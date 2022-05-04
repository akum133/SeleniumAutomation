package Script;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import POMPages.SkillraryDemoApp;
import POMPages.SkillraryLoginPage;
import POMPages.TestingPage;
import genericLib.BaseClass;

public class TestCase2 extends BaseClass{
	@Test
	public void tc2() throws IOException, InterruptedException {
	SkillraryLoginPage s = new SkillraryLoginPage(driver);
	s.getGearsbtn();
	s.getSkillrarydemoapp();
	
	SkillraryDemoApp sd = new SkillraryDemoApp(driver);
	utilies.switchingtabs(driver);
	utilies.dropDown(sd.getGetaddress(), pdata.getPropertyfiledata("dropdowndata"));
	
	TestingPage t = new TestingPage(driver);
	utilies.draganddrop(driver,t.getSeleniumtraining(),t.getCart());
	Point loc = t.getCart().getLocation();
	int x= loc.getX();
	int y= loc.getY();
	utilies.scrollBar(driver,x,y);
	}
	

}
