import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        System.out.println("Please insert your first name");
        Scanner myScan = new Scanner(System.in);
        String fname = myScan.nextLine();
        System.out.println("Please insert your last name");
        String lname = myScan.nextLine();
        System.out.println(fname.concat(" " + lname));
    }
}