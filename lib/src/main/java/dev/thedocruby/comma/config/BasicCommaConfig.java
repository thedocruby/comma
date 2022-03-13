package dev.thedocruby.comma.config;

import dev.thedocruby.comma.config.structure.ConfigClass;
import org.jetbrains.annotations.NotNull;

import java.security.InvalidParameterException;

public class BasicCommaConfig<C extends ConfigClass> extends CommaConfig<C> implements BasicConfig {
    protected BasicCommaConfig(@NotNull ConfigBuilder builder, @NotNull Class<C> configClass) throws InvalidParameterException {
        super(builder, configClass);
    }
}
