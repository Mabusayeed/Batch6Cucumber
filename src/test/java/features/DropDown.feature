Feature: Validate DropDown functionality

  Background: Launching App
    Given browser is open and navigate to the Base URL


  Scenario:TC-102 DropDown functionality should be able to work as expected
   # Given user navigate to practice page
    When user see the Select an option
    Then user can select option one
    Then user can select option two
    Then user can select option three

