package cucumber.resources;

import java.util.Random;

import cucumber.pages.SignUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    private SignUpPage signUpPage;
    private Random rand;

    @Given("User is on Homepage")
    public void user_is_on_homepage_scenario1() {
        this.signUpPage = new SignUpPage();
    }

    @Given("User clicks on the login button")
    public void user_clicks_on_the_login_button_scenario1() {
        signUpPage.clicarLogin("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a");
    }

    @When("User enters a name in the name field")
    public void user_enters_a_name_in_the_name_field1() {
        signUpPage.preencherCampoXpath("/html/body/section/div/div/div[3]/div/form/input[2]", "testename");
    }

    @When("User enters an email in the email field")
    public void user_enters_an_email_in_the_email_field() {
        rand = new Random();
        int randomNum = rand.nextInt(1000) + 1;
        signUpPage.preencherCampoXpath("/html/body/section/div/div/div[3]/div/form/input[3]", "teste" + randomNum + "@email.com");
        signUpPage.clicarXpath("/html/body/section/div/div/div[3]/div/form/button");
        System.out.println(randomNum);
    }

    @Then("User should be redirected to SignUp page.")
    public void user_should_be_redirected_to_sign_up_page() {
        signUpPage.paginaCerta("https://automationexercise.com/signup");
        signUpPage.verificarTextoPorXpath("/html/body/section/div/div/div/div[1]/h2/b", "Enter Account Information");
    }
 

    
@When("User enters an existing email in the email field")
public void user_enters_an_existing_email_in_the_email_field() {
    signUpPage.preencherCampoXpath("/html/body/section/div/div/div[3]/div/form/input[3]", "teste@email.com");
        signUpPage.clicarXpath("/html/body/section/div/div/div[3]/div/form/button");
}
@Then("User should get an error message")
public void user_should_get_an_error_message() {
    signUpPage.verificarTextoPorXpath("/html/body/section/div/div/div/div[1]/h2/b", "Email Address already exist!");
}
}