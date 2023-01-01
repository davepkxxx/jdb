package org.daida.jdb.io.rel;

import org.daida.jdb.lang.NotNull;
import org.daida.jdb.lang.Nullable;

import java.util.List;
import java.util.stream.Collectors;

public interface StructInit extends ThrowNotFound {
    default <T extends StructModel> T find(List<T> models, @Nullable String modelId, StructType type) throws StructNotFoundException {
        if (modelId == null) {
            return null;
        }

        return models.stream().filter(model ->
                model.getId().equals(modelId)
        ).findFirst().orElseGet(this.notFoundSupplier(modelId, type));
    }

    default <T extends StructModel> List<T> filter(List<T> models, List<@NotNull String> modelIds, StructType type) throws StructNotFoundException {
        return modelIds.stream().map(modelId ->
                models.stream().filter(model ->
                        model.getId().equals(modelId)
                ).findFirst().orElseGet(this.notFoundSupplier(modelId, type))
        ).collect(Collectors.toList());
    }
}
