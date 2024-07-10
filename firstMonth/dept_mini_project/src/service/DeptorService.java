package service;

import model.Deptor;

public class DeptorService {


    // Add Dept
    private Deptor[] deptors = new Deptor[100];
    private static int index = 0;

    public Deptor addDept(Deptor deptor) {
        if (index < 100) {
            deptors[index++] = deptor;
            return deptors[index - 1];
        }
        return null;
    }
    // hasName
    public boolean hasName(String name) {
        for (int i = 0; i < deptors.length; i++) {
            if ( deptors[i] != null && deptors[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    // addAmount
    public Deptor addAmount(Deptor deptor) {
        for (Deptor value : deptors) {
            if (value != null && value.getName().equals(deptor.getName())) {
                value.setAmount(value.getAmount() + deptor.getAmount());
                return value;
            }
        }
        return null;
    }
    // Reduce Dept
    public Deptor reduceDept(Deptor deptor) {

        for (int i = 0; i < deptors.length; i++) {
            if (deptors[i] != null && deptors[i].getName().equals(deptor.getName())) {
                deptors[i].setAmount(deptors[i].getAmount() - deptor.getAmount());
                return deptors[i];
            }
        }
        return null;
    }

    // List Dept
    public Deptor[] listDept() {
        return deptors ;
    }
    public Deptor getDeptorByName(String name) {
        for (Deptor deptor : deptors) {
            if (deptor != null) {
                if (deptor.getName().equals(name)) {
                    return deptor;
                }
            }

        }
        return null;
    }


}
