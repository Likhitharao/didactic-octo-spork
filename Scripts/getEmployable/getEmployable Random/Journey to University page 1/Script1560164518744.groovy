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

WebUI.comment('Enter Journey to University Details')

Random rad = new Random()

Mathyear = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/math grade'))

mathyearcount = (1 + rad.nextInt(Mathyear - 1))

WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/math grade'), mathyearcount)

englishyear = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/eng grade'))

englishyearcount = (1 + rad.nextInt(englishyear - 1))

WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/eng grade'), englishyearcount)

WebUI.comment('Main Qualification  Information')

'A-Level year'
ALevelYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/A level complete'))

ALevelYearcount = (1 + rad.nextInt(ALevelYearTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/A level complete'), ALevelYearcount)

'GCSE Year'
GCSEYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/complete gsce'))

GCSEYearCount = (1 + rad.nextInt(GCSEYearTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/complete gsce'), GCSEYearCount)

'Uk schools'
schoolOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/ukschool'))

schoolCount = (1 + rad.nextInt(schoolOptions - 1))

WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/ukschool'), schoolCount)

'2'
if (schoolCount == 1) {
    WebUI.setText(findTestObject('Journey,background details/Journey/school1'), 'Kings Richard School')

    WebUI.setText(findTestObject('Journey,background details/Journey/school2'), 'Kings Richard School')
} else if (schoolCount == 2) {
    WebUI.setText(findTestObject('Journey,background details/Journey/school1'), 'Kings Richard School')

    WebUI.setText(findTestObject('Journey,background details/Journey/school2'), 'Kings Richard School')

    WebUI.setText(findTestObject('Journey,background details/Journey/school3'), 'Kings Richard School')
} else if (schoolCount == 3) {
    WebUI.setText(findTestObject('Journey,background details/Journey/school1'), 'Kings Richard School')

    WebUI.setText(findTestObject('Journey,background details/Journey/school2'), 'Kings Richard School')

    WebUI.setText(findTestObject('Journey,background details/Journey/school3'), 'Kings Richard School')

    WebUI.setText(findTestObject('Journey,background details/Journey/school4'), 'Kings Richard School')
} else if (schoolCount == 3) {
    WebUI.setText(findTestObject('Journey,background details/Journey/school1'), 'Kings Richard School')

    WebUI.setText(findTestObject('Journey,background details/Journey/school2'), 'Kings Richard School')

    WebUI.setText(findTestObject('Journey,background details/Journey/school3'), 'Kings Richard School')

    WebUI.setText(findTestObject('Journey,background details/Journey/school4'), 'Kings Richard School')

    WebUI.setText(findTestObject('Journey,background details/Journey/school5'), 'Kings Richard School')
}

'Select Main Qualification'
MainQualificationTotaloptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/main qualification'))

MainQualificationCount = (1 + rad.nextInt(MainQualificationTotaloptions - 1))

WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/main qualification'), MainQualificationCount)

'A-Level'
if (MainQualificationCount == 1) {
    'Subject Title One'
    WebUI.setText(findTestObject('Journey,background details/Journey/subjecttitle1'), 'Further Mathematics')

    Grade1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/Grade onee'))

    Grade1 = rad.nextInt(Grade1TotalOptions - 1)

    WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/Grade onee'), Grade1)

    Year1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/year one'))

    Year1 = (1 + rad.nextInt(Year1TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/year one'), Year1)

    'Subject Title Two'
    WebUI.setText(findTestObject('Journey,background details/Journey/subjecttitle2'), 'Computer Science')

    Grade2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/grade 2'))

    Grade2 = (1 + rad.nextInt(Grade2TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/grade 2'), Grade2)

    Year2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/year 2'))

    Year2 = (1 + rad.nextInt(Year2TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/year 2'), Year2)

    'Subject Title Three'
    WebUI.setText(findTestObject('Journey,background details/Journey/Subjecttitle3'), 'Further Mathematics')

    Grade3TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/grade3'))

    Grade3 = (1 + rad.nextInt(Grade3TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/grade3'), Grade3)

    Year3TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/year 3'))

    Year3 = (1 + rad.nextInt(Year3TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/year 3'), Year3)
} else if (MainQualificationCount == 2) {
    'B-Tech Subject Line'
    WebUI.setText(findTestObject('Journey,background details/Journey/Btech title'), 'maths')

    BtechGradeTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/Btech Grade'))

    BtechGradeCount = (1 + rad.nextInt(BtechGradeTotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/Btech Grade'), BtechGradeCount)

    BtechYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/Btech Year'))

    BtechYearCount = (1 + rad.nextInt(BtechYearTotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/Btech Year'), BtechYearCount)
} else if (MainQualificationCount == 3) {
    IBP1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/IB points 1'))

    IBP1count = (1 + rad.nextInt(IBP1TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/IB points 1'), IBP1count)

    IBY1TotalPoints = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/IB year 1'))

    IBY1count = (1 + rad.nextInt(IBY1TotalPoints - 1))

    WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/IB year 1'), IBY1count)

    IBP2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/IB points 2'))

    IBP2count = (1 + rad.nextInt(IBP2TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/IB points 2'), IBP2count)

    WebUI.delay(2)

    IBY2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/IB year 2'))

    IBY2count = (1 + rad.nextInt(IBY2TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/IB year 2'), IBY2count)

    IBP3TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/IB points 3'))

    IBP3count = (1 + rad.nextInt(IBP3TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/IB points 3'), IBP3count)

    IBY3TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/IB year 3'))

    IBY3count = (1 + rad.nextInt(IBY3TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/IB year 3'), IBY3count)
} else if (MainQualificationCount == 4) {
    WebUI.setText(findTestObject('Journey,background details/Journey/other text'), 'other ouualifications ')
} else if (MainQualificationCount == 5) {
    WebUI.setText(findTestObject('Journey,background details/Journey/HE title'), 'hemathshe course')

    HEGradeTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/HE grade'))

    HEGradeCount = (1 + rad.nextInt(HEGradeTotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/HE grade'), HEGradeCount)

    HEYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Journey,background details/Journey/HE year'))

    HEYearCount = (1 + rad.nextInt(HEYearTotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('Journey,background details/Journey/HE year'), HEYearCount)
}

WebUI.delay(5)

'illness'
not_run: WebUI.setText(findTestObject('getEmployable (Siftings)/set text'), 'abc', FailureHandling.CONTINUE_ON_FAILURE)

'ALevel PostalCode'
WebUI.setText(findTestObject('Journey,background details/Journey/post1'), findTestData('getEmployable/Applicants').getValue(
        8, 1))

WebUI.delay(5)

'GCSE PostalCode'
not_run: WebUI.setText(findTestObject('Journey,background details/Journey/post2'), findTestData('getEmployable/Applicants').getValue(
        9, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('getEmployable (Siftings)/journey1 next'))

