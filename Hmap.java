import java.util.HashMap;

public class Hmap {
    public static void main(String[] args) {

        HashMap < String, String > cars = new HashMap < String, String > ();

        cars.put("Maruti", "Swift");
        cars.put("Ford", "Mustang");
        cars.put("Toyota", "Innova");
        cars.put("Hyundai", "i20");
        cars.put("Renault", "Duster");

        for (String i: cars.keySet()) {
            System.out.println("Brand: " + i + "  Model: " + cars.get(i));
        }
    }
}