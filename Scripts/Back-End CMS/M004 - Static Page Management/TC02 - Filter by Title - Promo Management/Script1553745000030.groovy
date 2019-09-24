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

WebUI.click(findTestObject('Backend/OR Web Management/Banner/span_Web Management'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/span_Static Page Management'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/a_Promo'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR User Management/Owner 2.0/select_Name'), 'title', 
    true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR User Management/Owner 2.0/input_Owner_searchValue'), 'a')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR User Management/Owner 2.0/button_Owner_filterBtn'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

