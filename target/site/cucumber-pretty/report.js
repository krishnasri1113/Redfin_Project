$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Redfin.feature");
formatter.feature({
  "line": 1,
  "name": "Redfin functionality",
  "description": "",
  "id": "redfin-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "search houses by min and max prices",
  "description": "",
  "id": "redfin-functionality;search-houses-by-min-and-max-prices",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Redfin site is launched",
  "keyword": "When "
});
formatter.step({
  "line": 4,
  "name": "when user enter the \"\u003ccity\u003e\" name",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click on search button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "select the city name from the list",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Select max house price",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Select min house price",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "redfin-functionality;search-houses-by-min-and-max-prices;",
  "rows": [
    {
      "cells": [
        "city"
      ],
      "line": 10,
      "id": "redfin-functionality;search-houses-by-min-and-max-prices;;1"
    },
    {
      "cells": [
        "Dallas"
      ],
      "line": 11,
      "id": "redfin-functionality;search-houses-by-min-and-max-prices;;2"
    },
    {
      "cells": [
        "Sunnyvale"
      ],
      "line": 12,
      "id": "redfin-functionality;search-houses-by-min-and-max-prices;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7471499600,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "search houses by min and max prices",
  "description": "",
  "id": "redfin-functionality;search-houses-by-min-and-max-prices;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Redfin site is launched",
  "keyword": "When "
});
formatter.step({
  "line": 4,
  "name": "when user enter the \"Dallas\" name",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click on search button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "select the city name from the list",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Select max house price",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Select min house price",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitionfile.redfin_site_is_launched()"
});
formatter.result({
  "duration": 122876600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dallas",
      "offset": 21
    }
  ],
  "location": "stepdefinitionfile.when_user_enter_the_name(String)"
});
formatter.result({
  "duration": 216315700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinitionfile.user_click_on_search_button()"
});
formatter.result({
  "duration": 134126800,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinitionfile.select_the_city_name_from_the_list()"
});
formatter.result({
  "duration": 777283000,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinitionfile.select_max_house_price()"
});
formatter.result({
  "duration": 3039271100,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinitionfile.select_min_house_price()"
});
formatter.result({
  "duration": 274134900,
  "status": "passed"
});
formatter.after({
  "duration": 4322865400,
  "status": "passed"
});
formatter.before({
  "duration": 6631598200,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "search houses by min and max prices",
  "description": "",
  "id": "redfin-functionality;search-houses-by-min-and-max-prices;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Redfin site is launched",
  "keyword": "When "
});
formatter.step({
  "line": 4,
  "name": "when user enter the \"Sunnyvale\" name",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click on search button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "select the city name from the list",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Select max house price",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Select min house price",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitionfile.redfin_site_is_launched()"
});
formatter.result({
  "duration": 1912100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale",
      "offset": 21
    }
  ],
  "location": "stepdefinitionfile.when_user_enter_the_name(String)"
});
formatter.result({
  "duration": 309670800,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinitionfile.user_click_on_search_button()"
});
formatter.result({
  "duration": 98439600,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinitionfile.select_the_city_name_from_the_list()"
});
formatter.result({
  "duration": 736851000,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinitionfile.select_max_house_price()"
});
formatter.result({
  "duration": 2330809800,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinitionfile.select_min_house_price()"
});
formatter.result({
  "duration": 315711200,
  "status": "passed"
});
formatter.after({
  "duration": 4089041200,
  "status": "passed"
});
});