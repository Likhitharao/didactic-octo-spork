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

if (MainQualificationCount == 0) {
    'Subject Title One'
    WebUI.setText(findTestObject('REALRatings/REALrating/ALevel Title One'), 'Further Mathematics')

    Grade1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/ALevel Grade One'))

    int Grade1 = rad.nextInt(Grade1TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/ALevel Grade One'), Grade1)

    Year1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Alevel Year One'))

    int Year1 = rad.nextInt(Year1TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Alevel Year One'), Year1)

    'Subject Title Two'
    WebUI.setText(findTestObject('REALRatings/REALrating/ALevel Title Two'), 'Computer Science')

    Grade2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/ALevel Grade Two'))

    int Grade2 = rad.nextInt(Grade2TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/ALevel Grade Two'), Grade2)

    Year2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/ALevel Year Two'))

    int Year2 = rad.nextInt(Year2TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/ALevel Year Two'), Year2)

    'Subject Title Three'
    WebUI.setText(findTestObject('REALRatings/REALrating/ALevel Title Three'), 'Further Mathematics')

    Grade3TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Alevel Grade Three'))

    int Grade3 = rad.nextInt(Grade3TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Alevel Grade Three'), Grade3)

    Year3TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/ALevel Year Three'))

    int Year3 = rad.nextInt(Year3TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/ALevel Year Three'), Year3)
} else if (MainQualificationCount == 1) {
    'B-Tech Subject Line'
    WebUI.setText(findTestObject('REALRatings/REALrating/BTech Title'), 'maths')

    BtechGradeTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/BTech Grade'))

    int BtechGradeCount = rad.nextInt(BtechGradeTotalOptions)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/BTech Grade'), BtechGradeCount)

    BtechYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/BTech Year'))

    int BtechYearCount = rad.nextInt(BtechYearTotalOptions)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/BTech Year'), BtechYearCount)
} else if (MainQualificationCount == 2) {
    IBP1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/IBPoints One'))

    int IBP1count = rad.nextInt(IBP1TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/IBPoints One'), IBP1count)

    IBY1TotalPoints = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/IBYear One'))

    int IBY1count = rad.nextInt(IBY1TotalPoints)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/IBYear One'), IBY1count)

    IBP2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/IBPoints Two'))

    int IBP2count = rad.nextInt(IBP2TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/IBPoints Two'), IBP2count)

    IBY2TotalOptions = WebUI.getNumberOfSelectedOption(findTestObject('REALRatings/REALrating/IBYear Two'))

    int IBY2count = rad.nextInt(IBY2TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/IBYear Two'), IBY2count)

    IBP3TotalOptions = WebUI.getNumberOfSelectedOption(findTestObject('REALRatings/REALrating/IBPoints Three'))

    int IBP3count = rad.nextInt(IBP3TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/IBPoints Three'), IBP3count)

    IBY3TotalOptions = WebUI.getNumberOfSelectedOption(findTestObject('REALRatings/REALrating/IBYear Three'))

    int IBY3count = rad.nextInt(IBY3TotalOptions)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/IBYear Three'), IBY3count)
} else if (MainQualificationCount == 3) {
    WebUI.setText(findTestObject('REALRatings/REALrating/Other Qualification'), 'other ouualifications ')
} else if (MainQualificationCount == 4) {
    WebUI.setText(findTestObject('REALRatings/REALrating/HE Title'), 'hemathshe course')

    HEGradeTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/HE Grade'))

    int HEGradeCount = rad.nextInt(HEGradeTotalOptions)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/HE Grade'), HEGradeCount)

    HEYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/HE Year'))

    int HEYearCount = rad.nextInt(HEYearTotalOptions)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/HE Year'), HEYearCount)
}

