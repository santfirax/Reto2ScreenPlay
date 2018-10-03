package co.com.proyectobase.screenplay.stepdefinitions;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.fasterxml.classmate.util.ResolvedTypeCache.Key;

import co.com.proyectobase.screenplay.model.DataNewEmploye;
import co.com.proyectobase.screenplay.questions.PopUpEmploye;
import co.com.proyectobase.screenplay.questions.SearchFor;
import co.com.proyectobase.screenplay.tasks.Add;
import co.com.proyectobase.screenplay.tasks.ClickOn;
import co.com.proyectobase.screenplay.tasks.LogIn;
import co.com.proyectobase.screenplay.ui.OrangeHrm;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.Matchers.equalTo;

public class OrangeHrmDefinitions {

	@Managed
	private WebDriver hisBrowser;
	private Actor Juan = Actor.named("Juan");

	@Before
	public void initialSetup() {
		Juan.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^that Juan needs to create an employe in OrageHR$")
	public void thatJuanNeedsToCreateAnEmployeInOrageHR() throws Exception {
		Juan.wasAbleTo(LogIn.onOrangeHrm());

	}

	@When("^he performs the entry of the record in the application$")
	public void hePerformsTheEntryOfTheRecordInTheApplication(List<DataNewEmploye> dataNewEmploye) throws Exception {
		Juan.attemptsTo(ClickOn.menuOption(dataNewEmploye, OrangeHrm.ADD_EMPLOYE, 0));
		Juan.should(seeThat(PopUpEmploye.formEmploye(), equalTo(dataNewEmploye.get(0).getTitlePopUp())));
		Juan.attemptsTo(Add.dataNewEmploye(dataNewEmploye));

	}

	@Then("^he visualize the new employe in the application$")
	public void heVisualizeTheNewEmployeInTheApplication(List<DataNewEmploye> dataSearchEmployee) throws Exception {
		Juan.attemptsTo(Click.on(OrangeHrm.EMPLOYEE_LIST));
		Juan.attemptsTo(Enter.theValue(dataSearchEmployee.get(0).getEmployeeName()).into(OrangeHrm.EMPLOYEE_NAME_SEARCH_FIELD).thenHit(Keys.ENTER));
		Juan.should(seeThat(SearchFor.Employee(dataSearchEmployee), equalTo(true)));

	}

}
