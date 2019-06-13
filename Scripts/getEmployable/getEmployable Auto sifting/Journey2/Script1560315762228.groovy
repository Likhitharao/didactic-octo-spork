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

WebUI.comment('Auto-sifting- Journey to university page 2 Criteria')

'Household Income'
WebUI.click(findTestObject('getEmployable (Siftings)/25000'))

'First Parent'
WebUI.setText(findTestObject('getEmployable (Siftings)/lolipop1'), 'Lollipop Lady, Lollipop Man, School Crossing Patrol Attendant')

'Second parent'
WebUI.setText(findTestObject('getEmployable (Siftings)/school sec'), 'School Secretary')

'disadvntage'
WebUI.click(findTestObject('getEmployable/input_Please tick any statements that apply to you_dis_16'))

WebUI.click(findTestObject('getEmployable/input_Please tick any statements that apply to you_dis_17'))

'Click on how you hear about getEmployable'
WebUI.click(findTestObject('Journey,background details/Journey/friend'))

WebUI.delay(5)

'Click on next button'
WebUI.click(findTestObject('getEmployable/Employee details/21-05-2019/background/background next'))

