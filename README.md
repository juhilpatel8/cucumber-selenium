### Run Tests

Tests can be run against diff env by passing the right config file. The config files resides under
"src/main/resources/env_configs/*" dir

**Following command has to be used to run tests **

mvn clean test -Denv={ENV_CONFIG}

run test locally- mvn clean install -Denv=e2e-firefox
run test locally- mvn clean install -Denv=e2e-chrome
run test locally- mvn clean install -Denv=e2e-ie

Smoke Suite:
mvn clean test -Denv={ENV_CONFIG} -Dcucumber.options="--tags @smoke --tags ~@wip"

## Directory structure

-> Features- src/test/resources/
-> Stepdefs- src/test/java/stepdefs/

-> Pages- src/main/java/pages/
-> Locators- src/main/java/locators/