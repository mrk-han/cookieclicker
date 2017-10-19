# web-ui-testing-archetype

## Overview
This project archetype is meant to help you quickly get setup to start writing web automated tests.
 
### Importing
- Clone/Download this project
- Intellij
  - File > Open
  - Navigate to this project
  - Double click on the `pom.xml`
  - Click on `Open as project`
  - Click on `Delete existing project and import` (if prompted)

### Default Properties
Under the `default.properties` file you can specify the default properties for your project:
- `base_url` - Default base url to be use, e.g. (`https://willowtreeapps.com`)
- `browser` - Default browser to be used, i.e. (`chrome`, `safari`, `firefox`, etc.) 
- `timeout` - Default timeout for each call, in `seconds`.
- `screenshot_on_fail` - `true` or `false` whether you want to get a screenshot when a test fails 

### Base Page Class
This archetype comes with a `BasePage` class that should be used as the main place where reusable/shareable code is kept (i.e. css selectors for footer ui element and validation methods). Most of your other pages should extend from this `BasePage` class.

### Base Test Class
This archetype also comes with a `BaseTest` test class, similar to the `BasePage` class you can use this base test class for all the test that should be ran on every page. Most of your other test classes should extend this `BaseTest` class.

### Test Results
You can find the outputs under the following directories:
- Test Reports: `target\surefire-reports`
- Screenshots for failed tests: `target\test-screenshots`# cookieclicker
