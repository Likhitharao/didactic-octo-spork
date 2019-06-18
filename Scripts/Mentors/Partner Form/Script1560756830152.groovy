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

'Maximize the opened browser'
WebUI.maximizeWindow()

'Print message on console log'
KeywordLogger log = new KeywordLogger()

'Check whether First Name field exists or not'
try {
    log.logInfo('---------First Name exists --------------')

    'Enter First Name'
    WebUI.setText(findTestObject('Mentors/partner Form/Firstname'), 'William')
}
catch (Throwable e) {
    log.logInfo('knowm Name not found: ' + e.getMessage())
} 

try {
    log.logInfo('---------Known Name exists --------------')

    'Enter Known name'
    WebUI.setText(findTestObject('Mentors/partner Form/Know Name'), 'William')
}
catch (Throwable e) {
    log.logInfo('Known not found: ' + e.getMessage())
} 


'Check whether last Name field exists or not'
try {
	log.logInfo('---------Last Name exists --------------')
	'Enter LastName'
	WebUI.setText(findTestObject('Mentors/partner Form/lastName'), 'Levis')
	
}
catch (Throwable e) {
	log.logInfo('Last Name not found: ' + e.getMessage())
}


Random rad = new Random()

int Email = rad.nextInt(2000)

'Enter Work Email'
WebUI.setText(findTestObject('Mentors/partner Form/WorkEmail'), ('test' + Email) + '@ac.uk')

'Enter Personal Email '
WebUI.setText(findTestObject('Mentors/partner Form/Personal Email'), ('personal' + Email) + '@test.com')

WebUI.setText(findTestObject('Mentors/partner Form/Linkedin-URL'), 'Linkedin-Williams')

WebUI.setText(findTestObject('Mentors/partner Form/Skype-Id'), 'Skype-Williams')

WebUI.click(findTestObject('Mentors/partner Form/Prefered Email'))


try {
	log.logInfo('--------Gender exists --------------')

	'Random Selection of gender'
	GenderTotalOption = WebUI.getNumberOfTotalOption(findTestObject('Mentors/partner Form/Gender'))
	
	int GenderCount = 1 + rad.nextInt(GenderTotalOption - 1)
	
	WebUI.selectOptionByIndex(findTestObject('Mentors/partner Form/Gender'), GenderCount)
	
}
catch (Throwable e) {
	log.logInfo('gendernot found: ' + e.getMessage())
}



WebUI.delay(5)

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

