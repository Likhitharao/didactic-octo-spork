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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('Management Screen (Settings)/Login/Enki Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Management Screen (Settings)/Email Template Settings/Settings button'))

WebUI.click(findTestObject('Management Screen (Settings)/Email Template Settings/Email Template button'))

' Verify Email Template page or not'
assert WebUI.getUrl() == 'https://uat-enki.upreach.org.uk/email-template'


WebDriver driver = DriverFactory.getWebDriver()



//find the number of columns
List<WebElement> col = driver.findElements(By.xpath('html/body/div[1]/div[2]/div/div/div/div[2]/div[3]/div[2]/div/table/thead/tr/th'))

//find the number of rows
List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='email-template-listing-table']/tbody/tr"))

java.lang.System.out.println(rows.size())
  java.lang.System.out.println(col.size());

 
  //Loop will execute till the last row of table.
  for (int row = 0; row <rows.size(); row++) {
	  
	  //To locate columns(cells) of that specific row.
	  List < WebElement > Columns_row = rows.get(row).findElements(By.tagName("td"));
	  
	  //To calculate no of columns (cells). In that specific row.
	  int columns_count = Columns_row.size();
	  
	  System.out.println("Number of cells In Row " + row + " are " + columns_count);
	  
	  //Loop will execute till the last cell of that specific row.
	  for (int column = 0; column < columns_count; column++) {
		  
		  // To retrieve text from that specific cell.
		  String celtext = Columns_row.get(column).getText();
		  
		  System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
	  
	  System.out.println("-------------------------------------------------- ");
  
	'Checking if Cell text is matching with the expected value'
	
	if (celtext.equalsIgnoreCase('123@hotmail.com')) {
		
	
	'Getting the Country Name if cell text i.e Company name matches with Expected value'
	java.lang.System.out.println('Text present in row number 3 is: ' + Columns_row.get(1).getText())
	}
	}
  }