package co.com.proyectobase.screenplay.tasks;

import java.util.List;

import co.com.proyectobase.screenplay.interactions.ToList;
import co.com.proyectobase.screenplay.model.DataNewEmploye;
import co.com.proyectobase.screenplay.ui.OrangeHrm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickOn implements Task {
	private List<DataNewEmploye> dataNewEmploye;
	private Target target;
	private int option;

	public ClickOn(List<DataNewEmploye> dataNewEmploye, Target target, int option) {
		this.dataNewEmploye = dataNewEmploye;
		this.target = target;
		this.option = option;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// actor.attemptsTo(ToList.menu(OrangeHrm.MENU_CONTENT,dataNewEmploye.get(0).getOption()));
		// actor.attemptsTo(Click.on(OrangeHrm.ADD_EMPLOYE));
		actor.attemptsTo(ToList.menu(OrangeHrm.MENU_CONTENT, dataNewEmploye.get(option).getOption()));
		actor.attemptsTo(Click.on(target));
	}

	public static ClickOn menuOption(List<DataNewEmploye> dataNewEmploye, Target target, int option) {
		return Tasks.instrumented(ClickOn.class, dataNewEmploye, target, option);
	}

}
