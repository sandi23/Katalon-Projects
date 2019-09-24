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

WebUI.callTestCase(findTestCase('JOM - Back End/Login/Login'), [:], FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('JOM - Back End/ERP Management/Sync Payment Tipe/span_ERP Management'), 3)

WebUI.click(findTestObject('Object Repository/JOM - Back End/ERP Management/Sync Payment Tipe/span_ERP Management'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('JOM - Back End/ERP Management/Sync Payment Tipe/span_Payment Type'), 3)

WebUI.click(findTestObject('Object Repository/JOM - Back End/ERP Management/Sync Payment Tipe/span_Payment Type'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/JOM - Back End/ERP Management/Sync Payment Tipe/a_Synchronize'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Page_JOM 3.0  Payment Type/div_Data has been successfully'), 3)

WebUI.setText(findTestObject('JOM - Back End/ERP Management/Sync Warehouse/input_form-control input-sm'), 
    'AA0')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/JOM - Back End/ERP Management/Sync Payment Tipe/a_btn btn-success btn-xs bs-to'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/JOM - Back End/ERP Management/Sync Payment Tipe/span_fa fa-times'))

