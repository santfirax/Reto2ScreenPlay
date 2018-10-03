package co.com.proyectobase.screenplay.interactions;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class ToListTwo implements Interaction {
	private Target target;
	private String option;

	public ToListTwo(Target target, String option) {
		this.target = target;
		this.option = option;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElement> menuContent = target.resolveFor(actor).findElements(By.tagName("li"));
		for (int i = 0; i < menuContent.size(); i++) {
			System.out.println(menuContent.get(i).getText());
			List<WebElement> selectDropDown = target.resolveFor(actor).findElements(By.tagName("span"));
			for (int j = 0; j < menuContent.size(); j++) {
				System.out.println(menuContent.get(j).getText());
				if (selectDropDown.get(j).getText().trim().contains(option)) {
					System.out.println(selectDropDown.get(j).getText());
					selectDropDown.get(j).click();
					break;
				}
			}
		}

	}

	public static ToListTwo menu(Target target, String option) {
		return new ToListTwo(target, option);
	}

}