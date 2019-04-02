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

WebUI.comment('School Information')

'A-Level year'
ALevelYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/ALevel Year'))

Random rad = new Random()

ALevelYearcount = (1 + rad.nextInt(ALevelYearTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/ALevel Year'), ALevelYearcount)

'GCSE Year'
GCSEYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/GCSE Year'))

GCSEYearCount = (1 + rad.nextInt(GCSEYearTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/GCSE Year'), GCSEYearCount)

'University'
UniversityTotalOption = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/University'))

UniversityCount = (1 + rad.nextInt(UniversityTotalOption - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/University'), UniversityCount)

'Other University'
if (UniversityCount == 95) {
	WebUI.setText(findTestObject('REALRatings/REALrating/Other University'), 'VTU Other university')
}

'University Course'
UniversityCourseTotalOption = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/University Course'))

UniveristyCourseCount = (1 + rad.nextInt(UniversityCourseTotalOption - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/University Course'), UniveristyCourseCount)

'University Other Course '
if (UniveristyCourseCount == 95) {
	WebUI.setText(findTestObject('REALRatings/REALrating/University Course Other'), 'VTU ')
}

'Length of university course'
LengthOfUniversitycourseTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/REALrating/Length Of university Course'))

LengthOfUniversitycount = (1 + rad.nextInt(LengthOfUniversitycourseTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Length Of university Course'), LengthOfUniversitycount)

'Current Year of Study (as of Sept 2018)'
WebUI.selectOptionByIndex(findTestObject('REALRatings/REALrating/Current Year Of Study'), LengthOfUniversitycount)

WebUI.delay(5)

WebUI.click(findTestObject('REALRatings/REALrating/button_Next (1)'))