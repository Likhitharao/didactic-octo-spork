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
'Ethnicity'
WebUI.selectOptionByValue(findTestObject('getEmployable/select_IrishEnglishWelshScottishNorthern IrishGypsy or Irish TravellerAny other White backgroundWhite and Black CaribbeanWhite and AsianAny other Mixed Multiple ethnic backgroundWhite and Black AfricanIndianPakistaniBang'), 
    'number:13', true)

WebUI.selectOptionByValue(findTestObject('getEmployable/select_HeterosexualstraightGay womanlesbianGay manBisexualPrefer not to say'), 
    'HETERO_SEXUAL', true)

WebUI.selectOptionByValue(findTestObject('getEmployable/select_No religionBuddhistChristianHinduJewishMuslimSikhAny other religionPrefer not to say'), 
    'BUDDHIST', true)

WebUI.selectOptionByValue(findTestObject('getEmployable/select_DivorcedMarriedSingleWidowedPrefer not to say'), 
    'MARRIED', true)

WebUI.selectOptionByValue(findTestObject('getEmployable/select_Yes                                                     No                                                     Prefer not to say'), 
    'NO', true)

WebUI.click(findTestObject('getEmployable/span_I am interested show me the eligibility criteria.'))

WebUI.click(findTestObject('getEmployable/span_I meet the eligibility criteria.'))

WebUI.click(findTestObject('getEmployable/span_Please tick this box to consent to upReach contacting you in the future to help you secure a graduate job.'))

WebUI.click(findTestObject('getEmployable/span_By ticking this box I confirm that I agree to the'))

WebUI.click(findTestObject('getEmployable/input_getEmployable User Agreement and Data Protection Policy._form-submit'))

WebUI.click(findTestObject('Page_getEmployable/div_Congratulations on completing the Employability Assessment                                         Your Employability Score and report have been sent to your University email address.                                 '))

WebUI.click(findTestObject('Page_getEmployable/div_Congratulations on completing the Employability Assessment                                         Your Employability Score and report have been sent to your University email address.                                 '))

