package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioClass extends BaseClass {
	ScenarioPojo s;

	@Given("To Launch the browser and Maximize the window")
	public void to_Launch_the_browser_and_Maximize_the_window() {
		launchBrowser();
		windowMaximize();
	}

	@When("To launch the Url of application")
	public void to_launch_the_Url_of_application() {
		launchUrl("https://staging3-akes.nexquare.io/");
	}

	@When("To Login to the application using given credentials")
	public void to_Login_to_the_application_using_given_credentials() {
		s = new ScenarioPojo();
		passText("S0075", s.getUsername());
		passText("Abc!@1", s.getPassword());
		clickBtn(s.getLoginBtn());
	}

	@When("Go to ‘Staff Profile Management’ menu and open ‘Staff Add’")
	public void go_to_Staff_Profile_Management_menu_and_open_Staff_Add() {
		s = new ScenarioPojo();
		WebDriverWait waits = new WebDriverWait(driver, 3000);
		waits.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='link-name-newui'])[2]")));
		clickBtn(s.getNavBtn());
		clickBtn(s.getAddStaff());
	}

	@When("To Enter all mandatory fields in {string} section")
	public void to_Enter_all_mandatory_fields_in_section(String string) {
		s = new ScenarioPojo();
		passText("Pushparaj Sivakumar", s.getFullName());
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dob")));
		clickBtn(s.getDob());
		clickBtn(s.getMonthSelectorDOB());
		clickBtn(s.getMonthselectedDOB());
		clickBtn(s.getYearSelectionDOB());
		clickBtn(s.getYearSelectedDOB());
		clickBtn(s.getDOBDate());

		clickBtn(s.getDOJ());
		clickBtn(s.getDateDOJ());

		passText("pushparajsivakumar2@gmail.com", s.getEmail());

		clickBtn(s.getSalaryDate());
		clickBtn(s.getMonthSelector());
		clickBtn(s.getMonthSelected());
		clickBtn(s.getDaySelector());

	}

	@When("To click ‘Save’ button, will add a new staff with the data entered")
	public void to_click_Save_button_will_add_a_new_staff_with_the_data_entered() {
		s = new ScenarioPojo();
		clickBtn(s.getSaveButton());
	}

	@When("To Go to ‘Fee Configuration’ menu, you will land on ‘Fee Collection’")
	public void to_Go_to_Fee_Configuration_menu_you_will_land_on_Fee_Collection() {
		s = new ScenarioPojo();
		WebDriverWait wait0 = new WebDriverWait(driver, 3000);
		wait0.until(ExpectedConditions.elementToBeClickable(By.id("Fee Configuration")));
		clickBtn(s.getFeeConfiguration());
	}

	@When("To Enter ‘{int}’ into the ‘Global Student Search’ box")
	public void to_Enter_into_the_Global_Student_Search_box(Integer int1) {
		s = new ScenarioPojo();
		WebDriverWait wait1 = new WebDriverWait(driver, 3000);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("searchInput")));
		passText("200011312", s.getGlobalSearch());

	}

	@When("To search")
	public void to_search() {
		s = new ScenarioPojo();
		WebDriverWait wait2 = new WebDriverWait(driver, 3000);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='mat-button-wrapper'][1]")));
		clickBtn(s.getSearchBtn());

	}

	@When("To Select one pending invoice under ‘Payable’ -> ‘Pending Invoice’ section")
	public void to_Select_one_pending_invoice_under_Payable_Pending_Invoice_section() {

	}

	@When("To choose the ‘Payment Mode’ under ‘Payments’\\(bottom left)")
	public void to_choose_the_Payment_Mode_under_Payments_bottom_left() {
		s = new ScenarioPojo();
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("paymentAmount")));
		passText("3320", s.getEnterAmount());
	}

	@When("To Click on ‘Pay’ button\\(bottom right),")
	public void to_Click_on_Pay_button_bottom_right() {
		s = new ScenarioPojo();
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='mat-select-arrow-wrapper'])[14]")));
		clickBtn(s.getPaymentMode());
		

	}

	@When("To Make sure that the payment has been completed successfully")
	public void to_Make_sure_that_the_payment_has_been_completed_successfully() {
		s = new ScenarioPojo();
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		clickBtn(s.getPay());
		System.out.println("The Payment has been completed successfully");
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
		//closeEntireBrowser();
	}

}
