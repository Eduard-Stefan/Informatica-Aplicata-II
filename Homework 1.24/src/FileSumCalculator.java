import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileSumCalculator {
    private File file;
    public FileSumCalculator(String filename) {
        this.file = new File(filename);
    }
    public int calculateSum() {
        int sum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split("\\D+");
                for (String token : tokens) {
                    try {
                        int num = Integer.parseInt(token);
                        sum += num;
                    } catch (NumberFormatException e) {
                        // ignore non-integer tokens
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Error while reading file");
        }
        return sum;
    }
}