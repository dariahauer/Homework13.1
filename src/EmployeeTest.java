import java.io.FileNotFoundException;

public class EmployeeTest {

    public static void main(String[] args) {
        FileUtils fileUtils = new FileUtils();
        EmployeeUtils employeeUtils = new EmployeeUtils();
        try {
            Employee[] employees = FileUtils.read("employeeList.csv");
            System.out.println("Average salary: " + employeeUtils.averageSalary(employees));
            System.out.println("Lower salary: " + employeeUtils.minSalary(employees));
            System.out.println("Higher salary: " + employeeUtils.maxSalary(employees));
            System.out.println("Employee number in depatment it: " + employeeUtils.employeeNumber(employees, "it"));
            System.out.println("Employee number in depatment it: " + employeeUtils.employeeNumber(employees, "Support"));
            System.out.println("Employee number in depatment it: " + employeeUtils.employeeNumber(employees, "Management"));


            for (Employee empl : employees) {
                System.out.println(empl);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Cann not find the file");
        }
    }

}

