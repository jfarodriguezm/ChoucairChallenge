package co.com.choucair.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesFormPage extends PageObject {
    public static final Target NEXT_BUTTON = Target.the("button to confirm information")
            .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Next: Last Step')]"));
}
