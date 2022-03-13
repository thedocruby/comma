package dev.thedocruby.comma.config;

import dev.thedocruby.comma.config.structure.ConfigClass;
import org.jetbrains.annotations.NotNull;

import java.security.InvalidParameterException;

public class AttributedCommaConfig<C extends ConfigClass> extends AnnotatedCommaConfig<C> implements AttributedConfig{
    public AttributedCommaConfig(@NotNull ConfigBuilder builder, @NotNull Class<C> configClass) throws InvalidParameterException {
        super(builder, configClass);
    }
}
