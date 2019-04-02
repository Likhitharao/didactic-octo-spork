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

'Alevel School'
WebUI.setText(findTestObject('REALRatings/Page_REALrating/ALevelschool'), findTestData('getEmployable/Applicants').getValue(
		6, 1))

'GCSE School'
WebUI.setText(findTestObject('REALRatings/Page_REALrating/GCSEschool'), findTestData('getEmployable/Applicants').getValue(
		7, 1))

'Gender'
WebUI.click(findTestObject('REALRatings/Page_REALrating/Gender'))

'ALevel PostalCode'
WebUI.setText(findTestObject('REALRatings/Page_REALrating/ALevelPostcode'), findTestData('getEmployable/Applicants').getValue(
		8, 1))

'GCSE PostalCode'
WebUI.setText(findTestObject('REALRatings/Page_REALrating/GCSEPostcode'), findTestData('getEmployable/Applicants').getValue(
		9, 1))

'Tick Any Statement'
WebUI.click(findTestObject('REALRatings/Page_REALrating/TickAnyStatement'))

'How did you Hear About?'
WebUI.click(findTestObject('REALRatings/Page_REALrating/HearAbout'))

'User Agreement'
WebUI.click(findTestObject('REALRatings/Page_REALrating/User Agreement and Data Protection Policy.'))

'Click on Submit Button'
WebUI.click(findTestObject('REALRatings/Page_REALrating/button_Submit'))

WebUI.delay(5)

'verify Sucessfull Form Submission'
assert WebUI.getUrl() == 'https://uat.realrating.co.uk/realrating/thankyou'

WebUI.takeScreenshot()
