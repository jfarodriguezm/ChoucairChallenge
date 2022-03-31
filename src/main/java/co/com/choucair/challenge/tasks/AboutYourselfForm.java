package co.com.choucair.challenge.tasks;

import co.com.choucair.challenge.userinterface.AboutYourselfFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class AboutYourselfForm implements Task {


    public static AboutYourselfForm onThePage() {
        return Tasks.instrumented(AboutYourselfForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Gustavo").into(AboutYourselfFormPage.INPUT_FIRSTNAME),
                Enter.theValue("Moreno").into(AboutYourselfFormPage.INPUT_LASTNAME),
                Enter.theValue("j.r.m@correo.com").into(AboutYourselfFormPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("April").from(AboutYourselfFormPage.INPUT_MONTH),
                SelectFromOptions.byVisibleText("12").from(AboutYourselfFormPage.INPUT_DAY),
                SelectFromOptions.byVisibleText("1997").from(AboutYourselfFormPage.INPUT_YEAR),
                Click.on(AboutYourselfFormPage.NEXT_BUTTON)
        );
    }
}
