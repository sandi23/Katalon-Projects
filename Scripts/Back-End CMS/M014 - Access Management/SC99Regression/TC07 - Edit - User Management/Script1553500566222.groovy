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

not_run: WebUI.callTestCase(findTestCase('Back-End CMS/M002 - User Management/SC99 Regression/TC53 - Sign in as Admin'), 
    [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Backend/OR Access Management/a_Access Management'))

WebUI.click(findTestObject('Object Repository/Backend/OR Access Management/a_User Management'))

WebUI.click(findTestObject('Object Repository/Backend/OR Access Management/a_nansulaiman5mailinator.com_b'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Backend/OR Access Management/input_NPK _npk'), '009')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Backend/OR Access Management/input_Name _name'), 'nandangupdate')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Backend/OR Access Management/input_Email _email'), 'nansulaiman5update@mailinator.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Backend/OR Access Management/input_Phone Number _phone'), '082121212122')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Backend/OR Access Management/span_Nothing selected'))

WebUI.delay(2)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Backend/OR Access Management/a_Superadmin'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Access Management/select_Admin Data'), 'ab203982-13d0-427e-bc4b-8d887712b7c9', 
    true)

WebUI.click(findTestObject('Object Repository/Backend/OR Access Management/button_Save'))

WebUI.delay(2)

