package qaf.example.tests;

import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.verifyLinkWithPartialTextPresent;
import static qaf.example.steps.StepsLibrary.searchFor;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class SampleTest extends WebDriverTestCase {

	@Test
	public void testGoogleSearch() throws InterruptedException {
		
		get("https://www.google.com/");
		searchFor("qaf github ");
		verifyLinkWithPartialTextPresent("qaf");
		
	}
}
