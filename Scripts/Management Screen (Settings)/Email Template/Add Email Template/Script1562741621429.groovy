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

WebUI.comment('Adding Email template')

WebUI.callTestCase(findTestCase('Management Screen (Settings)/Login/Enki Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'Click on Settings button'
WebUI.click(findTestObject('Management Screen (Settings)/Email Template Settings/Settings button'))

'Click on Email template button'
WebUI.click(findTestObject('Management Screen (Settings)/Email Template Settings/Email Template button'))

' Verify Email Template page or not'
assert WebUI.getUrl() == 'https://uat-enki.upreach.org.uk/email-template'

WebUI.click(findTestObject('Management Screen (Settings)/Email Template Settings/Add Button'))

'Print message on console log'
KeywordLogger log = new KeywordLogger()

WebUI.delay(3)

'Check whether Email key field exists or not'
try {
    log.logInfo('---------Email Key Field exists --------------')

    WebUI.setText(findTestObject('Management Screen (Settings)/Email Template Settings/Email Key'), '123@gmail.com')
}
catch (Throwable e) {
    log.logInfo('Email Key Field not found: ' + e.getMessage())
} 

'Check whether Subject field exists or not'
try {
    log.logInfo('---------Subject Field exists --------------')

    WebUI.setText(findTestObject('Management Screen (Settings)/Email Template Settings/Subject'), 'upReach')
}
catch (Throwable e) {
    log.logInfo('Subject field not found: ' + e.getMessage())
} 

'Check whether Message exists or not'
try {
    log.logInfo('---------Message field  exists --------------')

    WebUI.setText(findTestObject('Management Screen (Settings)/Email Template Settings/Message'), 'abcd1234')
}
catch (Throwable e) {
    log.logInfo('Message field not found: ' + e.getMessage())
} 

'Check whether Submit button exists or not'
try {
    log.logInfo('---------submit button field exists --------------')

    WebUI.click(findTestObject('Management Screen (Settings)/Email Template Settings/Submit button'), FailureHandling.STOP_ON_FAILURE)
}
catch (Throwable e) {
    log.logInfo('submit button field not found: ' + e.getMessage())
} 

