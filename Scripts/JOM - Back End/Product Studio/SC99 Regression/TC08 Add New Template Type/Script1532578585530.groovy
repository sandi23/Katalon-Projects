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

WebUI.scrollToElement(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template Type/span_Product Studio'), 
    2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template Type/span_Product Studio'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template Type/span_Template'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template Type/span_Template Type'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template Type/a_Add New (1)'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template Type/input_name (1)'), 'Template Testing')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template Type/textarea_description (1)'), 
    'Deskripsi testing')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template Type/button_Save (1)'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template Type/div_Data has been successfully'), 
    4)

not_run: WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template Type/input_form-control input-sm'), 
    'tes')

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template Type/a_btn btn-success btn-xs bs-to'))

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template Type/button_Close'))

not_run: WebUI.click(findTestObject('JOM - Back End/Product Studio/Add New Template Type/ikon delete'))

not_run: WebUI.click(findTestObject('JOM - Back End/Product Studio/Add New Template Type/button delete'))

WebUI.delay(5)

