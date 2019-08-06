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

WebUI.comment('Enki - Login')

'Open browser'
WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat-enki.upreach.org.uk/')

'Maximize the opened browser'
WebUI.maximizeWindow()

'Print message on console log'
KeywordLogger log = new KeywordLogger()

'Check whether User Name field exists or not'
try {
    log.logInfo('---------User Name exists --------------')

    WebUI.setText(findTestObject('Management Screen (Settings)/Enki Login/Page_Welcome to UpReach/Username'), 'adam@mydomain.com')
}
catch (Throwable e) {
    log.logInfo('User Name not found: ' + e.getMessage())
} 

'Check whether Password field exists or not'
try {
    log.logInfo('---------password exists --------------')

    WebUI.setEncryptedText(findTestObject('Management Screen (Settings)/Enki Login/Page_Welcome to UpReach/Password'), 'qyc7M0v/URyD44GTYZMjdA==')
}
catch (Throwable e) {
    log.logInfo('Password not found: ' + e.getMessage())
} 

'Check whether Log In button exists or not'
try {
    log.logInfo('---------Log In  exists --------------')

    WebUI.click(findTestObject('Management Screen (Settings)/Enki Login/Page_Welcome to UpReach/Login Button'))
}
catch (Throwable e) {
    log.logInfo('Log In not found: ' + e.getMessage())
} 

WebUI.delay(5)

'Check if login was proper or not'
currentpageurl = WebUI.getUrl()

if (currentpageurl.equals('https://uat-enki.upreach.org.uk/home')) {
    log.logInfo('--------- Sucessfull Log In --------------')
} else {
    errormessage = WebUI.getText(findTestObject('Login/errormessage'))

    log.logInfo(errormessage)
}

WebUI.delay(5)

