package co.com.choucair.challenge.tasks;

import co.com.choucair.challenge.userinterface.FinalFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FinalForm implements Task {

    private String strPassword;
    private String strConfirmPassword;

    public FinalForm(String strPassword, String strConfirmPassword) {
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static FinalForm onThePage(String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(FinalForm.class, strPassword, strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strPassword).into(FinalFormPage.INPUT_PASS),
                Enter.theValue(strConfirmPassword).into(FinalFormPage.INPUT_CONFIRMPASS),
                Click.on(FinalFormPage.CHK_TERMS),
                Click.on(FinalFormPage.CHK_POLICY),
                Click.on(FinalFormPage.COMPLETE_BUTTON)
        );
    }
}
