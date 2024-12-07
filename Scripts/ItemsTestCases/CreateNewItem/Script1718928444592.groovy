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
def randomName = generateRandomName()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://app.staging.interu.io/login')

WebUI.setText(findTestObject('Object Repository/ItemsObjects/input_Email_Email'), 'nm+katalon@iov42.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ItemsObjects/input_Password_Password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Object Repository/ItemsObjects/span_Log In'))

WebUI.click(findTestObject('Object Repository/ItemsObjects/span_Items'))

WebUI.click(findTestObject('Object Repository/ItemsObjects/span_add Add new'))

WebUI.setText(findTestObject('Object Repository/ItemsObjects/input_ID_ID'), randomName)

WebUI.click(findTestObject('Object Repository/ItemsObjects/input_Product_mat-input-8'))

WebUI.click(findTestObject('Object Repository/ItemsObjects/span_rgerreg'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('ItemsObjects/input_Initial quantity_Initial quantity'), 0)

WebUI.setText(findTestObject('Object Repository/ItemsObjects/input_Initial quantity_Initial quantity'), '3')

WebUI.click(findTestObject('Object Repository/ItemsObjects/input_Created at location_mat-input-11'))

WebUI.click(findTestObject('Object Repository/ItemsObjects/span_9i67676'))

WebUI.setText(findTestObject('Object Repository/ItemsObjects/input_Range (fromto)_mat-input-6'), '20/02/2040')

WebUI.click(findTestObject('ItemsObjects/SameAsCreatedAtLocationCheckbox'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ItemsObjects/span_check Save'))

WebUI.verifyElementNotPresent(findTestObject('ItemsObjects/span_check Save'), 0)

WebUI.click(findTestObject('Object Repository/ItemsObjects/div_Certificates'))

WebUI.click(findTestObject('Object Repository/ItemsObjects/mat-icon_add'))

WebUI.click(findTestObject('Object Repository/ItemsObjects/mat-icon_close'))

WebUI.click(findTestObject('Object Repository/ItemsObjects/div_Documents'))

WebUI.click(findTestObject('Object Repository/ItemsObjects/mat-icon_add'))

WebUI.click(findTestObject('Object Repository/ItemsObjects/mat-icon_close'))

WebUI.closeBrowser()

String generateRandomName() {
	def firstNames = ['top', 'Nick', 'Garry', 'Jasson', 'Roger', 'Tom', 'Virat', 'Nick', 'Tom', 'We', 'Naimal','Hamza','Fawad']

    def lastNames = ['Gun', 'Bailey', 'Kirsten', 'Gillespe', 'Binny', 'Kohler', 'Kohli', 'Jonas', 'Moody', 'Got', 'Khawar','Abbasi','Khan']

    def random = new Random()

    def firstName = firstNames[random.nextInt(firstNames.size())]

    def lastName = lastNames[random.nextInt(lastNames.size())]

    return "$firstName $lastName"
}

