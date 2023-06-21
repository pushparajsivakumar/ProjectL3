@feature11
Feature: To Add a staff into the system & fee collection

  @Sanity
  Scenario: To Add a staff into the system & fee collection
    Given To Launch the browser and Maximize the window
    When To launch the Url of application
    And To Login to the application using given credentials
    And Go to ‘Staff Profile Management’ menu and open ‘Staff Add’
    And To Enter all mandatory fields in 'Personal Details' section
    And To click ‘Save’ button, will add a new staff with the data entered
    And To Go to ‘Fee Configuration’ menu, you will land on ‘Fee Collection’
    And To Enter ‘200011312’ into the ‘Global Student Search’ box
    And To search
    And To Select one pending invoice under ‘Payable’ -> ‘Pending Invoice’ section
    And To choose the ‘Payment Mode’ under ‘Payments’(bottom left)
    And To Click on ‘Pay’ button(bottom right),
    And To Make sure that the payment has been completed successfully
    Then To close the chrome browser
