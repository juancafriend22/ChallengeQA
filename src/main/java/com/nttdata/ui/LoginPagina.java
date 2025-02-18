package com.nttdata.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPagina extends PageObject {

    public static final Target USERNAME_FIELD = Target.the("Username field").locatedBy("#user-name");
    public static final Target PASSWORD_FIELD = Target.the("Password field").locatedBy("#password");
    public static final Target LOGIN_BUTTON = Target.the("Login button").locatedBy("#login-button");

}
