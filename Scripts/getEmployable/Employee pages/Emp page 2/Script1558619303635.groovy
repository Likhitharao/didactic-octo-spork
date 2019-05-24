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

WebUI.comment('Enter Employee page 2 details')

WebUI.delay(5)

WebUI.click(findTestObject('Employee details/Employee pages/Emp page 2/Page_getEmployable - Assessment Form/input_I dont know much about any careers  suited to me._option_question_19'))

WebUI.click(findTestObject('Employee details/Employee pages/Emp page 2/Page_getEmployable - Assessment Form/input_concat(No I don  t know which career is best for me.)_option_question_24'))

WebUI.click(findTestObject('Employee details/Employee pages/Emp page 2/Page_getEmployable - Assessment Form/input_The general application process for graduate jobs (and internships if applicable)._option_question_30'))

WebUI.click(findTestObject('Employee details/Employee pages/Emp page 2/Page_getEmployable - Assessment Form/input_The career trajectory including how promotion is achieved and the pay at each level._option_question_31'))

WebUI.click(findTestObject('Employee details/Employee pages/Emp page 2/Page_getEmployable - Assessment Form/span_Not applicable or none of these_fa fa-angle-right fa-2x'))

