Feature: Login functionality

  #@Functionaltest
  #Scenario: Successful Login with Valid Credentials
  #Given user opens browser
  #And user enter website name "saucedemo"
  #And use enters login id "standard_user" and password "secret_sauce"
  #And user close browser
  #
  #Scenario Outline: Title of your scenario outline
  #Given user opens "CH" browser and open website "saucedemo"
  #And use enters login id "<LoginId>" and password "<Password>"
  #
  #
  #Examples:
  #| LoginId | Password |
  #| standard_user |secret_sauce |
  #| problem_user  | secret_sauce|
  #
  @smoketest
  Scenario: Check login functionality
    Given use enters login id "standard_user" and password "secret_sauce"
    And user adds "Sauce Labs Backpack" to cart
    And user adds "Sauce Labs Bike Light" to cart
    And user go to Cart section
    And user check if cart has 2 prodcuts
    And user buy the product

  #
  @Regressiontest
  Scenario: Check login functionality
    Given use enters login id "standard_user" and password "secret_sauce"
