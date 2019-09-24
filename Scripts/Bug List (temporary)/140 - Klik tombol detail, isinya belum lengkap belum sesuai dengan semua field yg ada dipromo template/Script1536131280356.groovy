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

WebUI.callTestCase(findTestCase('JOM - Back End/Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/JOM - Back End/Promo Management/Page_JOM 3.0  Dashboard/span_Promo Management'), 
    0)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Promo Management/Page_JOM 3.0  Dashboard/span_Promo Management'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Promo Management/Page_JOM 3.0  Dashboard/span_Promo Template'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Promo Management/Page_JOM 3.0  Promo Template/input_form-control input-sm'), 
    'PT00001')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Promo Management/Page_JOM 3.0  Promo Template/i_fa fa-edit fa-lg'))

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

//Go in to new tab
WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('http://jonas-beta.stagingapps.net/login')

WebUI.scrollToElement(findTestObject('Object Repository/JOM - Back End/Promo Management/Page_JOM 3.0  Dashboard/span_Promo Management'), 
    0)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Promo Management/Page_JOM 3.0  Dashboard/span_Promo Management'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Promo Management/Page_JOM 3.0  Dashboard/span_Promo Template'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Promo Management/Page_JOM 3.0  Promo Template/input_form-control input-sm'), 
    'PT00001')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Promo Management/Page_JOM 3.0  Promo Template/i_fa fa-search fa-lg'))

