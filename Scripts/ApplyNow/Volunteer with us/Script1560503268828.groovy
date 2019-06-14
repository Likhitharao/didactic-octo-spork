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

WebUI.comment('Volunteer with us - Details')

'Opening Browser'
WebUI.openBrowser('')

'Navigating to URL'
WebUI.navigateToUrl('https://uat.upreach.org.uk')

WebUI.maximizeWindow()

'Click on Partners'
WebUI.click(findTestObject('ApplyNow/Volunteer with us/our partner'))

'Enter \'First Name\''
WebUI.setText(findTestObject('ApplyNow/Volunteer with us/Firstname'), 'Mark')

'Enter \'LastName\''
WebUI.setText(findTestObject('ApplyNow/Volunteer with us/Lastname'), 'Levis')

'Enter Contact Number'
WebUI.setText(findTestObject('ApplyNow/Volunteer with us/Contact number'), '07704512535')

Random rad = new Random()

int Email = rad.nextInt(2000)

'Enter Email '
WebUI.setText(findTestObject('ApplyNow/Volunteer with us/Email'), ('personal' + Email) + '@test.com')

'Enter \'Current Employer\''
WebUI.setText(findTestObject('ApplyNow/Volunteer with us/Current employer'), 'ppp')

'Enter \'How you can help\' - Description'
WebUI.setText(findTestObject('ApplyNow/Volunteer with us/how you can help'), 'Volunteer with upReach')

'Enter \'Previous Skills\''
WebUI.setText(findTestObject('ApplyNow/Volunteer with us/previous skills'), 'Product Manager')

'Click on Submit button'
WebUI.click(findTestObject('ApplyNow/Volunteer with us/Submit'))

