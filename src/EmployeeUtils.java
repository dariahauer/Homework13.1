public class EmployeeUtils {


    public double averageSalary(Employee[] employees) {
        int employeeCounter = 0;
        double salarySum = 0;
        for (Employee employee : employees) {
            employeeCounter++;
            salarySum += employee.getSalary();
        }
        return salarySum / employeeCounter;
    }


    double minSalary(Employee[] employees) {
        double salary = employees[0].getSalary();
        double[] salaryTable = new double[employees.length];
        for (int i = 0; i < employees.length; i++) {
            salaryTable[i] = employees[i].getSalary();
            if (isMin(salaryTable, salary)) {
                salary = salaryTable[i];
            }
        }
        return salary;
    }

    double maxSalary(Employee[] employees) {
        double salary = employees[0].getSalary();
        double[] salaryTable = new double[employees.length];
        for (int i = 0; i < employees.length; i++) {
            salaryTable[i] = employees[i].getSalary();
            if (!isMin(salaryTable, salary)) {
                salary = salaryTable[i];
            }
        }
        return salary;
    }

    private boolean isMin(double[] salaryTable, double salary) {
        salary = salaryTable[0];
        for (double salaryTab : salaryTable) {
            if (salary < salaryTab) {
                return false;
            }
        }
        return true;

    }

    long employeeNumber(Employee[] employees, String department) {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment().equals(department)) {
                count++;
            }
        }
        return count;
    }
}
