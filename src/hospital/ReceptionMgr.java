package hospital;

import facade.DataEngineInterface;
import mgr.Manageable;
import mgr.Manager;
import java.util.List;

public class ReceptionMgr extends Manager implements DataEngineInterface {
    private static ReceptionMgr mgr = null;
    private ReceptionMgr() {}
    public static ReceptionMgr getInstance() {
        return mgr;
    }
    private String[] headers = {"진료순서", "이름(나이,성별)", "증상","담당의사"};

    @Override
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return 4;
    }

    @Override
    public String[] getColumnNames() {
        // TODO Auto-generated method stub
        return headers;
    }

    @Override
    public void readAll(String filename) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Manageable> search(String kwd) {
        // TODO Auto-generated method stub
        return Main.doctorMgr.findAll(kwd);
    }

    @Override
    public void addNewItem(String[] uiTexts) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(String[] uiTexts) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(String kwd) {
        // TODO Auto-generated method stub

    }
}
