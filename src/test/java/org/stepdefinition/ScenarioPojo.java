package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScenarioPojo extends BaseClass {

	public ScenarioPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "txtuser")
	private WebElement Username;

	@FindBy(id = "txtpassword")
	private WebElement Password;

	@FindBy(id = "log-btn")
	private WebElement LoginBtn;

	@FindBy(xpath = "(//span[@class='link-name-newui'])[2]")
	private WebElement NavBtn;

	@FindBy(id = "link_addStaff")
	private WebElement AddStaff;

	@FindBy(id = "staffFullName")
	private WebElement FullName;

	@FindBy(id = "dob")
	private WebElement dob;

	@FindBy(xpath = "//select[@data-handler=\"selectMonth\"]")
	private WebElement monthSelectorDOB;

	@FindBy(xpath = "//option[text()='Mar']")
	private WebElement MonthselectedDOB;

	@FindBy(xpath = "//select[@data-handler=\"selectYear\"]")
	private WebElement yearSelectionDOB;

	@FindBy(xpath = "//option[text()='1998']")
	private WebElement YearSelectedDOB;

	@FindBy(xpath = "//a[text()='1']")
	private WebElement DOBDate;

	@FindBy(id = "joinDate")
	private WebElement DOJ;

	@FindBy(xpath = "//a[text()='1']")
	private WebElement DateDOJ;

	@FindBy(id = "email")
	private WebElement Email;

	@FindBy(id = "salaryStartDate")
	private WebElement SalaryDate;

	@FindBy(xpath = "//select[@class='ui-datepicker-month browser-default']")
	private WebElement monthSelector;

	@FindBy(xpath = "//option[text()='Apr']")
	private WebElement MonthSelected;

	@FindBy(xpath = "//a[text()='2']")
	private WebElement daySelector;

	@FindBy(id = "submitButton")
	private WebElement SaveButton;

	@FindBy(id = "Fee Configuration")
	private WebElement FeeConfiguration;

	@FindBy(id = "searchInput")
	private WebElement GlobalSearch;

	@FindBy(xpath = "//span[@class='mat-button-wrapper'][1]")
	private WebElement searchBtn;

	@FindBy(name = "paymentAmount")
	private WebElement EnterAmount;

	@FindBy(xpath = "(//div[@class='mat-select-arrow-wrapper'])[14]")
	private WebElement PaymentMode;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Pay;

	// Getters and Setters

	public WebElement getPay() {
		return Pay;
	}

	public WebElement getPaymentMode() {
		return PaymentMode;
	}

	public WebElement getEnterAmount() {
		return EnterAmount;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getGlobalSearch() {
		return GlobalSearch;
	}

	public WebElement getFeeConfiguration() {
		return FeeConfiguration;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getSalaryDate() {
		return SalaryDate;
	}

	public WebElement getMonthSelector() {
		return monthSelector;
	}

	public WebElement getMonthSelected() {
		return MonthSelected;
	}

	public WebElement getDaySelector() {
		return daySelector;
	}

	public WebElement getDateDOJ() {
		return DateDOJ;
	}

	public WebElement getDOJ() {
		return DOJ;
	}

	public WebElement getDOBDate() {
		return DOBDate;
	}

	public WebElement getYearSelectionDOB() {
		return yearSelectionDOB;
	}

	public WebElement getYearSelectedDOB() {
		return YearSelectedDOB;
	}

	public WebElement getMonthselectedDOB() {
		return MonthselectedDOB;
	}

	public WebElement getMonthSelectorDOB() {
		return monthSelectorDOB;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getFullName() {
		return FullName;
	}

	public WebElement getAddStaff() {
		return AddStaff;
	}

	public WebElement getNavBtn() {
		return NavBtn;
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

}
