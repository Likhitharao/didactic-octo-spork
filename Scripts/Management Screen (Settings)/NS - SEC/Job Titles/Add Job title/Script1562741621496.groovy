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

WebUI.comment('')

WebUI.callTestCase(findTestCase('Management Screen (Settings)/Login/Enki Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Management Screen (Settings)/Email Template Settings/Settings button'))

WebUI.click(findTestObject('Management Screen (Settings)/NS-SEC/Classifications/NS -SEC button'))

WebUI.delay(3)

WebUI.click(findTestObject('Management Screen (Settings)/NS-SEC/Job Titles/Job titles button'))

' Verify Job Titles page or not'
assert WebUI.getUrl() == 'https://uat-enki.upreach.org.uk/ns-sec-job-title'

WebUI.click(findTestObject('Management Screen (Settings)/NS-SEC/Job Titles/Add job title'))

'Print message on console log'
KeywordLogger log = new KeywordLogger()

'Check whether Title field exists or not'
try {
    log.logInfo('---------Title Field exists --------------')

    WebUI.delay(3)

    WebUI.setText(findTestObject('Management Screen (Settings)/NS-SEC/Job Titles/Title'), 'upReach')
}
catch (Throwable e) {
    log.logInfo('Title field not found: ' + e.getMessage())
} 

'Check whether Active check box field exists or not'
try {
    log.logInfo('---------Active check box Field exists --------------')

    WebUI.click(findTestObject('Management Screen (Settings)/NS-SEC/Job Titles/Active check box'), FailureHandling.STOP_ON_FAILURE)
}
catch (Throwable e) {
    log.logInfo('Active check box field not found: ' + e.getMessage())
} 

WebUI.click(findTestObject('Management Screen (Settings)/NS-SEC/Job Titles/submit button'))

