@tag
Feature: Data Table Test

  @Withoutheader
  Scenario: DataDriven test without header datatable credentials
    Given he is on webpage
    And he clicks the Login tab
    When he enter the below credentials
      | surenpetro@gmail.com | Bruce@wayne1586 |  
    And he clicks the Login tab again
    
 #The datatable here stores the values as 0,1 indexeswhen without header
 
 @WithHeader
  Scenario: DataDriven test with header datatable credentials
    Given user is on webpage
    And user clicks the Login tab
    When user enter the below credentials
    	| UserName						 | Password				 |
      | surenpetro@gmail.com | Bruce@wayne1586 |
        
    And user clicks the Login tab again