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

WebUI.delay(3)

WebUI.click(findTestObject('Management Screen (Settings)/NS-SEC/Classifications/NS -SEC button'))

WebUI.delay(3)

WebUI.click(findTestObject('Management Screen (Settings)/NS-SEC/Sub Category/Sub Category button'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Management Screen (Settings)/NS-SEC/Sub Category/show entries'))

not_run: WebUI.click(findTestObject('Management Screen (Settings)/NS-SEC/Sub Category/option of show entries'))

not_run: WebUI.scrollToElement(findTestObject('Management Screen (Settings)/NS-SEC/Sub Category/Next pagination'), 0)

WebUI.delay(10)

not_run: WebUI.scrollToElement(findTestObject('Management Screen (Settings)/NS-SEC/Sub Category/Next pagination'), 0)

WebDriver driver = DriverFactory.getWebDriver()

List pagination =driver.findElements(By.xpath(".//*[@id='categories-listing-table_paginate']/ul/li/a"));
int size= pagination.size();

java.lang.System.out.println(pagination.size())

if(size>0)
{
System.out.println("pagination exists");
// click on pagination link
for(int i=2; i<size; i++){


driver.findElement(By.xpath(".//*[@id='categories-listing-table_paginate']/ul/li["+i+"]/a")).click() ;
Thread.sleep(5000);
}
}
else
{
System.out.println("pagination not exists");
}


