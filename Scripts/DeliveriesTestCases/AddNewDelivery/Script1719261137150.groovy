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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://app.staging.interu.io/login')

WebUI.setText(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/input_Email_Email'), 'nm+katalon@iov42.com')

WebUI.setEncryptedText(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/input_Password_Password'), 
    'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/span_Log In'))

WebUI.click(findTestObject('DeliveriesObjects/DeliveriesObjects/DeliveryIconFromLeftMenu'))

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/span_add Add new'))

WebUI.setText(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/input_ID_ID'), randomName)

WebUI.setText(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/input_From_mat-input-7'), '')

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/input_From_mat-input-7'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/span_Noam Crawley'))

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/input_To_mat-input-8'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/span_Mike Dockrell'))

WebUI.setText(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/input_Sent_mat-input-10'), '12/03/2024')

WebUI.setText(findTestObject('DeliveriesObjects/DeliveriesObjects/input_Delivered_mat-input-11'), '11/07/2024')

WebUI.click(findTestObject('DeliveriesObjects/DeliveriesObjects/input_Trader(s)_mat-input-12'))

WebUI.setText(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/input_Trader(s)_mat-input-12'), 'Test Trader')

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/Page_Interu/span_Save'))

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/Page_Interu/button_Items'))

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/Page_Interu/span_add Add'))

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/Page_Interu/mat-icon_add'))

WebUI.setText(findTestObject('DeliveriesObjects/Page_Interu/input_ID_ID'), randomName)

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/Page_Interu/input_Product_mat-input-78'))

WebUI.click(findTestObject('DeliveriesObjects/Page_Interu/mat-option_Joker Difficult'))

WebUI.setText(findTestObject('Object Repository/DeliveriesObjects/Page_Interu/input_Initial quantity_Initial quantity'), 
    '100')

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/Page_Interu/input_Created at location_mat-input-46'))

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/Page_Interu/mat-option_Zack Crawley'))

WebUI.setText(findTestObject('Object Repository/DeliveriesObjects/Page_Interu/input_Creation date_mat-input-40'), '11/05/2050')

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/Page_Interu/input_Current  final location_mat-input-74'))

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/Page_Interu/mat-option_QAAutomationLocation'))

WebUI.setText(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/input_Delivery quantity_Delivery quantity'), 
    '4')

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/Page_Interu/span_check Save'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/div_Documents'))

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/Page_Interu/span_add Add'))

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/mat-icon_close'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/span_Deliveries'))

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/ng-component_Delivered'))

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/span_Edit'))

WebUI.doubleClick(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/input_ID_ID'))

WebUI.doubleClick(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/input_ID_ID'))

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/input_ID_ID'))

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/div_Items'))

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/button_Details'))

WebUI.click(findTestObject('DeliveriesObjects/DeliveriesObjects/span_Edit'))

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/input_From_mat-input-44'))

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/span_Mike Dockrell'))

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/input_To_mat-input-53'))

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/span_Ben Plunkett'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/DeliveriesObjects/DeliveriesObjects/span_check Save'))

WebUI.delay(1)

WebUI.closeBrowser()

String generateRandomName() {
    def firstNames = ['top', 'Nick', 'Garry', 'Jasson', 'Roger', 'Tom', 'Virat', 'Nick', 'Tom', 'We', 'Naimal','Hamza','Fawad']

    def lastNames = ['Gun', 'Bailey', 'Kirsten', 'Gillespe', 'Binny', 'Kohler', 'Kohli', 'Jonas', 'Moody', 'Got', 'Khawar','Abbasi','Khan']

    def random = new Random()

    def firstName = firstNames[random.nextInt(firstNames.size())]

    def lastName = lastNames[random.nextInt(lastNames.size())]

    return "$firstName $lastName"
}

