Feature: Validate DropDown functionality

  Background: Launching App
    Given browser is open and navigate to the Base URL


  Scenario:TC-101 DropDown functionality should be able to work as expected
   # Given user navigate to practice page
    When user hover the mouse over the option
    Then user can select Option one using Actions Class
    Then user can select Option two using Actions Class

