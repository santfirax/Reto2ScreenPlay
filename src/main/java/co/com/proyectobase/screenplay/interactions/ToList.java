package co.com.proyectobase.screenplay.interactions;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class ToList implements Interaction {
	private Target target;
	private String option;

	public ToList(Target target, String option) {
		this.target = target;
		this.option = option;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElement> menuContent = target.resolveFor(actor).findElements(By.tagName("li"));
		for (int i = 0; i < menuContent.size(); i++) {
			if (menuContent.get(i).getText().contains(option)) {
				System.out.println(menuContent.get(i).getText());
				menuContent.get(i).click();
				break;
			}
		}

	}

	public static ToList menu(Target target, String option) {
		return new ToList(target, option);
	}

}
