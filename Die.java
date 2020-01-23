public class Die implements Lockable{
    private int side;
    private int key;
    private boolean locked;

    public Die(){
        side = 1;
    }

    public int getSide(){
        return side;
    }

    public void roll(int key){
        if((this.key == key) && (!locked)) {
            side = (int) ((Math.random() * 6) + 1);
        } else {
            System.out.println("You cannot roll this die!");
        }
    }

    public String toString(){
        String result = "Face value = " + side;
        return result;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void lock() {
        locked = true;
    }

    public void unlock() {
        locked = false;
    }

    public boolean locked() {
        return locked;
    }
}