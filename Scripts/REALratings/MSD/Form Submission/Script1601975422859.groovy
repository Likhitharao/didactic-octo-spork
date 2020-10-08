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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.comment('MSD REAlrating - Form Submission')

'Open Browser'
WebUI.openBrowser('')

'Launch MSD Application'
WebUI.navigateToUrl('https://uat-msd.realrating.co.uk/')

WebUI.maximizeWindow()

Random rad = new Random()

WebUI.comment('Basic Information')

'Enter First Name'
WebUI.setText(findTestObject('REALRatings/NorthHighland/Page_REALrating/First Name'), findTestData('getEmployable/Applicants').getValue(
        1, 1))

'Enter Last Name'
WebUI.setText(findTestObject('REALRatings/NorthHighland/Page_REALrating/Last Name'), findTestData('getEmployable/Applicants').getValue(
        2, 1))

'Enter University Email'
int Email = rad.nextInt(2000)

WebUI.setText(findTestObject('REALRatings/NorthHighland/Page_REALrating/University Emailid'), ('nh' + Email) + '@test.com')

'Click NEXT'
WebUI.click(findTestObject('REALRatings/NorthHighland/Page_REALrating/First Next'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Main Qualifications')

'A-Level year'
ALevelYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/MSD/Page_RealRating/Alevl-dropdown'))

ALevelYearcount = (1 + rad.nextInt(ALevelYearTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/MSD/Page_RealRating/Alevl-dropdown'), ALevelYearcount)

'GCSE Year'
GCSEYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/MSD/Page_RealRating/GSCE-dropdown'))

int GCSEYearCount = 1 + rad.nextInt(GCSEYearTotalOptions - 1)

WebUI.selectOptionByIndex(findTestObject('REALRatings/MSD/Page_RealRating/GSCE-dropdown'), GCSEYearCount)

WebUI.delay(2)

WebUI.comment('University Information')

'University'
UniversityTotalOption = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Greensill/Page_REALrating/University'))

UniversityCount = (1 + rad.nextInt(UniversityTotalOption - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/University'), UniversityCount)

'Other University'
if (UniversityCount == 98) {
    WebUI.setText(findTestObject('REALRatings/Greensill/Page_REALrating/Other University'), 'VTU Other university')
}

'University Course'
UniversityCourseTotalOption = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Greensill/Page_REALrating/University Course'))

UniveristyCourseCount = (1 + rad.nextInt(UniversityCourseTotalOption - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/University Course'), UniveristyCourseCount)

'University Other Course '
if (UniveristyCourseCount == 95) {
    WebUI.setText(findTestObject('REALRatings/Greensill/Page_REALrating/Univerisity Course Other'), 'VTU ')
}

'Length of university course'
LengthOfUniversitycourseTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/MSD/Page_RealRating/Page_REALrating/Length of University'))

LengthOfUniversitycount = (1 + rad.nextInt(LengthOfUniversitycourseTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/MSD/Page_RealRating/Page_REALrating/Length of University'), LengthOfUniversitycount)

'Current Year of Study (as of Sept 2018)'
WebUI.selectOptionByIndex(findTestObject('REALRatings/MSD/Page_RealRating/Page_REALrating/Current year of study'), LengthOfUniversitycount)

WebUI.delay(5)

WebUI.click(findTestObject('REALRatings/MSD/Page_RealRating/Page_REALrating/2nd Next'))

WebUI.delay(2)

MainQualificationTotaloptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/NorthHighland/Page_REALrating/Main Qualification'))

int MainQualificationCount = 1 + rad.nextInt(MainQualificationTotaloptions - 1)

WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/Main Qualification'), MainQualificationCount)

'Select Main Qualification'
WebUI.delay(5)

//WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/Main Qualification'), '3', FailureHandling.STOP_ON_FAILURE)
if (MainQualificationCount == 1) {
    'Subject Title One'
    WebUI.setText(findTestObject('REALRatings/MSD/Page_RealRating/A-sub1'), 'Further Mathematics')

    Grade1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/MSD/Page_RealRating/A-Grade1'))

    Grade1 = (1 + rad.nextInt(Grade1TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/MSD/Page_RealRating/A-Grade1'), Grade1)

    Year1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/MSD/Page_RealRating/A-Year1'))

    Year1 = (1 + rad.nextInt(Year1TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/MSD/Page_RealRating/A-Year1'), Year1)

    'Subject Title Two'
    WebUI.setText(findTestObject('REALRatings/MSD/Page_RealRating/A-sub2'), 'Computer Science')

    Grade2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/MSD/Page_RealRating/A-Grade2'))

    Grade2 = (1 + rad.nextInt(Grade2TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/MSD/Page_RealRating/A-Grade2'), Grade2)

    Year2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/MSD/Page_RealRating/A-Year2'))

    Year2 = (1 + rad.nextInt(Year2TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/MSD/Page_RealRating/A-Year2'), Year2)

    'Subject Title Three'
    WebUI.setText(findTestObject('REALRatings/MSD/Page_RealRating/A-sub3'), 'Further Mathematics')

    Grade3TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/MSD/Page_RealRating/A-grade3'))

    Grade3 = (1 + rad.nextInt(Grade3TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/MSD/Page_RealRating/A-grade3'), Grade3)

    Year3TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/MSD/Page_RealRating/A-Year3'))

    Year3 = (1 + rad.nextInt(Year3TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/MSD/Page_RealRating/A-Year3'), Year3) //IBY2TotalOptions = WebUI.getNumberOfSelectedOption(findTestObject('REALRatings/MSD/Page_RealRating/IB- yaer2 new'))
    //IBY2count = (1 + rad.nextInt(IBY2TotalOptions - 1))
    //IBP3TotalOptions = WebUI.getNumberOfSelectedOption(findTestObject('REALRatings/MSD/Page_RealRating/IB-3'))
    //IBP3count = (1 + rad.nextInt(IBP3TotalOptions - 1))
    //IBY3TotalOptions = WebUI.getNumberOfSelectedOption(findTestObject('REALRatings/MSD/Page_RealRating/IB-year3'))
    //IBY3count = (1 + rad.nextInt(IBY3TotalOptions - 1))
} else if (MainQualificationCount == 2) {
    'B-Tech Subject Line'
    WebUI.setText(findTestObject('REALRatings/MSD/Page_RealRating/Btech-sub'), 'maths')

    BtechGradeTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/MSD/Page_RealRating/Btech-Grade'))

    BtechGradeCount = (1 + rad.nextInt(BtechGradeTotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/MSD/Page_RealRating/Btech-Grade'), BtechGradeCount)

    BtechYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/MSD/Page_RealRating/Btec-year'))

    BtechYearCount = (1 + rad.nextInt(BtechYearTotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/MSD/Page_RealRating/Btec-year'), BtechYearCount)
} else if (MainQualificationCount == 3) {
    'IB -Level'
    IBP1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/MSD/Page_RealRating/IB-1'))

    IBP1count = (1 + rad.nextInt(IBP1TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/MSD/Page_RealRating/IB-1'), IBP1count)

    IBY1TotalPoints = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/MSD/Page_RealRating/IB-year1'))

    IBY1count = (1 + rad.nextInt(IBY1TotalPoints - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/MSD/Page_RealRating/IB-year1'), IBY1count)

    IBP2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/MSD/Page_RealRating/IB-2'))

    IBP2count = (1 + rad.nextInt(IBP2TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/MSD/Page_RealRating/IB-2'), IBP2count)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/MSD/Page_RealRating/IB- yaer2 new'), IBY1count)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/MSD/Page_RealRating/IB-3'), IBP1count)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/MSD/Page_RealRating/IB-year3'), IBY1count)
} else if (MainQualificationCount == 4) {
    WebUI.setText(findTestObject('REALRatings/MSD/Page_RealRating/Other-text'), 'other ouualifications ')
} else if (MainQualificationCount == 5) {
    WebUI.setText(findTestObject('REALRatings/NorthHighland/Page_REALrating/HE Title'), 'hemathshe course')

    HEGradeTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/NorthHighland/Page_REALrating/HE Grade'))

    HEGradeCount = (1 + rad.nextInt(HEGradeTotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/HE Grade'), HEGradeCount)

    HEYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/MSD/Page_RealRating/Page_REALrating/Page_REALrating/Access HE year'))

    int HEYearCount = 1 + rad.nextInt(HEYearTotalOptions - 1)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/MSD/Page_RealRating/Page_REALrating/Page_REALrating/Access HE year'), 
        HEYearCount)
}

'Alevel School'
WebUI.setText(findTestObject('REALRatings/NorthHighland/Page_REALrating/A Level School'), findTestData('getEmployable/Applicants').getValue(
        6, 1))

'GCSE School'
WebUI.setText(findTestObject('REALRatings/NorthHighland/Page_REALrating/GCSE School'), findTestData('getEmployable/Applicants').getValue(
        7, 1))

'Gender'
WebUI.click(findTestObject('REALRatings/NorthHighland/Page_REALrating/Gender'))

'ALevel PostalCode'
WebUI.setText(findTestObject('REALRatings/NorthHighland/Page_REALrating/ALevelPostcode'), findTestData('getEmployable/Applicants').getValue(
        8, 1))

'GCSE PostalCode'
WebUI.setText(findTestObject('REALRatings/NorthHighland/Page_REALrating/GCSEPostcode'), findTestData('getEmployable/Applicants').getValue(
        9, 1))

'Tick Any Statement'
WebUI.click(findTestObject('REALRatings/NorthHighland/Page_REALrating/TickAnyStatement'))

'User Agreement'
WebUI.click(findTestObject('REALRatings/NorthHighland/Page_REALrating/ConfirmAggreement'))

'Click on Submit Button'
WebUI.click(findTestObject('REALRatings/NorthHighland/Page_REALrating/Submit'))

WebUI.delay(5)

'verify Sucessfull Form Submission'
assert WebUI.getUrl() == 'https://uat-msd.realrating.co.uk/thankyou'

WebUI.takeScreenshot()

