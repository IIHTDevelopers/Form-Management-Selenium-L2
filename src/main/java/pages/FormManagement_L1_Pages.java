package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class FormManagement_L1_Pages extends StartupPage 
{
	public SoftAssert softAssert;
	//WebElemet Declaration
	By pageTitleText = By.xpath(""); 
	By switchToNavigationMenu = By.xpath(""); 
	By Alerts = By.xpath(""); 
	By ButtonToDisplayAnAlertBox = By.xpath(""); 
	By RegisterNavigationMenu = By.xpath(""); 
	By firstNameTextbox = By.xpath(""); 
	By lastNameTextbox = By.xpath(""); 
	By addressInputAreabox = By.xpath(""); 
	By emailAddressTextbox = By.xpath(""); 
	By phoneNumberTextbox = By.xpath(""); 
	By maleRadioButton = By.xpath(""); 
	By feMaleRadioButton = By.xpath(""); 
	By CricketCheckBox = By.xpath(""); 
	By MoviesCheckBox = By.xpath(""); 
	By HockeyCheckBox = By.xpath(""); 
	By languageDropdown = By.xpath(""); 
	By selectEnglish = By.xpath(""); 
	By selectHindi = By.xpath(""); 
	By skillsDropdown = By.xpath(""); 
	By countryDropdown = By.xpath(""); 
	By clickOnCountryDropdown = By.xpath(""); 
	By selectCountryAustralia = By.xpath(""); 
	By selectCountryBangladesh = By.xpath(""); 
	By selectCountryDenmark = By.xpath(""); 
	By selectCountryHongKong = By.xpath(""); 
	By selectCountryIndia = By.xpath(""); 
	By selectCountryJapan = By.xpath(""); 
	By selectCountryNetherlands = By.xpath(""); 
	By selectCountryNewZealand = By.xpath(""); 
	By selectCountrySouthAfrica = By.xpath(""); 
	By selectCountryUnitedStatesOfAmerica = By.xpath(""); 
	By selectYear = By.xpath("");
	By selectMonth = By.xpath(""); 
	By selectDate = By.xpath(""); 
	By password = By.xpath("");
	By confirmPassword = By.xpath("");
	By submitButton = By.xpath("");
	By refreshButton = By.xpath("");
	By chooseFile = By.xpath("");
	By uploadImageFileName = By.xpath("");
	
	
	

	//Getting the page name
	String pageName = this.getClass().getSimpleName();
	

	//constructor Initialization
	public FormManagement_L1_Pages(WebDriver driver) 
	{
		super(driver);


	}	
	/**@Test1
	 * about this method validateTitleOfHomePage() 
	 * @param : null
	 * @description : get the title of the home page and validate
	 * @return : String
	 * @author : Yaksha
	 */
	public String validateTitleOfHomePage() throws Exception {
		
		return null;
		
	}
	/**@Test2
	 * about this method clickOnSwitchToAlertandValidateTitlePage() 
	 * @param : null
	 * @description : click on the switch to alert and validate the title of this page
	 * @return : String
	 * @author : Yaksha
	 */
	public String  clickOnSwitchToAlertandValidateTitlePage() throws Exception {
		
		return null;
	}
	
	/**@Test3
	 * about this method handleAlertsPopupandValidateTheTextInsideAnAlertsPopup() 
	 * @param : null
	 * @description : click on the ButtonToDisplayAnAlertBox then control switch in to alert popup and get the alert message and validate
	 * @return : String
	 * @author : Yaksha
	 */
	
	public String handleAlertsPopupandValidateTheTextInsideAnAlertsPopup() throws Exception {
		
		return null;
	}
	
	/**@Test4
	 * about this method clickOnRegisterLinkandFillTheForms() 
	 * @param : Map<String, String>
	 * @description : Click on the register and fill data in all fields
	 * @return : boolean
	 * @author : Yaksha
	 */
	
	public boolean clickOnRegisterLinkandFillTheForms(Map<String, String> expectedData) throws Exception {
		
		return false;
	}
	/**@Test5
	 * about this method clickOnSelectCountryDropdownAndSelectEachCountryOneByOne() 
	 * @param : null
	 * @description : refresh the page and click and country drop down and select all the country from the drop down
	 * @return : boolean
	 * @author : Yaksha
	 */
	
	public boolean clickOnSelectCountryDropdownAndSelectEachCountryOneByOne() throws Exception {
		
		return false;
}
	/**@Test6
	 * about this method selectEachCountryOneByOneFromCountryDrpdownAndValidate() 
	 * @param : null
	 * @description : refresh the page and click on country dropdown then select Australia and get the value and validate it 
	 * @return : String
	 * @author : Yaksha
	 */

	public String selectAustraliaInCountryDrpdownAndValidate() throws Exception {
		
		return null;
	}
	/**@Test7
	 * about this method selectEachCountryOneByOneFromCountryDrpdownAndValidate() 
	 * @param : null
	 * @description : check all the check boxes and validate hockey check box is selected or not
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean checkandUncheckEachCheckBoxAndValidateThatCheckBox() throws Exception {
		
		return false;
	}
	
	/**@Test8
	 * about this method selecteachRadioButtonvalidateEachRadioButtonoptionShouldBeSelectableAttime() 
	 * @param : null
	 * @description :  select each Radio Button validate Each Radio Button option Should Be selectable At time
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean selecteachRadioButtonvalidateEachRadioButtonoptionShouldBeSelectableAttime() throws Exception {
		
		return false;
	}
		
	/**@Test9
	 * about this method selectYearMonthDate() 
	 * @param : null
	 * @description : select year,month and date in the dropdown using select class
	 * @return : boolean
	 * @author : Yaksha
	 */
	
	public boolean selectYearMonthDate() throws Exception {
		
		return false;
	}
	
	/**@Test10
	 * about this method clickOnChooseFilUploadButtonAndUploadImage() 
	 * @param : null
	 * @description : click on choose file button and upload the image
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnChooseFilUploadButtonAndUploadImage(String pathOfTheFile) throws Exception {
		
		return false;
	}
	

	/**@Test11
	 * about this method validateMandetoryField() 
	 * @param : Map<String, String>
	 * @description :click on the register and fill first name text field,lastNameTextbox,,emailAddressTextbox and then click on submit button
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnRegisterAndFillFirstNameTextboxlastNameTextboxaddressInputAreaboxemailAddressTextboxAndsubmitButton(Map<String, String> expectedData) throws Exception {
		
		return false;
	}

}
