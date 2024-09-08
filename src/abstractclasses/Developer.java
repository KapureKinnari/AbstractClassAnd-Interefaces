package abstractclasses;

public class Developer extends Employee {

    private String project_name;

    public Developer(int age, String name, String project_name) {
        super(age, name);
        this.project_name = project_name;
    }

    @Override
    public double calcSalary(double basic){
        double ta, da, hra;
        double bonus = 2000;
        ta = basic * 0.5;
        da = basic * 0.10;
        hra = basic * 0.15;

        return (basic + ta + da + hra + bonus);
    }


    @Override
    public String toString() {
        return "Developer{" +
                "project_name='" + project_name + '\'' +
                "}" + super.toString();
    }
}
