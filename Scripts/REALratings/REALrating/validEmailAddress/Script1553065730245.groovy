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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.realrating.co.uk')

WebUI.maximizeWindow()

WebUI.click(findTestObject('REALRatings/REALrating/Get Started'))

WebUI.delay(5)

WebUI.comment('Basic Information')

WebUI.setText(findTestObject('REALRatings/REALrating/First Name'), 'asha')

WebUI.setText(findTestObject('REALRatings/REALrating/Last Name'), 'rajendran')

WebUI.setText(findTestObject('REALRatings/REALrating/University Email'), 'asharajendran@uni.ac.uk')

WebUI.click(findTestObject('REALRatings/REALrating/FP Next'))

WebUI.comment('School Information')

'A-Level year'
ALevelYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/ALevel Year'))

Random rad = new Random()

int ALevelYearcount = rad.nextInt(ALevelYearTotalOptions)

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/ALevel Year'), ALevelYearcount)

'GCSE Year'
GCSEYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/GCSE Year'))

int GCSEYearCount = rad.nextInt(GCSEYearTotalOptions)

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/GCSE Year'), GCSEYearCount)

'University'
UniversityTotalOption = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/University'))

int UniversityCount = rad.nextInt(UniversityTotalOption)

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/University'), UniversityCount)

'Other University'
if (UniversityCount == 95) {
    WebUI.setText(findTestObject('REALRatings/REALrating/Other University'), 'VTU Other university')
}

'University Course'
UniversityCourseTotalOption = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/University Course'))

int UniveristyCourseCount = rad.nextInt(UniversityCourseTotalOption)

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/University Course'), UniveristyCourseCount)

'University Other Course '
if (UniveristyCourseCount == 95) {
    WebUI.setText(findTestObject('REALRatings/REALrating/University Course Other'), 'VTU ')
}

'Length of university course'
LengthOfUniversitycourseTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Length Of university Course'))

int LengthOfUniversitycount = rad.nextInt(LengthOfUniversitycourseTotalOptions)

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Length Of university Course'), LengthOfUniversitycount)

'Current Year of Study (as of Sept 2018)'
WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Current Year Of Study'), LengthOfUniversitycount)

WebUI.delay(5)

WebUI.click(findTestObject('REALRatings/REALrating/button_Next (1)'))

WebUI.comment('Main Qualification')

'Select Main Qualification'
MainQualificationTotaloptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Main Qualification'))

int MainQualificationCount = rad.nextInt(MainQualificationTotaloptions)

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Main Qualification'), MainQualificationCount)

WebUI.delay(5)

if (MainQualificationCount == 1) {
    'Subject Title One'
    WebUI.setText(findTestObject('dummy/Page_REALrating/Page_REALrating/TitleOne'), 'Further Mathematics')

    Grade1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('dummy/Page_REALrating/Page_REALrating/GradeOne'))

    int Grade1 = rad.nextInt(Grade1TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('dummy/Page_REALrating/Page_REALrating/GradeOne'), Grade1)

    Year1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('dummy/Page_REALrating/Page_REALrating/YearOne'))

    int Year1 = rad.nextInt(Year1TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('dummy/Page_REALrating/Page_REALrating/YearOne'), Year1)

    'Subject Title Two'
    WebUI.setText(findTestObject('dummy/Page_REALrating/Page_REALrating/TitleTwo'), 'Computer Science')

    Grade2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('dummy/Page_REALrating/Page_REALrating/GradeTwo'))

    int Grade2 = rad.nextInt(Grade2TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('dummy/Page_REALrating/Page_REALrating/GradeTwo'), Grade2)

    Year2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('dummy/Page_REALrating/Page_REALrating/YearTwo'))

    int Year2 = rad.nextInt(Year2TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('dummy/Page_REALrating/Page_REALrating/YearTwo'), Year2)

    'Subject Title Three'
    WebUI.setText(findTestObject('dummy/Page_REALrating/Page_REALrating/TitleThree'), 'Further Mathematics')

    Grade3TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('dummy/Page_REALrating/Page_REALrating/GradeThree'))

    int Grade3 = rad.nextInt(Grade3TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('dummy/Page_REALrating/Page_REALrating/GradeThree'), Grade3)

    Year3TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('dummy/Page_REALrating/Page_REALrating/YearThree'))

    int Year3 = rad.nextInt(Year3TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('dummy/Page_REALrating/Page_REALrating/YearThree'), Year3)
} else if (MainQualificationCount == 2) {
    'B-Tech Subject Line'
    WebUI.setText(findTestObject('dummy/Page_REALrating/Page_REALrating/BTechTitle'), 'maths')

    BtechGradeTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('dummy/Page_REALrating/Page_REALrating/BTechGrade'))

    int BtechGradeCount = rad.nextInt(BtechGradeTotalOptions)

    WebUI.selectOptionByIndex(findTestObject('dummy/Page_REALrating/Page_REALrating/BTechGrade'), BtechGradeCount)

    BtechYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('dummy/Page_REALrating/Page_REALrating/BTechYear'))

    int BtechYearCount = rad.nextInt(BtechYearTotalOptions)

    WebUI.selectOptionByIndex(findTestObject('dummy/Page_REALrating/Page_REALrating/BTechYear'), BtechYearCount)
} else if (MainQualificationCount == 3) {
    IBP1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('dummy/Page_REALrating/Page_REALrating/IBPointsOne'))

    int IBP1count = rad.nextInt(IBP1TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('dummy/Page_REALrating/Page_REALrating/IBPointsOne'), IBP1count)

    IBY1TotalPoints = WebUI.getNumberOfTotalOption(findTestObject('dummy/Page_REALrating/Page_REALrating/IBYearOne'))

    int IBY1count = rad.nextInt(IBY1TotalPoints)

    WebUI.selectOptionByIndex(findTestObject('dummy/Page_REALrating/Page_REALrating/IBYearOne'), IBY1count)

    IBP2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('dummy/Page_REALrating/Page_REALrating/IBPointsTwo'))

    int IBP2count = rad.nextInt(IBP2TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('dummy/Page_REALrating/Page_REALrating/IBPointsTwo'), IBP2count)

    IBY2TotalOptions = WebUI.getNumberOfSelectedOption(findTestObject('dummy/Page_REALrating/Page_REALrating/IBYearTwo'))

    int IBY2count = rad.nextInt(IBY2TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('dummy/Page_REALrating/Page_REALrating/IBYearTwo'), IBY2count)

    IBP3TotalOptions = WebUI.getNumberOfSelectedOption(findTestObject('dummy/Page_REALrating/Page_REALrating/IBPointsThree'))

    int IBP3count = rad.nextInt(IBP3TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('dummy/Page_REALrating/Page_REALrating/IBPointsThree'), IBP3count)

    IBY3TotalOptions = WebUI.getNumberOfSelectedOption(findTestObject('dummy/Page_REALrating/Page_REALrating/IBYearThree'))

    int IBY3count = rad.nextInt(IBY3TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('dummy/Page_REALrating/Page_REALrating/IBYearThree'), IBY3count)
} else if (MainQualificationCount == 4) {
    WebUI.setText(findTestObject('dummy/Page_REALrating/Page_REALrating/OtherQualification'), 'other ouualifications ')
} else if (MainQualificationCount == 5) {
    WebUI.setText(findTestObject('dummy/Page_REALrating/Page_REALrating/HETitle'), 'hemathshe course')

    HEGradeTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('dummy/Page_REALrating/Page_REALrating/HEGrade'))

    int HEGradeCount = rad.nextInt(HEGradeTotalOptions)

    WebUI.selectOptionByIndex(findTestObject('dummy/Page_REALrating/Page_REALrating/HEGrade'), HEGradeCount)

    HEYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('dummy/Page_REALrating/Page_REALrating/HEYear'))

    int HEYearCount = rad.nextInt(HEYearTotalOptions)

    WebUI.selectOptionByIndex(findTestObject('dummy/Page_REALrating/Page_REALrating/HEYear'), HEYearCount)
}

WebUI.setText(findTestObject('dummy/Page_REALrating/Page_REALrating/ALevelschool'), 'King Richard School')

WebUI.setText(findTestObject('dummy/Page_REALrating/Page_REALrating/GCSEschool'), 'King Richard School')

WebUI.click(findTestObject('dummy/Page_REALrating/Page_REALrating/Gender'))

WebUI.setText(findTestObject('dummy/Page_REALrating/Page_REALrating/ALevelPostcode'), 'NW64DN')

WebUI.setText(findTestObject('dummy/Page_REALrating/Page_REALrating/GCSEPostcode'), 'NW64DN')

WebUI.click(findTestObject('dummy/Page_REALrating/Page_REALrating/TickAnyStatement'))

WebUI.click(findTestObject('dummy/Page_REALrating/Page_REALrating/HearAbout'))

WebUI.click(findTestObject('dummy/Page_REALrating/Page_REALrating/User Agreement and Data Protection Policy.'))

WebUI.delay(5)

WebUI.click(findTestObject('dummy/Page_REALrating/Page_REALrating/button_Submit'))

