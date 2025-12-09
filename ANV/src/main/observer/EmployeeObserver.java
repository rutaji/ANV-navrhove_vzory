package main.observer;

public class EmployeeObserver implements Observer{
    String name;
    public EmployeeObserver(String name){
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println(name + " notified: " + status);
    }
}
