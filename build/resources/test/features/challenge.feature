# Autor: Jhonatan Rodriguez
@stories
  Feature: RegisterFeature
  This feature deal with the register new user functionality on the uTest page

  @Scenario1:
  Scenario Outline: Register a new user
    Given Gustavo is in the home page of uTest website
    And he wants signup in the website
    When he fills the about yourself form
    | strFirstName    | strLastName    | strEmail   | strMonth    | strDay      | strYear       |
    | <strFirstName>  | <strLastName>  | <strEmail> | <strMonth>  | <strDay>   | <strYear>     |
    And he adds your address information
    | strZip      |
    | <strZip>    |
    And he inserts about his devices
    And he inserts and confirms the login password, and accepts terms and policies
    | strPassword      | strConfirmPassword      |
    | <strPassword>    | <strConfirmPassword>    |
    Then he is already see the welcome message
    | strMsg      |
    | <strMsg>    |

    Examples:
      | strFirstName | strLastName  | strEmail              | strMonth       | strDay      | strYear       | strZip  | strPassword   | strConfirmPassword | strMsg             |
      | name         | lastname     | email.j.f@email.com   | April          | 12          | 1997          | 110711  | Choucar2022*  | Choucar2022*       | welcome message    |