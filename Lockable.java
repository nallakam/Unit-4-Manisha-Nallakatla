public interface Lockable(){
    void setKey(int key);
    boolean lock(int key);
    void unlock(int key);
}
