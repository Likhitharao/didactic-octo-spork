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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.comment('Add Reject Reasons')

WebUI.callTestCase(findTestCase('Management Screen (Settings)/Login/Enki Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Click on Settings button'
WebUI.click(findTestObject('Management Screen (Settings)/Email Template Settings/Settings button'))

'Click on Bookings Button'
WebUI.click(findTestObject('Management Screen (Settings)/Bookings/Bookings button'))

WebUI.delay(3)

'Click on Reject reason button button'
WebUI.click(findTestObject('Management Screen (Settings)/Bookings/Reject Reasons button'))

' Verify Reject Reasons page or not'
assert WebUI.getUrl() == 'https://uat-enki.upreach.org.uk/booking-status-reason'

WebUI.delay(3)

WebUI.click(findTestObject('Management Screen (Settings)/Bookings/Add Reject reasons'))

'Print message on console log'
KeywordLogger log = new KeywordLogger()

WebUI.delay(3)

'Check whether Name field exists or not'
try {
    log.logInfo('---------Name Field exists --------------')

    WebUI.setText(findTestObject('Management Screen (Settings)/Bookings/Name'), 'upReach')
}
catch (Throwable e) {
    log.logInfo('Name Field not found: ' + e.getMessage())
} 

'Check whether Active Check box field exists or not'
try {
    log.logInfo('---------Active Check box field exists --------------')

    WebUI.click(findTestObject('Management Screen (Settings)/Bookings/Active check box'), FailureHandling.STOP_ON_FAILURE)
}
catch (Throwable e) {
    log.logInfo('Active Check box filed not found: ' + e.getMessage())
} 

'Check whether Submit button field exists or not'
try {
    log.logInfo('---------submit button field exists --------------')

    WebUI.click(findTestObject('Management Screen (Settings)/Bookings/Submit button'), FailureHandling.STOP_ON_FAILURE)
}
catch (Throwable e) {
    log.logInfo('submit button field not found: ' + e.getMessage())
} 

' Verify Reject Reasons page or not'
assert WebUI.getUrl() == 'https://uat-enki.upreach.org.uk/booking-status-reason'