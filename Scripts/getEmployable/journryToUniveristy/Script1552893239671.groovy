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

'Select GCSE Math Grade\r\n'
WebUI.getNumberOfTotalOption(findTestObject('Page_getEmployable - Assessment Form/journeyToUniversity/select_GCSEMathsGrade'))

WebUI.click(findTestObject('Page_getEmployable - Assessment Form/div_Subject title'))

WebUI.setText(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Year awarded_form-text ng-untouched ng-valid ng-dirty ng-valid-parse'), 
    'maths')

WebUI.selectOptionByValue(findTestObject('Page_getEmployable - Assessment Form/select_DDDDDDDDDDDDDDMDMMMMMMMPMPPPPP'), 
    'D*DD*', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_getEmployable - Assessment Form/select_2019                                2018                                2017                                2016                                2015                                2014                             '), 
    '2008', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_getEmployable - Assessment Form/select_A-Levels - enter your best 3 grades (including Welsh Baccalaureate  Advanced Diploma)BTEC Level 3 Nationals (QCF)International BaccalaureateOther (or mix of the above qualifications)Access to HE Course'), 
    'object:885', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_getEmployable - Assessment Form/select_1234567'), '1', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_getEmployable - Assessment Form/select_2019                                2018                                2017                                2016                                2015                                2014                             '), 
    '2009', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_getEmployable - Assessment Form/select_1234567'), '2', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_getEmployable - Assessment Form/select_2019                                2018                                2017                                2016                                2015                                2014                             '), 
    '2011', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_getEmployable - Assessment Form/select_1234567'), '3', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_getEmployable - Assessment Form/select_2019                                2018                                2017                                2016                                2015                                2014                             '), 
    '2007', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_getEmployable - Assessment Form/select_A-Levels - enter your best 3 grades (including Welsh Baccalaureate  Advanced Diploma)BTEC Level 3 Nationals (QCF)International BaccalaureateOther (or mix of the above qualifications)Access to HE Course'), 
    'object:886', true)

WebUI.setText(findTestObject('Object Repository/Page_getEmployable - Assessment Form/textarea_Year awarded_form-text ng-untouched ng-dirty ng-valid-parse ng-valid ng-valid-required'), 
    'other ouualifications ')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_getEmployable - Assessment Form/select_A-Levels - enter your best 3 grades (including Welsh Baccalaureate  Advanced Diploma)BTEC Level 3 Nationals (QCF)International BaccalaureateOther (or mix of the above qualifications)Access to HE Course'), 
    'object:887', true)

WebUI.setText(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Year awarded_form-text ng-untouched ng-valid ng-valid-maxlength ng-dirty ng-valid-parse'), 
    'mathshe course')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_getEmployable - Assessment Form/select_Grade AGrade AGrade BGrade CGrade DGrade EGrade FGrade UDid not take'), 
    'string:B', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_getEmployable - Assessment Form/select_2019                                2018                                2017                                2016                                2015                                2014                             '), 
    '2009', true)

WebUI.setText(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Year awarded_alevel-postal-code'), 
    'NW64DN')

WebUI.setText(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Year awarded_gcse-postal-code'), 
    'NW64DN')

WebUI.click(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Year awarded_next'))

WebUI.comment('Second Page Journey To University ')

WebUI.click(findTestObject('Object Repository/Page_getEmployable - Assessment Form/label_Below 25000'))

WebUI.setText(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Would rather not say_parent_carer_one'), 
    'parent')

WebUI.click(findTestObject('Object Repository/Page_getEmployable - Assessment Form/div_Houseparent Residential Warden'))

WebUI.setText(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Would rather not say_parent_carer_one'), 
    'Houseparent, Residential Warden')

WebUI.setText(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_What is the occupation of your first parent or carer _parent_carer_two'), 
    'parent')

WebUI.click(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Please tick any statements that apply to you_dis_16'))

WebUI.click(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Please tick any statements that apply to you_dis_17'))

WebUI.click(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Please tick any statements that apply to you_dis_18'))

WebUI.click(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Please tick any statements that apply to you_dis_19'))

WebUI.click(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_Please tick any statements that apply to you_dis_22'))

WebUI.click(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_How did you hear about getEmployable_867'))

WebUI.click(findTestObject('Object Repository/Page_getEmployable - Assessment Form/input_How did you hear about getEmployable_next'))

WebUI.comment('endofpage')

