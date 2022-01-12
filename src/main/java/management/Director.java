package management;

public class Director extends Manager{


    private double budget;

    public Director(String _name, String _nino, double _salary, String _deptName, double budget){
        super(_name, _nino, _salary, _deptName);
        this.budget = budget;

    }
    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus(){
        return 0.02 * this.getSalary();
    }

}
