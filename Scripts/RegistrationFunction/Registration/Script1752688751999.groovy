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

WebUI.openBrowser('http://localhost:5173')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_DUPSS - Phng Nga S Dng Ma Ty Trong Cng ng/registrationPageLink'))

WebUI.setText(findTestObject('Page_ng K - DUPSS/input__username'), username)

WebUI.setText(findTestObject('Page_ng K - DUPSS/input__email'), email)

WebUI.setText(findTestObject('Page_ng K - DUPSS/input__password'), password)

WebUI.setText(findTestObject('Page_ng K - DUPSS/input__confirmPassword'), confirmPassword)

WebUI.setText(findTestObject('Page_ng K - DUPSS/input__fullName'), fullname)

WebUI.setText(findTestObject('Page_ng K - DUPSS/input__phone'), phoneNumber)

WebUI.click(findTestObject('Page_ng K - DUPSS/input_Ngy sinh_terms'))

WebUI.click(findTestObject('Page_ng K - DUPSS/button_ng k'))

WebUI.verifyTextPresent(expected_msg, false)

WebUI.closeBrowser()

