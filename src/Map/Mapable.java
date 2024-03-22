package Map;

import java.util.ArrayList;

public interface Mapable<K, V> {
    V put(K key, V value);
    V get(K key);
    V remove(K key);
    boolean containsKey(K key);
    ArrayList<V> values();
    ArrayList<K> keySet();
}
