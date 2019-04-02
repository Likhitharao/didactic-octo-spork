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

WebUI.comment('Main Qualification')

Random rad = new Random()

'Select Main Qualification'
MainQualificationTotaloptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Main Qualification'))

MainQualificationCount = (1 + rad.nextInt(MainQualificationTotaloptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Main Qualification'), MainQualificationCount)

WebUI.delay(1)

'A-Level'
if (MainQualificationCount == 1) {
	
    'Subject Title One'
    WebUI.setText(findTestObject('REALRatings/Page_REALrating/TitleOne'), 'Further Mathematics')

    Grade1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Page_REALrating/GradeOne'))

    Grade1 = rad.nextInt(Grade1TotalOptions - 1)

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
} else if (MainQualificationCount == 2) {
    'B-Tech Subject Line'
    WebUI.setText(findTestObject('REALRatings/Page_REALrating/BTechTitle'), 'maths')

    BtechGradeTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Page_REALrating/BTechGrade'))

    BtechGradeCount = (1 + rad.nextInt(BtechGradeTotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Page_REALrating/BTechGrade'), BtechGradeCount)

    BtechYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Page_REALrating/BTechYear'))

    BtechYearCount = (1 + rad.nextInt(BtechYearTotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Page_REALrating/BTechYear'), BtechYearCount)
} else if (MainQualificationCount == 3) {
    IBP1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Page_REALrating/IBPointsOne'))

    IBP1count = (1 + rad.nextInt(IBP1TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Page_REALrating/IBPointsOne'), IBP1count)

    IBY1TotalPoints = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Page_REALrating/IBYearOne'))

    IBY1count = (1 + rad.nextInt(IBY1TotalPoints - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Page_REALrating/IBYearOne'), IBY1count)

    IBP2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Page_REALrating/IBPointsTwo'))

    IBP2count = (1 + rad.nextInt(IBP2TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Page_REALrating/IBPointsTwo'), IBP2count)

    IBY2TotalOptions = WebUI.getNumberOfSelectedOption(findTestObject('REALRatings/Page_REALrating/IBYearTwo'))

    IBY2count = (1 + rad.nextInt(IBY2TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Page_REALrating/IBYearTwo'), IBY2count)

    IBP3TotalOptions = WebUI.getNumberOfSelectedOption(findTestObject('REALRatings/Page_REALrating/IBPointsThree'))

    IBP3count = (1 + rad.nextInt(IBP3TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Page_REALrating/IBPointsThree'), IBP3count)

    IBY3TotalOptions = WebUI.getNumberOfSelectedOption(findTestObject('REALRatings/Page_REALrating/IBYearThree'))

    IBY3count = (1 + rad.nextInt(IBY3TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Page_REALrating/IBYearThree'), IBY3count)
} else if (MainQualificationCount == 4) {
    WebUI.setText(findTestObject('REALRatings/Page_REALrating/OtherQualification'), 'other ouualifications ')
} else if (MainQualificationCount == 5) {
    WebUI.setText(findTestObject('REALRatings/Page_REALrating/HETitle'), 'hemathshe course')

    HEGradeTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Page_REALrating/HEGrade'))

    HEGradeCount = (1 + rad.nextInt(HEGradeTotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Page_REALrating/HEGrade'), HEGradeCount)

    HEYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Page_REALrating/HEYear'))

    HEYearCount = (1 + rad.nextInt(HEYearTotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Page_REALrating/HEYear'), HEYearCount)
}


