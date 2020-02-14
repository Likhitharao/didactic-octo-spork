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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import java.util.Arrays;

'Opening Browser'
WebUI.openBrowser('upReach mentoring Programme Sing-up Form-Partners')

'Navigate to Partner URL'
WebUI.navigateToUrl('https://uat-enki.upreach.org.uk/form/partner-mentor-application')

WebUI.maximizeWindow()

Random rad = new Random()

'Enter First Name'
WebUI.setText(findTestObject('Mentors/partner Form/Firstname'), findTestData('getEmployable/Applicants').getValue(1, 1))

'Enter Known Name'
WebUI.setText(findTestObject('Mentors/partner Form/Know Name'), findTestData('getEmployable/Applicants').getValue(10, 1))

'Enter Last Name'
WebUI.setText(findTestObject('Mentors/partner Form/Last Name'), findTestData('getEmployable/Applicants').getValue(2, 1))

'Enter Work Email'
int Email = rad.nextInt(2000)

WebUI.setText(findTestObject('Mentors/partner Form/Work Email'), ('asha' + Email) + '@ac.uk')

'Enter Personal Email '
WebUI.setText(findTestObject('Mentors/partner Form/Personal Email'), ('asha' + Email) + '@test.com')

'Enter LinkedIn URL'
WebUI.setText(findTestObject('Mentors/partner Form/Linkedin-URL'), 'https://www.linkedin.com/feed/')

'Enter Skype ID'
WebUI.setText(findTestObject('Mentors/partner Form/Skype ID'), 'https://www.skype.com/en/')

'Select preferred Email'
WebUI.click(findTestObject('Mentors/partner Form/Prefered Email'))

'Random Selection of gender'
GenderTotalOption = WebUI.getNumberOfTotalOption(findTestObject('Mentors/partner Form/Gender'))

int GenderCount = 1 + rad.nextInt(GenderTotalOption - 1)

WebUI.selectOptionByIndex(findTestObject('Mentors/partner Form/Gender'), GenderCount)

WebUI.delay(2)

'Upload Photo'

//WebUI.uploadFile(findTestObject('Mentors/partner Form/Upload Photo'), 'C:\\Users\\Administrator\\Downloads\\91AvcLraAtL._SL1500_.png')
'Enter Phone Number'
WebUI.setText(findTestObject('Mentors/partner Form/PhoneNumber'), findTestData('getEmployable/Applicants').getValue(5, 1))

'Enter Job Title'
WebUI.setText(findTestObject('Mentors/partner Form/Job title'), 'Project Manager')

'Select Employer'
EmployerTotalOption = WebUI.getNumberOfTotalOption(findTestObject('Mentors/partner Form/Select Employer'))

int EmployerCount = 1 + rad.nextInt(EmployerTotalOption - 1)

WebUI.selectOptionByIndex(findTestObject('Mentors/partner Form/Select Employer'), EmployerCount)

if (EmployerCount == 71) {
	'Who is your other employer?'
	WebUI.setText(findTestObject('Mentors/partner Form/PhoneNumber'), 'JMAN Employer')
}

'Select Industry'
IndustryTotalOption = WebUI.getNumberOfTotalOption(findTestObject('Mentors/partner Form/Select Industry'))

int IndustryCount = 1 + rad.nextInt(IndustryTotalOption - 1)

WebUI.selectOptionByIndex(findTestObject('Mentors/partner Form/Select Industry'), IndustryCount)

if (IndustryCount == 11) {
	'What is your other Indusrty?'
	WebUI.setText(findTestObject('Mentors/partner Form/Other Industry'), 'Information Technology')
}

WebUI.delay(2)

'Select Department'
DepartmentTotalOption = WebUI.getNumberOfTotalOption(findTestObject('Mentors/partner Form/select_3) Select Departments'))

int DepartmentCount = 1 + rad.nextInt(DepartmentTotalOption - 1)

WebUI.selectOptionByIndex(findTestObject('Mentors/partner Form/select_3) Select Departments'), DepartmentCount)

'Select How long you have been with your current employer?'
CurrentEmployerTotalOption = WebUI.getNumberOfTotalOption(findTestObject('Mentors/partner Form/Current'))

int CurrentEmployerCount = 1 + rad.nextInt(CurrentEmployerTotalOption - 1)

WebUI.selectOptionByIndex(findTestObject('Mentors/partner Form/Current'), CurrentEmployerCount)

'Describe your role in 2 - 3 sentences'
WebUI.setText(findTestObject('Mentors/partner Form/Description'), 'Your role in the project will be strictly defined.The role of the police is to ensure (that) the law is obeyed.')

'Select Where are you based?'
BasedTotalOption = WebUI.getNumberOfTotalOption(findTestObject('Mentors/partner Form/Based'))

int BasedCount = 1 + rad.nextInt(BasedTotalOption - 1)

WebUI.selectOptionByIndex(findTestObject('Mentors/partner Form/Based'), BasedCount)

if (BasedCount == 9) {
	'Which location are you from?'
	WebUI.setText(findTestObject('Mentors/partner Form/Other Based'), 'Chennai')
}

'Select University'
UniversityTotalOption = WebUI.getNumberOfTotalOption(findTestObject('Mentors/partner Form/University'))

int UniversityCount = 1 + rad.nextInt(UniversityTotalOption - 1)

WebUI.selectOptionByIndex(findTestObject('Mentors/partner Form/University'), UniversityCount)

if (UniversityCount == 157) {
	'Which university did you attend?'
	WebUI.setText(findTestObject('Mentors/partner Form/Other University'), 'London University')
}

'Select Degree'
DegreeTotalOption = WebUI.getNumberOfTotalOption(findTestObject('Mentors/partner Form/Degree'))

int DegreeCount = 1 + rad.nextInt(DegreeTotalOption - 1)

WebUI.selectOptionByIndex(findTestObject('Mentors/partner Form/Degree'), DegreeCount)

if (DegreeCount == 9) {
	'Which degree did you complete?'
	WebUI.setText(findTestObject('Mentors/partner Form/Other Degree'), 'MCA')
}

'Select Course'
CourseTotalOption = WebUI.getNumberOfTotalOption(findTestObject('Mentors/partner Form/Course'))

int CourseCount = 1 + rad.nextInt(CourseTotalOption - 1)

WebUI.selectOptionByIndex(findTestObject('Mentors/partner Form/Course'), CourseCount)

if (CourseCount == 97) {
	'Which course did you complete?'
	WebUI.setText(findTestObject('Mentors/partner Form/other course'), 'Software Testing')
}

'Select upReach operates 3 and 6 month mentoring cycles. Which would you prefer?'
WebUI.click(findTestObject('Mentors/partner Form/Mentoring Cycle'))

'Where do you think you can add the most value to your prospective mentee?'
WebUI.click(findTestObject('Mentors/partner Form/Prospective Mentee'))

'Can you tell us a little about yourself?'
WebUI.setText(findTestObject('Mentors/partner Form/Best Quality'), 'In business, engineering, and manufacturing, quality has a pragmatic interpretation as the non-inferiority or superiority of something; its also defined as being suitable for its')

'Mentor User Agreement and Data Protection Guidelines.'
WebUI.click(findTestObject('Mentors/partner Form/Terms and Conditions'))

'Click Submit'
WebUI.click(findTestObject('Mentors/partner Form/Submit'))



