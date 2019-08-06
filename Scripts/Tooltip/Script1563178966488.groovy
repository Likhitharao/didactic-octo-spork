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
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('Management Screen (Settings)/Login/Enki Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Management Screen (Settings)/Email Template Settings/Settings button'))

WebDriver driver = DriverFactory.getWebDriver()

/*// Create action class object
Actions builder = new Actions(driver)

// find the tooltip xpath
WebElement username_tooltip = driver.findElement(By.xpath("html/body/div[2]/div/div[3]/div/div[1]/a[1]/div/div[1]/div/div[2]/span"))

// Mouse hover to that text message
builder.moveToElement(username_tooltip).perform()

// Extract text from tooltip
String tooltip_msg = username_tooltip.getText()

// Print the tooltip message just for our refrences
java.lang.System.out.println('Tooltip/ Help message is ' + tooltip_msg)*/

String toolTipText = driver.findElement(By.xpath("html/body/div[1]/div[3]/ul/li[3]/a")).getAttribute("title").toString();

java.lang.System.out.println("Tool Tip Text is :" + toolTipText)
