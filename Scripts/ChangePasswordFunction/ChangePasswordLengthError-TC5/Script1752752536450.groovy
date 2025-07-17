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

WebUI.click(findTestObject('Page_DUPSS - Phng Nga S Dng Ma Ty Trong Cng ng/loginPageLink'))

WebUI.setText(findTestObject('Page_ng K - DUPSS/input__username'), 'testcp05')

WebUI.setText(findTestObject('Page_ng Nhp - DUPSS/input_password'), 'Admin@123')

WebUI.click(findTestObject('Page_ng Nhp - DUPSS/button_login'))

WebUI.click(findTestObject('Page_DUPSS - Phng Nga S Dng Ma Ty Trong Cng ng/btnTurnOffNoti'))

WebUI.click(findTestObject('Page_DUPSS - Phng Nga S Dng Ma Ty Trong Cng ng/accountBox'))

WebUI.click(findTestObject('Page_DUPSS - Phng Nga S Dng Ma Ty Trong Cng ng/path'))

WebUI.setText(findTestObject('Page_DUPSS - Phng Nga S Dng Ma Ty Trong Cng ng/input_currentPassword'), 'Admin@123')

WebUI.setText(findTestObject('Page_DUPSS - Phng Nga S Dng Ma Ty Trong Cng ng/input_newPassword'), 'A1uit')

WebUI.setText(findTestObject('Page_DUPSS - Phng Nga S Dng Ma Ty Trong Cng ng/input_confirmNewPassword'), 'A1uit')

WebUI.click(findTestObject('Page_DUPSS - Phng Nga S Dng Ma Ty Trong Cng ng/button_changePassword'))

WebUI.verifyTextPresent('Mật khẩu phải có ít nhất 6 ký tự', false)

WebUI.closeBrowser()

