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

WebUI.comment('Add Division')

WebUI.callTestCase(findTestCase('Management Screen (Settings)/Login/Enki Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Click on Settings button'
WebUI.click(findTestObject('Management Screen (Settings)/Email Template Settings/Settings button'))

'Click on Employers button'
WebUI.click(findTestObject('Management Screen (Settings)/Employers/Divisions/Employers button'))

WebUI.delay(3)

'Click on Divisions button'
WebUI.click(findTestObject('Management Screen (Settings)/Employers/Divisions/Divisions button'))

' Verify Job Division page or not'
assert WebUI.getUrl() == 'https://uat-enki.upreach.org.uk/divisions'

'Click on add division button'
WebUI.click(findTestObject('Management Screen (Settings)/Employers/Divisions/Add Division'))

WebUI.delay(3)

'Print message on console log'
KeywordLogger log = new KeywordLogger()

'Check whether Division name field exists or not'
try {
    log.logInfo('---------Division name Field exists --------------')

    WebUI.delay(3)

    WebUI.setText(findTestObject('Management Screen (Settings)/Employers/Divisions/division name'), 'upReach')
}
catch (Throwable e) {
    log.logInfo('Division name field not found: ' + e.getMessage())
} 

Random rad = new Random()

'Check whether Employer Dropdown field exists or not'
try {
    log.logInfo('---------Employer Dropdown Field exists --------------')

    Employer = WebUI.getNumberOfTotalOption(findTestObject('Management Screen (Settings)/Employers/Divisions/Employers dropdown'))

    Employercount = (1 + rad.nextInt(Employer - 1))

    WebUI.selectOptionByIndex(findTestObject('Management Screen (Settings)/Employers/Divisions/Employers dropdown'), Employercount)
}
catch (Throwable e) {
    log.logInfo('Employer Dropdown  field not found: ' + e.getMessage())
} 

WebUI.delay(3)

'Check whether Opportunity Dropdown field exists or not'
try {
    log.logInfo('---------Opportunity Dropdown Field exists --------------')

    Opportunity = WebUI.getNumberOfTotalOption(findTestObject('Management Screen (Settings)/Employers/Divisions/Opportunity dropdown'))

    Opportunitycount = (1 + rad.nextInt(Opportunity - 1))

    WebUI.selectOptionByIndex(findTestObject('Management Screen (Settings)/Employers/Divisions/Opportunity dropdown'), Opportunitycount)
}
catch (Throwable e) {
    log.logInfo('Opportunity Dropdown  field not found: ' + e.getMessage())
} 

'Click on active check box'
WebUI.click(findTestObject('Management Screen (Settings)/Employers/Divisions/Active check box'))

'Click on submit button'
WebUI.click(findTestObject('Management Screen (Settings)/Employers/Divisions/Submit button'))

