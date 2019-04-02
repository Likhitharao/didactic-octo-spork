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

'Main Qualification'
WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Main Qualification'), 1)

Random rad = new Random()

'Subject Title One'
WebUI.setText(findTestObject('REALRatings/Page_REALrating/TitleOne'), 'Further Mathematics')

Grade1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Page_REALrating/GradeOne'))

Grade1 = (1+rad.nextInt(Grade1TotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/Page_REALrating/GradeOne'), Grade1)

Year1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Page_REALrating/YearOne'))

Year1 = (1 + rad.nextInt(Year1TotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/Page_REALrating/YearOne'), Year1)

'Subject Title Two'
WebUI.setText(findTestObject('REALRatings/Page_REALrating/TitleTwo'), 'Computer Science')

Grade2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Page_REALrating/GradeTwo'))

Grade2 = (1 + rad.nextInt(Grade2TotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/Page_REALrating/GradeTwo'), Grade2)

Year2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Page_REALrating/YearTwo'))

Year2 = (1 + rad.nextInt(Year2TotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/Page_REALrating/YearTwo'), Year2)

'Subject Title Three'
WebUI.setText(findTestObject('REALRatings/Page_REALrating/TitleThree'), 'Further Mathematics')

Grade3TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Page_REALrating/GradeThree'))

Grade3 = (1 + rad.nextInt(Grade3TotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/Page_REALrating/GradeThree'), Grade3)

Year3TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Page_REALrating/YearThree'))

Year3 = (1 + rad.nextInt(Year3TotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/Page_REALrating/YearThree'), Year3)

