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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Back-End CMS/M002 - User Management/SC99 Regression/TC53 - Sign in as Admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Backend/OR Car Management/Car Management/span_Car Management'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Car Management/Car Management/a_Car Management'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Car Management/Car Management/a_Model'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Car Management/Car Management/a_New (2)'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Car Management/Car Management/span_Brand _select2-selection'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Car Management/Car Management/input_Astra Internasional - Mo'), 
    'bmw')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.sendKeys(findTestObject('Object Repository/Backend/OR Car Management/Car Management/input_Astra Internasional - Mo'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Car Management/Car Management/span_Category _select2-selecti'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Car Management/Car Management/input_Astra Internasional - Mo'), 
    'jeep')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.sendKeys(findTestObject('Object Repository/Backend/OR Car Management/Car Management/input_Astra Internasional - Mo'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Car Management/Car Management/input_Model _name'), 'model')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Car Management/Car Management/button_Save (2)'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Backend/OR Popular Management/Destination and Rental/div_SuccessUpdate data succeed'), 
    2)

