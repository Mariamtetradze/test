package Template.StepObject;

import Template.PageObject.HomePage;

public class HomePageSteps extends HomePage {

    public HomePageSteps SetFirstName(String fName) {
        firstName.setValue(fName);
        return this;
    }
}

