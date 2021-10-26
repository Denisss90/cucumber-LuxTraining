Feature: Shout feature name for report
  Link to Jira issue
  Event at multiple rows

  Scenario: Listener is withing range
    Given Lucy is in 14 m from Sean
    When Sean shouts 'Free bagels!!'
    Then Lucy hear sean message

  Scenario: Listener is withing range
    Given Lucy is in 14 m from Sean
    But Lucy is not hungry
    When Sean shouts 'Free bagels!!'
    Then Lucy not hear sean message


  Scenario: Listener is withing range
    Given Lucy is in 100 m from Sean
    When Sean shouts 'Free bagels!!'
    Then Lucy not hear sean message

