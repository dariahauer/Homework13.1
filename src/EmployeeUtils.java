public class EmployeeUtils {


    public static double averageSalary(Employee[] employees) {
        double salarySum = 0;
        for (Employee employee : employees) {
            salarySum += employee.getSalary();
        }
        return salarySum / employees.length;
    }


    public static double minSalary(Employee[] employees) {
        double minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    public static double maxSalary(Employee[] employees) {
        double maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }


    public static long employeeNumber(Employee[] employees, String department) {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment().equals(department)) {
                count++;
            }
        }
        return count;
    }
}
