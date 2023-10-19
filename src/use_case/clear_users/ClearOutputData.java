package use_case.clear_users;

// TODO Complete me

import java.util.List;


public class ClearOutputData {

    private final List<String> listofnames;

    public ClearOutputData(List<String> user){
        this.listofnames = user;
    }


    public List<String> getNames(){
      return listofnames;
    }
}
