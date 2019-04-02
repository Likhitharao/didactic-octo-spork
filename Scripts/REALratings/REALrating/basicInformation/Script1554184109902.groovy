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



'Verify REALratings Application Page'
WebUI.verifyElementPresent(findTestObject('REALRatings/REALrating/Get Started'), 5, FailureHandling.STOP_ON_FAILURE)

'Click Get Started'
WebUI.click(findTestObject('REALRatings/REALrating/Get Started'))

WebUI.delay(1)

WebUI.comment('Basic Information')

'Enter First Name'
WebUI.setText(findTestObject('REALRatings/REALrating/First Name'), findTestData('getEmployable/Applicants').getValue(1, 
        1))

'Enter Last Name'
WebUI.setText(findTestObject('REALRatings/REALrating/Last Name'), findTestData('getEmployable/Applicants').getValue(2, 1))

Random rad = new Random()

int emailid = rad.nextInt(1000)

'Enter University Email'
WebUI.setText(findTestObject('REALRatings/REALrating/University Email'), ('realratings' + emailid) + '@test.ac.uk')

'Click NEXT'
WebUI.click(findTestObject('REALRatings/REALrating/FP Next'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

