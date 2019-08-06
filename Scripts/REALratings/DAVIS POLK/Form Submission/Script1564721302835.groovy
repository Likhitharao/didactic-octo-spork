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

WebUI.comment(' DAVIS POLK - Form Submission')

'Open Browser'
WebUI.openBrowser('')

'Launch DAVIS POLK Application'
WebUI.navigateToUrl('https://davispolk-uat.realrating.co.uk/')

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
ALevelYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/NorthHighland/Page_REALrating/A Level Year'))

ALevelYearcount = (1 + rad.nextInt(ALevelYearTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/A Level Year'), ALevelYearcount)

'GCSE Year'
GCSEYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/NorthHighland/Page_REALrating/GCSE Year'))

int GCSEYearCount = 1 + rad.nextInt(GCSEYearTotalOptions - 1)

WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/GCSE Year'), GCSEYearCount)

'Select Main Qualification'
MainQualificationTotaloptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/NorthHighland/Page_REALrating/Main Qualification'))

int MainQualificationCount = 1 + rad.nextInt(MainQualificationTotaloptions - 1)

WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/Main Qualification'), MainQualificationCount)

WebUI.delay(5)

'A-Level'
if (MainQualificationCount == 1) {
    'Subject Title One'
    WebUI.setText(findTestObject('REALRatings/NorthHighland/Page_REALrating/Title One'), 'Further Mathematics')

    Grade1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/NorthHighland/Page_REALrating/Grade One'))

    Grade1 = (1 + rad.nextInt(Grade1TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/Grade One'), Grade1)

    Year1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/NorthHighland/Page_REALrating/Year One'))

    Year1 = (1 + rad.nextInt(Year1TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/Year One'), Year1)

    'Subject Title Two'
    WebUI.setText(findTestObject('REALRatings/NorthHighland/Page_REALrating/Title Two'), 'Computer Science')

    Grade2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/NorthHighland/Page_REALrating/Grade Two'))

    Grade2 = (1 + rad.nextInt(Grade2TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/Grade Two'), Grade2)

    Year2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/NorthHighland/Page_REALrating/Year Two'))

    Year2 = (1 + rad.nextInt(Year2TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/Year Two'), Year2)

    'Subject Title Three'
    WebUI.setText(findTestObject('REALRatings/NorthHighland/Page_REALrating/Title Three'), 'Further Mathematics')

    Grade3TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/NorthHighland/Page_REALrating/Grade Three'))

    Grade3 = (1 + rad.nextInt(Grade3TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/Grade Three'), Grade3)

    Year3TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/NorthHighland/Page_REALrating/Year Three'))

    Year3 = (1 + rad.nextInt(Year3TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/Year Three'), Year3)
} else if (MainQualificationCount == 2) {
    'B-Tech Subject Line'
    WebUI.setText(findTestObject('REALRatings/NorthHighland/Page_REALrating/BTech Title'), 'maths')

    BtechGradeTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/NorthHighland/Page_REALrating/BTech Grade'))

    BtechGradeCount = (1 + rad.nextInt(BtechGradeTotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/BTech Grade'), BtechGradeCount)

    BtechYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/NorthHighland/Page_REALrating/BTech Year'))

    BtechYearCount = (1 + rad.nextInt(BtechYearTotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/BTech Year'), BtechYearCount)
} else if (MainQualificationCount == 3) {
    IBP1TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/NorthHighland/Page_REALrating/IBP One'))

    IBP1count = (1 + rad.nextInt(IBP1TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/IBP One'), IBP1count)

    IBY1TotalPoints = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/NorthHighland/Page_REALrating/IBP1 Year'))

    IBY1count = (1 + rad.nextInt(IBY1TotalPoints - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/IBP1 Year'), IBY1count)

    IBP2TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/NorthHighland/Page_REALrating/IBP Two'))

    IBP2count = (1 + rad.nextInt(IBP2TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/IBP Two'), IBP2count)

    IBY2TotalOptions = WebUI.getNumberOfSelectedOption(findTestObject('REALRatings/NorthHighland/Page_REALrating/IBP2 Year'))

    IBY2count = (1 + rad.nextInt(IBY2TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/IBP2 Year'), IBY2count)

    IBP3TotalOptions = WebUI.getNumberOfSelectedOption(findTestObject('REALRatings/NorthHighland/Page_REALrating/IBP Three'))

    IBP3count = (1 + rad.nextInt(IBP3TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/IBP Three'), IBP3count)

    IBY3TotalOptions = WebUI.getNumberOfSelectedOption(findTestObject('REALRatings/NorthHighland/Page_REALrating/IBP3 Year'))

    IBY3count = (1 + rad.nextInt(IBY3TotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/IBP3 Year'), IBY3count)
} else if (MainQualificationCount == 4) {
    WebUI.setText(findTestObject('REALRatings/NorthHighland/Page_REALrating/Other Qualification'), 'other ouualifications ')
} else if (MainQualificationCount == 5) {
    WebUI.setText(findTestObject('REALRatings/NorthHighland/Page_REALrating/HE Title'), 'hemathshe course')

    HEGradeTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/NorthHighland/Page_REALrating/HE Grade'))

    HEGradeCount = (1 + rad.nextInt(HEGradeTotalOptions - 1))

    WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/HE Grade'), HEGradeCount)

    HEYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/NorthHighland/Page_REALrating/HE Year'))

    int HEYearCount = 1 + rad.nextInt(HEYearTotalOptions - 1)

    WebUI.selectOptionByIndex(findTestObject('REALRatings/NorthHighland/Page_REALrating/HE Year'), HEYearCount)
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
assert WebUI.getUrl() == 'https://davispolk-uat.realrating.co.uk/thankyou'

WebUI.takeScreenshot()

