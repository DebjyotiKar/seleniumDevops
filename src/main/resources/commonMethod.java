import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class commonMethod {
	
	WebDriver driver;
	@FindBy(xpath = "//title[text()='Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in']");
	WebElement title;
	
	public void getand validatePageTitle()
	{
		title.getText();
		
	}
	
	

}
