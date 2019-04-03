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

WebUI.navigateToUrl('https://fclp-uat.realrating.co.uk/')

WebUI.setText(findTestObject('REALRatings/FCLP/Page_REALrating/First Name'), 'asha')

WebUI.setText(findTestObject('REALRatings/FCLP/Page_REALrating/Last Name'), 'rajednran')

Random rad = new Random()

int emailid = rad.nextInt(2000)

WebUI.setText(findTestObject('REALRatings/FCLP/Page_REALrating/Univrsity Emaid'), ('fclp' + emailid) + '@test.com')

'University'
UniversityTotalOption = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/FCLP/Page_REALrating/University'))

UniversityCount = (1 + rad.nextInt(UniversityTotalOption - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/FCLP/Page_REALrating/University'), UniversityCount)

'Other University'
if (UniversityCount == 98) {
    WebUI.setText(findTestObject('REALRatings/REALrating/Other University'), 'VTU Other university')
}

'University Course'
UniversityCourseTotalOption = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/FCLP/Page_REALrating/University Course'))

UniveristyCourseCount = (1 + rad.nextInt(UniversityCourseTotalOption - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/FCLP/Page_REALrating/University Course'), UniveristyCourseCount)

'University Other Course '
if (UniveristyCourseCount == 95) {
    WebUI.setText(findTestObject('REALRatings/FCLP/Page_REALrating/Other University Course'), 'VTU ')
}

'Graduation'
GraduationYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/FCLP/Page_REALrating/Graduation Year'))

GraduationYearcount = (1 + rad.nextInt(GraduationYearTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/FCLP/Page_REALrating/Graduation Year'), GraduationYearcount)

'Grade 2:1'
GradeYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/FCLP/Page_REALrating/Grade 21'))

GradeYearcount = (1 + rad.nextInt(GradeYearTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/FCLP/Page_REALrating/Grade 21'), GradeYearcount)

'Grade B English'
GradeEnglishYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/FCLP/Page_REALrating/Grade B English'))

GradeEnglishYearcount = (1 + rad.nextInt(GradeEnglishYearTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/FCLP/Page_REALrating/Grade B English'), GradeEnglishYearcount)

WebUI.delay(2)

'Grade B Maths'
//GradeMathsYearTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('REALRatings/FCLP/Page_REALrating/Grade B Maths'))

//GradeMathsYearcount = (1 + rad.nextInt(GradeMathsYearTotalOptions - 1))

WebUI.selectOptionByIndex(findTestObject('REALRatings/FCLP/Page_REALrating/Grade B Maths'), GradeEnglishYearcount)

