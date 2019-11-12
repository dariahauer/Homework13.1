import java.io.*;
import java.util.Scanner;

public class FileUtils {

    static Employee[] read(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        int lines = countLines(filename);
        Employee[] result = new Employee[lines];
        for (int i = 0; i < lines; i++) {
            String line = scanner.nextLine();
            String[] split = line.split(";");
            //    int pesel = Integer.parseInt(split[2]);
            double salary = Double.parseDouble(split[4]);
            result[i] = new Employee(split[0], split[1], split[2], split[3], salary);
        }
        return result;
    }


    private static int countLines(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        int lines = 0;
        while (scanner.hasNextLine()) {
            lines++;
            scanner.nextLine();
        }
        return lines;
    }
}
