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

WebUI.scrollToElement(findTestObject('JOM - Back End/General Setting/Add new bank/span_General Settings'), 3)

WebUI.click(findTestObject('Object Repository/JOM - Back End/General Setting/Add new bank/span_General Settings'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('JOM - Back End/General Setting/Add new bank/span_Finance Setting'), 3)

WebUI.click(findTestObject('Object Repository/JOM - Back End/General Setting/Add new bank/span_Finance Setting'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/JOM - Back End/General Setting/Add new bank/span_Bank'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/JOM - Back End/General Setting/Add new bank/a_Add New'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/General Setting/Add new bank/input_code'), 'cod')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/General Setting/Add new bank/input_name'), 'nama')

WebUI.setText(findTestObject('JOM - Back End/General Setting/Add new bank/textarea_description'), 'deskripsi')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/JOM - Back End/General Setting/Add new bank/button_Save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/General Setting/Add new bank/a_Close'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/JOM - Back End/General Setting/Add new bank/div_'), 
    5)

not_run: WebUI.delay(3)

not_run: WebUI.setText(findTestObject('JOM - Back End/General Setting/Add new bank/input_code'), 'cod')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/General Setting/Add new bank/a_btn btn-primary btn-xs bs-to'))

not_run: WebUI.click(findTestObject('JOM - Back End/General Setting/Add new bank/a_Close'))

not_run: WebUI.acceptAlert()

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/General Setting/Add new bank/span_fa fa-times'))

