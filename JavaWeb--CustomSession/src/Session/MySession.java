package Session;

public interface MySession {
    String getID();
    Object get(String id);
    void set(String id,String msg);
}
