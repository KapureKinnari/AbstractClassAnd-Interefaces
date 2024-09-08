package Interfaces;

import java.util.Date;

public interface Calculator {  //Here instead of class we are having the "interface" Keyword.
    //we can write with public abstract and we can also avoid writing public abstaract
    void add(int a ,int b);

    public abstract void subtract(int a ,int b);

    public abstract void divide(int a ,int b);

    public abstract void multiply(int a ,int b);

    //Default keyword of interfaces -- came from JAVA V--8
    default public void display(){ //this is the default of interface
        logDate();
        System.out.println("Called from interface");
    }

    //Static method of interface -- came from JAVA V--8
    static public void someFunction(){
        System.out.println("From static");
    }

    //Private method of interface -- came from JAVA V--9
    private void logDate(){
        System.out.println("Date:"+ new Date());
    }

}
