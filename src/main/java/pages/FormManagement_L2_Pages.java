package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormManagement_L2_Pages extends StartupPage 
{

	By firstNameTextbox = By.xpath(""); 
	By lastNameTextbox = By.xpath("");
	By addressInputAreabox =By.xpath("");
	By emailAddressTextbox = By.xpath("");
	By phoneNumberTextbox = By.xpath("");
	By maleRadioButton = By.xpath("");
	By feMaleRadioButton =By.xpath("");
	By CricketCheckBox = By.xpath("");
	By MoviesCheckBox = By.xpath(""); 
	By HockeyCheckBox = By.xpath(""); 
	By languageDropdown = By.xpath("");
	By selectEnglish = By.xpath(""); 
	By selectCountryIndia = By.xpath(""); 
	By selectYear = By.xpath("");
	By selectMonth = By.xpath("");
	By selectDate = By.xpath("");
	By password = By.xpath("");
	By confirmPassword = By.xpath("");
	By submitButton = By.xpath("");
	By refreshButton = By.xpath("");
	By skillsDropdown = By.xpath("");
	By countryDropdown = By.xpath("");
	By radioButton = By.xpath("");
	By switchToNavigationMenu = By.xpath(""); 
	By window = By.xpath("");
	By clickLink = By.xpath("");
	By openNewSeparateWindowLink =By.xpath("");
	By newWindowclickLink = By.xpath("");
	By openMultipleSeparateWindowLink = By.xpath("");
	By newMultipleWindowclickLink =By.xpath("");
	By skipSignInButton = By.xpath("");
	By widgetsMenu = By.xpath("");
	By accordionList = By.xpath("");
	By accordionListToggle = By.xpath("");;
	By accordionListTogglePannel2Text =By.xpath("");
	By autoCompleteLink = By.xpath("");
	By autoCompleteTextBox = By.xpath("");
	By signInButton = By.xpath("");
	By homeIcon = By.xpath("");
	By registerNavigationMenu = By.xpath(""); 
	By interactioNavigationMenu = By.xpath("");
	By dragAndDrop = By.xpath("");
	By staticButton = By.xpath("");
	By sourceLocationseleniumLogo = By.xpath("");
	By targetLocationseleniumLogo = By.xpath("");
	


	//Getting the page name
	String pageName = this.getClass().getSimpleName();


	//constructor Initialization
	public FormManagement_L2_Pages(WebDriver driver) 
	{
		super(driver);
	}	


	//Utilization
	
	/**@Test1
	 * about this method goTohomeThenClickOnSignInButtOnValidateTitleOfTheSignInPage() 
	 * @param : null
	 * @description : Click on the home and click on the sign in button then validate the title of the page 
	 * @return : String
	 * @author : yaksha
	 */
	public String goTohomeThenClickOnSignInButtOnValidateTitleOfTheSignInPage() throws Exception {
		return null;
	}
	
	
	/**@Test2
	 * about this method goBackToIndexPageclickonSkipSignInButtonAndValidateTheRegisterPageTitle() 
	 * @param : null
	 * @description :Going back to the index page then click on the signIn button and validate the page title.
	 * @return : String
	 * @author : yaksha
	 */
	public String goBackToIndexPageclickonSkipSignInButtonAndValidateTheRegisterPageTitle() throws Exception {
		return null;
	}
	
	
	/**@Test3
	 * about this method thenFillTheRegisterFormAndClickOnRefreshButton() 
	 * @param : Map<String, String>
	 * @description :Fill all the fields and click on refresh button
	 * @return : boolean
	 * @author : yaksha
	 */
		public boolean thenFillTheRegisterFormAndClickOnRefreshButton(Map<String, String> expectedData) throws Exception {
			return false;	
	}

	/**@Test4.1
	 * about this method fillTheForms() 
	 * @param : Map<String, String>
	 * @description : fill emailAddsPhoneNumberTextbox then enter data in passwordTextbox and click on login button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean fillTheForms(Map<String, String> expectedData) throws Exception {
		return false;	
	}



	/**@Test4.2
	 * about this method VerifyThatClickingOnRefreshButtonItsRefreshingAllTheEnteredDataInAllTheFields() 
	 * @param : null
	 * @description : it will click on refresh button after fill the form then check each fields is empty or not
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean VerifyThatClickingOnRefreshButtonItsRefreshingAllTheEnteredDataInAllTheFields() throws Exception {
		return false;	
	}

	/** @test5
	 * about this method verifyTitleOfNewTab() 
	 * @param : null
	 * @description : here control go to the new Tab and get the title  of the new tab page,
	 * @return : title of string type
	 * @author : Yaksha
	 */
	public String verifyTitleOfNewTab() throws Exception {
		return null;	

	}

	/** @test6
	 * about this method verifyTitleOfNewWindows() 
	 * @param : null
	 * @description : here control goes to the new window and get the title  of the new window page,
	 * @return : title of string type
	 * @author : Yaksha
	 */
	public String verifyTitleOfNewWindows() throws Exception {
		return null;	
	}

	/** @test7
	 * about this method verifyTitleOfMultipleWindows() 
	 * @param : null
	 * @description : here control goes to the new window and get the title  of the new window page,
	 * @return : title of string type
	 * @author : Yaksha
	 */
	public String verifyTitleOfMultipleWindows() throws Exception {
		return null;	
	}
	
	/**@Test8
	 * about this method gotoInteractionTabclickOnDragandDropThenClickOnStaticThenValidateTitleOfThePage() 
	 * @param :null
	 * @description :go to Interaction Tab click On Drag and Drop Then Click On Static Then Validate Title Of The Page
	 * @return : String
	 * @author : yaksha
	 */	
	
	public String gotoInteractionTabclickOnDragandDropThenClickOnStaticThenValidateTitleOfThePage() throws Exception {
		return null;	
	}
	
	

	/**@Test9
	 * about this method selecttheSeleniumLogoAndPerformDragAndDropOperation() 
	 * @param :null
	 * @description :Select the selenium logo and perform drag and drop operation
	 * @return : boolean
	 * @author : yaksha
	 */	
	
	public boolean selecttheSeleniumLogoAndPerformDragAndDropOperation() throws Exception {
		return false;	
	}

	/** @test10
	 * about this method verifyTextofAnyToggleActionInsideOfAccordionListMenu() 
	 * @param : null
	 * @description : here get the text from CollapsibleGroup pannnel body of Widget Menu of Accordion list ,
	 * @return : title of string type
	 * @author : Yaksha
	 */
	public String verifyTextofAnyToggleActionInsideOfAccordionListMenu() throws Exception {

		return null;	
	}

	/** @test11
	 * about this method verifyAutoCompleteTextBoxIsPresentOrNotAndPassThevalue() 
	 * @param : Map<String, String> expectedData
	 * @description : here get the text from CollapsibleGroup pannnel body of Widget Menu of Accordion list ,
	 * @return : true
	 * @author : Yaksha
	 */
	public boolean verifyAutoCompleteTextBoxIsPresentOrNotAndPassThevalue(Map<String, String> expectedData) throws Exception {
		return false;	
	}


}
