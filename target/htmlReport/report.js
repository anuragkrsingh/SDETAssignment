$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 2,
  "name": "Upskill Assignment",
  "description": "",
  "id": "upskill-assignment",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Upskill"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Registration",
  "description": "",
  "id": "upskill-assignment;registration",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Upskill1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate to \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click Sign up",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Register by filling mandatory fields \"\u003cfirstName\u003e\", \"\u003clastName\u003e\", \"\u003cemail\u003e\", \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click register",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Validate registration confirmation message",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click on top rigth corner",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Validate \"\u003cfirstName\u003e\", \"\u003clastName\u003e\" and \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click inbox",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Compose a message \"\u003cmessage \u003e\"and send it to \"\u003crecipent\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Validate the message sent acknowledgement message",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "upskill-assignment;registration;",
  "rows": [
    {
      "cells": [
        "url",
        "firstName",
        "lastName",
        "email",
        "userName",
        "password",
        "recipent",
        "message"
      ],
      "line": 18,
      "id": "upskill-assignment;registration;;1"
    },
    {
      "cells": [
        "http://elearningm1.upskills.in/",
        "Abc",
        "def",
        "abc@ac.com",
        "xyz10",
        "asd",
        "nav",
        "test"
      ],
      "line": 19,
      "id": "upskill-assignment;registration;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5097511200,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Registration",
  "description": "",
  "id": "upskill-assignment;registration;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Upskill"
    },
    {
      "line": 4,
      "name": "@Upskill1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate to \"http://elearningm1.upskills.in/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click Sign up",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Register by filling mandatory fields \"Abc\", \"def\", \"abc@ac.com\", \"xyz10\" and \"asd\"",
  "matchedColumns": [
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click register",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Validate registration confirmation message",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click on top rigth corner",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Validate \"Abc\", \"def\" and \"abc@ac.com\"",
  "matchedColumns": [
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click inbox",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Compose a message \"\u003cmessage \u003e\"and send it to \"nav\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Validate the message sent acknowledgement message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://elearningm1.upskills.in/",
      "offset": 15
    }
  ],
  "location": "StepDefination.i_navigate_to(String)"
});
