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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://app.staging.interu.io/login')

WebUI.setText(findTestObject('Object Repository/SupplyChain/input_Email_Email'), 'nm+katalon@iov42.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SupplyChain/input_Password_Password'), 'p4y+y39Ir5PSroUgyOehqg==')

WebUI.click(findTestObject('Object Repository/SupplyChain/span_Log In'))

WebUI.click(findTestObject('Object Repository/SupplyChain/span_Supply chains'))

WebUI.click(findTestObject('EditOrganisation/CertificateAndDocumentsObjects/1stitemonPage'))

WebUI.verifyElementText(findTestObject('Object Repository/SupplyChain/span_Graph'), 'Graph')

WebUI.verifyElementText(findTestObject('Object Repository/SupplyChain/span_Map'), 'Map')

WebUI.verifyElementText(findTestObject('Object Repository/SupplyChain/span_Locations'), 'Locations')

WebUI.verifyElementText(findTestObject('Object Repository/SupplyChain/span_Certificates'), 'Certificates')

WebUI.verifyElementText(findTestObject('Object Repository/SupplyChain/span_Documents'), 'Documents')

WebUI.verifyElementText(findTestObject('Object Repository/SupplyChain/span_Comments (0)'), 'Comments (2)')

WebUI.click(findTestObject('Object Repository/SupplyChain/span_Edit_mat-mdc-button-touch-target'))

WebUI.doubleClick(findTestObject('Object Repository/SupplyChain/input_Name_Name'))

WebUI.setText(findTestObject('Object Repository/SupplyChain/input_Name_Name'), '')

WebUI.setText(findTestObject('Object Repository/SupplyChain/input_Name_Name'), 'QA Automation')

WebUI.click(findTestObject('Object Repository/SupplyChain/mat-icon_add'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/SupplyChain/mat-icon_close'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/SupplyChain/span_check Save'))

WebUI.click(findTestObject('Object Repository/SupplyChain/svg'))

WebUI.closeBrowser()

