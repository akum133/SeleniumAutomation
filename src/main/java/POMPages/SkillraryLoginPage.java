package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement Skillrarydemoapp;
	
	public SkillraryLoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public void getGearsbtn() {
		gearsbtn.click();
	}

	public void getSkillrarydemoapp() {
		Skillrarydemoapp.click();
	}

}
