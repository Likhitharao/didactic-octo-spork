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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://uat.upreach.org.uk/')

WebUI.click(findTestObject('ApplyNow/Page_upReach  Boosting social mobility by supporting students from less-advantaged backgrounds to secure top jobs./a_Apply Now'))

WebUI.switchToWindowTitle('Apply Now – upReach')

WebUI.setText(findTestObject('ApplyNow/Page_Apply Now  upReach/input__first_name'), 'dfdgfg')

WebUI.setText(findTestObject('ApplyNow/Page_Apply Now  upReach/input__last_name'), 'hfgjhgj')

WebUI.selectOptionByValue(findTestObject('ApplyNow/Page_Apply Now  upReach/select_Not at University yet        University of AberdeenAbertay UniversityAberystwyth UniversityAnglia Ruskin University CambridgeArden UniversityThe Arts University BournemouthAston UniversityBangor UniversityUniversi'), 
    '64', true)

WebUI.selectOptionByValue(findTestObject('ApplyNow/Page_Apply Now  upReach/select_Accounting and FinanceAccounting and ManagementAmerican StudiesAncient HistoryAnthropologyArtificial IntelligenceBiochemistryBiologyBiomedical ScienceBroadcast JournalismBusinessBusiness and FinanceBusiness and Ma'), 
    '13', true)

WebUI.selectOptionByValue(findTestObject('ApplyNow/Page_Apply Now  upReach/select_123456'), '1', true)

WebUI.selectOptionByValue(findTestObject('ApplyNow/Page_Apply Now  upReach/select_123456_1'), '2', true)

WebUI.setText(findTestObject('ApplyNow/Page_Apply Now  upReach/input__phone'), '4564657')

WebUI.setText(findTestObject('ApplyNow/Page_Apply Now  upReach/input__email'), '545657ygjhgjhkhk')

WebUI.setText(findTestObject('ApplyNow/Page_Apply Now  upReach/input__university_email'), 'dfgfghgjhk')

WebUI.click(findTestObject('ApplyNow/Page_Apply Now  upReach/label_All'))

WebUI.click(findTestObject('ApplyNow/Page_Apply Now  upReach/label_University - society or other'))

WebUI.click(findTestObject('ApplyNow/Page_Apply Now  upReach/label_By ticking this box I confirm that I meet all the eligibility criteria (Who we support).'))

WebUI.click(findTestObject('ApplyNow/Page_Apply Now  upReach/label_By ticking this box I agree to the upReachs Associate User Agreement and Data Protection Policy.'))

WebUI.click(findTestObject('ApplyNow/Page_Apply Now  upReach/button_Register'))

