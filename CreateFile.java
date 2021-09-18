import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("Testfile.txt");
            if (myFile.createNewFile()) {
                System.out.println("File Created:" + myFile.getName());
            } else {
                System.out.println("File already exists");
            }
            FileWriter myWriter = new FileWriter("Testfile.txt");
            myWriter.write("Hello World!!");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}