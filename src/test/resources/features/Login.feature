Feature: Login

  Scenario: User logs in
    When user is on the landing page
    When user logs in
    Then user should see "Web Orders" page title
