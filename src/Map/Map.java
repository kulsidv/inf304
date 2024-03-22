package Map;

import java.util.ArrayList;

public class Map<K, V> {
    private ArrayList<K> keys;
    private ArrayList<V> values;
    Map() {
        this.keys = new ArrayList<K>();
        this.values = new ArrayList<V>();
    }

    public V put(K key, V value) {
        keys.add(key);
        values.add(keys.indexOf(key), value);
        return value;
    }
    public V get(K key){
        if (keys.isEmpty() | !keys.contains(key)) return null;
        return values.get(keys.indexOf(key));
    }
    public V remove(K key){
        if (keys.isEmpty() | !containsKey(key)) return null;
        V delValue = get(key);
        values.remove(keys.indexOf(key));
        keys.remove(key);
        return delValue;
    }
    public boolean containsKey(K key){
        if (!keys.contains(key)) return false;
        return true;
    }
    public ArrayList<V> values(){
        return values;
    }
    public ArrayList<K> keySet() {
        return keys;
    }
}
