import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Doublex {
    private File file;
    public Doublex(String filename) {
        this.file = new File(filename);
    }
    public float calculateSum() {
        float x = 1;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            x = Float.parseFloat(br.readLine());
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Error while reading file");
        } catch (NumberFormatException e) {
            System.err.println("Not a number");
        } catch (NullPointerException e) {
            System.err.println("File is empty");
        }
        return 2 * x;
    }
}