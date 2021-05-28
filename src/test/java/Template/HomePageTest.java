package Template;

import Template.StepObject.HomePageSteps;
import Template.Utils.ChromeRunner;
import org.testng.annotations.Test;

import static Template.DataObject.HomePageData.*;


public class HomePageTest extends ChromeRunner {
    @Test
    public void personalInfo () {
        HomePageSteps steps = new HomePageSteps();
        steps
                .SetFirstName(FirstName);
    }
}
