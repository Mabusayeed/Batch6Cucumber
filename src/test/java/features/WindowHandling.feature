Feature: Handling the windows

# Ref Class #17

   Background: The Login Page should be open
    Given browser is open and navigate to the Base URL

  Scenario: TC -107 Validate that user handles multiples windows properly
   # Given User is in the practice page
    When user click on the open window
    Then validate that user can switch to the second window
    Then validate that user can switch to the second window