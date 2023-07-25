Feature: Visa Confirmation Test
  As a user I want to confirm visa requirements

  @smoke, @regression
  Scenario: An Australian coming to UK for tourism
    Given I am on homepage
    When I click on accept cookies
    And I click on start button
    And  I select nationality "Australia"
    And I click on continue button in nationality page
    And I select reason "Tourism or visiting family and friends"
    And I Click on continue button in reason for travel page
    Then You will not need a visa to come to the UK message is displayed

    @sanity, @regression
      Scenario: A Chilean coming to the UK for work and plans on staying for longer then six months
      Given I am on homepage
      When I click on accept cookies
      And I click on start button
      And I select nationality "Chile"
      And I click on continue button in nationality page
      And I select reason "Work, academic visit or business"
      And I Click on continue button in reason for travel page
      And I select intend to stay for "longer than 6 months"
      And I click on continue button in duration of stay page
      And I select have planning to work for "Health and care professional"
      And I click on continue button in work type page
      Then You need a visa to work in health and care message is displayed
      
      @regression
      Scenario: A Columbian national coming to the UK to join a partner for a long stay they do have an article 100r20card
        Given I am on homepage
        When I click on accept cookies
        And I click on start button
        And I select nationality "Colombia"
        And I click on continue button in nationality page
        And I select reason "Join partner or family for a long stay"
        And I Click on continue button in reason for travel page
        Then You’ll need a visa to join your family or partner in the UK message is displayed