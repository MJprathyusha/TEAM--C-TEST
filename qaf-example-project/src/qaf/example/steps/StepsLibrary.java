package qaf.example.steps;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import com.qmetry.qaf.automation.step.QAFTestStep;

public class StepsLibrary {
	
	 
		@QAFTestStep(description = "search for {0}")
		public static void searchFor(String searchTerm) throws InterruptedException {
			sendKeys(searchTerm, "text.searchbox");
			Thread.sleep(5000);
			click("btn.search");
		}

}
