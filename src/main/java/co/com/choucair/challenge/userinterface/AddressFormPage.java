package co.com.choucair.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressFormPage extends PageObject {
    public static final Target INPUT_CITY = Target.the("where do we write the city")
            .located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("where do we write the zip")
            .located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("where do we select the country")
            .located(By.className("btn btn-default form-control ui-select-toggle"));
    public static final Target NEXT_BUTTON = Target.the("button to confirm information")
            .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Next: Devices')]"));
}
