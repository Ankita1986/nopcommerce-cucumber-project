$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/demo/nopcommerce/recources/featurefile/books.feature");
formatter.feature({
  "line": 2,
  "name": "As a User I want to visit books page onto nopcommerce website",
  "description": "",
  "id": "as-a-user-i-want-to-visit-books-page-onto-nopcommerce-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Books"
    }
  ]
});
formatter.before({
  "duration": 13227068400,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should navigate to books page successfully",
  "description": "",
  "id": "as-a-user-i-want-to-visit-books-page-onto-nopcommerce-website;user-should-navigate-to-books-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on nopcommerce  homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on books link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should navigate to books page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestSteps.iAmOnNopcommerceHomepage()"
});
formatter.result({
  "duration": 184924300,
  "status": "passed"
});
formatter.match({
  "location": "BooksTestSteps.iClickOnBooksLink()"
});
formatter.result({
  "duration": 1761990400,
  "status": "passed"
});
formatter.match({
  "location": "BooksTestSteps.iShouldNavigateToBooksPageSuccessfully()"
});
formatter.result({
  "duration": 110364200,
  "status": "passed"
});
formatter.after({
  "duration": 747219200,
  "status": "passed"
});
formatter.before({
  "duration": 13053274700,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "User should sort books by a to z and verify it",
  "description": "",
  "id": "as-a-user-i-want-to-visit-books-page-onto-nopcommerce-website;user-should-sort-books-by-a-to-z-and-verify-it",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on books link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on sort by a to z",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should see books sorted in a to z order",
  "keyword": "Then "
});
formatter.match({
  "location": "BooksTestSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 40300,
  "status": "passed"
});
formatter.match({
  "location": "BooksTestSteps.iClickOnBooksLink()"
});
formatter.result({
  "duration": 1854221100,
  "status": "passed"
});
formatter.match({
  "location": "BooksTestSteps.iClickOnSortByAToZ()"
});
formatter.result({
  "duration": 1358765100,
  "status": "passed"
});
formatter.match({
  "location": "BooksTestSteps.iShouldSeeBooksSortedInAToZOrder()"
});
formatter.result({
  "duration": 125535800,
  "status": "passed"
});
formatter.after({
  "duration": 717802400,
  "status": "passed"
});
formatter.before({
  "duration": 10917936200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User should sort books by low to high price and verify it",
  "description": "",
  "id": "as-a-user-i-want-to-visit-books-page-onto-nopcommerce-website;user-should-sort-books-by-low-to-high-price-and-verify-it",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I click on books link",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I click on low to high",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should see books sorted in low to high price order",
  "keyword": "Then "
});
formatter.match({
  "location": "BooksTestSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 33600,
  "status": "passed"
});
formatter.match({
  "location": "BooksTestSteps.iClickOnBooksLink()"
});
formatter.result({
  "duration": 1658923000,
  "status": "passed"
});
formatter.match({
  "location": "BooksTestSteps.iClickOnLowToHigh()"
});
formatter.result({
  "duration": 596148900,
  "status": "passed"
});
formatter.match({
  "location": "BooksTestSteps.iShouldSeeBooksSortedInLowToHighPriceOrder()"
});
formatter.result({
  "duration": 83307900,
  "status": "passed"
});
formatter.after({
  "duration": 727429300,
  "status": "passed"
});
});