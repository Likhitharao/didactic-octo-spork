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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByXPath as ByXPath
import org.openqa.selenium.WebElement as WebElement

WebUI.comment('Apply Now/Form1 - Details')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.upreach.org.uk/')

WebUI.maximizeWindow()

WebDriver myDriver = DriverFactory.getWebDriver()

'Click on Apply Now button'
WebUI.click(findTestObject('ApplyNow/Page_upReach  Boosting social mobility by supporting students from less-advantaged backgrounds to secure top jobs/a_Apply Now'))

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

'Validate the URL'
assert WebUI.getUrl() == 'https://uat.upreach.org.uk/apply-now/'

'Enter First Name'
WebUI.setText(findTestObject('ApplyNow/Page_Apply Now  upReach/First Name'), findTestData('getEmployable/Applicants').getValue(
        1, 1))

'Enter Last Name'
WebUI.setText(findTestObject('ApplyNow/Page_Apply Now  upReach/Last Name '), findTestData('getEmployable/Applicants').getValue(
        2, 1))

Random rad = new Random()

'University'
UniversityTotalOption = WebUI.getNumberOfTotalOption(findTestObject('ApplyNow/Page_Apply Now  upReach/University'))

UniversityCount = (1 + rad.nextInt(UniversityTotalOption - 1))

WebUI.selectOptionByIndex(findTestObject('ApplyNow/Page_Apply Now  upReach/University'), UniversityCount)

'Not yet University'
if (UniversityCount == 1) {
    'Start Date'
    StartDateTotalOption = WebUI.getNumberOfTotalOption(findTestObject('ApplyNow/Page_Apply Now  upReach/Start Date_University'))

    StartDateCount = (1 + rad.nextInt(StartDateTotalOption - 1))

    WebUI.selectOptionByIndex(findTestObject('ApplyNow/Page_Apply Now  upReach/Start Date_University'), StartDateCount)
} else {
    'University Course'
    UniversityCourseTotalOption = WebUI.getNumberOfTotalOption(findTestObject('ApplyNow/Page_Apply Now  upReach/University Courses'))

    UniveristyCourseCount = (1 + rad.nextInt(UniversityCourseTotalOption - 1))

    WebUI.selectOptionByIndex(findTestObject('ApplyNow/Page_Apply Now  upReach/University Courses'), UniveristyCourseCount)

    'University Other Course '
    if (UniveristyCourseCount == 94) {
        WebUI.setText(findTestObject('ApplyNow/Page_Apply Now  upReach/Other_Unviveristy Course'), 'VTU ')
    }
    
    'Random selection of Course Duration and Year Of Study'
    CourseDurationTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('ApplyNow/Page_Apply Now  upReach/Length of undergraduate course (years)'))

    int CourseDurationCount = 1 + rad.nextInt(CourseDurationTotalOptions - 1)

    WebUI.selectOptionByIndex(findTestObject('ApplyNow/Page_Apply Now  upReach/Length of undergraduate course (years)'), CourseDurationCount)

    WebUI.selectOptionByIndex(findTestObject('ApplyNow/Page_Apply Now  upReach/Year of study as of September 2018'), CourseDurationCount)
}

'Enter Mobile Number'
WebUI.setText(findTestObject('ApplyNow/Page_Apply Now  upReach/Mobile Number'), findTestData('getEmployable/Applicants').getValue(
        5, 1))

int Email = rad.nextInt(2000)
'Enter Personal Email '
WebUI.setText(findTestObject('ApplyNow/Page_Apply Now  upReach/Personal Email Address'), ('personal' + Email) + '@test.com')

'Enter University Email'
WebUI.setText(findTestObject('ApplyNow/Page_Apply Now  upReach/University Email Address'), ('test' + Email) + '@ac.uk')

WebUI.delay(2)

'Select the Preferred Career Stream'
List Career = myDriver.findElements(By.xpath('.//*[@id=\'form1\']/div[11]/table/tbody/tr/td/label/input'))

int Careercount = Career.size()

java.lang.System.out.println('The total number of Career stream options =' + Careercount)

CareerStreamCount = (1 + rad.nextInt(Careercount - 1))

myDriver.findElement(By.xpath('.//*[@id=\'form1\']/div[11]/table/tbody/tr[1]/td/label/input')).click()

'Hear about upReach'
AboutupReach = WebUI.getNumberOfTotalOption(findTestObject('ApplyNow/Page_Apply Now  upReach/How did you hear about upReach'))

AboutupReachCount = (1 + rad.nextInt(AboutupReach - 1))

WebUI.selectOptionByIndex(findTestObject('ApplyNow/Page_Apply Now  upReach/How did you hear about upReach'), AboutupReachCount)

if (AboutupReachCount == 4) {
    WebUI.setText(findTestObject('ApplyNow/Page_Apply Now  upReach/Associate Name _How did you hear about upReach'), 'John')
} else if (AboutupReachCount == 16) {
    WebUI.setText(findTestObject('ApplyNow/Page_Apply Now  upReach/Other_How did you hear about upReach'), 'Other')
}

WebUI.delay(2)

'I confirm that I meet all the eligibility criteria (Who we support). '
WebUI.click(findTestObject('ApplyNow/Page_Apply Now  upReach/label_By ticking this box I co'))

'I agree to the upReachs Associate User Agreement and Data Protection Policy.'
WebUI.click(findTestObject('ApplyNow/Page_Apply Now  upReach/label_By ticking this box I ag'))

'Click on register button'
WebUI.click(findTestObject('ApplyNow/Page_Apply Now  upReach/button_Register'))

'Verify Successfull registration'
assert WebUI.getUrl()== 'https://uat-enki.upreach.org.uk/form/register'

