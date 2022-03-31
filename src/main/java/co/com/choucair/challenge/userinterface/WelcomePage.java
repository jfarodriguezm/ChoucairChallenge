package co.com.choucair.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WelcomePage extends PageObject {
    public static final Target MSG_WELCOME = Target.the("Welcome message")
            .located(By.xpath("//strong[contains(text(),'How uTest Works')]"));
}
