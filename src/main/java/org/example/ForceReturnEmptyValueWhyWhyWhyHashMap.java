package org.example;

import java.util.HashMap;

public abstract class ForceReturnEmptyValueWhyWhyWhyHashMap<K,V> extends HashMap<K,V> {
    @Override
    public V get(Object key) {
        return super.getOrDefault(key, getDefaultValue());
    }

    protected abstract V getDefaultValue();
}
