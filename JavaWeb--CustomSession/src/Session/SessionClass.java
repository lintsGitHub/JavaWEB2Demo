package Session;

import java.util.HashMap;
import java.util.Map;

public class SessionClass implements MySession {
    Map<String,Object> map = new HashMap<>();
    String id;
    @Override
    public String getID() {
        return id;
    }

    @Override
    public Object get(String id) {
        return map.get(id);
    }

    @Override
    public void set(String id, String msg) {
        map.put(id,msg);
    }
}
