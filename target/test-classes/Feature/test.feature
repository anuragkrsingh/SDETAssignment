@Upskill
Feature: Upskill Assignment

  @Upskill1
  Scenario Outline: Registration
    Given I navigate to "<url>"
    When Click Sign up
    And Register by filling mandatory fields "<firstName>", "<lastName>", "<email>", "<userName>" and "<password>"
    And click register
    Then Validate registration confirmation message
    When Click on top rigth corner
    And Validate "<firstName>", "<lastName>" and "<email>"
    And Click inbox
    And Compose a message "<message >"and send it to "<recipent>"
    Then Validate the message sent acknowledgement message

    Examples: 
      | url                             | firstName | lastName | email      | userName | password | recipent | message |
      | http://elearningm1.upskills.in/ | Abc       | def      | abc@ac.com | xyz11    | asd      | virat     | test    |
