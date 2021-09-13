import java.util.Scanner;

public class Charat {
    public static void main(String[] args) {
        String a = "Hello This is test string";
        System.out.println(a);
        Scanner myScan = new Scanner(System.in);
        int scan = myScan.nextInt();
        char result = a.charAt(scan);
        System.out.println("Character at " + scan + " index is " + result);
    }
}