package org.daida.jdb.sql.ast.frag;

import org.daida.jdb.sql.ast.SyntaxNode;

import java.util.ArrayList;
import java.util.Collection;

public class Items<T> extends ArrayList<T> implements SyntaxNode {
    public Items(Collection<? extends T> c) {
        super(c);
    }
}
