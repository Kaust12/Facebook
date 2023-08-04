Feature: Test the FaceBook Application

  Scenario Outline: Test the RegisterPage
    Given User is on registerpage of facebook
    When user enter "<firstname>" and "<lastname>" and "<email>" and "<confirmemail>" and  "<password>" and "<Bday>" and  "<Bmonth>" and  "<Byear>"
    Then select gender
    And click on signup button

    Examples: 
      | firstname | lastname | email         | confirmemail  | password | Bday | Bmonth | Byear |
      | kaustubh  | lagad    | abc@gmail.com | abc@gmail.com | pass@123 |   10 | Mar    |  2000 |
      | samu      | kadu     | abc@gmail.com | abc@gmail.com | pass@123 |   20 | Aug    |  1997 |
      | Sanu      | Kadu     | abc@gmail.com | abc@gmail.com | pass@123 |   30 | Jan    |  1995 |
