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

WebUI.click(findTestObject('Object Repository/Backend/OR Popular Management/Destination and Rental/span_Popular Management'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Popular Management/Destination and Rental/a_Popular Destination'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.rightClick(findTestObject('Backend/OR Popular Management/Destination and Rental/btnEdit'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Popular Management/Destination and Rental/span_Aceh'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Popular Management/Destination and Rental/input_Astra Internasional - Mo'), 
    'ban')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.sendKeys(findTestObject('Object Repository/Backend/OR Popular Management/Destination and Rental/input_Astra Internasional - Mo'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.uploadFile(findTestObject('Object Repository/Backend/OR Popular Management/Destination and Rental/input_Image _logo'), 
    'C:\\Users\\Sandi\\Pictures\\Screenshots\\qa\\QA-Tester-meme-07.jpg')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Popular Management/Destination and Rental/input_Text_description'), 
    'Kota Aceh')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Popular Management/Destination and Rental/span_1'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Popular Management/Destination and Rental/input_Astra Internasional - Mo'), 
    '4')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.sendKeys(findTestObject('Object Repository/Backend/OR Popular Management/Destination and Rental/input_Astra Internasional - Mo'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Popular Management/Destination and Rental/button_Save'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Backend/OR Popular Management/Destination and Rental/div_SuccessUpdate data succeed'), 
    2)

