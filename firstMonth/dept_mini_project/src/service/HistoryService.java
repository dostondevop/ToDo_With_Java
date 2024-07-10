package service;

import model.Deptor;
import model.History;

public class HistoryService {
    DeptorService deptorService;
    private static int  index = 0;

    public HistoryService(DeptorService deptorService) {
        this.deptorService = deptorService;
    }
    public void addHistory(History history, String name) {
        Deptor[] deptors = deptorService.listDept();
        for (int i = 0; i < deptors.length; i++) {
            if (deptors[i] != null) {
                if ( deptors[i].getName().equals(name) ) {
                    deptors[i].histories[index ++] = history;
                }
            }
        }
    }
    public History[] listHistory(Deptor deptor) {
        return deptor.histories;
    }
}
              