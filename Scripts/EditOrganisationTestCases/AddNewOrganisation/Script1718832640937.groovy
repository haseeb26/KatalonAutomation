import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Function to generate a random name
// Generate random name
def randomName = generateRandomName()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://app.staging.interu.io/login')

WebUI.setText(findTestObject('Object Repository/EditOrganisation/NewOrgObjects/input_Email_Email'), 'nm+katalon@iov42.com')

WebUI.setEncryptedText(findTestObject('Object Repository/EditOrganisation/NewOrgObjects/input_Password_Password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Object Repository/EditOrganisation/NewOrgObjects/span_Log In'))

WebUI.click(findTestObject('Object Repository/EditOrganisation/NewOrgObjects/span_add Add new'))

WebUI.setText(findTestObject('Object Repository/EditOrganisation/NewOrgObjects/input_Name_Name'), randomName)

def inputFieldok = WebUI.findWebElement(findTestObject('Object Repository/EditOrganisation/NewOrgObjects/input_Name_Name'))

WebUI.clearText(findTestObject('EditOrganisation/NewOrgObjects/input_Name_Name'))

// Simulate pressing Backspace key
inputFieldok.sendKeys(Keys.BACK_SPACE)

WebUI.verifyElementText(findTestObject('Object Repository/EditOrganisation/NewOrgObjects/mat-hint_This field is mandatory'), 
    'This field is mandatory.')

WebUI.setText(findTestObject('Object Repository/EditOrganisation/NewOrgObjects/input_Name_Name'), randomName)

WebUI.setText(findTestObject('Object Repository/EditOrganisation/NewOrgObjects/input_Website_Website'), 'ds')

WebUI.click(findTestObject('Object Repository/EditOrganisation/NewOrgObjects/mat-hint_Please enter a valid URL'))

WebUI.verifyElementText(findTestObject('Object Repository/EditOrganisation/NewOrgObjects/mat-hint_Please enter a valid URL'), 
    'Please enter a valid URL.')

WebUI.setText(findTestObject('Object Repository/EditOrganisation/NewOrgObjects/input_Website_Website'), 'https://www.google.com')

WebUI.setText(findTestObject('Object Repository/EditOrganisation/NewOrgObjects/input_Address_Address'), 'New')

WebUI.setText(findTestObject('Object Repository/EditOrganisation/NewOrgObjects/input_Region_Region'), 'KP')

WebUI.setText(findTestObject('Object Repository/EditOrganisation/NewOrgObjects/input_ZIP  Postcode_ZIP  Postcode'), '123')

WebUI.setText(findTestObject('Object Repository/EditOrganisation/NewOrgObjects/input_Country_mat-input-9'), '')

WebUI.click(findTestObject('Object Repository/EditOrganisation/NewOrgObjects/input_Country_mat-input-9'))

WebUI.setText(findTestObject('Object Repository/EditOrganisation/NewOrgObjects/input_Country_mat-input-9'), 'Uni')

WebUI.click(findTestObject('Object Repository/EditOrganisation/NewOrgObjects/span_United Kingdom'))

WebUI.verifyElementClickable(findTestObject('Object Repository/EditOrganisation/NewOrgObjects/span_check Save'))

WebUI.click(findTestObject('EditOrganisation/NewOrgObjects/span_check Save'))

WebUI.verifyElementNotPresent(findTestObject('EditOrganisation/NewOrgObjects/span_check Save'), 0)

WebUI.closeBrowser()

String generateRandomName() {
	def firstNames = ['top', 'Nick', 'Garry', 'Jasson', 'Roger', 'Tom', 'Virat', 'Nick', 'Tom', 'We', 'Naimal','Hamza','Fawad']

    def lastNames = ['Gun', 'Bailey', 'Kirsten', 'Gillespe', 'Binny', 'Kohler', 'Kohli', 'Jonas', 'Moody', 'Got', 'Khawar','Abbasi','Khan']

    def random = new Random()

    def firstName = firstNames[random.nextInt(firstNames.size())]

    def lastName = lastNames[random.nextInt(lastNames.size())]

    return "$firstName $lastName"
}

