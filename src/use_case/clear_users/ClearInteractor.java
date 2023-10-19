package use_case.clear_users;

// TODO Complete me

import interface_adapter.clear_users.ClearPresenter;
import view.SignupView;

import java.util.List;

public class ClearInteractor implements ClearInputBoundary{

    final ClearUserDataAccessInterface clearDataAccessInterface;

    final ClearOutputBoundary clearPresenter;


    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessInterface, ClearOutputBoundary clearPresenter){
        this.clearDataAccessInterface = clearDataAccessInterface;
        this.clearPresenter = clearPresenter;
    }

    public void execute(){
        List<String> listofusers = clearDataAccessInterface.clear();
        ClearOutputData clearOutputData = new ClearOutputData(listofusers);
        clearPresenter.prepareSuccessView(clearOutputData);


        // treat it like the else branch in the signup interactor. Calls to the presenter to show a pop-up of all the
        // users that got deleted.
        // everything else mimics the signup interactor except for the presenter and this function. Figure out how to
        // call on the clear use data access interface to delete the users and show the list of deleted users.
    }

}
