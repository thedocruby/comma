package dev.thedocruby.mcereal;

import org.jetbrains.annotations.NotNull;
import org.spongepowered.configurate.serialize.SerializationException;

public class BasicMCereal extends MCereal implements BasicSerializer{
    public BasicMCereal(@NotNull String savePath) {
        super(savePath);
    }

    public boolean getBoolean(String[] path) {
        return rootNode.node((Object[]) path).getBoolean();
    }

    public int getInt(String[] path) {
        return rootNode.node((Object[]) path).getInt();
    }

    public long getLong(String[] path) {
        return rootNode.node((Object[]) path).getLong();
    }

    public float getFloat(String[] path) {
        return rootNode.node((Object[]) path).getFloat();
    }

    public double getDouble(String[] path) {
        return rootNode.node((Object[]) path).getDouble();
    }

    public boolean getBoolean(String[] path, boolean defaultValue) {
        return rootNode.node((Object[]) path).getBoolean(defaultValue);
    }

    public int getInt(String[] path, int defaultValue) {
        return rootNode.node((Object[]) path).getInt(defaultValue);
    }

    public long getLong(String[] path, long defaultValue) {
        return rootNode.node((Object[]) path).getLong(defaultValue);
    }

    public float getFloat(String[] path, float defaultValue) {
        return rootNode.node((Object[]) path).getFloat(defaultValue);
    }

    public double getDouble(String[] path, double defaultValue) {
        return rootNode.node((Object[]) path).getDouble(defaultValue);
    }

    public void setBoolean(String[] path, boolean value) throws SerializationException {
        rootNode.node((Object[]) path).set(value);
    }

    public void setInt(String[] path, int value) throws SerializationException {
        rootNode.node((Object[]) path).set(value);
    }

    public void setLong(String[] path, long value) throws SerializationException {
        rootNode.node((Object[]) path).set(value);
    }

    public void setFloat(String[] path, float value) throws SerializationException {
        rootNode.node((Object[]) path).set(value);
    }

    public void setDouble(String[] path, double value) throws SerializationException {
        rootNode.node((Object[]) path).set(value);
    }
}
