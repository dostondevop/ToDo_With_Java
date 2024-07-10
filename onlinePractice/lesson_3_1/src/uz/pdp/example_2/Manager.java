package uz.pdp.example_2;

public class Manager extends Employee{
    private int bonus;

    public Manager(int bonus) {
        super();
        this.bonus = bonus;
        System.out.println("Manager one  arg constructor called");
    }

    public Manager(String fullName, double salary, int bonus) {
        super(fullName,salary);
        this.bonus = bonus;
        System.out.println("Manager 3 arg constructor");
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
    return super.getSalary() + bonus;
    }

}
