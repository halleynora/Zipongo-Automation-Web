Feature: Login to Zipongo demo accounts

  @smoke @loginhankmccoy
  Scenario: Login to demo account Hank McCoy and log out
    When Zipongo trial page is loaded
    Then click Log in Here! link
    Then log in with Hank McCoy demo account
    Then logout

  @smoke @loginangelabower
  Scenario: Login to demo account Angela Bower and log out
    When Zipongo trial page is loaded
    Then click Log in Here! link
    Then log in with Angela Bower demo account
    Then logout

#  @smoke @hankmccoyverifytopnavmenu
#  Scenario: Login to demo account Hank McCoy and verify top navigation menu
#    When Zipongo trial page is loaded
#    And click Log in Here! link
#    Then log in with Hank McCoy demo account
#    And verify correct order of top naviagtion links: Zipongo,Acme Inc,Home,CookItNow,Recipes,MyCafe,My Profile, Rewards
#    Then logout
#
#  @smoke @angelabowerverifytopnavmenu
#  Scenario: Login to demo account Angela Bower and verify top navigation menu
#    When Zipongo trial page is loaded
#    And click Log in Here! link
#    Then log in with Angela Bower demo account
#    And verify correct order of top naviagtion links: Zipongo,Acme Inc,Home,CookItNow,Recipes,MyCafe,My Profile, Rewards
#    Then logout