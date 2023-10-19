package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.signup.SignupState;
import use_case.clear_users.ClearInteractor;

import java.util.ArrayList;
import java.util.List;

public class ClearState {
    private List<String> listnames = new ArrayList<>();

    public ClearState(ClearState copy){
        this.listnames = copy.listnames;
    }
    public ClearState(){
    }

    public List<String> getstate(){
        return listnames;
    }

    public void setState(List<String> users){
        this.listnames = users;
    }
}
