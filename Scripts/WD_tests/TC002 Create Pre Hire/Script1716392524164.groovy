import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://impl.workday.com/wday/authgwy/deloittecansrv_dpt1/login.htmld')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Workday deloittecansrv_dpt1-Ouvrir une_d947d1/input_concat(Nom d, , utilisateur)_gwt-Text_b82a8a'), 
    'momoussaoui-impl')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Workday deloittecansrv_dpt1-Ouvrir une_d947d1/input_Mot de passe_gwt-PasswordTextBox GDPVGE1BC3B'), 
    'ZnA8ZS7WWbLgAM3CRORbJA==')

WebUI.click(findTestObject('Object Repository/Page_Workday deloittecansrv_dpt1-Ouvrir une_d947d1/button_Ouvrir une session'))

WebUI.click(findTestObject('Page_Home - Workday/input_Add Shortcuts_css-gow7vg-InputElement_4f4787'))

WebUI.setText(findTestObject('Page_Home - Workday/input_Add Shortcuts_css-gow7vg-InputElement_4f4787'), 'Create Pre-Hire')

WebUI.click(findTestObject('Object Repository/Page_Home - Workday/div_Create Position'))

WebUI.click(findTestObject('Object Repository/Page_Create Pre-Hire - Workday/svg_Country_wd-icon-x-small wd-icon'))

WebUI.setText(findTestObject('Object Repository/Page_Create Pre-Hire - Workday/input_Country_56277733--uid11-input'), 'canada')

WebUI.sendKeys(findTestObject('Object Repository/Page_Create Pre-Hire - Workday/input_Country_56277733--uid11-input'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Page_Create Pre-Hire - Workday/input_Prefix_56551055--uid21-input'), 'mr')

WebUI.sendKeys(findTestObject('Page_Create Pre-Hire - Workday/input_Prefix_56551055--uid21-input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Create Pre-Hire - Workday/input_Miss_iqn86'))

WebUI.setText(findTestObject('Page_Create Pre-Hire - Workday/input_First Name_56551056--uid22-input'), 'mmo')

WebUI.setText(findTestObject('Object Repository/Page_Create Pre-Hire - Workday/input_Last Name_56551056--uid24-input'), 
    'Fields')

WebUI.click(findTestObject('Object Repository/Page_Create Pre-Hire - Workday/div_Contact Information'))

WebUI.click(findTestObject('Object Repository/Page_Create Pre-Hire - Workday/span_Add'))

WebUI.click(findTestObject('Object Repository/Page_Create Pre-Hire - Workday/input_Phone Extension_56106324--uid27-input'))

WebUI.setText(findTestObject('Object Repository/Page_Create Pre-Hire - Workday/input_Phone Number_56506134--uid26-input'), 
    '4389263007')

WebUI.click(findTestObject('Object Repository/Page_Create Pre-Hire - Workday/div_Phone Number_56506134'))

WebUI.click(findTestObject('Object Repository/Page_Create Pre-Hire - Workday/svg_Mobile_wd-icon-caret-down-small wd-icon'))

WebUI.click(findTestObject('Object Repository/Page_Create Pre-Hire - Workday/div_Landline'))

WebUI.click(findTestObject('Object Repository/Page_Create Pre-Hire - Workday/input_Type_5631871--uid29-input'))

WebUI.click(findTestObject('Object Repository/Page_Create Pre-Hire - Workday/input_Cancel_iqn8c'))

WebUI.click(findTestObject('Object Repository/Page_Create Pre-Hire - Workday/span_OK'))

WebUI.takeFullPageScreenshotAsCheckpoint('t1')

