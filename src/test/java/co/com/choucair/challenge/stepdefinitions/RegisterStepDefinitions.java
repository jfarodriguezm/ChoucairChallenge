package co.com.choucair.challenge.stepdefinitions;

import co.com.choucair.challenge.model.ChallengeData;
import co.com.choucair.challenge.questions.Answer;
import co.com.choucair.challenge.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RegisterStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Gustavo is in the home page of uTest website$")
    public void gustavo_is_in_the_home_page_of_uTest_website() {
        OnStage.theActorCalled("Gustavo").wasAbleTo(OpenUp.thePage());
    }

    @Given("^he wants signup in the website$")
    public void he_wants_signup_in_the_website() {
        OnStage.theActorInTheSpotlight().wasAbleTo(SignUp.onThePage());
    }

    @When("^he fills the about yourself form$")
    public void he_fills_the_about_yourself_form(List<ChallengeData>challengeData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(AboutYourselfForm.onThePage(challengeData.get(0).getStrFirstName(),challengeData.get(0).getStrLastName(),challengeData.get(0).getStrEmail(),challengeData.get(0).getStrMonth(),challengeData.get(0).getStrDay(),challengeData.get(0).getStrYear()));
    }

    @When(value = "^he adds your address information$")
    public void he_adds_your_address_information(List<ChallengeData>challengeData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(AddressForm.onThePage(challengeData.get(0).getStrZip()));
    }

    @When("^he inserts about his devices$")
    public void he_inserts_about_his_devices() {
        OnStage.theActorInTheSpotlight().attemptsTo(DevicesForm.onThePage());

    }

    @When("^he inserts and confirms the login password, and accepts terms and policies$")
    public void he_inserts_and_confirms_the_login_password_and_accepts_terms_and_policies(List<ChallengeData>challengeData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(FinalForm.onThePage(challengeData.get(0).getStrPassword(), challengeData.get(0).getStrConfirmPassword()));
    }

    @Then("^he is already see the welcome message$")
    public void he_is_already_see_the_welcome_message(List<ChallengeData>challengeData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(challengeData.get(0).getStrMsg())));
    }
}
