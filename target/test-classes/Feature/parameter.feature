
@tag
Feature: JobPortal Login Test
  
  @tag1
  Scenario: Successful Login test with valid credentials
    Given user is on jobportal page
    And he enters first name "Surendiran Ganapathy Thiyagarajan"
    And he enters phone number "7339569035"
    And he clicks on login button
    When he enter the "surenpetro@gmail.com" and "Bruce@wayne1586"
    And he clicks on Login Button
    Then he must see the welocome page 
    

  