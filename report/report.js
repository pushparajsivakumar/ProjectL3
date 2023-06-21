$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Scenarioss1.feature");
formatter.feature({
  "name": "To Add a staff into the system \u0026 fee collection",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@feature11"
    }
  ]
});
formatter.scenario({
  "name": "To Add a staff into the system \u0026 fee collection",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@feature11"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "To Launch the browser and Maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenarioClass.to_Launch_the_browser_and_Maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the Url of application",
  "keyword": "When "
});
formatter.match({
  "location": "ScenarioClass.to_launch_the_Url_of_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Login to the application using given credentials",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioClass.to_Login_to_the_application_using_given_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Go to ‘Staff Profile Management’ menu and open ‘Staff Add’",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioClass.go_to_Staff_Profile_Management_menu_and_open_Staff_Add()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Enter all mandatory fields in \u0027Personal Details\u0027 section",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioClass.to_Enter_all_mandatory_fields_in_section(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click ‘Save’ button, will add a new staff with the data entered",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioClass.to_click_Save_button_will_add_a_new_staff_with_the_data_entered()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Go to ‘Fee Configuration’ menu, you will land on ‘Fee Collection’",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioClass.to_Go_to_Fee_Configuration_menu_you_will_land_on_Fee_Collection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Enter ‘200011312’ into the ‘Global Student Search’ box",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioClass.to_Enter_into_the_Global_Student_Search_box(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To search",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioClass.to_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Select one pending invoice under ‘Payable’ -\u003e ‘Pending Invoice’ section",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioClass.to_Select_one_pending_invoice_under_Payable_Pending_Invoice_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To choose the ‘Payment Mode’ under ‘Payments’(bottom left)",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioClass.to_choose_the_Payment_Mode_under_Payments_bottom_left()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Click on ‘Pay’ button(bottom right),",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioClass.to_Click_on_Pay_button_bottom_right()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Make sure that the payment has been completed successfully",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioClass.to_Make_sure_that_the_payment_has_been_completed_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioClass.to_close_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
});