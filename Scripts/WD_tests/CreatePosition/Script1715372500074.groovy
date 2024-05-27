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
    'z')

WebUI.click(findTestObject('Object Repository/Page_Workday deloittecansrv_dpt1 - Connexio_94ab08/div_Login PageNom dutilisateurMot de passeC_39fc6f'))

WebUI.setText(findTestObject('Object Repository/Page_Workday deloittecansrv_dpt1 - Connexio_94ab08/input_concat(Nom d, , utilisateur)_gwt-Text_b82a8a'), 
    'momousaoui-impl')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Workday deloittecansrv_dpt1 - Connexio_94ab08/input_Mot de passe_gwt-PasswordTextBox GDPVGE1BC3B'), 
    'ZnA8ZS7WWbLgAM3CRORbJA==')

WebUI.click(findTestObject('Object Repository/Page_Workday deloittecansrv_dpt1 - Connexio_94ab08/button_Connexion'))

WebUI.setText(findTestObject('Object Repository/Page_Workday deloittecansrv_dpt1 - Connexio_94ab08/input_concat(Nom d, , utilisateur)_gwt-Text_b82a8a'), 
    'momoussaoui-impl')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Workday deloittecansrv_dpt1 - Connexio_94ab08/input_Mot de passe_gwt-PasswordTextBox GDPVGE1BC3B'), 
    'ZnA8ZS7WWbLgAM3CRORbJA==')

WebUI.click(findTestObject('Object Repository/Page_Workday deloittecansrv_dpt1 - Connexio_94ab08/button_Connexion'))

WebUI.click(findTestObject('Page_Home - Workday/input_Add Shortcuts_css-gow7vg-InputElement_4f4787'))

WebUI.setText(findTestObject('Page_Home - Workday/input_Add Shortcuts_css-gow7vg-InputElement_4f4787'), 'create position')

WebUI.click(findTestObject('Object Repository/Page_Home - Workday/span_Create'))

WebUI.click(findTestObject('Object Repository/Page_Create Position - Workday/input_Supervisory Organization_569743--uid5-input'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Create Position - Workday/input_Supervisory Organization_569743--uid5-input'), 
    'supervisory organizations')

WebUI.click(findTestObject('Object Repository/Page_Create Position - Workday/div_Supervisory Organizations'))

WebUI.click(findTestObject('Object Repository/Page_Create Position - Workday/div_100 AR Info'))

WebUI.click(findTestObject('Object Repository/Page_Create Position - Workday/span_OK'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create Position - Workday/span_Create Position'), 'Create Position')

WebUI.takeFullPageScreenshotAsCheckpoint('')

WebUI.closeBrowser()

