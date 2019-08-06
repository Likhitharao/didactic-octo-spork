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

WebDriver driver = DriverFactory.getWebDriver()
//To locate table.
WebUI.delay(5)
List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='categories-listing-table']/tbody/tr"));
List<WebElement> col = driver.findElements(By.xpath(".//*[@id='categories-listing-table']/thead/tr/th"));
java.lang.System.out.println(rows.size());
java.lang.System.out.println(col.size());

//Loop will execute till the last row of table.
loop:
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
  
  if (celtext.equalsIgnoreCase('Abc')) {
	  
  
  'Getting the Country Name if cell text i.e Company name matches with Expected value'
  java.lang.System.out.println('Text present : ' + Columns_row.get(2).getText())
  
  break loop;
  }
  }
}

