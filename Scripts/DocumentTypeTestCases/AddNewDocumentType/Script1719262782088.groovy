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
import java.util.Random as Random

// Function to generate a random name
// Generate random name
def randomName = generateRandomName()

// Define the file path and target element
//String filePath = 'C:\\path\\to\\your\\file.pdf'
//
//TestObject fileInput = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//input[@type=\'file\' and @id=\'files\']')
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://app.staging.interu.io/login')

WebUI.setText(findTestObject('Object Repository/DocumentTypeObjects/MaterialObjects/input_Email_Email'), 'nm+katalon@iov42.com')

WebUI.setEncryptedText(findTestObject('Object Repository/DocumentTypeObjects/MaterialObjects/input_Password_Password'), 
    'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Object Repository/DocumentTypeObjects/MaterialObjects/span_Log In'))

WebUI.click(findTestObject('DocumentTypeObjects/DocumentIconFromLeftMenu'))

WebUI.click(findTestObject('DocumentTypeObjects/AddNewDocumentBtn'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('DocumentTypeObjects/Uploaddocument'), '/Users/haseeburrahman/Desktop/1.png')

WebUI.clearText(findTestObject('DocumentTypeObjects/DocumentNameField'))

WebUI.setText(findTestObject('DocumentTypeObjects/DocumentNameField'), randomName)

WebUI.setText(findTestObject('DocumentTypeObjects/TypeField'), randomName)

WebUI.click(findTestObject('DocumentTypeObjects/TypeOptionSelector'))

WebUI.click(findTestObject('DocumentTypeObjects/UploadDocumentButton'))

WebUI.click(findTestObject('DocumentTypeObjects/DoneButton'))

WebUI.delay(2)

WebUI.closeBrowser()

String generateRandomName() {
    def firstNames = ['top', 'Nick', 'Garry', 'Jasson', 'Roger', 'Tom', 'Virat', 'Nick', 'Tom', 'We', 'Naimal','Hamza','Fawad']

    def lastNames = ['Gun', 'Bailey', 'Kirsten', 'Gillespe', 'Binny', 'Kohler', 'Kohli', 'Jonas', 'Moody', 'Got', 'Khawar','Abbasi','Khan']

    def random = new Random()

    def firstName = firstNames[random.nextInt(firstNames.size())]

    def lastName = lastNames[random.nextInt(lastNames.size())]

    return "$firstName $lastName"
}

