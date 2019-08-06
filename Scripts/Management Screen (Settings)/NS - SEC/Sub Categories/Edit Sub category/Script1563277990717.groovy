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

WebUI.comment('Edit Sub- Category')

WebUI.callTestCase(findTestCase('Management Screen (Settings)/Login/Enki Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Click on Settings button'
WebUI.click(findTestObject('Management Screen (Settings)/Email Template Settings/Settings button'))

'Click on NS-Sec button'
WebUI.click(findTestObject('Management Screen (Settings)/NS-SEC/Classifications/NS -SEC button'))

WebUI.delay(3)

'Click on Sub Category Button'
WebUI.click(findTestObject('Management Screen (Settings)/NS-SEC/Sub Category/Sub Category button'))

//EDIT
//To Locate Table
WebDriver driver = DriverFactory.getWebDriver()

WebUI.delay(5)

'To find Size of Row'
List<WebElement> rows = driver.findElements(By.xpath('.//*[@id=\'categories-listing-table\']/tbody/tr'))

'To find Size of Column'
List<WebElement> col = driver.findElements(By.xpath('.//*[@id=\'categories-listing-table\']/thead/tr/th'))

'To Print Row Size'
java.lang.System.out.println(rows.size())

'To Print Column Size'
java.lang.System.out.println(col.size())

'Generating Random Edit Within Row Size'
Random rad = new Random()

int rowscount = rad.nextInt(rows.size)

WebUI.delay(5)

'Click on Random Edit'
driver.findElement(By.xpath('.//*[@id="categories-listing-table"]/tbody/tr[' + rowscount + ']/td[5]/button[1]')).click()

WebUI.delay(3)
'Edit Short Description'
WebUI.setText(findTestObject('Management Screen (Settings)/NS-SEC/Classifications/Short Description'), findTestData('Management Screen/NS-SEC/Sub-Category').getValue(
        1, 1))

'Click on Submit'
WebUI.click(findTestObject('Management Screen (Settings)/NS-SEC/Classifications/Submit button'))

WebUI.delay(3)

' Verify Sub Category page or not'
assert WebUI.getUrl() == 'https://uat-enki.upreach.org.uk/ns-sec-sub-category'


