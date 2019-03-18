import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
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

'Select GCSE Math Grade'
GCSEMathGradeTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_GCSEMathsGrade'))

Random rad = new Random()

int GCSEMathGradeCount = rad.nextInt(GCSEMathGradeTotalOptions)

WebUI.selectOptionByIndex(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_GCSEMathsGrade'), 
    GCSEMathGradeCount)

'Select GCSE English Grade'
GCSEEnglishGradeTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_GCSEEnglishGrade'))

int GCSEEnglishGradeCount = rad.nextInt(GCSEEnglishGradeTotalOptions)

WebUI.selectOptionByIndex(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_GCSEEnglishGrade'), 
    GCSEEnglishGradeCount)

'Select GCSE Year'
GCSEYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_GCSEYear'))

int GCSEYearCount = rad.nextInt(GCSEYearTotalOptions)

WebUI.selectOptionByIndex(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_GCSEYear'), GCSEYearCount)

'Select A-Level Year'
ALevelTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_ALevelYear'))

int ALevelCount = rad.nextInt(ALevelTotalOptions)

WebUI.selectOptionByIndex(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_ALevelYear'), 
    ALevelCount)

'Select UK Schooles/colleges'
UKSchoolsTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_NoOfSchools'))

int UKSchoolsCount = rad.nextInt(UKSchoolsTotalOptions)

WebUI.selectOptionByIndex(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_NoOfSchools'), 
    UKSchoolsCount)

if (UKSchoolsCount == 0) {
    WebUI.setText(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_GCSESchoolName'), 'King Richard School')

    WebUI.setText(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_ALevelSchoolName'), 'King Richard School')
} else if (UKSchoolsCount == 1) {
    WebUI.setText(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_GCSESchoolName'), 'King Richard School')

    WebUI.setText(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_ALevelSchoolName'), 'King Richard School')

    WebUI.setText(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/input_UkSchoolThree'), 'King Richard School')
} else if (UKSchoolsCount == 2) {
    WebUI.setText(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_GCSESchoolName'), 'King Richard School')

    WebUI.setText(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_ALevelSchoolName'), 'King Richard School')

    WebUI.setText(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/input_UkSchoolThree'), 'King Richard School')

    WebUI.setText(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/input_UkSchoolFour'), 'King Richard School')
} else if (UKSchoolsCount == 3) {
    WebUI.setText(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_GCSESchoolName'), 'King Richard School')

    WebUI.setText(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_ALevelSchoolName'), 'King Richard School')

    WebUI.setText(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/input_UkSchoolThree'), 'King Richard School')

    WebUI.setText(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/input_UkSchoolFour'), 'King Richard School')

    WebUI.setText(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/input_UkSchoolFive'), 'King Richard School')
}

'Select Main Qualification'
MainQualificationTotaloptions = WebUI.getNumberOfTotalOption(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_MainQualification'))

int MainQualificationCount = rad.nextInt(MainQualificationTotaloptions)

WebUI.selectOptionByIndex(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_MainQualification'), 
    MainQualificationCount)

if (MainQualificationCount == 0) {
    'Subject Title One'
    WebUI.setText(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/input_TitleOne'), 'Further Mathematics')

    Grade1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_GradeOne'))

    int Grade1 = rad.nextInt(Grade1TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_GradeOne'), 
        Grade1)

    Year1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_YearOne'))

    int Year1 = rad.nextInt(Year1TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_YearOne'), 
        Year1)

    'Subject Title Two'
    WebUI.setText(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/input_TitleTwo'), 'Computer Science')

    Grade2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_GradeTwo'))

    int Grade2 = rad.nextInt(Grade2TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_GradeTwo'), 
        Grade2)

    Year2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_YearTwo'))

    int Year2 = rad.nextInt(Year2TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_YearTwo'), 
        Year2)

    'Subject Title Three'
} else if (MainQualificationCount == 1) {
    'B-Tech Subject Line'
    WebUI.setText(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Year awarded_form-text ng-untouched ng-valid ng-dirty ng-valid-parse'), 
        'maths')

    BtechGradeTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Page_getEmployable - Assessment Form/select_Btechgrade'))

    int BtechGradeCount = rad.nextInt(BtechGradeTotalOptions)

    WebUI.selectOptionByIndex(findTestObject('Page_getEmployable - Assessment Form/select_Btechgrade'), BtechGradeCount)

    BtechYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_BtechYear'))

    int BtechYearCount = rad.nextInt(BtechYearTotalOptions)

    WebUI.selectOptionByIndex(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_BtechYear'), 
        BtechYearCount)
} else if (MainQualificationCount == 2) {
    IBP1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Object Repository/Page_getEmployable - Assessment Form/select_1234567'))

    int IBP1count = rad.nextInt(IBP1TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('Page_getEmployable - Assessment Form/select_1234567'), null)

    IBY1TotalPoints = WebUI.getNumberOfTotalOption(findTestObject('Object Repository/Page_getEmployable - Assessment Form/select_2019                                2018                                2017                                2016                                2015                                2014                             '))

    int IBY1count = rad.nextInt(IBY1TotalPoints)

    IBP2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Object Repository/Page_getEmployable - Assessment Form/select_1234567'))

    int IBP2count = rad.nextInt(IBP2TotalOptions)

    IBY2TotalOptions = WebUI.getNumberOfSelectedOption(findTestObject('Object Repository/Page_getEmployable - Assessment Form/select_2019                                2018                                2017                                2016                                2015                                2014                             '))

    int IBY2count = rad.nextInt(IBY2TotalOptions)

    IBP3TotalOptions = WebUI.getNumberOfSelectedOption(findTestObject('Object Repository/Page_getEmployable - Assessment Form/select_1234567'))

    int IBP3count = rad.nextInt(IBP3TotalOptions)

    IBY3TotalOptions = WebUI.getNumberOfSelectedOption(findTestObject('Object Repository/Page_getEmployable - Assessment Form/select_2019                                2018                                2017                                2016                                2015                                2014                             '))

    int IBY3count = rad.nextInt(IBY3TotalOptions)
} else if (MainQualificationCount == 3) {
    WebUI.setText(findTestObject('Object Repository/Page_getEmployable - Assessment Form/textarea_Year awarded_form-text ng-untouched ng-dirty ng-valid-parse ng-valid ng-valid-required'), 
        'other ouualifications ')
} else if (MainQualificationCount == 4) {
    WebUI.setText(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Year awarded_form-text ng-untouched ng-valid ng-valid-maxlength ng-dirty ng-valid-parse'), 
        'mathshe course')

    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_getEmployable - Assessment Form/select_Grade AGrade AGrade BGrade CGrade DGrade EGrade FGrade UDid not take'), 
        'string:B', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_getEmployable - Assessment Form/select_2019                                2018                                2017                                2016                                2015                                2014                             '), 
        '2009', true)
}

'A-Level HomePostal Code'
WebUI.setText(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Year awarded_alevel-postal-code'), 
    'NW64DN')

'GCSE Home Postal Code'
WebUI.setText(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Year awarded_gcse-postal-code'), 
    'NW64DN')

'Click on Next'
WebUI.click(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Year awarded_next'))

WebUI.comment('Second Page Journey To University ')

'Household Income'
WebUI.click(findTestObject('Object Repository/Page_getEmployable - Assessment Form/label_Below 25000'))

'First Parent'
WebUI.setText(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Would rather not say_parent_carer_one'), 
    'Houseparent, Residential Warden')

WebUI.setText(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Would rather not say_parent_carer_one'), 
    'Houseparent, Residential Warden')

'disadvntage'
WebUI.click(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Please tick any statements that apply to you_dis_16'))

WebUI.click(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Please tick any statements that apply to you_dis_17'))

WebUI.click(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Please tick any statements that apply to you_dis_18'))

WebUI.click(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Please tick any statements that apply to you_dis_19'))

WebUI.click(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Please tick any statements that apply to you_dis_22'))

'how did you hear about '
WebUI.click(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_How did you hear about getEmployable_867'))

WebUI.click(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_How did you hear about getEmployable_next'))

