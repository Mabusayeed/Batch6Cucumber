Feature: Login Feature

  Background: The Login Page should be open
    Given browser is open and navigate to the Base URL

    Scenario Outline:TC-101 valid user should be able to login to the application
      Given user navigate to the login page
      When user enter valid <username>
      And user enter a valid <password>
      And user click on login Button
    #  Then Validate that user is navigated to the home page

      Examples:

        | username      | password      |
        | "Mohammad"    | "Mohammad01"   |
        | "Msayeed"     | "Msayeed02"   |
        | "Sayeed"      | "Sayeed03"    |











