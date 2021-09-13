public class Constructors {
    int x;
    int y;
    public Constructors() {
        x = 5;
        y = 6;
    }
    public static void main(String[] args) {
        Constructors conObj = new Constructors();
        System.out.println(conObj.x + conObj.y);
    }
}