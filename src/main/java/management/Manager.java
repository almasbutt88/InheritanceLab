package management;

import staff.AbstractEmployee;

public class Manager extends AbstractEmployee {

    private String deptName;

    public Manager(String _name, String _nino, double _salary, String _deptName){
        super(_name, _nino, _salary);
        this.deptName = _deptName;
    };

    public String getDeptName() {
        return deptName;
    }


}
