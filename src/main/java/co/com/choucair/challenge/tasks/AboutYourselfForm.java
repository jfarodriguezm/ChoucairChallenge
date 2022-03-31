package co.com.choucair.challenge.tasks;

import co.com.choucair.challenge.userinterface.AboutYourselfFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class AboutYourselfForm implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;

    public AboutYourselfForm(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
    }

    public static AboutYourselfForm onThePage(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear) {
        return Tasks.instrumented(AboutYourselfForm.class, strFirstName, strLastName, strEmail, strMonth, strDay, strYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strFirstName).into(AboutYourselfFormPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(AboutYourselfFormPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(AboutYourselfFormPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMonth).from(AboutYourselfFormPage.INPUT_MONTH),
                SelectFromOptions.byVisibleText(strDay).from(AboutYourselfFormPage.INPUT_DAY),
                SelectFromOptions.byVisibleText(strYear).from(AboutYourselfFormPage.INPUT_YEAR),
                Click.on(AboutYourselfFormPage.NEXT_BUTTON)
        );
    }
}
