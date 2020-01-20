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

'Launch FCLP Applications'
WebUI.navigateToUrl('https://uat-apply.realrating.co.uk/')

WebUI.maximizeWindow()

//WebUI.verifyElementPresent(findTestObject('REALRatings/FCLP/page_REALrating_form/h3_upReach Future Charity Lead'), 5, FailureHandling.STOP_ON_FAILURE)
/*
for(int i = 4 ; i<=8 ; i++)
{
	 myDriver.findElement(By.xpath('html/body/div[2]/div[2]/div/div/div['+ i +']/div[2]/div/input')).sendKeys("sample")
}
*/
WebUI.setText(findTestObject('REALRatings/FCLP/page_REALrating_form/input_Email address_email'), 'e78m5678t845956yrta9i7897l4513@gmail.com')

WebUI.setText(findTestObject('REALRatings/FCLP/page_REALrating_form/input_First Name_first_name'), 'firstname')

WebUI.setText(findTestObject('REALRatings/FCLP/page_REALrating_form/input_Preferred Name_preferred'), 'preferredname')

WebUI.setText(findTestObject('REALRatings/FCLP/page_REALrating_form/input_Last Name_last_name'), 'lastname')

WebUI.setText(findTestObject('REALRatings/FCLP/page_REALrating_form/input_Mobile Number_mobile'), '08125458458')

WebUI.click(findTestObject('REALRatings/FCLP/page_REALrating_form/first_a_Next'))

/*
WebUI.comment('General Questions')

WebUI.comment('To verify the questions are present on the page ')

WebUI.delay(5)

List questions = myDriver.findElements(By.xpath('html/body/div[2]/div[2]/div[1]/div[3]/table/tbody/tr/td/div/div/div[1]/strong/label'))

int noofquestion = questions.size()

java.lang.System.out.println('The total number of questions on the second page ' + noofquestion)

if(noofquestion > 0)
{
	/*for(int i = 1 ; i<= noofquestion ; i++)
	{
		if(noofquestion == 1 || noofquestion == 6){
		List answers = myDriver.findElements(By.xpath('html/body/div[2]/div[2]/div[1]/div[3]/table/tbody/tr[' + i +']/td/div/div/div[2]/div/label/div[2]/div'))
		
		int noofanswer = answers.size()
		
		java.lang.System.out.println('The total number of answers for the each questions on the second page '+ i +'='+ noofanswer)
	}
	else if(noofquestion == 3 || noofquestion == 5){
		
		List answers = myDriver.findElements(By.xpath('html/body/div[2]/div[2]/div[1]/div[3]/table/tbody/tr/td/div/div/div/div/div/label'))
		
		int noofanswer = answers.size()
		
		java.lang.System.out.println('The total number of answers for the each questions on the second page '+ i +'='+ noofanswer)
	}
	else {
		
		List answers = myDriver.findElements(By.xpath('html/body/div[2]/div[2]/div[1]/div[3]/table/tbody/tr['+ i +']/td/div/div/div[2]/div/div[2]/div/div'))
		
		int noofanswer = answers.size()
		
		java.lang.System.out.println('The total number of answers for the each questions on the second page '+ i +'='+ noofanswer)
	}
}
} 
else {
	
	java.lang.System.out.println('No Questions on the general list page')
}
*/
WebUI.delay(35)

WebUI.click(findTestObject('REALRatings/FCLP/page_REALrating_form/second_a_Next'))

WebUI.comment('To verify the Motivational questions on the page ')

WebUI.comment('To find the number of motivational questions on the page ')

List mquestions = myDriver.findElements(By.xpath('html/body/div[2]/div[2]/div[2]/div[3]/table/tbody/tr/td/div/div/div/div/div[1]/strong/label'))

int mcount = mquestions.size()

java.lang.System.out.println('The total number of motivational questions=' + mcount)

if (mcount > 0) {
	
    for (int i = 1; i <= mcount; i++) {
		
        myDriver.findElement(By.xpath('html/body/div[2]/div[2]/div[2]/div[3]/table/tbody/tr[' + i + ']/td/div/div/div/div/div[2]/textarea')).sendKeys(
            'The aplhabets')
    }
    
} else {
    java.lang.System.out.println('No motivational questions')
}

WebUI.comment('To find the number of Scenario based questions on the page ')

List squestions = myDriver.findElements(By.xpath('html/body/div[2]/div[2]/div[2]/div[3]/table/tbody/tr/td/div/div/div/strong/label'))

int scount = squestions.size()

java.lang.System.out.println('The total number of scenario based  questions=' + scount)

if (scount > 0) {
    for (int i = 5; i <= 7; i++) {
		
        myDriver.findElement(By.xpath('html/body/div[2]/div[2]/div[2]/div[3]/table/tbody/tr[' + i + ']/td/div/div/div/textarea')).sendKeys('The scenario based answers')
    }
} else {
    java.lang.System.out.println('No Scenario Based questions')
}

