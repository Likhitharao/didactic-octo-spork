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

WebUI.callTestCase(findTestCase('getEmployable/yourUniversity'), [:], FailureHandling.STOP_ON_FAILURE)

<<<<<<< HEAD
=======
WebUI.click(findTestObject('getEmployable/yourEmployablility/WorkExperience_one'))

WebUI.click(findTestObject('getEmployable/yourEmployablility/WorkExperience_Two'))

WebUI.click(findTestObject('getEmployable/yourEmployablility/WorkExperience_Three'))

WebUI.click(findTestObject('getEmployable/yourEmployablility/WorkExperience_Four'))

WebUI.click(findTestObject('getEmployable/yourEmployablility/WorkExperience_Five'))

WebUI.click(findTestObject('getEmployable/yourEmployablility/WorkExperience_Six'))

WebUI.click(findTestObject('getEmployable/yourEmployablility/WorkExperience_Seven'))

WebUI.click(findTestObject('getEmployable/yourEmployablility/WorkExperience_Eight'))

WebUI.click(findTestObject('getEmployable/yourEmployablility/WorkExperience_Eight_Add'))

WebUI.click(findTestObject('getEmployable/yourEmployablility/WorkExperience_Nine'))

WebUI.click(findTestObject('getEmployable/yourEmployablility/WorkExperience_Ten'))

WebUI.click(findTestObject('getEmployable/yourEmployablility/WorkExperience_Eleven'))

WebUI.click(findTestObject('getEmployable/yourEmployablility/WorkExperience_Twelve'))

WebUI.click(findTestObject('getEmployable/yourEmployablility/WorkExperience_Next'))

WebUI.click(findTestObject('getEmployable/yourEmployablility/WorkExperience_Thirteen'))

WebUI.click(findTestObject('getEmployable/yourEmployablility/WorkExperience_fourteen'))

WebUI.click(findTestObject('getEmployable/yourEmployablility/WorkExperience_Fifteen'))

>>>>>>> branch 'master' of https://github.com/asharajendran89/didactic-octo-spork.git
WebUI.delay(5)
int loop;
for(loop = 2 ;loop<=15 ;loop++){
WebUI.click(findTestObject('Page_getEmployable - Assessment Form/span_Under 3 months' ,[('Variable'):loop]))
WebUI.delay(2)

}
