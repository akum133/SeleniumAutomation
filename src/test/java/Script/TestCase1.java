package Script;

import org.testng.annotations.Test;

import POMPages.AddtoCart;
import POMPages.SkillraryDemoApp;
import POMPages.SkillraryLoginPage;
import genericLib.BaseClass;

public class TestCase1 extends BaseClass {
	@Test
	public void tc1() throws InterruptedException {
	SkillraryLoginPage s = new SkillraryLoginPage(driver);
	s.getGearsbtn();
	s.getSkillrarydemoapp();
	
	SkillraryDemoApp sd = new SkillraryDemoApp(driver);
	utilies.switchingtabs(driver);
	utilies.mouseHover(driver, sd.getCoursetab());
	sd.Seleniumtrainingbtn();
	
	AddtoCart a = new AddtoCart(driver);
	utilies.doubleClick(driver,a.getAdd());
	a.addtocart();
	utilies.alertPopup(driver);
	Thread.sleep(4000);
	
}
}