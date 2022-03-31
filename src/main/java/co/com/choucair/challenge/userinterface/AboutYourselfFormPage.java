package co.com.choucair.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AboutYourselfFormPage extends PageObject {
    public static final Target INPUT_FIRSTNAME = Target.the("where do we write the firstname")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("where do we write the lastname")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the("where do we select the birth month")
            .located(By.id("birthMonth"));
    public static final Target INPUT_DAY = Target.the("where do we select the birth day")
            .located(By.id("birthDay"));
    public static final Target INPUT_YEAR = Target.the("where do we select the birth year")
            .located(By.id("birthYear"));
    public static final Target NEXT_BUTTON = Target.the("button to confirm information")
            .located(By.xpath("//div[@class='form-group col-xs-12 text-right']//span[contains(text(),'Next: Location')]"));


}
