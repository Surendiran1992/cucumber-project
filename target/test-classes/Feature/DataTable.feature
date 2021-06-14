@dataTable
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
    
    #The datatable here stores the values as column indexes 0,1,2,3 when with header
    
    @WithExamples
  Scenario Outline: DataDriven test with Examples datatable credentials
    Given she is on webpage
    And she clicks the Login tab
    When she enter the <UserName> and <Password>
    And she clicks the Login tab again
    
    Examples:
    
    | UserName						 			| Password				  |
    | surenpetro@gmail.com 			| Bruce@wayne1586 	|
    | surendiran92@outlook.com 	| suren11343434 		|
    | gt.suren92.com					 	| suren11343434			| 