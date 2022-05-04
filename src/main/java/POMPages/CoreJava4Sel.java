package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJava4Sel {
	@FindBy(name="q")
	private WebElement searchtext;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitbtn;
	
	@FindBy(xpath="(//img[@id='image-3'])[2]")
	private WebElement course;
	
	@FindBy(xpath="//a[text()='X']")
	private WebElement popup;

	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbtn;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement wishlist;

	public CoreJava4Sel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void serachtextfield(String searchvalue) {
		searchtext.sendKeys(searchvalue);
	}
	
	public void getSubmitbtn() {
		submitbtn.click();
	}
	
	public void getCourse() {
		course.click();
	}
	
	public void getPopup() {
		popup.click();
	}

	public void getPlaybtn() {
		playbtn.click();
	}
	
	public void getPausebtn() {
		pausebtn.click();
	}
	
	public void getWishlist() {
		wishlist.click();
	}
	
}
