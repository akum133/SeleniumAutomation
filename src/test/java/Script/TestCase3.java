package Script;

import org.testng.annotations.Test;

import POMPages.CoreJava4Sel;
import genericLib.BaseClass;

public class TestCase3 extends BaseClass{
	@Test
	public void tc3() throws InterruptedException{
		CoreJava4Sel js = new CoreJava4Sel(driver);
		js.serachtextfield("core java for selenium");
		js.getSubmitbtn();
		js.getCourse();
		js.getPopup();
		utilies.switchFrames(driver);
		js.getPlaybtn();
		js.getPausebtn();
		utilies.switchBackFrame(driver);
		Thread.sleep(2000);
		js.getWishlist();
		Thread.sleep(2000);

	}
}
