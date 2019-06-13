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

'Open Browser'
WebUI.openBrowser('')

'Launch REALrating Application'
WebUI.navigateToUrl('https://uat.realrating.co.uk/')

'Maximize the window'
WebUI.maximizeWindow()

'Verify REALrating Application Page'
WebUI.verifyElementPresent(findTestObject('REALRatings/REALrating/Page_REALrating/Get Started'), 5, FailureHandling.STOP_ON_FAILURE)

'Click Get Started'
WebUI.click(findTestObject('REALRatings/REALrating/Page_REALrating/Get Started'))

WebUI.delay(1)

WebUI.comment('Basic Information')

'Enter First Name'
WebUI.setText(findTestObject('REALRatings/REALrating/Page_REALrating/First Name'), findTestData('getEmployable/Applicants').getValue(
        1, 1))

'Enter Last Name'
WebUI.setText(findTestObject('REALRatings/REALrating/Page_REALrating/Last Name'), findTestData('getEmployable/Applicants').getValue(
        2, 1))

Random rad = new Random()

'Enter University Email'
int emailid = rad.nextInt(2000)

WebUI.setText(findTestObject('REALRatings/REALrating/Page_REALrating/University Email'), ('realrating' + emailid) + '@test.ac.uk')

'Click NEXT'
WebUI.click(findTestObject('REALRatings/REALrating/Page_REALrating/FP Next'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.comment('University Information')

'A-Level year'
ALevelYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Page_REALrating/A Level Year'))

ALevelYearcount = (1 + rad.nextInt(ALevelYearTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/A Level Year'), ALevelYearcount)

'GCSE Year'
GCSEYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Page_REALrating/GCSE Year'))

GCSEYearCount = (1 + rad.nextInt(GCSEYearTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/GCSE Year'), GCSEYearCount)

'University'
UniversityTotalOption = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Page_REALrating/University'))

UniversityCount = (1 + rad.nextInt(UniversityTotalOption - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/University'), UniversityCount)

'Other University'
if (UniversityCount == 95) {
    WebUI.setText(findTestObject('REALRatings/REALrating/Page_REALrating/Other University'), 'VTU Other university')
}

'University Course'
UniversityCourseTotalOption = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Page_REALrating/University Course'))

UniveristyCourseCount = (1 + rad.nextInt(UniversityCourseTotalOption - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/University Course'), UniveristyCourseCount)

'University Other Course '
if (UniveristyCourseCount == 95) {
    WebUI.setText(findTestObject('REALRatings/REALrating/Page_REALrating/University Course Other'), 'VTU other university course ')
}

'Length of university course'
LengthOfUniversitycourseTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Page_REALrating/Length Of university Course'))

LengthOfUniversitycount = (1 + rad.nextInt(LengthOfUniversitycourseTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/Length Of university Course'), LengthOfUniversitycount)

'Current Year of Study (as of Sept 2018)'
WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/Current Year Of Study'), LengthOfUniversitycount)

WebUI.delay(5)

WebUI.click(findTestObject('REALRatings/REALrating/Page_REALrating/button_Next (1)'))

WebUI.comment('Main Qualification Information')

'Select Main Qualification'
MainQualificationTotaloptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Page_REALrating/Main Qualification'))

MainQualificationCount = (1 + rad.nextInt(MainQualificationTotaloptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/Main Qualification'), MainQualificationCount)

WebUI.delay(1)

'A-Level'
if (MainQualificationCount == 1) {
    'Subject Title One'
    WebUI.setText(findTestObject('REALRatings/REALrating/Page_REALrating/TitleOne'), 'Further Mathematics')

    Grade1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Page_REALrating/GradeOne'))

    Grade1 = (1 + rad.nextInt(Grade1TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/GradeOne'), Grade1)

    Year1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Page_REALrating/YearOne'))

    Year1 = (1 + rad.nextInt(Year1TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/YearOne'), Year1)

    'Subject Title Two'
    WebUI.setText(findTestObject('REALRatings/REALrating/Page_REALrating/TitleTwo'), 'Computer Science')

    Grade2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Page_REALrating/GradeTwo'))

    Grade2 = (1 + rad.nextInt(Grade2TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/GradeTwo'), Grade2)

    Year2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Page_REALrating/YearTwo'))

    Year2 = (1 + rad.nextInt(Year2TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/YearTwo'), Year2)

    'Subject Title Three'
    WebUI.setText(findTestObject('REALRatings/REALrating/Page_REALrating/TitleThree'), 'Further Mathematics')

    Grade3TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Page_REALrating/GradeThree'))

    Grade3 = (1 + rad.nextInt(Grade3TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/GradeThree'), Grade3)

    Year3TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Page_REALrating/YearThree'))

    Year3 = (1 + rad.nextInt(Year3TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/YearThree'), Year3)
} else if (MainQualificationCount == 2) {
    'B-Tech Subject Line'
    WebUI.setText(findTestObject('REALRatings/REALrating/Page_REALrating/BTechTitle'), 'maths')

    BtechGradeTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Page_REALrating/BTechGrade'))

    BtechGradeCount = (1 + rad.nextInt(BtechGradeTotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/BTechGrade'), BtechGradeCount)

    BtechYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Page_REALrating/BTechYear'))

    BtechYearCount = (1 + rad.nextInt(BtechYearTotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/BTechYear'), BtechYearCount)
} else if (MainQualificationCount == 3) {
    IBP1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Page_REALrating/IBPointsOne'))

    IBP1count = (1 + rad.nextInt(IBP1TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/IBPointsOne'), IBP1count)

    IBY1TotalPoints = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Page_REALrating/IBYearOne'))

    IBY1count = (1 + rad.nextInt(IBY1TotalPoints - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/IBYearOne'), IBY1count)

    IBP2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Page_REALrating/IBPointsTwo'))

    IBP2count = (1 + rad.nextInt(IBP2TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/IBPointsTwo'), IBP2count)

    IBY2TotalOptions = WebUI.getNumberOfSelectedOption(findTestObject('REALRatings/REALrating/Page_REALrating/IBYearTwo'))

    IBY2count = (1 + rad.nextInt(IBY2TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/IBYearTwo'), IBY2count)

    IBP3TotalOptions = WebUI.getNumberOfSelectedOption(findTestObject('REALRatings/REALrating/Page_REALrating/IBPointsThree'))

    IBP3count = (1 + rad.nextInt(IBP3TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/IBPointsThree'), IBP3count)

    IBY3TotalOptions = WebUI.getNumberOfSelectedOption(findTestObject('REALRatings/REALrating/Page_REALrating/IBYearThree'))

    IBY3count = (1 + rad.nextInt(IBY3TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/IBYearThree'), IBY3count)
} else if (MainQualificationCount == 4) {
    WebUI.setText(findTestObject('REALRatings/REALrating/Page_REALrating/OtherQualification'), 'other ouualifications ')
} else if (MainQualificationCount == 5) {
    WebUI.setText(findTestObject('REALRatings/REALrating/Page_REALrating/HETitle'), 'hemathshe course')

    HEGradeTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Page_REALrating/HEGrade'))

    HEGradeCount = (1 + rad.nextInt(HEGradeTotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/HEGrade'), HEGradeCount)

    HEYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Page_REALrating/HEYear'))

    HEYearCount = (1 + rad.nextInt(HEYearTotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Page_REALrating/HEYear'), HEYearCount)
}

'Alevel School'
WebUI.setText(findTestObject('REALRatings/REALrating/Page_REALrating/ALevelschool'), findTestData('getEmployable/Applicants').getValue(
        6, 1))

'GCSE School'
WebUI.setText(findTestObject('REALRatings/REALrating/Page_REALrating/GCSEschool'), findTestData('getEmployable/Applicants').getValue(
        7, 1))

'Gender'
WebUI.click(findTestObject('REALRatings/REALrating/Page_REALrating/Gender'))

'ALevel PostalCode'
WebUI.setText(findTestObject('REALRatings/REALrating/Page_REALrating/ALevelPostcode'), findTestData('getEmployable/Applicants').getValue(
        8, 1))

'GCSE PostalCode'
WebUI.setText(findTestObject('REALRatings/REALrating/Page_REALrating/GCSEPostcode'), findTestData('getEmployable/Applicants').getValue(
        9, 1))

'Tick Any Statement'
WebUI.click(findTestObject('REALRatings/REALrating/Page_REALrating/TickAnyStatement'))

'How did you Hear About?'
WebUI.click(findTestObject('REALRatings/REALrating/Page_REALrating/HearAbout'))

'User Agreement'
WebUI.click(findTestObject('REALRatings/REALrating/Page_REALrating/User Agreement and Data Protection Policy.'))

'Click on Submit Button'
WebUI.click(findTestObject('REALRatings/REALrating/Page_REALrating/button_Submit'))

WebUI.delay(5)

WebUI.takeScreenshot()

