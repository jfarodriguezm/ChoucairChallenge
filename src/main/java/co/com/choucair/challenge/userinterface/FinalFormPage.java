package co.com.choucair.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinalFormPage extends PageObject {
    public static final Target INPUT_PASS = Target.the("where do we write the password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRMPASS = Target.the("where do we write the confirmation of the password")
            .located(By.id("confirmPassword"));
    public static final Target CHK_TERMS = Target.the("checkbox to confirm accepts terms")
            .located(By.id("termOfUse"));
    public static final Target CHK_POLICY = Target.the("checkbox to confirm accepts policy")
            .located(By.id("privacySetting"));
    public static final Target COMPLETE_BUTTON = Target.the("button to complete sign up")
            .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Complete Setup')]"));

}
