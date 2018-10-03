package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.ui.OrangeHrm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class LogIn implements Task {
	OrangeHrm orangeHrm = new OrangeHrm();
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(orangeHrm));
		actor.attemptsTo(Click.on(OrangeHrm.LOG_IN_BUTTON));
		
	}

	public static LogIn onOrangeHrm() {
		
		return Tasks.instrumented(LogIn.class);
	}
	
}
