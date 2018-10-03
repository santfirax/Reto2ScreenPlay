package co.com.proyectobase.screenplay.questions;

import java.util.List;

import co.com.proyectobase.screenplay.model.DataNewEmploye;
import co.com.proyectobase.screenplay.ui.OrangeHrm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class SearchFor implements Question<Boolean> {
	private List<DataNewEmploye> dataSearchEmployee;
	
	
	public SearchFor(List<DataNewEmploye> dataSearchEmployee) {
		this.dataSearchEmployee = dataSearchEmployee;
	}
	@Override
	public Boolean answeredBy(Actor actor) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		return Text.of(OrangeHrm.EMPLOYE_LIST_TABLE).viewedBy(actor).asString().contains(dataSearchEmployee.get(0).getEmployeeName());
	}
//	private Target target;
//	private String option;
//
//	public SearchFor(Target target, String option) {
//
//		this.target = target;
//		this.option = option;
//	}
//
//	@Override
//	public Boolean answeredBy(Actor actor) {
//
//		return inspectOnTableForEmployee(actor);
//	}
//
//	
//	public Boolean inspectOnTableForEmployee(Actor actor) {
//		List<WebElement> employeTable = target.resolveFor(actor).findElements(By.tagName("tr"));
//		for (int i = 0; i < employeTable.size(); i++) {
//			List<WebElement> employeRow = employeTable.get(i).findElements(By.tagName("td"));
//			for (int j = 0; j < employeRow.size(); j++) {
//				// if(employeRow.get(j).getText().contains(arg0))
//				/// System.out.println(employeRow.get(j).getText());
//				if (employeRow.get(j).getText().contains(option)) {
//					return true;
//				}
//
//			}
//
//		}
//
//		return false;
//
//	}
//
//	public static SearchFor Employee(Target target, String option) {
//
//		return new SearchFor(target, option);
//	}

	public static SearchFor Employee(List<DataNewEmploye> dataSearchEmployee) {
		
		return new SearchFor(dataSearchEmployee);
	}

}
