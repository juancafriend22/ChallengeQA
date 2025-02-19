package com.nttdata.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPagina extends PageObject {

    public static final Target USERNAME_FIELD = Target.the("username campo").located(By.id("user-name"));
    public static final Target PASSWORD_FIELD = Target.the("password campo").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("Login button").located(By.id("login-button"));

}
