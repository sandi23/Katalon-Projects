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

WebUI.callTestCase(findTestCase('Back-End CMS/M002 - User Management/SC99 Regression/TC53 - Sign in as Admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Car Management/Facility Management/span_Car Management'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Car Management/Facility Management/a_Facility Management'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Car Management/Facility Management/a_Owner'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Car Management/Facility Management/input_Search_form-control inpu'), 
    'car')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Car Management/Facility Management/a_Lepas Kunci_btn btn-primary'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Car Management/Facility Management/input_Facility _name'), 'fasilitastest')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.uploadFile(findTestObject('Object Repository/Backend/OR Car Management/Facility Management/input_Image _logo'), '')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Car Management/Facility Management/textarea_characters left_note'), 
    'note catatan')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Car Management/Facility Management/button_Save'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Backend/OR Car Management/Facility Management/div_SuccessInsert data succeed'), 
    2)

