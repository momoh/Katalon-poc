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

WebUI.setText(findTestObject('Object Repository/Page_Workday deloittecansrv_dpt1 - Connexio_94ab08/input_concat(Nom d, , utilisateur)_gwt-Text_b82a8a'), 
    'momoussaoui-impl')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Workday deloittecansrv_dpt1 - Connexio_94ab08/input_Mot de passe_gwt-PasswordTextBox GDPVGE1BC3B'), 
    'ZnA8ZS7WWbLgAM3CRORbJA==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Workday deloittecansrv_dpt1 - Connexio_94ab08/input_Mot de passe_gwt-PasswordTextBox GDPVGE1BC3B'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Home - Workday/input_Add Shortcuts_css-gow7vg-InputElement_4f4787'))

WebUI.setText(findTestObject('Object Repository/Page_Home - Workday/input_Add Shortcuts_css-gow7vg-InputElement_4f4787'), 
    'start proxy')

WebUI.sendKeys(findTestObject('Object Repository/Page_Home - Workday/input_Add Shortcuts_css-gow7vg-InputElement_4f4787'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Search Results - Saved Categories - Workday/a_Start Proxy'))

WebUI.click(findTestObject('Object Repository/Page_Start Proxy - Workday/input_Act As_56279654--uid5-input'))

WebUI.setText(findTestObject('Object Repository/Page_Start Proxy - Workday/input_Act As_56279654--uid5-input'), 'logan Mcneil')

WebUI.sendKeys(findTestObject('Object Repository/Page_Start Proxy - Workday/input_Act As_56279654--uid5-input'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Start Proxy - Workday/span_OK'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home - Workday/span_On behalf of Logan McNeil'), 'On behalf of: Logan McNeil')

WebUI.closeBrowser()

