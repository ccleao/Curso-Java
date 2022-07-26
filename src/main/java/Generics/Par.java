package Generics;

import java.util.Objects;

public class Par<K, V> {
    private K key;

    public Par(K key, V value) {
        this.key = key;
        this.value = value;
    }
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Par<?, ?> par = (Par<?, ?>) o;
        return key.equals(par.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
