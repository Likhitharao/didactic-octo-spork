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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement

WebUI.comment('FCLP - Form Submission')

'Open Browser'
WebUI.openBrowser('')

WebDriver myDriver = DriverFactory.getWebDriver()

'Random Method'
Random rad = new Random()

'Launch FCLP Applications'
WebUI.navigateToUrl('https://uat-apply.realrating.co.uk/')

WebUI.maximizeWindow()

//WebUI.verifyElementPresent(findTestObject('REALRatings/FCLP/page_REALrating_form/h3_upReach Future Charity Lead'), 5, FailureHandling.STOP_ON_FAILURE)
'Verify successfull form launch'
WebUI.comment('First Page : Basic Information')

'Enter First Name'
WebUI.setText(findTestObject('REALRatings/FCLP/page_REALrating_form/input_First Name_first_name'), 'ken')

'Enter Preferred Name'
WebUI.setText(findTestObject('REALRatings/FCLP/page_REALrating_form/input_Preferred Name_preferred'), 'Brytan')

'Enter Last Name'
WebUI.setText(findTestObject('REALRatings/FCLP/page_REALrating_form/input_Last Name_last_name'), 'Robert')

'Enter Email'
int Email = rad.nextInt(2000)

WebUI.setText(findTestObject('REALRatings/FCLP/page_REALrating_form/input_Email address_email'), ('kenrobert' + Email) + 
    '@gmail.com')

'Enter Mobile Number'
WebUI.setText(findTestObject('REALRatings/FCLP/page_REALrating_form/input_Mobile Number_mobile'), '08125458458')

'Click on Next Button'
WebUI.click(findTestObject('REALRatings/FCLP/page_REALrating_form/first_a_Next'))

WebUI.delay(5)

WebUI.comment('Second Page : General Questions')

'To verify the questions are present on the general questions page '
List questions = myDriver.findElements(By.xpath('html/body/div[2]/div[2]/div[1]/div[3]/table/tbody/tr/td/div/div/div[1]/strong/label'))

int noofquestion = questions.size()

java.lang.System.out.println('The total number of questions on the second page ' + noofquestion)

if (noofquestion > 0) {
    'Question 1'
    myDriver.findElement(By.xpath('html/body/div[2]/div[2]/div[1]/div[3]/table/tbody/tr[1]/td/div/div/div[2]/div/div[2]/label[5]/input')).click()

    'Question 2'
    myDriver.findElement(By.xpath('html/body/div[2]/div[2]/div[1]/div[3]/table/tbody/tr[2]/td/div/div/div[2]/div/div[2]/div/div[2]/input')).click()

    'Question 3'
    myDriver.findElement(By.xpath('html/body/div[2]/div[2]/div[1]/div[3]/table/tbody/tr[3]/td/div/div/div[2]/div/div[2]/input')).click()

    'Question 4'
    myDriver.findElement(By.xpath('html/body/div[2]/div[2]/div[1]/div[3]/table/tbody/tr[4]/td/div/div/div[2]/div/div[2]/div/div[2]/input')).click()

    'Question 5'
    myDriver.findElement(By.xpath('html/body/div[2]/div[2]/div[1]/div[3]/table/tbody/tr[5]/td/div/div/div[2]/div/div[2]/input')).click()

    'Question 6'
    myDriver.findElement(By.xpath('html/body/div[2]/div[2]/div[1]/div[3]/table/tbody/tr[6]/td/div/div/div[2]/div/div[2]/label[2]/input')).click()
} else {
    java.lang.System.out.println('No Questions on the general list page')
}

'Click on Next button of the second page'
WebUI.click(findTestObject('REALRatings/FCLP/page_REALrating_form/second_a_Next'))

WebUI.delay(5)

WebUI.comment('Third Page : Motivational Questions')

'To verify the Motivational questions on the page'
List mquestions = myDriver.findElements(By.xpath('html/body/div[2]/div[2]/div[2]/div[3]/table/tbody/tr/td/div/div/div/div/div[1]/strong/label'))

int mcount = mquestions.size()

java.lang.System.out.println('The total number of motivational questions=' + mcount)

if (mcount > 0) {
    for (int i = 1; i <= mcount; i++) {
        myDriver.findElement(By.xpath(('html/body/div[2]/div[2]/div[2]/div[3]/table/tbody/tr[' + i) + ']/td/div/div/div/div/div[2]/textarea')).sendKeys(
            'At minimum, motivation requires the biological substrate for physical sensations of pleasure and pain')
    }
} else {
    java.lang.System.out.println('No motivational questions')
}

'To find the number of Scenario based questions on the page '
List squestions = myDriver.findElements(By.xpath('html/body/div[2]/div[2]/div[2]/div[3]/table/tbody/tr/td/div/div/div/strong/label'))

int scount = squestions.size()

java.lang.System.out.println('The total number of scenario based  questions=' + scount)

if (scount > 0) {
    for (int i = 5; i <= 7; i++) {
        myDriver.findElement(By.xpath(('html/body/div[2]/div[2]/div[2]/div[3]/table/tbody/tr[' + i) + ']/td/div/div/div/textarea')).sendKeys(
            'At minimum, motivation requires the biological substrate for physical sensations of pleasure and pain')
    }
} else {
    java.lang.System.out.println('No Scenario Based questions')
}

'Click on Next button of third page'
WebUI.click(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating (1)/third_a_Next'))

WebUI.delay(5)

WebUI.comment('Fourth Page : Application Submission')

'Upload PDF file'

WebUI.uploadFile(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating (1)/Page_REALrating/input_Please upload your CV he'), 
   'C:\\Users\\Administrator\\Downloads\\fclp')

'Submit a response to the Contextualisation & Diversity Questionnaire'
WebUI.click(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating (1)/Page_REALrating/input_httpsfclp.realrating.co.'))

'Accept the privacy policy'
WebUI.click(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating (1)/Page_REALrating/input_No I have not submitted'))

'Click on submit button'
WebUI.click(findTestObject('REALRatings/FCLP/page_REALrating_form/Page_REALrating (1)/Page_REALrating/a_Submit'))

WebUI.delay(2)

'Verify the successfull form creation'
String currenturl = WebUI.getUrl()
if(currenturl.equalsIgnoreCase("https://uat-apply.realrating.co.uk/thank-you")){
	
	java.lang.System.out.println('Form submitted successfully')
	
}else 
{
	java.lang.System.out.println('Form not submitted successfully')
}

