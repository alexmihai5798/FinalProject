Feature: Main Page
  These tests will verify the functionality of the main page

  Scenario: Valid enrollment button
    Given I am on the main page
    When I press Start enrollment button
    Then it start the enrollment

  Scenario: Valid virtual read more button
      Given I am on the main page
      When I press read more button
      Then it takes me to read more page

  Scenario: Valid subscribe for newsletter
    Given I am on the main page
    When I introduce "testing@test.com"
    Then a pop-up confirm the subscription

  Scenario: Valid instructor John Doe Twitter button
    Given I am on the instructor section
    When I press twitter button
    Then It takes me to the Twitter page

  Scenario: Valid accordion collapse when click on it
      Given I am on the FAQ section
      When I press on first accordion
      Then It have to collapse

  Scenario: Valid scroll back to the top button
      Given I am on the bottom of the main page
      When I press the arrow from lower corner
      Then It have to scroll up to the main page

  Scenario: Invalid subscribe to newsletter
      Given I am on the main page
      When I introduce "testing.test"
      Then the email box should be red

  Scenario: Invalid subscribe numbers
      Given I am on the main page
      When I introduce "123"
      Then the email box should be red

  Scenario: Virtual read more button
      Given I am on the main page
      When I press read more button from virtual section
      Then the page title should start with "virtual"

  Scenario: Valid sign up
      Given I am on the sign up page
      When I introduce the required data
      And I press next button
      Then a new page will open