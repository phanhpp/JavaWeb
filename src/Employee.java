import java.util.ArrayList;

public class Employee {
    protected int id;
    protected String name;
    protected int phone;
    protected int workDay;
    protected int wagePerDay;
    protected int wageCal; // cach tinh luong



    public Employee (int id, String name, int workDay) {
        this.id = id;
        this.name = name;
        this.workDay = workDay;

    }

    @Override
    public String toString() {
        return id + " " + name;
    }

    public int getWage() {
        return wageCal;
    }
}

class Director extends Employee {
    private int companyShare;

    public Director(int id, String name, int workDay, int companyShare) {
        super(id, name, workDay);
        wagePerDay = 300;
        wageCal = workDay*wagePerDay;
        this.companyShare = companyShare;

    }

    public int getWage() {
        return wageCal;
    }

    public int getCompanyShare() {
        return companyShare;
    }

    public void setCompanyShare(int companyShare) {
        this.companyShare = companyShare;
    }
}

class Manager extends Employee {
    private int numEmployee;

    public ArrayList<Staff> staffList;
    public Manager(int id, String name, int workDay) {
        super(id, name, workDay);
        wagePerDay = 200;
        numEmployee = 0;
        staffList = new ArrayList<>();

    }

    public void setNumEmployee() {
        this.numEmployee += 1;
    }

    public int getWage() {
        //System.out.println(workDay + " " + numEmployee);
        this.wageCal = workDay*wagePerDay + numEmployee*100;
        return wageCal;
    }

    public int getNumEmployee() {
        return numEmployee;
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }

    public void deleteEmployee() {
        for (Staff s: staffList) {
            s.noMan();
        }
    }


}
class Staff extends Employee {
    private Manager manager;

    public Staff(int id, String name, int workDay) {
        super(id, name, workDay);
        manager = null;
        wagePerDay = 100;
        wageCal = workDay*wagePerDay;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
        manager.setNumEmployee();
        manager.staffList.add(this);
    }

    public int getWage() {
        return wageCal;
    }

    public void noMan() {
        this.manager = null;
    }

    public Manager getManager() {
        return manager;
    }
}