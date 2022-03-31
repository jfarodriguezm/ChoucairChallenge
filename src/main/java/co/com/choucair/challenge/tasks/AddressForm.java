package co.com.choucair.challenge.tasks;

import co.com.choucair.challenge.userinterface.AboutYourselfFormPage;
import co.com.choucair.challenge.userinterface.AddressFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;


public class AddressForm implements Task {

    public static AddressForm onThePage() {
        return Tasks.instrumented(AddressForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("110711").into(AddressFormPage.INPUT_ZIP),
                Click.on(AddressFormPage.NEXT_BUTTON)
        );

    }
}