package HashMap;

import java.util.HashMap;
import java.util.HashSet;

import javax.swing.text.html.parser.Entity;

public class Main {
    public static void main(String[] args) {
        MapUsingHash map= new MapUsingHash();
        map.put("Mango", "King of Fruits");
        map.put("Apple", "Red Fruit");
        map.put("Litchi", "Its a fruit");
        System.out.println(map.get("Apple"));
        String name = "Abc";
        Integer a = 45454;
        int code = a.hashCode();
        System.out.println(code);
        // HashMap<String,Integer> map = new HashMap<>();
        // map.put("Abc",89);
        // map.put("Efg",98);
        // map.put("Hij",96);
        // System.out.println(map.get("Abc"));
        // System.out.println(map.getOrDefault("ZXC",78));

        HashSet<Integer> set = new HashSet<>();
        set.add(12);
        set.add(13);
        set.add(252);
        set.add(13);
        set.add(526);
        System.out.println(set);
    }
}
class MapUsingHash{
    private Entity[] entities;
    public MapUsingHash(){
        entities = new Entity[100];
    }
    public void put(String key,String value){
        int hash = Math.abs(key.hashCode()%entities.length);
        entities[hash] = new Entity(key, value);
    }
    public String get(String key){
        int hash = Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }
    public void remove(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            entities[hash] = null;
        }
    }
    private class Entity {
        String key;
        String value;
        public Entity(String key,String value){
            this.key = key;
            this.value = value;
        }
    }
}