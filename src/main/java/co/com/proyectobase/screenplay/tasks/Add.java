package co.com.proyectobase.screenplay.tasks;

import java.util.List;

import co.com.proyectobase.screenplay.interactions.ToList;
import co.com.proyectobase.screenplay.interactions.ToListTwo;
import co.com.proyectobase.screenplay.model.DataNewEmploye;
import co.com.proyectobase.screenplay.ui.OrangeHrm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Add implements Task {
	private List<DataNewEmploye> dataNewEmploye;
	public Add(List<DataNewEmploye> dataNewEmploye) {
		this.dataNewEmploye = dataNewEmploye;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue(dataNewEmploye.get(0).getFirstName()).into(OrangeHrm.FIRST_NAME));
		actor.attemptsTo(Enter.theValue(dataNewEmploye.get(0).getMiddleName()).into(OrangeHrm.MIDDLE_NAME));
		actor.attemptsTo(Enter.theValue(dataNewEmploye.get(0).getLastName()).into(OrangeHrm.LAST_NAME));
		actor.attemptsTo(Enter.theValue(dataNewEmploye.get(0).getEmployeId()).into(OrangeHrm.EMPLOYE_ID));
		actor.attemptsTo(Click.on(OrangeHrm.SELECT_LOCATION2));
		actor.attemptsTo(ToList.menu(OrangeHrm.SELECT_LOCATION2, dataNewEmploye.get(0).getLocation()));
		actor.attemptsTo(Click.on(OrangeHrm.LOGIN_CREDENTIAL_CHECKBOX));
		actor.attemptsTo(Enter.theValue(dataNewEmploye.get(0).getUserName()).into(OrangeHrm.USER_NAME_FIELD));
		actor.attemptsTo(Click.on(OrangeHrm.SELECT_STATUS));
		actor.attemptsTo(ToList.menu(OrangeHrm.SELECT_STATUS,dataNewEmploye.get(0).getStatus()));
		actor.attemptsTo(Enter.theValue(dataNewEmploye.get(0).getPassword()).into(OrangeHrm.PASSWORD_FIELD));
		actor.attemptsTo(Enter.theValue(dataNewEmploye.get(0).getConfirmPassword()).into(OrangeHrm.CONFIRM_PASSWORD_FIELD));
		actor.attemptsTo(Click.on(OrangeHrm.ADMIN_ROLE_SELECT));
		actor.attemptsTo(ToList.menu(OrangeHrm.ADMIN_ROLE_SELECT, dataNewEmploye.get(0).getAdminRole()));
		
		try {
			actor.attemptsTo(Click.on(OrangeHrm.SAVE_BUTTON));
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
	}

	public static Add dataNewEmploye(List<DataNewEmploye> dataNewEmploye) {
		
		return Tasks.instrumented(Add.class,dataNewEmploye);
	}

}
