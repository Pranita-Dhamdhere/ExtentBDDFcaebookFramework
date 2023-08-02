Feature: Test Facebook application

  Scenario Outline: Test register page Functionality
    Given user on register page
    When user enter "<firstname>" and "<Lastname>" and "<email>" and "<cemail>" and "<Password>" and "<date>" and "<month>" and "<year>"

    Examples: 
      | firstname | Lastname  | email             | cemail            | Password   | date | month | year |
      | sulbha    | Date      | sulbha@gmail.com  | sulbha@gmail.com  | sulbha@123 |   20 | Aug   | 1994 |
      | pranita   | dhamdhere | pranita@gmail.com | pranita@gmaol.com | pranita123 |   28 | sep   | 1991 |
      | vishal    | dhamdhere | vishal@gmail.com  | vishal@gmail.com  | vishal@123 |   26 | Feb   | 1988 |
