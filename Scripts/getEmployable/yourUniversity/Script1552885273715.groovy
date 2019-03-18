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

WebUI.callTestCase(findTestCase('getEmployable/aboutYou'), [:], FailureHandling.STOP_ON_FAILURE)

'Random Selection of University '
UniversityTotalOption = WebUI.getNumberOfTotalOption(findTestObject('Page_getEmployable - Assessment Form/select_University'))

Random rad = new Random()

int UniversityCount = rad.nextInt(UniversityTotalOption)

WebUI.selectOptionByIndex(findTestObject('Page_getEmployable - Assessment Form/select_University'), UniversityCount)

'Random Selection of University Course'
UniversityCourseTotalOption = WebUI.getNumberOfTotalOption(findTestObject('Page_getEmployable - Assessment Form/select_UniversityCourse'))

int UniveristyCourseCount = rad.nextInt(UniversityCourseTotalOption)

WebUI.selectOptionByIndex(findTestObject('Page_getEmployable - Assessment Form/select_UniversityCourse'), UniveristyCourseCount)

if (UniveristyCourseCount == 94) {
    WebUI.setText(findTestObject('Page_getEmployable - Assessment Form/select_UniversityCourseOther'), 'VTU ')
}

'Random Selection of Degree'
DegreeTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Page_getEmployable - Assessment Form/select_Degree'))

int DegreeCount = rad.nextInt(DegreeTotalOptions)

WebUI.selectOptionByIndex(findTestObject('Page_getEmployable - Assessment Form/select_Degree'), DegreeCount)

'Random selection of Course Duration and Year Of Study'
CourseDurationTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Page_getEmployable - Assessment Form/select_CourseDuration'))

int CourseDurationCount = rad.nextInt(CourseDurationTotalOptions)

WebUI.selectOptionByIndex(findTestObject('Page_getEmployable - Assessment Form/select_CourseDuration'), CourseDurationCount)

WebUI.selectOptionByIndex(findTestObject('Page_getEmployable - Assessment Form/select_YearOfStudy'), CourseDurationCount)

'Select Full Time '
WebUI.click(findTestObject('Page_getEmployable - Assessment Form/select_FullTime'))

WebUI.delay(10)

'Click Next '
WebUI.click(findTestObject('Page_getEmployable - Assessment Form/button_NextUniversity'))

WebUI.delay(600)

