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

WebUI.comment('Enter Employee page 3 details')

WebUI.delay(5)

WebUI.click(findTestObject('getEmployable/Employee details/21-05-2019/Emp page 3/Page_getEmployable - Assessment Form/input_Application  Interview Skills_option_question_50'))

WebUI.click(findTestObject('Journey,background details/Emp page 3/Page_getEmployable - Assessment Form/input_No_option_question_51'))

WebUI.click(findTestObject('Journey,background details/Emp page 3/Page_getEmployable - Assessment Form/input_Yes - other technique_option_question_52'))

WebUI.click(findTestObject('Journey,background details/Emp page 3/Page_getEmployable - Assessment Form/span_None of the above_fa fa-angle-right fa-2x'))

