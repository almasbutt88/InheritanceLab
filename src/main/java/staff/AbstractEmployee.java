package staff;

import management.Manager;

public abstract class AbstractEmployee {

    private String name;
    private String nino;
    private double salary;

    public AbstractEmployee(String name, String nino, double salary){

        this.name = name;
        this.nino = nino;
        this.salary = salary;

    }


    public String getName() {
        return name;
    }

    public void setName(String name){
        if(name!= null) {
            this.name = name;
        }
    }

    public String getNino() {
        return nino;
    }

    public void setNino(String nino) {
        this.nino = nino;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double incrementSalary){
        if(incrementSalary >=0) {
            salary += incrementSalary;
        }

    }

    public double payBonus(){
        return 0.01 * salary;
    }

}
