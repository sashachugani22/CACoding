package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import interface_adapter.login.LoginState;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ClearPresenter implements ClearOutputBoundary {

    private final ClearViewModel clearViewModel;

    private final ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel,
                          ClearViewModel clearViewModel){
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
    }

    public void prepareSuccessView(ClearOutputData response){
        ClearState clearState = clearViewModel.getState();
        clearState.setState(response.getNames());
        this.clearViewModel.setState(clearState);
        clearViewModel.firePropertyChanged();

        viewManagerModel.setActiveView(clearViewModel.getViewName());
        viewManagerModel.firePropertyChanged();

    }
}
