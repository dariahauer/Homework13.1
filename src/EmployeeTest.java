import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeTest {

    public static void main(String[] args) {
        FileUtils fileUtils = new FileUtils();
        EmployeeUtils employeeUtils = new EmployeeUtils();
        try {
            Employee[] employees = FileUtils.read("employeeList.csv");
            FileWriter fileWriter= new FileWriter("employeeStatistics.csv");
            BufferedWriter bfw= new BufferedWriter(fileWriter);

            System.out.println("Average salary: " + employeeUtils.averageSalary(employees));
            System.out.println("Lower salary: " + employeeUtils.minSalary(employees));
            System.out.println("Higher salary: " + employeeUtils.maxSalary(employees));
            System.out.println("Employee number in depatment it: " + employeeUtils.employeeNumber(employees, "it"));
            System.out.println("Employee number in depatment it: " + employeeUtils.employeeNumber(employees, "Support"));
            System.out.println("Employee number in depatment it: " + employeeUtils.employeeNumber(employees, "Management"));

            bfw.write("Average salary: " + employeeUtils.averageSalary(employees));
            bfw.newLine();
            bfw.write("Lower salary: " + employeeUtils.minSalary(employees));
            bfw.newLine();
            bfw.write("Higher salary: " + employeeUtils.maxSalary(employees));
            bfw.newLine();
            bfw.write("Employee number in depatment it: " + employeeUtils.employeeNumber(employees, "it"));
            bfw.newLine();
            bfw.write("Employee number in depatment it: " + employeeUtils.employeeNumber(employees, "Support"));
            bfw.newLine();
            bfw.write("Employee number in depatment it: " + employeeUtils.employeeNumber(employees, "Management"));
            bfw.close();
            for (Employee empl : employees) {
                System.out.println(empl);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Cann not find the file");
        } catch (IOException e) {
            System.err.println("Cann not find the file");
        }
    }
}

