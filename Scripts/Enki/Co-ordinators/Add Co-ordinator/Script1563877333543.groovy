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

WebUI.comment('Add Coordinator Details')

WebUI.callTestCase(findTestCase('Management Screen (Settings)/Login/Enki Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Enki/Coordinators/Add Coordinators/coordinator button'))

WebUI.delay(3)

WebUI.click(findTestObject('Enki/Coordinators/Add Coordinators/Add Coordinator button'))

' Verify Coordinators page or not'
assert WebUI.getUrl() == 'https://uat-enki.upreach.org.uk/programme-coordinator'

WebUI.delay(3)

WebUI.click(findTestObject('Enki/Coordinators/Add Coordinators/add coordinator symbol'))

WebUI.delay(3)

WebUI.setText(findTestObject('Enki/Coordinators/Add Coordinators/First Name'), 'A')

WebUI.setText(findTestObject('Enki/Coordinators/Add Coordinators/Last Name'), 'B')

WebUI.setText(findTestObject('Enki/Coordinators/Add Coordinators/Known Name'), 'C')

Random rad = new Random()

int Email = rad.nextInt(2000)

'Enter University Email'
WebUI.setText(findTestObject('Enki/Coordinators/Add Coordinators/Email'), ('test' + Email) + '@ac.uk')

WebUI.setText(findTestObject('Enki/Coordinators/Add Coordinators/Phone'), '0888888888')

'Job title'
JobtitleTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Enki/Coordinators/Add Coordinators/Job Title dropdown'))

Jobtitlecount = (1 + rad.nextInt(JobtitleTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('Enki/Coordinators/Add Coordinators/Job Title dropdown'), Jobtitlecount)

'Role Type'
RoleTypeTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Enki/Coordinators/Add Coordinators/Role Type'))

RoleTypecount = (1 + rad.nextInt(RoleTypeTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('Enki/Coordinators/Add Coordinators/Role Type'), RoleTypecount)

WebUI.setText(findTestObject('Enki/Coordinators/Add Coordinators/Skype ID'), 'https://www.skype.com/upreach.ab')

WebUI.setText(findTestObject('Enki/Coordinators/Add Coordinators/Facebook ID'), 'https://www.facebook.com/upreach.ab')

WebUI.setText(findTestObject('Enki/Coordinators/Add Coordinators/Linkedin ID'), 'https://www.linkedin.com/upreach.ab')

WebUI.setText(findTestObject('Enki/Coordinators/Add Coordinators/Description'), 'abc')

WebUI.setText(findTestObject('Enki/Coordinators/Add Coordinators/Target Aim'), '1')

WebUI.setText(findTestObject('Enki/Coordinators/Add Coordinators/Target Rise'), '2')

WebUI.setText(findTestObject('Enki/Coordinators/Add Coordinators/Target rise programme'), '3')

WebUI.click(findTestObject('Enki/Coordinators/Add Coordinators/Active check box'))

WebUI.uploadFile(findTestObject('Enki/Coordinators/Add Coordinators/Profile Image'), 'C:\\Users\\sambhavi\\Desktop\\\\Smiley-Thumbnail.png')

WebUI.click(findTestObject('Enki/Coordinators/Add Coordinators/Submit button'))

WebUI.delay(3)

WebDriver driver = DriverFactory.getWebDriver()

List pagination = driver.findElements(By.xpath('.//*[@id="coordinators-listing-table_paginate"]/ul/li/a'))

int size = pagination.size()

java.lang.System.out.println(pagination.size())

if (size > 0) {
    System.out.println('pagination exists')

    WebUI.delay(3)

    for (int i = 2; i < size; i++) {
        driver.findElement(By.xpath('.//*[@id=\'coordinators-listing-table_paginate\']/ul/li[' + i + ']/a')).click()

        Thread.sleep(5000)

        if (WebUI.verifyTextPresent() == '0888888888') {
            break
        }
    }
} else {
    System.out.println('pagination not exists')
}


