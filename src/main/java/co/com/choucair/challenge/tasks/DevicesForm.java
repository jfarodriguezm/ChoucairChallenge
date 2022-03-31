package co.com.choucair.challenge.tasks;

import co.com.choucair.challenge.userinterface.DevicesFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class DevicesForm implements Task {


    public static DevicesForm onThePage() {
        return Tasks.instrumented(DevicesForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DevicesFormPage.NEXT_BUTTON)
        );
    }
}
