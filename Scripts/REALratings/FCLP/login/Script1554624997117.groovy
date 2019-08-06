import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.comment('FCLP - Login')

'Open Browser'
WebUI.openBrowser('')

'Login to FCLP Application'
WebUI.navigateToUrl('https://fclp-uat.realrating.co.uk/login')

WebUI.maximizeWindow()

'Enter Email Address'
WebUI.setText(findTestObject('REALRatings/Greensill/login/Page_RealRating/input_E-Mail Address_email'), 'john@upreach.org.uk')

'Enter Password'
WebUI.setEncryptedText(findTestObject('REALRatings/Greensill/login/Page_RealRating/input_Password_password'), 'YPztdU12xyABLAH+eFFt4w==')

'Click On Login'
WebUI.click(findTestObject('REALRatings/Greensill/login/Page_RealRating/button_Login'))

'Get All Links On Current Page - A-Level'
WebUI.getAllLinksOnCurrentPage(false, [])

'Verify All Links On Current Page Accessible - A-Level'
WebUI.verifyAllLinksOnCurrentPageAccessible(false, [])

'Click on Other Qualification Tab'
WebUI.click(findTestObject('REALRatings/Greensill/login/Page_RealRating/Other Qualifications Tab'))

'Get All Links On Current Page - Other Qualification'
WebUI.getAllLinksOnCurrentPage(false, [])

'Verify All Links On Current Page Accessible - Other Qualification'
WebUI.verifyAllLinksOnCurrentPageAccessible(false, [])

'Logout of Greensill Application'
WebUI.click(findTestObject('REALRatings/Greensill/login/Page_RealRating/Profile'))

WebUI.click(findTestObject('REALRatings/Greensill/login/Page_RealRating/Logout'))

WebUI.delay(5)

WebUI.click(findTestObject('REALRatings/Greensill/login/Page_RealRating/button_Logout'))

'Asserting Sucessful Logout'
assert WebUI.getUrl() == 'https://fclp-uat.realrating.co.uk/login'

