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