package Challenge88;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the file you wish");
        String fileName = input.next();
        try (FileReader reader = new FileReader(fileName)){
            int read;
            while ((read = reader.read()) != -1) {
                System.out.print((char)read);
            }
        } catch (FileNotFoundException exception) {
            System.out.printf(" %s not found ", fileName);

        } catch (IOException exception) {
            System.out.printf("Exception occured: %s",
                    exception.getMessage());

        }
    }




}
