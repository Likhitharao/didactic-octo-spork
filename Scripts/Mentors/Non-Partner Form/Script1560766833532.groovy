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

WebUI.comment('upReach mentoring Programme Sing-up Form- Non-Partners')

'Opening Browser'
WebUI.openBrowser('')

'Navigate to Non-Partner URL'
WebUI.navigateToUrl('https://uat-enki.upreach.org.uk/form/nonpartner-mentor-application')

WebUI.maximizeWindow()

'Enter Firstname'
WebUI.setText(findTestObject('Mentors/partner Form/Firstname'), 'William')

'Enter Known name'
WebUI.setText(findTestObject('Mentors/partner Form/Know Name'), 'William')

'Enter Last Name'
WebUI.setText(findTestObject('Mentors/partner Form/lastName'), 'Levis')

Random rad = new Random()

int Email = rad.nextInt(2000)

'Enter Work Email'
WebUI.setText(findTestObject('Mentors/partner Form/WorkEmail'), ('test' + Email) + '@ac.uk')

'Enter Personal Email '
WebUI.setText(findTestObject('Mentors/partner Form/Personal Email'), ('personal' + Email) + '@test.com')

'Enter Linkedin -URl'
WebUI.setText(findTestObject('Mentors/partner Form/Linkedin-URL'), 'Linkedin-Williams')

'Enter Skype-URL'
WebUI.setText(findTestObject('Mentors/partner Form/Skype-Id'), 'Skype-Williams')

'Select prefered Email'
WebUI.click(findTestObject('Mentors/partner Form/Prefered Email'))

'Random Selection of gender'
GenderTotalOption = WebUI.getNumberOfTotalOption(findTestObject('Mentors/partner Form/Gender'))

int GenderCount = 1 + rad.nextInt(GenderTotalOption - 1)

WebUI.selectOptionByIndex(findTestObject('Mentors/partner Form/Gender'), GenderCount)

WebUI.delay(5)

'Upload Photo'
WebUI.uploadFile(findTestObject('Mentors/partner Form/Upload Photo'), 'C:\\Users\\sambhavi\\Desktop\\\\Smiley-Thumbnail.png')

WebUI.setText(findTestObject('Mentors/partner Form/PhoneNumber'), '07704562566')

WebUI.setText(findTestObject('Mentors/partner Form/Job title'), 'Project Manager')

'Random Selection of Employer'
EmployerTotalOption = WebUI.getNumberOfTotalOption(findTestObject('Mentors/partner Form/SelectEmployer'))

int EmployerCount = 1 + rad.nextInt(EmployerTotalOption - 1)

WebUI.selectOptionByIndex(findTestObject('Mentors/partner Form/SelectEmployer'), EmployerCount)

'Random Selection of Industry'
IndustryTotalOption = WebUI.getNumberOfTotalOption(findTestObject('Mentors/partner Form/Select Industry'))

int IndustryCount = 1 + rad.nextInt(IndustryTotalOption - 1)

WebUI.selectOptionByIndex(findTestObject('Mentors/partner Form/Select Industry'), IndustryCount)

if (IndustryCount == 11) {
    WebUI.setText(findTestObject('Mentors/partner Form/Other Industry'), 'Abc')
}

WebUI.delay(5)

'Random Selection of Department'
DepartmentTotalOption = WebUI.getNumberOfTotalOption(findTestObject('Mentors/partner Form/Select Department'))

int DepartmentCount = 1 + rad.nextInt(DepartmentTotalOption - 1)

WebUI.selectOptionByIndex(findTestObject('Mentors/partner Form/Select Department'), DepartmentCount)

'Random Selection of CurrentEmployer'
CurrentEmployerTotalOption = WebUI.getNumberOfTotalOption(findTestObject('Mentors/partner Form/Current'))

int CurrentEmployerCount = 1 + rad.nextInt(CurrentEmployerTotalOption - 1)

WebUI.selectOptionByIndex(findTestObject('Mentors/partner Form/Current'), CurrentEmployerCount)

WebUI.setText(findTestObject('Mentors/partner Form/Description'), 'ABC')

'Random Selection of Based'
BasedTotalOption = WebUI.getNumberOfTotalOption(findTestObject('Mentors/partner Form/Based'))

int BasedCount = 1 + rad.nextInt(BasedTotalOption - 1)

WebUI.selectOptionByIndex(findTestObject('Mentors/partner Form/Based'), BasedCount)

if (BasedCount == 9) {
    WebUI.setText(findTestObject('Mentors/partner Form/Other Based'), 'Abc')
}

WebUI.delay(5)

'Random Selection of University'
UniversityTotalOption = WebUI.getNumberOfTotalOption(findTestObject('Mentors/partner Form/University'))

int UniversityCount = 1 + rad.nextInt(UniversityTotalOption - 1)

WebUI.selectOptionByIndex(findTestObject('Mentors/partner Form/University'), UniversityCount)

if (UniversityCount == 157) {
    WebUI.setText(findTestObject('Mentors/partner Form/Other University'), 'VTU')
}

WebUI.delay(5)

'Random Selection of Degree'
DegreeTotalOption = WebUI.getNumberOfTotalOption(findTestObject('Mentors/partner Form/Degree'))

int DegreeCount = 1 + rad.nextInt(DegreeTotalOption - 1)

WebUI.selectOptionByIndex(findTestObject('Mentors/partner Form/Degree'), DegreeCount)

if (DegreeCount == 9) {
    WebUI.setText(findTestObject('Mentors/partner Form/Other Degree'), 'MCA')
}

WebUI.delay(5)

'Random Selection of Course'
CourseTotalOption = WebUI.getNumberOfTotalOption(findTestObject('Mentors/partner Form/Course'))

int CourseCount = 1 + rad.nextInt(CourseTotalOption - 1)

WebUI.selectOptionByIndex(findTestObject('Mentors/partner Form/Course'), CourseCount)

if (CourseCount == 97) {
    WebUI.setText(findTestObject('Mentors/partner Form/other course'), 'Other')
}

WebUI.delay(5)

'Select Mentoring Cycle'
WebUI.click(findTestObject('Mentors/partner Form/Mentoring Cycle'))

'Select prospective mentee'
WebUI.click(findTestObject('Mentors/partner Form/Prospective Mentee'))

'Enter Best quality'
WebUI.setText(findTestObject('Mentors/partner Form/Best Quality'), 'ABc')

'Select Mentor Training Session'
WebUI.click(findTestObject('Mentors/partner Form/Mentor Training session'))

'Accept Terms and conditions'
WebUI.click(findTestObject('Mentors/partner Form/Terms and Conditions'))

'Click Submit'
WebUI.click(findTestObject('Mentors/partner Form/Submit'))

