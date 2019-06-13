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

WebUI.comment('Enter Employee page 5 details')

WebUI.delay(5)

WebUI.click(findTestObject('Employee details/Employee pages/Emp page 5/Page_getEmployable - Assessment Form/input_Prefect_option_question_1'))

WebUI.click(findTestObject('Employee details/Employee pages/Emp page 5/Page_getEmployable - Assessment Form/input_Position on a society committee such as Treasurer or Social Secretary of RAG._option_question_8'))

WebUI.click(findTestObject('Employee details/Employee pages/Emp page 5/Page_getEmployable - Assessment Form/input_None_option_question_9'))

WebUI.click(findTestObject('Employee details/Employee pages/Emp page 5/Page_getEmployable - Assessment Form/span_Founder of a business or project_fa fa-angle-right fa-2x'))

