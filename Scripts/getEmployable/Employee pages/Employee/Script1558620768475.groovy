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

WebUI.comment('Calling Employee test cases')

WebUI.callTestCase(findTestCase('getEmployable/Employee pages/Emp page 1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('getEmployable/Employee pages/Emp page 2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('getEmployable/Employee pages/Emp page 3'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('getEmployable/Employee pages/Emp page 4'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('getEmployable/Employee pages/Emp page 5'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('getEmployable/Employee pages/Emp page 6,7'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('getEmployable/Employee pages/Emp page 8,9,10'), [:], FailureHandling.STOP_ON_FAILURE)

