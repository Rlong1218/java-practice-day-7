import java.util.Map;

// Modify and return the given map as follows:
// if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "".
// Basically "b" is a bully, taking the value and replacing it with the empty string.

public class MapBully {
    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", "a");
            map.put("a", "");
        }
        return map;
    }
}
