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

WebUI.comment('Enter Employee page 6,7 details')

WebUI.delay(5)

WebUI.click(findTestObject('Journey,background details/Emp page 6,7/Page_getEmployable - Assessment Form/input_Problem Solving  Creativity_option_question_6'))

WebUI.click(findTestObject('Employee details/Employee pages/Emp page 6,7/Page_getEmployable - Assessment Form/input_I am actively involved in a student enterprise club or a consultancy society or programme._option_question_7'))

WebUI.click(findTestObject('Journey,background details/Emp page 6,7/Page_getEmployable - Assessment Form/span_None of these_fa fa-angle-right fa-2x'))

WebUI.delay(5)

WebUI.click(findTestObject('Journey,background details/Emp page 6,7/Page_getEmployable - Assessment Form/input_Professionalism_option_question_48'))

WebUI.click(findTestObject('Journey,background details/Emp page 6,7/Page_getEmployable - Assessment Form/input_None of the above_option_question_49'))

WebUI.delay(5)

WebUI.click(findTestObject('Journey,background details/Emp page 6,7/Page_getEmployable - Assessment Form/next'))

