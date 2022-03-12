package dev.thedocruby.comma.config;

import dev.thedocruby.comma.config.structure.ConfigClass;
import dev.thedocruby.mcereal.AnnotatedMCerealizer;
import org.jetbrains.annotations.NotNull;

public class AnnotatedConfig<C extends ConfigClass> extends Config<C> {
    public AnnotatedConfig(@NotNull ConfigBuilder builder) throws IllegalArgumentException {
        super(builder);
        this.serializer = new AnnotatedMCerealizer(this.savePath);
    }
}
