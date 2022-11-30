import java.util.ArrayList;

public class Company {
    private String name;
    private int taxCode;
    private int income;

    private int expense;



    protected ArrayList<Employee> employeeArrayList;

    public Company(String name, int taxCode) {
        this.name = name;
        this.taxCode = taxCode;
        employeeArrayList = new ArrayList<>();
    }

    public void getProfit() {
        System.out.println("\nTotal Profit: ");
        System.out.println(income - expense);
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void addEmployee(Employee e) {
        employeeArrayList.add(e);
    }

    public void getAllEmployee() {
        System.out.println("Employee List");
        for (Employee e: employeeArrayList) {
            System.out.println(e);
        }
    }

    public void getAllSalary() {
        int res = 0;
        System.out.println("\nSalary Expenses");
        for (Employee e: employeeArrayList) {
            System.out.println(e.name + " " + e.getWage());
            res += e.getWage();
        }
        expense = res;
        System.out.println("Total: " + res);
    }

    public void getDirectorSalary() {
        int res = 0;
        System.out.println("\nDirector Compensation:");
        for (Employee e: employeeArrayList) {
            if (e instanceof Director) {
                System.out.println(e.name + " " + e.getWage());
                res += e.getWage();
            }

        }
        System.out.println("Total: " + res);
    }

    public void deleteEmployee(Employee employee) {
        if (employee instanceof Manager m) {
            m.deleteEmployee();
        }
        employeeArrayList.removeIf(e -> e.equals(employee));
    }

    public void findMaxSalary() {
        int res = 0;
        String name = "";
        for (Employee e: employeeArrayList) {
            if (e instanceof Staff) {
                if (e.getWage() > res) {
                    res = e.getWage();
                    name = e.name;
                }
            }

        }
        System.out.println("\nHighest-paid employee: " + name + " " + res);
    }

    public void findMaxMan() {
        int res = 0;
        String name = "";
        for (Employee e: employeeArrayList) {
            if (e instanceof Manager a) {
                if (a.staffList.size() > res) {
                    res = a.staffList.size();
                    name = a.name;
                }
            }

        }
        System.out.println("\nManager with the largest number of subordinates: " + name + ", number of subordinates: " + res);
    }

    public void sortByName() {
        employeeArrayList.sort((Employee e1, Employee e2) -> e1.name.compareTo(e2.name));
        System.out.println("\nEmployee List Sorted By Name:");
        for (Employee e: employeeArrayList) {
            System.out.println(e);
        }
    }


    public void sortBySalary() {
        employeeArrayList.sort((Employee e1, Employee e2) -> e1.getWage() < e2.getWage() ? 1: -1 );
        System.out.println("\nEmployee List Sorted By Salary:");
        for (Employee e: employeeArrayList) {
            System.out.println(e + " Salary: " + e.getWage());
        }
    }


}

