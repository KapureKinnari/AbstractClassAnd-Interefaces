package abstractclasses;

public abstract class Employee {
    protected int age;
    protected String Name;

    public Employee(int age, String name) {
        this.age = age;
        this.Name = name;
    }

    public abstract double calcSalary(double basic);

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", Name='" + Name + '\'' +
                '}';
    }

    public void someFunction(){
        System.out.println("HELLO");
    }
}
