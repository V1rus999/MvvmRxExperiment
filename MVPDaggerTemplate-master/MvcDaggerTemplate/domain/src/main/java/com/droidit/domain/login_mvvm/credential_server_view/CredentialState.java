package com.droidit.domain.login_mvvm.credential_server_view;

import com.droidit.domain.login_mvvm.LoginColors;
import com.droidit.domain.login_mvvm.LoginStates;

/**
 * Created by johannesC on 2017/06/17.
 */

public class CredentialState {

    public String loginButtonText;
    public boolean progressBarVisible;
    public LoginStates currentState;
    public boolean isFinished;

    public CredentialState(final String loginButtonText, final boolean progressBarVisible, final LoginStates currentState) {
        this.loginButtonText = loginButtonText;
        this.progressBarVisible = progressBarVisible;
        this.currentState = currentState;
        this.isFinished = false;
    }

    public int getLoginButtonColor() {
        return LoginColors.getColorForState(currentState);
    }
}
