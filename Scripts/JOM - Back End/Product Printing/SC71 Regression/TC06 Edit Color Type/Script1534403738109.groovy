import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Simulasi login'
WebUI.callTestCase(findTestCase('JOM - Back End/User Management/SC99 Regression/TC01 Login As admin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Simulasi mouse scroll ke menu \'Product Printing\''
WebUI.scrollToElement(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Color Type/Page_JOM 3.0  Dashboard/span_Product Printing'), 
    1)

'Simulasi klik menu \'Product Printing\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Color Type/Page_JOM 3.0  Dashboard/span_Product Printing'))

'Simulasi klik submenu \'Color Type\'\r\n\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Color Type/Page_JOM 3.0  Dashboard/span_Color Type'))

'Simulasi klik button Edit pada salah satu data'
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Color Type/Page_JOM 3.0  Color Type/a_btn btn-primary btn-xs bs-to'))

'Simulasi input nama'
WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Color Type/Page_JOM 3.0  Color Type/input_name'), 
    'Test Katalon Edit')

'Simulasi klik button \'Save\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Color Type/Page_JOM 3.0  Color Type/button_Save'))

'Verifikasi muncul notifikasi data berhasil diedit'
WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Color Type/Page_JOM 3.0  Color Type/div_Data has been successfully'))

'Verifikasi data berhasil diedit\r\n'
WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Color Type/Page_JOM 3.0  Color Type/td_Test Katalon Edit'))

