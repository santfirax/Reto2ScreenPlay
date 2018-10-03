package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.ui.OrangeHrm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PopUpEmploye implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		try {
			Thread.sleep(10000);
			return Text.of(OrangeHrm.ADD_EMPLOYE_LABEL).viewedBy(actor).asString();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		return Text.of(OrangeHrm.ADD_EMPLOYE_LABEL).viewedBy(actor).asString();
	}

	public static PopUpEmploye formEmploye() {
		
		return new PopUpEmploye();
	}

}
