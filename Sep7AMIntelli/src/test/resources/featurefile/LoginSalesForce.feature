Feature: Salesforce login validation

  @SC01 @errormessage @Salesforce @RegessionTest
    #Before
  Scenario: Validating the error message
    When user enters the username "xyz" and password "123"
    And user clicks on login button
    Then user validate the error message
#After

   @SC02  @Salesforce
     #Before
  Scenario: validate the login
    Given user navigates to salesforce login page
    When user enters the username "learnmore" and password "abc"
    And user clicks on login button
    Then user should navigate to homepage

    @aravinth
  Scenario: sample
    Given xyz




