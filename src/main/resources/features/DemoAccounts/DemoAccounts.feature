Feature: Log into demo accounts

  @smoke
  Scenario: Log into Hank McCoy and Log out
    Given Zipongo trial page is loaded
    When click Log in Here! link
    And log in with Hank McCoy demo account
    Then logout


  @smoke
  Scenario: Log into Angela Bower and Log out
    Given Zipongo trial page is loaded
    When click Log in Here! link
    And log in with Angela Bower demo account
    Then logout


  @smoke @topnavmenu
  Scenario: Log into Hank McCoy and verify top navigation menu
    Given Zipongo trial page is loaded
    When click Log in Here! link
    And log in with Hank McCoy demo account
    Then verify Zipongo logo is clickable
    Then verify Acme Inc logo is clickable
    Then verify Home link is clickable
    Then verify CookItNow link is clickable
    Then verify Recipes link is clickable
    Then verify MyCafe link is clickable
    Then verify My Profile link is clickable
    Then verify Rewards link is clickable
    Then verify GroceryLIst button is clickable
    Then logout


  @smoke @topnavmenu
  Scenario: Log into Angela Bower and verify top navigation menu
    Given Zipongo trial page is loaded
    When click Log in Here! link
    And log in with Angela Bower demo account
    Then verify Zipongo logo is clickable
    Then verify Acme Inc logo is clickable
    Then verify Home link is clickable
    Then verify CookItNow link is clickable
    Then verify Recipes link is clickable
    Then verify MyCafe link is clickable
    Then verify My Profile link is clickable
    Then verify Rewards link is clickable
    Then verify GroceryLIst button is clickable
    Then logout


  @smoke @pods
  Scenario: Log into Hank McCoy and verify pods
    Given Zipongo trial page is loaded
    When click Log in Here! link
    And log in with Hank McCoy demo account
    Then verify Whats for Lunch pod
    Then verify See Your 23andMe Results pod
    Then verify Add your Biometrics pod
    Then verify Discover new Recipes pod
    Then logout

  @smoke @pods
  Scenario: Log into Angela Bower and verify pods
    Given Zipongo trial page is loaded
    When click Log in Here! link
    And log in with Angela Bower demo account
    Then verify Whats for Lunch pod
    Then verify See Your 23andMe Results pod
    Then verify Add your Biometrics pod
    Then verify Discover new Recipes pod
    Then logout

  @smoke @pods
  Scenario: Log into Hank McCoy and verify breakfast, lunch and dinner pods
    Given Zipongo trial page is loaded
    When click Log in Here! link
    And log in with Hank McCoy demo account
    Then verify View Breakfast Recipes pod
    Then verify View This Recipe on lunch pod
    Then verify VIew This Recipe on dinner pod
    Then logout

  @smoke @pods @test
  Scenario: Log into Angela Bower and verify breakfast, lunch and dinner pods
    Given Zipongo trial page is loaded
    When click Log in Here! link
    And log in with Angela Bower demo account
    Then verify View Breakfast Recipes pod
    Then verify View This Recipe on lunch pod
    Then verify VIew This Recipe on dinner pod
    Then logout