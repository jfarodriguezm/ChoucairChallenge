package co.com.choucair.challenge.tasks;

import co.com.choucair.challenge.userinterface.AddressFormPage;
import co.com.choucair.challenge.userinterface.FinalFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FinalForm implements Task {

    public static FinalForm onThePage() {
        return Tasks.instrumented(FinalForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Choucair2022*").into(FinalFormPage.INPUT_PASS),
                Enter.theValue("Choucair2022*").into(FinalFormPage.INPUT_CONFIRMPASS),
                Click.on(FinalFormPage.CHK_TERMS),
                Click.on(FinalFormPage.CHK_POLICY),
                Click.on(FinalFormPage.COMPLETE_BUTTON)
        );
    }
}
