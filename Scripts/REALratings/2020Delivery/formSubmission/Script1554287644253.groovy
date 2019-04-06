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

'Launch REALratings Application'
WebUI.navigateToUrl('https://2020-uat.realrating.co.uk/')

WebUI.maximizeWindow()

WebUI.delay(1)

WebUI.comment('Basic Information')

Random rad = new Random()

'Enter First Name'
WebUI.setText(findTestObject('REALRatings/2020Delivery/Page_REALrating/input_First Name_first_name'), findTestData('getEmployable/Applicants').getValue(
        1, 1))

'Enter Last Name'
WebUI.setText(findTestObject('REALRatings/2020Delivery/Page_REALrating/input_Last Name_last_name'), findTestData('getEmployable/Applicants').getValue(
        2, 1))

int email = rad.nextInt(2000)

'Enter University Email'
WebUI.setText(findTestObject('REALRatings/2020Delivery/Page_REALrating/input_Email address used in your application_email'), 
    ('2020' + email) + '@test.com')

'Click NEXT'
WebUI.click(findTestObject('REALRatings/Greensill/Page_REALrating/First Next'), FailureHandling.STOP_ON_FAILURE)

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
LengthOfUniversitycourseTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Greensill/Page_REALrating/Length Of University Course'))

LengthOfUniversitycount = (1 + rad.nextInt(LengthOfUniversitycourseTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/Length Of University Course'), LengthOfUniversitycount)

'Current Year of Study (as of Sept 2018)'
WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/Current Year Of Study'), LengthOfUniversitycount)

WebUI.delay(5)

WebUI.click(findTestObject('REALRatings/2020Delivery/Page_REALrating/Second Next'))

WebUI.delay(2)

WebUI.comment('Last  Information')

'A-Level year'
ALevelYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Greensill/Page_REALrating/A Level Year'))

ALevelYearcount = (1 + rad.nextInt(ALevelYearTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/A Level Year'), ALevelYearcount)

'GCSE Year'
GCSEYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Greensill/Page_REALrating/GCSE Year'))

GCSEYearCount = (1 + rad.nextInt(GCSEYearTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/GCSE Year'), GCSEYearCount)

'Select Main Qualification'
MainQualificationTotaloptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Greensill/Page_REALrating/Main Qualification'))

MainQualificationCount = (1 + rad.nextInt(MainQualificationTotaloptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/Main Qualification'), MainQualificationCount)

'A-Level'
if (MainQualificationCount == 1) {
    'Subject Title One'
    WebUI.setText(findTestObject('REALRatings/Greensill/Page_REALrating/Title One'), 'Further Mathematics')

    Grade1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Greensill/Page_REALrating/Grade one'))

    Grade1 = rad.nextInt(Grade1TotalOptions - 1)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/Grade one'), Grade1)

    Year1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Greensill/Page_REALrating/Year One'))

    Year1 = (1 + rad.nextInt(Year1TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/Year One'), Year1)

    'Subject Title Two'
    WebUI.setText(findTestObject('REALRatings/Greensill/Page_REALrating/Title Two'), 'Computer Science')

    Grade2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Greensill/Page_REALrating/Grade Two'))

    Grade2 = (1 + rad.nextInt(Grade2TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/Grade Two'), Grade2)

    Year2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Greensill/Page_REALrating/Year Two'))

    Year2 = (1 + rad.nextInt(Year2TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/Year Two'), Year2)

    'Subject Title Three'
    WebUI.setText(findTestObject('REALRatings/Greensill/Page_REALrating/Title Three'), 'Further Mathematics')

    Grade3TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Greensill/Page_REALrating/Grade Three'))

    Grade3 = (1 + rad.nextInt(Grade3TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/Grade Three'), Grade3)

    Year3TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Greensill/Page_REALrating/Year Three'))

    Year3 = (1 + rad.nextInt(Year3TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/Year Three'), Year3)
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
    IBP1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Greensill/Page_REALrating/IB Points one'))

    IBP1count = (1 + rad.nextInt(IBP1TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/IB Points one'), IBP1count)

    IBY1TotalPoints = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Greensill/Page_REALrating/IB Year One'))

    IBY1count = (1 + rad.nextInt(IBY1TotalPoints - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/IB Year One'), IBY1count)

    IBP2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Greensill/Page_REALrating/IB Points Two'))

    IBP2count = (1 + rad.nextInt(IBP2TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/IB Points Two'), IBP2count)

    WebUI.delay(2)

    IBY2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Greensill/Page_REALrating/IB YearTwo'))

    IBY2count = (1 + rad.nextInt(IBY2TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/IB YearTwo'), IBY2count)

    IBP3TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Greensill/Page_REALrating/IB Points Three'))

    IBP3count = (1 + rad.nextInt(IBP3TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/IB Points Three'), IBP3count)

    IBY3TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Greensill/Page_REALrating/IB YearThree'))

    IBY3count = (1 + rad.nextInt(IBY3TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/IB YearThree'), IBY3count)
} else if (MainQualificationCount == 4) {
    WebUI.setText(findTestObject('REALRatings/Greensill/Page_REALrating/Other Qualification'), 'other ouualifications ')
} else if (MainQualificationCount == 5) {
    WebUI.setText(findTestObject('REALRatings/Greensill/Page_REALrating/HETitle'), 'hemathshe course')

    HEGradeTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Greensill/Page_REALrating/HE Grade'))

    HEGradeCount = (1 + rad.nextInt(HEGradeTotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/HE Grade'), HEGradeCount)

    HEYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Greensill/Page_REALrating/HE Year'))

    HEYearCount = (1 + rad.nextInt(HEYearTotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/HE Year'), HEYearCount)
}

'Alevel School'
WebUI.setText(findTestObject('REALRatings/Greensill/Page_REALrating/A Level School'), findTestData('getEmployable/Applicants').getValue(
        6, 1))

'GCSE School'
WebUI.setText(findTestObject('REALRatings/Greensill/Page_REALrating/GCSE School'), findTestData('getEmployable/Applicants').getValue(
        7, 1))

'ALevel PostalCode'
WebUI.setText(findTestObject('REALRatings/Greensill/Page_REALrating/A Level Postalcode'), findTestData('getEmployable/Applicants').getValue(
        8, 1))

'GCSE PostalCode'
WebUI.setText(findTestObject('REALRatings/Greensill/Page_REALrating/GCSE Postalcode'), findTestData('getEmployable/Applicants').getValue(
        9, 1))

'Gender'
WebUI.click(findTestObject('REALRatings/Greensill/Page_REALrating/Gender'))

'Tick Any Statement'
WebUI.click(findTestObject('REALRatings/Greensill/Page_REALrating/TickAnyStatement'))

'User Agreement'
WebUI.click(findTestObject('REALRatings/Greensill/Page_REALrating/input_By ticking this box I confirm that I agree to the_confirmAgreement'))

'Click on Submit Button'
WebUI.click(findTestObject('REALRatings/Greensill/Page_REALrating/a_Submit'))

WebUI.delay(5)

'verify Sucessfull Form Submission'
assert WebUI.getUrl() == 'https://2020-uat.realrating.co.uk/thankyou'

WebUI.takeScreenshot()

