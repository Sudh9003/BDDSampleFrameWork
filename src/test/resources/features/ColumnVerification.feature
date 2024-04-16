Feature: Validate Orange HRM Application
  @Smoke
 Scenario: User logs in By UserName and Password
 
  Given user navigate to the loginPage
  When user enters userID and password 
  And clicks on login button
  Then validate user name at dashboardpage
  
  
 @Regression
 Scenario: System User Search
   Given user navigate to the loginPage
   When user enters userID and password 
   And clicks on login button  
   Then user validate system user "Admin" search option
   Then user should be able to logout
 
   @Sanity
  Scenario Outline: Articles Column verification of Homepage
    Given I navigate to the HRM website
    When I am viewing the "<Page>" page
    Then I am presented with "<ColNum>" columns of articles
    And The Left "<LeftCol>" column is displaying "<LeftColArticlesNum>" articles
    And the Middle "<MiddleCol>" column is displaying "<MiddleColArticlesNum>" articles
    And The Right "<RightCol>" column is displaying "<RightColArticlesNum>" articles
    Examples:
      | Page | ColNum | LeftCol| MiddleCol | RightCol |LeftColArticlesNum | MiddleColArticlesNum | RightColArticlesNum |
      | Home | 3      | 2      | 1         | 3        | 2                 | 1                    | 4                   |


 