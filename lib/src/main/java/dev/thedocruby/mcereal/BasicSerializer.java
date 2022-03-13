package dev.thedocruby.mcereal;

import org.spongepowered.configurate.serialize.SerializationException;

public interface BasicSerializer extends Serializer{
    boolean getBoolean(String[] path);
    int getInt(String[] path);
    long getLong(String[] path);
    float getFloat(String[] path);
    double getDouble(String[] path);

    boolean getBoolean(String[] path, boolean defaultValue);
    int getInt(String[] path, int defaultValue);
    long getLong(String[] path, long defaultValue);
    float getFloat(String[] path, float defaultValue);
    double getDouble(String[] path, double defaultValue);

    void setBoolean(String[] path, boolean value) throws SerializationException;
    void setInt(String[] path, int value) throws SerializationException;
    void setLong(String[] path, long value) throws SerializationException;
    void setFloat(String[] path, float value) throws SerializationException;
    void setDouble(String[] path, double value) throws SerializationException;
}
