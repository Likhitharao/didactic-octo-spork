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

WebUI.comment('Not Interested Details')

WebUI.delay(5)

Random rad = new Random()

//WebUI.click(findTestObject('getEmployable (Siftings)/Ehnicity5'))
ethnicity = WebUI.getNumberOfTotalOption(findTestObject('getEmployable (Siftings)/ehnicity'))

ethnicitycount = (1 + rad.nextInt(ethnicity - 1))

'Select Ethnicity'
WebUI.selectOptionByIndex(findTestObject('getEmployable (Siftings)/ehnicity'), ethnicitycount)

sexualorientation = WebUI.getNumberOfTotalOption(findTestObject('getEmployable/Employee details/21-05-2019/background/sexual orientation'))

sexualorientationcount = (1 + rad.nextInt(sexualorientation - 1))

'Select sexual orientation'
WebUI.selectOptionByIndex(findTestObject('getEmployable/Employee details/21-05-2019/background/sexual orientation'), sexualorientationcount)

religion = WebUI.getNumberOfTotalOption(findTestObject('getEmployable/Employee details/21-05-2019/background/religion'))

religioncount = (1 + rad.nextInt(religion - 1))

'Select Religion'
WebUI.selectOptionByIndex(findTestObject('getEmployable/Employee details/21-05-2019/background/religion'), religioncount)

maritalstatus = WebUI.getNumberOfTotalOption(findTestObject('getEmployable/Employee details/21-05-2019/background/Page_getEmployable - Assessment Form/marital status'))

maritalstatuscount = (1 + rad.nextInt(maritalstatus - 1))

'Select Marital status'
WebUI.selectOptionByIndex(findTestObject('getEmployable/Employee details/21-05-2019/background/Page_getEmployable - Assessment Form/marital status'), 
    maritalstatuscount)

Disability = WebUI.getNumberOfTotalOption(findTestObject('getEmployable/Employee details/21-05-2019/background/Page_getEmployable - Assessment Form/Disability'))

Disabilitycount = (1 + rad.nextInt(Disability - 1))

'Select Disability count'
WebUI.selectOptionByIndex(findTestObject('getEmployable/Employee details/21-05-2019/background/Page_getEmployable - Assessment Form/Disability'), 
    Disabilitycount)

'Click not interested'
WebUI.click(findTestObject('getEmployable (Siftings)/Not intertestd'))

WebUI.delay(5)

'Policy'
WebUI.click(findTestObject('getEmployable/Employee details/21-05-2019/background/Tick2'))

WebUI.delay(5)

'click on submit button'
WebUI.click(findTestObject('getEmployable/Employee details/21-05-2019/background/Submit'))

WebUI.delay(5)

WebUI.verifyTextPresent('Congratulations on completing the Employability Assessment!', false)

WebUI.takeScreenshot()

