package co.com.choucair.challenge.questions;

import co.com.choucair.challenge.userinterface.WelcomePage;
import com.vladsch.flexmark.ext.attributes.AttributesExtension;
import cucumber.api.java.bs.A;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.TextContent;

public class Answer implements Question<String> {
    private String question;

    public static Answer toThePage(){
        return new Answer();
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = TextContent.of(WelcomePage.MSG_WELCOME).viewedBy(actor).asString();
        return msg;
    }
}
