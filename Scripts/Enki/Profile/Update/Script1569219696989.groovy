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

WebUI.callTestCase(findTestCase('Management Screen (Settings)/Login/Enki Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'Click on avatar on right top of the page'
WebUI.click(findTestObject('Enki/Profile/Page_upReach/img_John_img-circle avatar'))

WebUI.delay(2)

'Click on Profile'
WebUI.click(findTestObject('Enki/Profile/Page_upReach/a_Profile'))

WebUI.delay(2)

'Click on Submit'
WebUI.click(findTestObject('Enki/Profile/Page_upReach/submit'))

'Get the Confirmation Message'
ProfileConfirmation = WebUI.getText(findTestObject('Enki/Profile/Page_upReach/div_ Profile updated successfully'))
java.lang.System.out.println('the text is : ' + ProfileConfirmation)
/*if(ProfileConfirmation.equalsIgnoreCase(' × Profile updated successfully')){
	java.lang.System.out.println('Profile data updated successfully')
} else {
java.lang.System.out.println('Profile data  not updated successfully')

}*/
