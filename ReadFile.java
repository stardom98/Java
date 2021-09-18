import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("TestFile.txt");
            Scanner myScanner = new Scanner(myFile);
            while (myScanner.hasNextLine()) {
                String data = myScanner.nextLine();
                System.out.println(data);
            }
            myScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error Occured.");
            e.printStackTrace();

        }
    }
}