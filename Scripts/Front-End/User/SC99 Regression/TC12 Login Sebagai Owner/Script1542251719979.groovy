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

'Buka Browser'
WebUI.openBrowser('')

'Maximize Window'
WebUI.maximizeWindow()

'Akses Url'
WebUI.navigateToUrl('https://stg.movic.id/home')

WebUI.waitForPageLoad(10)

'Klik textlink Masuk'
WebUI.click(findTestObject('Object Repository/Front-End/OR User/OR Login sebagai Owner/a_Masuk'))

WebUI.delay(3)

'Input Email'
WebUI.setText(findTestObject('Object Repository/Front-End/OR User/OR Login sebagai Owner/input_EmailNomor Handphone_for'), 
    '082128751192')

'Input Email'
not_run: WebUI.setText(findTestObject('Object Repository/Front-End/OR User/OR Login sebagai Owner/input_EmailNomor Handphone_for'), 
    'ali.msaputra01@gmail.com')

WebUI.delay(3)

'Input Password'
WebUI.setText(findTestObject('Object Repository/Front-End/OR User/OR Login sebagai Owner/input_Password_form-control ng'), 
    'password10')

WebUI.delay(3)

'Klik button Masuk'
WebUI.click(findTestObject('Object Repository/Front-End/OR User/OR Login sebagai Owner/button_MASUK'))

WebUI.delay(3)

'Klik Switch to Owner'
WebUI.click(findTestObject('Front-End/OR User/OR Login sebagai Owner/a_Switch to Owner update'))

WebUI.delay(3)

