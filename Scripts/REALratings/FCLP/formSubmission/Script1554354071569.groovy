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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver

WebUI.comment('FCLP - Form Submission')

'Open Browser'
WebUI.openBrowser('')

WebDriver myDriver = DriverFactory.getWebDriver()

'Launch FCLP Applications'
WebUI.navigateToUrl('https://fclp-uat.realrating.co.uk/')

WebUI.maximizeWindow()

Random rad = new Random()

WebUI.comment('Basic and University  Information')

'Enter First Name'
WebUI.setText(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/First Name'), 'asha')

'Enter Last Name'
WebUI.setText(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Last Name'), 'rajednran')

'Enter University Email'
int emailid = rad.nextInt(2000)

WebUI.setText(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Univrsity Emaid'), ('fclp' + emailid) + '@test.com')

'University'
UniversityTotalOption = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/University'))

UniversityCount = (1 + rad.nextInt(UniversityTotalOption - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/University'), UniversityCount)

'Other University'
if (UniversityCount == 98) {
    WebUI.setText(findTestObject('REALRatings/REALrating/Page_REALrating/Other University'), 'VTU Other university')
}

'University Course'
UniversityCourseTotalOption = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/University Course'))

UniveristyCourseCount = (1 + rad.nextInt(UniversityCourseTotalOption - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/University Course'), UniveristyCourseCount)

'University Other Course '
if (UniveristyCourseCount == 95) {
    WebUI.setText(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Other University Course'), 'VTU ')
}

'Graduation Year'
GraduationYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Graduation Year'))

GraduationYearcount = (1 + rad.nextInt(GraduationYearTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Graduation Year'), GraduationYearcount)

'Do you have a university degree at grade 2:1 or higher (or equivalent)?'
GradeYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Grade 21'))

GradeYearcount = (1 + rad.nextInt(GradeYearTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Grade 21'), GradeYearcount)

'Do you have at least a grade B in GCSE English?'
GradeEnglishYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Grade B English'))

GradeEnglishYearcount = (1 + rad.nextInt(GradeEnglishYearTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Grade B English'), GradeEnglishYearcount)

WebUI.delay(2)

//GradeMathsYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Grade B Maths'))
//GradeMathsYearcount = (1 + rad.nextInt(GradeMathsYearTotalOptions - 1))
'Do you have at least a grade B in GCSE Maths?'
WebUI.selectOptionByIndex(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Grade B Maths'), GradeEnglishYearcount)

WebUI.click(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/a_Next'))

WebUI.delay(2)

WebUI.comment('Main Qualification Information')

'A-Level year'
ALevelYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/A Level Year'))

ALevelYearcount = (1 + rad.nextInt(ALevelYearTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/A Level Year'), ALevelYearcount)

'GCSE Year'
GCSEYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/GCSE Year'))

GCSEYearCount = (1 + rad.nextInt(GCSEYearTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/GCSE Year'), GCSEYearCount)

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

'Tick Any Statement'
WebUI.click(findTestObject('REALRatings/Greensill/Page_REALrating/TickAnyStatement'))

'Click on Next'
WebUI.click(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Second Next'))

WebUI.delay(2)

WebUI.comment('Background Information')

'Confirm User Agreement'
WebUI.click(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/confirm agreement'))

'What is your ethnic group?'
EthnicTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Ethnic Group'), FailureHandling.STOP_ON_FAILURE)

EthnicCount = (1 + rad.nextInt(EthnicTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Ethnic Group'), EthnicCount)

'Select the group that best describes the type of work your highest earning parent or guardian did when you were 14 from the options that appear once you start typing.'
WebUI.setText(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/input_What is your ethnic group_parent_carer'), 'ethnicparent group')

'Gender'
GenderTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Gender'), FailureHandling.STOP_ON_FAILURE)

GenderCount = (1 + rad.nextInt(GenderTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Gender'), GenderCount)

'other Gender'
if (GenderCount == 3) {
    WebUI.setText(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Other Gender'), 'Othr Gender')
}

'What is your religion?'
ReligionTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Religion'))

ReligionCount = (1 + rad.nextInt(ReligionTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Religion'), ReligionCount)

'Other Religion'
if (ReligionCount == 8) {
    WebUI.setText(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/input_Other Religion_religion'), 'hindu')
}

'Is your gender identity the same as the sex you were assigned at birth?'
BirthTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Birth Gender'))

BirthCount = (1 + rad.nextInt(BirthTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Birth Gender'), BirthCount)

'What is your sexual orientation?'
SexualTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Sexual Orientation'))

SexualCount = (1 + rad.nextInt(SexualTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Sexual Orientation'), SexualCount)

'other Orientation'
if (SexualCount == 5) {
    WebUI.setText(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/input_Other Orientation_sexual_orientation'), 'other sexual ')
}

'Do you have an impairment, health condition or learning difference that has a substantial or long term impact on your ability to carry out day to day activities?'
ImpairmentTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Impairment'))

ImpairmentCount = (1 + rad.nextInt(ImpairmentTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Impairment'), ImpairmentCount)

'Other Impairment'
if (ImpairmentCount == 9) {
    WebUI.setText(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/Other Orientation'), 'othe health issues')
}

'click submit button'
WebUI.click(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating/a_Submit'))

WebUI.delay(5)

'verify Sucessfull Form Submission'
assert WebUI.getUrl() == 'https://fclp-uat.realrating.co.uk/thankyou'

WebUI.takeScreenshot()

