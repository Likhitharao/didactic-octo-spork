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

import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement


WebUI.callTestCase(findTestCase('Management Screen (Settings)/Login/Enki Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Management Screen (Settings)/Email Template Settings/Settings button'))

WebUI.click(findTestObject('Management Screen (Settings)/NS-SEC/Classifications/NS -SEC button'))

WebUI.delay(3)

WebUI.click(findTestObject('Management Screen (Settings)/NS-SEC/Sub Category/Sub Category button'))





'Expected value from Table'

String ExpectedValue = 'Employers in large organisations'

WebDriver driver = DriverFactory.getWebDriver()

'To locate table'
WebUI.delay(3)

//WebElement Table = driver.findElement(By.xpath('//table/tbody'))

'To locate rows of table it will Capture all the rows available in the table '

List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='categories-listing-table']/tbody/tr"));

java.lang.System.out.println(rows.size());

'Find a matching text in a table and performing action'

'Loop will execute for all the rows of the table'

table: for (int i = 0; i < rows.size(); i++) {

'To locate columns(cells) of that specific row'

List<WebElement> Cols = rows.get(i).findElements(By.xpath(".//*[@id='categories-listing-table']/thead/tr/th"));
 
for (int j = 0; j < Cols.size(); j++) {

'Verifying the expected text in the each cell'

if (Cols.get(j).getText().equals(ExpectedValue)) {

'To locate anchor in the expected value matched row to perform action'

Cols.get(4).findElement(By.xpath(".//*[@id='categories-listing-table']/tbody/tr["+rows+"]/td[5]/button[1]")).click()

table: break

}

}

}
