package HashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapFinal<K, V> {
    ArrayList<LinkedList<Entity>> list;
    private int size = 0;
    private float lf = 0.5f; // Load factor threshold

    public HashMapFinal() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value) {
        if ((float) (size) / list.size() > lf) {
            reHash();
        }
        
        int hash = (key.hashCode() & Integer.MAX_VALUE) % list.size();
        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                entity.value = value;
                return;
            }
        }

        entities.add(new Entity(key, value));
        size++;
    }

    public V get(K key) {
        int hash = (key.hashCode() & Integer.MAX_VALUE) % list.size();
        LinkedList<Enticd ty> entities = list.get(hash);

        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                return entity.value;
            }
        }
        return null; // Key not found
    }

    private void reHash() {
        System.out.println("We are now rehashing");
        ArrayList<LinkedList<Entity>> oldList = list;
        list = new ArrayList<>();
        size = 0;

        for (int i = 0; i < oldList.size() * 2; i++) {
            list.add(new LinkedList<>());
        }

        for (LinkedList<Entity> entities : oldList) {
            for (Entity entity : entities) {
                put(entity.key, entity.value);
            }
        }
    }

    private class Entity {
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
