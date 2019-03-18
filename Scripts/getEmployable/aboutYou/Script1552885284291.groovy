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

WebUI.callTestCase(findTestCase('getEmployable/launchSite'), [:], FailureHandling.STOP_ON_FAILURE)

'Enter First Name\r\n'
WebUI.setText(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_First Name'), findTestData('getEmployable/Applicants').getValue(
        1, 1))

'Enter Last Name'
WebUI.setText(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Last name'), findTestData('getEmployable/Applicants').getValue(
        2, 1))

'Enter University Email'
WebUI.setText(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_University Email'), findTestData(
        'getEmployable/Applicants').getValue(3, 1))

'Enter Personal Email '
WebUI.setText(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Personal Email'), findTestData(
        'getEmployable/Applicants').getValue(4, 1))

'Enter Mobile Number\r\n'
WebUI.setText(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Phone Number'), findTestData(
        'getEmployable/Applicants').getValue(5, 1))

WebUI.click(findTestObject('Page_getEmployable - Assessment Form/input_date Of Birth'))

WebUI.click(findTestObject('Page_getEmployable - Assessment Form/input_Date'))

WebUI.delay(10)

'Select Gender'
WebUI.click(findTestObject('Object Repository/Page_getEmployable - Assessment Form/label_Female'))

'Click Next '
WebUI.click(findTestObject('Page_getEmployable - Assessment Form/input_Other_next'))

WebUI.delay(5)

