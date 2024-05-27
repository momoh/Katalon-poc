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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://impl.workday.com/wday/authgwy/deloittecansrv_dpt1/login.htmld')

WebUI.setText(findTestObject('Object Repository/Page_Workday deloittecansrv_dpt1-Ouvrir une_d947d1/input_concat(Nom d, , utilisateur)_gwt-Text_b82a8a'), 
    'momoussaoui-impl')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Workday deloittecansrv_dpt1-Ouvrir une_d947d1/input_Mot de passe_gwt-PasswordTextBox GDPVGE1BC3B'), 
    'ZnA8ZS7WWbLgAM3CRORbJA==')

WebUI.click(findTestObject('Object Repository/Page_Workday deloittecansrv_dpt1-Ouvrir une_d947d1/button_Ouvrir une session'))

WebUI.click(findTestObject('Page_Home - Workday/input_Add Shortcuts_css-gow7vg-InputElement_4f4787'))

WebUI.setText(findTestObject('Page_Home - Workday/input_Add Shortcuts_css-gow7vg-InputElement_4f4787'), 'start proxy')

WebUI.click(findTestObject('Object Repository/Page_Search Results - Saved Categories - Workday/div_Start Proxy'))

WebUI.click(findTestObject('Page_Start Proxy - Workday/input_Act As_56279654--uid5-input'))

WebUI.setText(findTestObject('Object Repository/Page_Start Proxy - Workday/input_Act As_56279654--uid5-input'), 'logan McNeil')

WebUI.sendKeys(findTestObject('Object Repository/Page_Start Proxy - Workday/input_Act As_56279654--uid5-input'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Start Proxy - Workday/span_OK'))

WebUI.click(findTestObject('Page_Home - Workday/input_Add Shortcuts_css-gow7vg-InputElement_4f4787'))

WebUI.setText(findTestObject('Page_Home - Workday/input_Add Shortcuts_css-gow7vg-InputElement_4f4787'), 'hire employee')

WebUI.click(findTestObject('Object Repository/Page_Home - Workday/div_Hire Employee'))

WebUI.click(findTestObject('Object Repository/Page_Hire Employee - Workday/path_Country_wd-icon-fill'))

WebUI.setText(findTestObject('Object Repository/Page_Hire Employee - Workday/input_Country_56594650--uid6-input'), 'canada')

WebUI.sendKeys(findTestObject('Object Repository/Page_Hire Employee - Workday/input_Country_56594650--uid6-input'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Hire Employee - Workday/input_First Name_56594643--uid56-input'), 'Bowen')

WebUI.setText(findTestObject('Object Repository/Page_Hire Employee - Workday/input_Last Name_56594643--uid58-input'), 'Yang')

WebUI.click(findTestObject('Object Repository/Page_Hire Employee - Workday/span_Search'))

WebUI.click(findTestObject('Object Repository/Page_Hire Employee - Workday/button_Search_1'))

WebUI.takeFullPageScreenshotAsCheckpoint('t3', FailureHandling.STOP_ON_FAILURE)

