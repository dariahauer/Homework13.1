import java.io.*;
import java.util.Scanner;

public class FileUtils {

//    static Employee[] read(String filename) throws FileNotFoundException {
//        Scanner scanner = new Scanner(new File(filename));
//        int lines = countLines(filename);
//        Employee[] result = new Employee[lines];
//        for (int i = 0; i < lines; i++) {
//            String line = scanner.nextLine();
//            String[] split = line.split(";");
//            double salary = Double.parseDouble(split[4]);
//            result[i] = new Employee(split[0], split[1], split[2], split[3], salary);
//        }
//        return result;
//    }
    

    public static Employee[] read2(String filename) throws IOException {
        int lines = countLines(filename);
        Employee[] employee = new Employee[lines];
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        int index = 0;
        while ((line = br.readLine()) != null) {
            String[] split = line.split(";");
            double salary = Double.parseDouble(split[4]);
            employee[index] = new Employee(split[0], split[1], split[2], split[3], salary);
            index++;
        }
        return employee;
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
