package co.com.choucair.challenge.questions;

import co.com.choucair.challenge.userinterface.WelcomePage;
import com.vladsch.flexmark.ext.attributes.AttributesExtension;
import cucumber.api.java.bs.A;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.TextContent;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){
        this.question=question;
    }

    public static Answer toThe(String question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;
        String msg = "";
        String aux = Text.of(WelcomePage.MSG_WELCOME).viewedBy(actor).asString();
        if (aux.equals("How uTest Works")){
            msg = "welcome message";
        }
        if (question.equals(msg)){
            result = true;
        }
        return result;
    }
}
