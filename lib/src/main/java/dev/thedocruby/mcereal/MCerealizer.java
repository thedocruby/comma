/*
 * Copyright (C) 2022 Dr. Rubisco
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA
 */

package dev.thedocruby.mcereal;

import lombok.Getter;
import org.spongepowered.configurate.CommentedConfigurationNode;
import org.spongepowered.configurate.ConfigurateException;
import org.spongepowered.configurate.ConfigurationNode;
import org.spongepowered.configurate.hocon.HoconConfigurationLoader;
import org.spongepowered.configurate.serialize.SerializationException;

import javax.annotation.Nullable;
import java.nio.file.Path;
import java.util.List;

public class MCerealizer {
    @Getter
    private final String filePath;
    private final HoconConfigurationLoader loader;
    private CommentedConfigurationNode rootNode;

    public MCerealizer(String filePath) {
        this.filePath = filePath;
        this.loader = HoconConfigurationLoader.builder().path(Path.of(this.filePath)).build();
    }

    public void load() throws ConfigurateException {
        rootNode = loader.load();
    }
    
    public void save() throws ConfigurateException {
        loader.save(rootNode);
    }

    @Nullable
    public String getString(String[] path) {
        ConfigurationNode node = rootNode.node((Object[]) path);
        return node.getString();
    }

    public boolean getBoolean(String[] path) {
        ConfigurationNode node = rootNode.node((Object[]) path);
        return node.getBoolean();
    }

    public int getInt(String[] path) {
        ConfigurationNode node = rootNode.node((Object[]) path);
        return node.getInt();
    }

    public long getLong(String[] path) {
        ConfigurationNode node = rootNode.node((Object[]) path);
        return node.getLong();
    }

    public float getFloat(String[] path) {
        ConfigurationNode node = rootNode.node((Object[]) path);
        return node.getFloat();
    }

    public double getDouble(String[] path) {
        ConfigurationNode node = rootNode.node((Object[]) path);
        return node.getDouble();
    }

    @Nullable
    public <T> List<T> getList(String[] path, Class<T> type) throws SerializationException {
        ConfigurationNode node = rootNode.node((Object[]) path);
        return node.getList(type);
    }

    @Nullable
    public <T> T get(String[] path, Class<T> type) throws SerializationException {
        ConfigurationNode node = rootNode.node((Object[]) path);
        return node.get(type);
    }


    public void setString(String[] path, @Nullable String value) throws SerializationException {
        ConfigurationNode node = rootNode.node((Object[]) path);
        node.set(value);
    }

    public void setBoolean(String[] path, boolean value) throws SerializationException {
        ConfigurationNode node = rootNode.node((Object[]) path);
        node.set(value);
    }

    public void setInt(String[] path, int value) throws SerializationException {
        ConfigurationNode node = rootNode.node((Object[]) path);
        node.set(value);
    }

    public void setLong(String[] path, long value) throws SerializationException {
        ConfigurationNode node = rootNode.node((Object[]) path);
        node.set(value);
    }

    public void setFloat(String[] path, float value) throws SerializationException {
        ConfigurationNode node = rootNode.node((Object[]) path);
        node.set(value);
    }

    public void setDouble(String[] path, double value) throws SerializationException {
        ConfigurationNode node = rootNode.node((Object[]) path);
        node.set(value);
    }

    public <T> void setList(String[] path, Class<T> type, @Nullable List<T> value) throws SerializationException {
        ConfigurationNode node = rootNode.node((Object[]) path);
        node.setList(type, value);
    }

    public <T> void set(String[] path, Class<T> type, @Nullable T value) throws SerializationException {
        ConfigurationNode node = rootNode.node((Object[]) path);
        node.set(type, value);
    }
}
