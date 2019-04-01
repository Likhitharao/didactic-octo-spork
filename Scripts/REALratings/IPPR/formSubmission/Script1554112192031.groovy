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

'Launch IPPR Application'
WebUI.navigateToUrl(findTestData('getEmployable/URL').getValue(1, 6))

WebUI.maximizeWindow()
Random rad = new Random()

WebUI.comment('Basic Information')

'Enter First Name'
WebUI.setText(findTestObject('REALRatings/REALrating/First Name'), findTestData('getEmployable/Applicants').getValue(1,
		1))

'Enter Last Name'
WebUI.setText(findTestObject('REALRatings/REALrating/Last Name'), findTestData('getEmployable/Applicants').getValue(2, 1))

'Enter University Email'
WebUI.setText(findTestObject('REALRatings/REALrating/University Email'), findTestData('getEmployable/Applicants').getValue(
		3, 1))

WebUI.delay(5)



WebUI.comment('School Information')



'University'
UniversityTotalOption = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/University'))

 UniversityCount = (1+rad.nextInt(UniversityTotalOption-1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/University'), UniversityCount)

'Other University'
if (UniversityCount == 95) {
	WebUI.setText(findTestObject('REALRatings/REALrating/Other University'), 'VTU Other university')
}

'University Course'
UniversityCourseTotalOption = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/University Course'))

 UniveristyCourseCount = (1+rad.nextInt(UniversityCourseTotalOption-1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/University Course'), UniveristyCourseCount)

'University Other Course '
if (UniveristyCourseCount == 95) {
	WebUI.setText(findTestObject('REALRatings/REALrating/University Course Other'), 'VTU ')
}

'Length of university course'
LengthOfUniversitycourseTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Length Of university Course'))

 LengthOfUniversitycount = (1+rad.nextInt(LengthOfUniversitycourseTotalOptions-1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Length Of university Course'), LengthOfUniversitycount)

'Current Year of Study (as of Sept 2018)'
WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Current Year Of Study'), LengthOfUniversitycount)

WebUI.delay(5)

WebUI.comment('Main Qualification')

'A-Level year'
ALevelYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/ALevel Year'))



int ALevelYearcount = rad.nextInt(ALevelYearTotalOptions)

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/ALevel Year'), ALevelYearcount)

'GCSE Year'
GCSEYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/GCSE Year'))

int GCSEYearCount = rad.nextInt(GCSEYearTotalOptions)

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/GCSE Year'), GCSEYearCount)



'Select Main Qualification'
MainQualificationTotaloptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Main Qualification'))

 MainQualificationCount = (1+rad.nextInt(MainQualificationTotaloptions-1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Main Qualification'), MainQualificationCount)

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

    Grade2 = (1 + rad.nextInt(Grade2TotalOptions))

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

    IBP1count = (1 + rad.nextInt(IBP1TotalOptions))

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

    int IBY3count = 1 + rad.nextInt(IBY3TotalOptions - 1)

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



'ALevel PostalCode'
WebUI.setText(findTestObject('REALRatings/NorthHighland/Page_REALrating/ALevelPostcode'), findTestData('getEmployable/Applicants').getValue(
        8, 1))

'GCSE PostalCode'
WebUI.setText(findTestObject('REALRatings/NorthHighland/Page_REALrating/GCSEPostcode'), findTestData('getEmployable/Applicants').getValue(
        9, 1))
'Gender'
WebUI.click(findTestObject('REALRatings/NorthHighland/Page_REALrating/Gender'))

'Tick Any Statement'
WebUI.click(findTestObject('REALRatings/NorthHighland/Page_REALrating/TickAnyStatement'))

'User Agreement'
WebUI.click(findTestObject('REALRatings/NorthHighland/Page_REALrating/ConfirmAggreement'))

'Click on Submit Button'
WebUI.click(findTestObject('REALRatings/NorthHighland/Page_REALrating/Submit'))

'verify Sucessfull Form Submission'
assert WebUI.getUrl() == 'https://nh-uat.realrating.co.uk/thankyou'