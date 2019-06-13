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

WebUI.comment('Auto-sifting- Journey to University page 1 criteria')

Random rad = new Random()

WebUI.click(findTestObject('getEmployable (Siftings)/GCSE math grade'))

WebUI.click(findTestObject('getEmployable (Siftings)/GCSE English grade A'))

WebUI.comment('Main Qualification  Information')

'A-Level year'
ALevelYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/A level complete'))

ALevelYearcount = (1 + rad.nextInt(ALevelYearTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/A level complete'), ALevelYearcount)

'GCSE Year'
GCSEYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/complete gsce'))

GCSEYearCount = (1 + rad.nextInt(GCSEYearTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/complete gsce'), GCSEYearCount)

WebUI.click(findTestObject('getEmployable (Siftings)/uk scools (2)'))

'Uk schools'
WebUI.setText(findTestObject('Journey,background details/Journey/school1'), 'Kings School')

WebUI.delay(3)

WebUI.click(findTestObject('getEmployable (Siftings)/uk school dd'))

WebUI.delay(5)

'Uk shcool'
WebUI.setText(findTestObject('Journey,background details/Journey/school2'), 'Richard ')

WebUI.delay(5)

WebUI.click(findTestObject('getEmployable (Siftings)/uk school dd2'))

WebUI.delay(5)

'Select Main Qualification'
WebUI.click(findTestObject('getEmployable (Siftings)/A level'))

'A-Level'

'Subject Title One'
WebUI.setText(findTestObject('Journey,background details/Journey/subjecttitle1'), 'Further Mathematics')

WebUI.click(findTestObject('getEmployable (Siftings)/subject1-grade'))

Year1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/year one'))

Year1 = (1 + rad.nextInt(Year1TotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/year one'), Year1)

'Subject Title Two'
WebUI.setText(findTestObject('Journey,background details/Journey/subjecttitle2'), 'Computer Science')

WebUI.click(findTestObject('getEmployable (Siftings)/Subt2-Grade'))

Year2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/year 2'))

Year2 = (1 + rad.nextInt(Year2TotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/year 2'), Year2)

'Subject Title Three'
WebUI.setText(findTestObject('Journey,background details/Journey/Subjecttitle3'), 'Accounting')

WebUI.click(findTestObject('getEmployable (Siftings)/subt3-grade'))

Year3TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/year 3'))

Year3 = (1 + rad.nextInt(Year3TotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/year 3'), Year3)

'illness'
WebUI.setText(findTestObject('getEmployable (Siftings)/set text'), 'abc')

'ALevel PostalCode'
WebUI.setText(findTestObject('Journey,background details/Journey/post1'), findTestData('getEmployable/Applicants').getValue(
        8, 1))

WebUI.delay(5)

WebUI.click(findTestObject('Journey,background details/Journey/post click1'))

'GCSE PostalCode'
WebUI.setText(findTestObject('Journey,background details/Journey/post2'), findTestData('getEmployable/Applicants').getValue(
        9, 1))

WebUI.click(findTestObject('Journey,background details/Journey/next'))

WebUI.delay(5)

