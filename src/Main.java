
public class Main {
    public static void main(String[] args) {
        Company c = new Company("PA", 12);
        c.setIncome(49000);
        Director d1 = new Director(0, "Mi", 30, 20);
        Director d2 = new Director(1, "Jai", 25, 30);
        Director d3 = new Director(2, "Lool", 21, 15);
        Manager m1 = new Manager(3, "Aai", 25);
        Manager m2 = new Manager(4, "Quan", 27);
        Staff s1 = new Staff(5, "Boo", 30);
        s1.setManager(m1);
        Staff s2 = new Staff(6, "Kuu", 10);
        s2.setManager(m2);
        Staff s3 = new Staff(7, "Haa", 20);
        s3.setManager(m2);
        c.employeeArrayList.add(d1);
        c.employeeArrayList.add(d2);
        c.employeeArrayList.add(d3);
        c.employeeArrayList.add(m1);
        c.employeeArrayList.add(m2);
        c.employeeArrayList.add(s1);
        c.employeeArrayList.add(s2);
        c.employeeArrayList.add(s3);
        // 4
        c.getAllEmployee();
        // 5
        c.getAllSalary();
        // 6
        c.findMaxSalary();
        // 7
        c.findMaxMan();
        // 8
        c.sortByName();
        // 9
        c.sortBySalary();
        //10
        c.getDirectorSalary();
        //11
        c.getProfit();

        // 3 delete staff
        c.deleteEmployee(m1);
        assert s1.getManager() == null; // check if s1's manager set to null








    }
}