import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.comment('Apply Now/Form1 - Details')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.upreach.org.uk/')

WebUI.maximizeWindow()

'Click on apply now button'
WebUI.click(findTestObject('ApplyNow/Page_upReach  Boosting social mobility by supporting students from less-advantaged backgrounds to secure top jobs/a_Apply Now'))

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

'Enter First Name'
WebUI.setText(findTestObject('ApplyNow/Page_Apply Now  upReach/Firstnam'), findTestData('getEmployable/Applicants').getValue(
        1, 1))

'Enter Last Name'
WebUI.setText(findTestObject('ApplyNow/Page_Apply Now  upReach/input__last_name'), findTestData('getEmployable/Applicants').getValue(
        2, 1))

Random rad = new Random()

'University'
UniversityTotalOption = WebUI.getNumberOfTotalOption(findTestObject('ApplyNow/Page_Apply Now  upReach/University'))

UniversityCount = (1 + rad.nextInt(UniversityTotalOption - 1))

WebUI.selectOptionByIndex(findTestObject('ApplyNow/Page_Apply Now  upReach/University'), UniversityCount)

'Not yet University'
if (UniversityCount == 1) {
} else {
    'University Course'
    UniversityCourseTotalOption = WebUI.getNumberOfTotalOption(findTestObject('ApplyNow/Page_Apply Now  upReach/University course'))

    UniveristyCourseCount = (1 + rad.nextInt(UniversityCourseTotalOption - 1))

    WebUI.selectOptionByIndex(findTestObject('ApplyNow/Page_Apply Now  upReach/University course'), UniveristyCourseCount)

    'University Other Course '
    if (UniveristyCourseCount == 94) {
        WebUI.setText(findTestObject('ApplyNow/Page_Apply Now  upReach/other course'), 'VTU ')
    }
    
    'Random selection of Course Duration and Year Of Study'
    CourseDurationTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('ApplyNow/Page_Apply Now  upReach/Course length'))

    int CourseDurationCount = 1 + rad.nextInt(CourseDurationTotalOptions - 1)

    WebUI.selectOptionByIndex(findTestObject('ApplyNow/Page_Apply Now  upReach/Course length'), CourseDurationCount)

    WebUI.selectOptionByIndex(findTestObject('ApplyNow/Page_Apply Now  upReach/Current Year'), CourseDurationCount)
}

'Enter Mobile Number'
WebUI.setText(findTestObject('ApplyNow/Page_Apply Now  upReach/input__phone'), findTestData('getEmployable/Applicants').getValue(
        5, 1))

int Email = rad.nextInt(2000)

'Enter Personal Email '
WebUI.setText(findTestObject('ApplyNow/Page_Apply Now  upReach/personal email'), ('personal' + Email) + '@test.com')

'Enter University Email'
WebUI.setText(findTestObject('ApplyNow/Page_Apply Now  upReach/input__university_email'), ('test' + Email) + '@ac.uk')

WebUI.click(findTestObject('ApplyNow/Page_Apply Now  upReach/Career Stream'))

'Hear about upReach'
AboutupReach = WebUI.getNumberOfTotalOption(findTestObject('ApplyNow/Page_Apply Now  upReach/hear about upreach'))

AboutupReachCount = (1 + rad.nextInt(AboutupReach - 1))

WebUI.selectOptionByIndex(findTestObject('ApplyNow/Page_Apply Now  upReach/hear about upreach'), AboutupReachCount)

if (AboutupReachCount == 4) {
    WebUI.setText(findTestObject('ApplyNow/Page_Apply Now  upReach/Associate name'), 'John')
} else if (AboutupReachCount == 2) {
    WebUI.setText(findTestObject('ApplyNow/Page_Apply Now  upReach/other hear about upreach'), 'Other')
}

'Check Confirm '
WebUI.click(findTestObject('ApplyNow/Page_Apply Now  upReach/label_By ticking this box I confirm that I meet all the eligibility criteria (Who we support).'))

'Check Agreement '
WebUI.click(findTestObject('ApplyNow/Page_Apply Now  upReach/Agreement tick'))

'Click on register button'
WebUI.click(findTestObject('ApplyNow/Page_Apply Now  upReach/button_Register'))

