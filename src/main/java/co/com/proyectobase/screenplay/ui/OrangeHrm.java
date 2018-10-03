package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://orangehrm-demo-6x.orangehrmlive.com/")
public class OrangeHrm extends PageObject {

	public static final Target LOG_IN_BUTTON = Target.the("log in buttong").located(By.id("btnLogin"));
	public static final Target MENU_CONTENT = Target.the("menu content").located(By.id("menu-content"));
	public static final Target ADD_EMPLOYE = Target.the("add employe option").located(By.id("menu_pim_addEmployee"));
	public static final Target FIRST_NAME = Target.the("first name field").located(By.id("firstName"));
	public static final Target MIDDLE_NAME = Target.the("middle name field").located(By.id("middleName"));
	public static final Target LAST_NAME = Target.the("last name field").located(By.id("lastName"));
	public static final Target EMPLOYE_ID = Target.the("employe id field").located(By.id("employeeId"));
	public static final Target ADD_EMPLOYE_LABEL = Target.the("add employe menu label").located(By.cssSelector("#addEmployeeModal > h4"));
	public static final Target SELECT_LOCATION = Target.the("select location").located(By.className("select-dropdown"));
	public static final Target SELECT_LOCATION2 = Target.the("select location").located(By.id("location_inputfileddiv"));
	public static final Target LOGIN_CREDENTIAL_CHECKBOX = Target.the("loging credentials checkbox").located(By.cssSelector("#pimAddEmployeeForm > div.modal-content > div > materializecss-decorator:nth-child(3) > div > sf-decorator > div > label"));
	public static final Target SELECT_STATUS = Target.the("select status").located(By.id("status_inputfileddiv"));
	public static final Target USER_NAME_FIELD = Target.the("username field").located(By.id("username"));
	public static final Target PASSWORD_FIELD = Target.the("password field").located(By.id("password"));
	public static final Target CONFIRM_PASSWORD_FIELD = Target.the("confirm password field").located(By.id("confirmPassword"));
	public static final Target ADMIN_ROLE_SELECT = Target.the("select admin role").located(By.id("adminRoleId_inputfileddiv"));
	public static final Target SAVE_BUTTON = Target.the("save button").located(By.id("systemUserSaveBtn"));
	public static final Target EMPLOYEE_LIST = Target.the("Employee list field").located(By.id("menu_pim_viewEmployeeList"));
	public static final Target EMPLOYEE_NAME_SEARCH_FIELD = Target.the("emplyee name search field").located(By.id("employee_name_quick_filter_employee_list_value"));
	public static final Target EMPLOYE_LIST_TABLE = Target.the("employe search").located(By.id("employeeListTable"));

}
