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

WebUI.comment('Add Sub category')

WebUI.callTestCase(findTestCase('Management Screen (Settings)/Login/Enki Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Click on Settings button'
WebUI.click(findTestObject('Management Screen (Settings)/Email Template Settings/Settings button'))

'Click on NS-SEC Button'
WebUI.click(findTestObject('Management Screen (Settings)/NS-SEC/Classifications/NS -SEC button'))

WebUI.delay(3)

'Click on Sub Category button'
WebUI.click(findTestObject('Management Screen (Settings)/NS-SEC/Sub Category/Sub Category button'))

' Verify Sub Category page or not'
assert WebUI.getUrl() == 'https://uat-enki.upreach.org.uk/ns-sec-sub-category'

WebUI.delay(3)

WebUI.click(findTestObject('Management Screen (Settings)/NS-SEC/Sub Category/Add category'))

WebUI.delay(3)

Random rad = new Random()

'Print message on console log'
KeywordLogger log = new KeywordLogger()

WebUI.delay(3)

'Check whether Name field exists or not'
try {
    log.logInfo('---------Name Field exists --------------')

    WebUI.setText(findTestObject('Management Screen (Settings)/NS-SEC/Sub Category/Name'), 'upReach')
}
catch (Throwable e) {
    log.logInfo('Name Field not found: ' + e.getMessage())
} 

'Check whether Category Dropdown field exists or not'
try {
    log.logInfo('---------Category Dropdown Field exists --------------')

    CCategory = WebUI.getNumberOfTotalOption(findTestObject('Management Screen (Settings)/NS-SEC/Sub Category/Category Dropdown'))

    Categorycount = (1 + rad.nextInt(CCategory - 1))

    WebUI.selectOptionByIndex(findTestObject('Management Screen (Settings)/NS-SEC/Sub Category/Category Dropdown'), Categorycount)
}
catch (Throwable e) {
    log.logInfo('Category Dropdown field not found: ' + e.getMessage())
} 

'Check whether Short Description exists or not'
try {
    log.logInfo('---------Short Description field  exists --------------')

    WebUI.setText(findTestObject('Management Screen (Settings)/NS-SEC/Classifications/Short Description'), 'abcd1234')
}
catch (Throwable e) {
    log.logInfo('Short Description field not found: ' + e.getMessage())
} 

'Check whether Active Check box field exists or not'
try {
    log.logInfo('---------Active Check box field exists --------------')

    WebUI.click(findTestObject('Management Screen (Settings)/NS-SEC/Classifications/Active check box'), FailureHandling.STOP_ON_FAILURE)
}
catch (Throwable e) {
    log.logInfo('Active Check box filed not found: ' + e.getMessage())
} 

'Check whether Submit button field exists or not'
try {
    log.logInfo('---------submit button field exists --------------')

    WebUI.click(findTestObject('Management Screen (Settings)/NS-SEC/Classifications/Submit button'), FailureHandling.STOP_ON_FAILURE)
}
catch (Throwable e) {
    log.logInfo('submit button field not found: ' + e.getMessage())
} 

