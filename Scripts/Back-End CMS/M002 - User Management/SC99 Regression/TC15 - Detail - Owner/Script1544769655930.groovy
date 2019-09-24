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

WebUI.click(findTestObject('Backend/OR User Management/Temporary/span_User Management'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Backend/OR User Management/Temporary/a_Owner'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR User Management/Owner/input_Search_form-control inpu'), 'belinda')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Backend/OR User Management/Owner 2.0/btnDetail'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.verifyElementPresent(findTestObject('Object Repository/Backend/OR User Management/Owner/div_Owner Info'), 1)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.verifyElementPresent(findTestObject('Object Repository/Backend/OR User Management/Owner/div_Account Info'), 1)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.verifyElementPresent(findTestObject('Object Repository/Backend/OR User Management/Owner/div_Rental Info'), 1)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.verifyElementPresent(findTestObject('Object Repository/Backend/OR User Management/Owner/div_Account Bank Info'), 1)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.scrollToElement(findTestObject('Object Repository/Backend/OR User Management/Owner/div_Identity Info'), 1)

WebUI.scrollToPosition(0, 800)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR User Management/Owner/select_Model'), 'brand', true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR User Management/Owner/select_Model'), 'city', true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR User Management/Owner/button_Car List_filterBtn'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR User Management/Owner/a_Import Car'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR User Management/Owner/a_Back to owner detail page'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR User Management/Owner/a_Back'))

