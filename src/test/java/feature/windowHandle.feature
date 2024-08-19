Feature: Manejo de alerts

  Scenario: [CP-003] Switch entre ventanas de navegador
    Given enter the window handle website
    When click in window handle button
    Then Navigate in the new window
    And return principal window