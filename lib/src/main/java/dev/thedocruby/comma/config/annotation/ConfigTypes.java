package dev.thedocruby.comma.config.annotation;

import dev.thedocruby.comma.config.AnnotatedCommaConfig;
import dev.thedocruby.comma.config.AttributedCommaConfig;
import dev.thedocruby.comma.config.BasicCommaConfig;
import dev.thedocruby.comma.config.CommaConfig;

public enum ConfigTypes {
    BASIC(BasicCommaConfig.class),
    ANNOTATED(AnnotatedCommaConfig.class),
    ATTRIBUTED(AttributedCommaConfig.class);

    private final Class<? extends CommaConfig> typeClass;

    ConfigTypes(Class<? extends CommaConfig> typeClass) {
        this.typeClass = typeClass;
    }

    public Class<? extends CommaConfig> getTypeClass() {
        return typeClass;
    }
}
