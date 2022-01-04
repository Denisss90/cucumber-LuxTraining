@shout
  Feature: Shout feature
    The first feature, link to jira issue XX-YY

    Background: example
      Given Print text to console "Scenario start"

    @tag1 @tag2
    Scenario: Listener is within range
      Given Lucy is in 14 m from Sean
      When Sean shouts "Free bagels!!!"
      Then Lucy hear Sean message

    @lucy @outline
    Scenario: Lucy is not hungry
      Given Lucy is in 14 m from Sean
      And Lucy is not hungry
      When Sean shouts "Free bagels!!!"
      Then Lucy not hear Sean message

    @lucy
    Scenario: Lucy is out of range hungry
      Given Lucy is in 100 m from Sean
      When Sean shouts "Free bagels!!!"
      Then Lucy not hear Sean message

    Scenario: bullet time
      * Lucy is in 10 m from Sean
      * Sean shouts "Hello!!!"
      * Lucy hear Sean message

    Scenario Outline: outline example
      Given Lucy is in <distance> m from Sean
      When Sean shouts "<message>"
      Then Lucy hear Sean message

    Examples:
      | distance | message    |
      | 12       | Yahoo      |
      | 13       | Test       |
      | 16       | Google it! |

