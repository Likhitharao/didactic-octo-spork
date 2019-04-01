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
WebUI.navigateToUrl(findTestData('getEmployable/URL').getValue(1, 5))

WebUI.maximizeWindow()

WebUI.delay(1)

WebUI.comment('Basic Information')

'Enter First Name'
WebUI.setText(findTestObject('REALRatings/Greensill/Page_REALrating/First Name'), findTestData('getEmployable/Applicants').getValue(
        1, 1))

'Enter Last Name'
WebUI.setText(findTestObject('REALRatings/Greensill/Page_REALrating/Last Name'), findTestData('getEmployable/Applicants').getValue(
        2, 1))

'Enter University Email'
WebUI.setText(findTestObject('REALRatings/Greensill/Page_REALrating/University Emailid'), findTestData('getEmployable/Applicants').getValue(
        3, 1))

WebUI.delay(5)

'Click NEXT'
WebUI.click(findTestObject('REALRatings/Greensill/Page_REALrating/First Next'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('University Information')

'University'
UniversityTotalOption = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/Greensill/Page_REALrating/University'))

Random rad = new Random()

UniversityCount = (1 + rad.nextInt(UniversityTotalOption - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/Greensill/Page_REALrating/University'), UniversityCount)

'Other University'
if (UniversityCount == 95) {
    WebUI.setText(findTestObject('REALRatings/Greensill/Page_REALrating/Other University'), 'VTU Other university')

    'Enter Last Name'
    WebUI.setText(findTestObject('REALRatings/Greensill/Page_REALrating/Last Name'), findTestData('getEmployable/Applicants').getValue(
            2, 1))
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

WebUI.click(findTestObject('REALRatings/Greensill/Page_REALrating/Second Next'))

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

WebUI.delay(5)

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
WebUI.click(findTestObject('REALRatings/Greensill/Page_REALrating/User Agrrement'))

'Click on Submit Button'
WebUI.click(findTestObject('REALRatings/Greensill/Page_REALrating/Last Next'))

'verify Sucessfull Form Submission'
assert WebUI.getUrl() == 'https://uat.realrating.co.uk/realrating/thankyou'

