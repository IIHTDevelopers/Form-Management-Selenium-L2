package testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.awt.image.BufferedImage;

import pages.StartupPage;

public class LocatorsFactory extends StartupPage {
	//please write all the locators for facebook page only 

	By refreshButton = By.xpath("//button[@value='Refresh']"); 
	By logoIconLink = By.xpath("//a[@class='navbar-brand']"); 
	By CollapsibleGroup3 = By.xpath("//b[contains(text(), 'Collapsible Group 3 - Methhod Chaining')]"); 
	By autoCompleteTextBox = By.xpath("//input[@type='text']");
	By firstNameTextbox = By.xpath("//input[@placeholder='First Name']"); 
	By lastNameTextbox = By.xpath("//input[@placeholder='Last Name']"); 
	By emailTextField = By.xpath("//input[@placeholder=\"E mail\"]"); 
	By switchToNavigationMenu = By.xpath("//a[contains(text() , 'SwitchTo')]");
	By interactionNavigationMenu = By.xpath("//a[contains(text(), 'Interactions ')]"); 
	By shopIconButton = By.xpath("//a[.='Shop']"); 
	By alertWithOk = By.xpath("//a[.='Alert with OK ']");
	By countryDropdown = By.xpath("//select[@id='countries']"); 
	By registerNavigationMenu = By.xpath("//a[contains(text(), 'Register')]"); 
	By hockeyCheckBox = By.xpath("//input[@value='Hockey']"); 
	By maleRadioButton = By.xpath("//input[@value='Male']");
	By selectYear = By.xpath("//select[@placeholder='Year']");
	By seleniumWebDriver = By.xpath("//h4[contains(text(), 'Selenium WebDriver')]");
	By downloadNavigationMenu = By.xpath("//a[@class='nav-link']//span[contains(text(), 'Downloads')]");
	By seleniumDragAndDropImage = By.xpath("(//img[contains(@src, 'selenium.png')])[1]");
	By messageAfterClickingSakinaliumCrossBrowserTestingOption = By.id("feedback");
	public LocatorsFactory(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


public boolean compareImages(BufferedImage img1, BufferedImage img2) {
        // Image comparison logic
        // Example: Compare image dimensions and pixel values
         if (img1.getWidth() == img2.getWidth() && img1.getHeight() == img2.getHeight()) {
        for (int x = 0; x < img1.getWidth(); x++) {
            for (int y = 0; y < img1.getHeight(); y++) {
                if (img1.getRGB(x, y) != img2.getRGB(x, y))
                    return false;
            }
        }
    } else {
        return false;
    }
    return true;
    }


	//Expected data will be fetch from config.json file,path of the json file is:FaceBook_Automation_Dummy/src/main/resources/config.json

	public WebElement refreshButton(WebDriver driver) {
		WebElement refreshButtonWebElement = driver.findElement(refreshButton);
		return refreshButtonWebElement; 
	}
	
	public WebElement registerNavigationMenu(WebDriver driver) {
		WebElement registerNavigationMenuWebElement = driver.findElement(registerNavigationMenu);
		return registerNavigationMenuWebElement; 
	}

	public WebElement seleniumlogoIcon(WebDriver driver) {
		WebElement logoIconLinkWebElement = driver.findElement(logoIconLink);
		return logoIconLinkWebElement; 
	}
	
	public WebElement seleniumWebDriverText(WebDriver driver) {
		WebElement seleniumWebDriverTextWebElement = driver.findElement(seleniumWebDriver);
		return seleniumWebDriverTextWebElement; 
	}
	
	public WebElement downloadNavigationMenu(WebDriver driver) {
		WebElement downloadNavigationMenuWebElement = driver.findElement(downloadNavigationMenu);
//		commonEvents.waitTillElementLocated(downloadNavigationMenu, 60);
		return downloadNavigationMenuWebElement; 
	}
	
	public WebElement CollapsibleGroup3(WebDriver driver) {
		WebElement CollapsibleGroup3WebElement = driver.findElement(CollapsibleGroup3);
		return CollapsibleGroup3WebElement;  
	}
	
	public WebElement autoCompleteTextBox(WebDriver driver) {
		WebElement autoCompleteTextBoxWebElement = driver.findElement(autoCompleteTextBox);
		return autoCompleteTextBoxWebElement; 
	}
	
	public WebElement emailTextFieldIsPresent(WebDriver driver) {
		WebElement emailTextFieldWebElement = driver.findElement(emailTextField);
        return emailTextFieldWebElement;
    }
	
	public WebElement firstNameTextboxIsPresent(WebDriver driver) {
		WebElement firstNameTextboxWebElement = driver.findElement(firstNameTextbox);
        return firstNameTextboxWebElement;
    }
	
	public WebElement lastNameTextboxIsPresent(WebDriver driver) {
		WebElement lastNameTextboxWebElement = driver.findElement(lastNameTextbox);
        return lastNameTextboxWebElement;
    }
	
	public WebElement getswitchToNavigationMenu(WebDriver driver) {
		WebElement switchToNavigationMenuWebElement = driver.findElement(switchToNavigationMenu);
        return switchToNavigationMenuWebElement;
    }
	
	public WebElement interactionNavigationMenu(WebDriver driver) {
		WebElement interactionNavigationMenuWebElement = driver.findElement(interactionNavigationMenu);
        return interactionNavigationMenuWebElement;
    }
	
	public WebElement getAlertWithOkButton(WebDriver driver) {
		WebElement alertWithOkWebElement = driver.findElement(alertWithOk);
        return alertWithOkWebElement;
    }

	
	public WebElement countryDropdownIsPresent(WebDriver driver) {
		WebElement countryDropdownWebElement = driver.findElement(countryDropdown);
        return countryDropdownWebElement;
    }
	
	public WebElement hockeyCheckBox(WebDriver driver) {
		WebElement hockeyCheckBoxWebElement = driver.findElement(hockeyCheckBox);
        return hockeyCheckBoxWebElement;
    }
	
	public WebElement maleradioButton(WebDriver driver) {
		WebElement maleRadioButtonWebElement = driver.findElement(maleRadioButton);
        return maleRadioButtonWebElement;
    }
	
	public WebElement selectYearDropdown(WebDriver driver) {
		WebElement selectYearDropdownWebElement = driver.findElement(selectYear);
        return selectYearDropdownWebElement;
    }
	
	public WebElement seleniumDragAndDropImage(WebDriver driver) {
		WebElement seleniumDragAndDropImageWebElement = driver.findElement(seleniumDragAndDropImage);
        return seleniumDragAndDropImageWebElement;
    }

	public WebElement messageAfterClickingSakinaliumCrossBrowserTestingOptionIsPresent(WebDriver driver) {
		WebElement messageAfterClickingSakinaliumCrossBrowserTestingOptionWebElement = driver.findElement(messageAfterClickingSakinaliumCrossBrowserTestingOption);
        return messageAfterClickingSakinaliumCrossBrowserTestingOptionWebElement;
    }
}
