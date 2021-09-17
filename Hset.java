import java.util.HashSet;

public class Hset {
    public static void main(String[] args) {
        HashSet < String > set = new HashSet < String > ();
        set.add("Burger");
        set.add("Pizza");
        set.add("Roti");
        set.add("Panini");
        set.add("Pizza");
        set.add("frankie");

        for (String i: set) {
            System.out.println(i);
        }
    }
}