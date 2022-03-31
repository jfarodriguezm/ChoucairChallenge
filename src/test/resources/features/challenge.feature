# Autor: Jhonatan Rodriguez
@stories
  Feature: RegisterFeature
  This feature deal with the register new user functionality on the uTest page
  @Scenario1:
  Scenario: Register a new user
    Given Gustavo is in the home page of uTest website
    And he wants signup in the website
    When he fills the about yourself form
    And he adds your address information
    And he inserts about his devices
    And he inserts and confirms the login password, and accepts terms and policies
    Then he is already signup in the website




