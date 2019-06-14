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

WebUI.comment('Verifying all links in applynow page')

'opening browser'
WebUI.openBrowser('')

'Navigate to URL'
WebUI.navigateToUrl('https://uat.upreach.org.uk')

WebUI.maximizeWindow()

'Click on apply now'
WebUI.click(findTestObject('ApplyNow/Page_upReach  Boosting social mobility by supporting students from less-advantaged backgrounds to secure top jobs/a_Apply Now'))

'get all Links'
WebUI.getAllLinksOnCurrentPage(false, [])

'Verify all links'
WebUI.verifyAllLinksOnCurrentPageAccessible(false, [])

