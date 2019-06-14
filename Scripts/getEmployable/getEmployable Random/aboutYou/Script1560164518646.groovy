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

WebUI.comment('Enter aboutYou page details')
Random rad = new Random()

'Enter First Name'

WebUI.setText(findTestObject('getEmployable/input_First Name'), findTestData('getEmployable/Applicants').getValue(1, 1))

'Enter Last Name'
WebUI.setText(findTestObject('getEmployable/input_Last name'), findTestData('getEmployable/Applicants').getValue(2, 1))


int Email = rad.nextInt(2000)

'Enter University Email'
WebUI.setText(findTestObject('getEmployable/input_University Email'), ('test' + Email) + '@ac.uk')

'Enter Personal Email '
WebUI.setText(findTestObject('getEmployable/input_Personal Email'), ('personal' + Email) + '@test.com')

'Enter Mobile Number'
WebUI.setText(findTestObject('getEmployable/input_Phone Number'), findTestData('getEmployable/Applicants').getValue(5, 1))

WebUI.delay(10)

'Select DOB'
WebUI.click(findTestObject('getEmployable/input_date Of Birth'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ApplyNow/Page_getEmployable - Assessment Form/a_04'))

WebUI.delay(5)

'Select Gender'
WebUI.click(findTestObject('getEmployable/gender'))

'Click Next '
WebUI.click(findTestObject('getEmployable/input_Other_next'))

WebUI.delay(5)

