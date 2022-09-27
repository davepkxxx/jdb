package org.daida.jdb.syntax.lexer;

import org.daida.jdb.syntax.err.SyntaxException;

import java.util.*;
import java.util.regex.Pattern;

public class LexerParser {

    private static final Map<LexerSymbol, String> regexMap = Collections.synchronizedMap(new EnumMap<>(LexerSymbol.class));

    static {
        LexerParser.regexMap.put(LexerSymbol.SELECT, "SELECT");
        LexerParser.regexMap.put(LexerSymbol.FROM, "FROM");
        LexerParser.regexMap.put(LexerSymbol.COMMA, ",");
        LexerParser.regexMap.put(LexerSymbol.WHITESPACE, "[\\s]+");
        LexerParser.regexMap.put(LexerSymbol.NAME, "[a-zA-Z][\\w]*");
    }

    private final Map<LexerSymbol, Pattern> patternMap = Collections.synchronizedMap(new EnumMap<>(LexerSymbol.class));

    private final String text;

    private int index = 0;

    private LexerParser(String text) throws NullPointerException {
        this.text = text;
        for (var entry : LexerParser.regexMap.entrySet()) {
            this.patternMap.put(entry.getKey(), Pattern.compile(entry.getValue()));
        }
    }

    private Optional<LexerMatch> find(LexerSymbol symbol, Pattern pattern) {
        var matcher = pattern.matcher(this.text);
        if (matcher.find(this.index)) {
            return Optional.of(new LexerMatch(symbol, this.text, this.index, matcher.regionEnd()));
        } else {
            return Optional.empty();
        }
    }

    private Optional<LexerMatch> find(Iterator<Map.Entry<LexerSymbol, Pattern>> iterator) {
        if (iterator.hasNext()) {
            var entry = iterator.next();
            var curr = this.find(entry.getKey(), entry.getValue());
            var next = this.find(iterator);
            if (curr.isEmpty()) {
                return next;
            } else if (next.isEmpty()) {
                return curr;
            } else if (next.get().end() > curr.get().end()) {
                return next;
            } else if (next.get().end() < curr.get().end()) {
                return curr;
            } else if (curr.get().symbol().isDynamicValue()) {
                return next;
            } else {
                return curr;
            }
        } else {
            return Optional.empty();
        }
    }

    private LexerMatch find() throws SyntaxException {
        var result = this.find(this.patternMap.entrySet().iterator());
        if (result.isPresent()) {
            return result.get();
        } else {
            throw SyntaxException.newExceptedInstance(this.text, this.index);
        }
    }

    private List<LexerMatch> matches() throws SyntaxException {
        if (this.index < this.text.length()) {
            LexerMatch match = this.find();
            this.index++;
            var result = this.matches();
            result.add(0, match);
            return result;
        } else {
            return new ArrayList<>();
        }
    }

    public static List<LexerMatch> parse(String text) throws SyntaxException {
        return new LexerParser(text).matches();
    }
}
