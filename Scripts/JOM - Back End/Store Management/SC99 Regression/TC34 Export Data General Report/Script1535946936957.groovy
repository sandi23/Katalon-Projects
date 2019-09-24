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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('JOM - Back End/Login/Login'), [:], FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('JOM - Back End/Store Management/OR Export Data General Report/Page_JOM 3.0  Dashboard/span_Store Management'), 
    0)

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Export Data General Report/Page_JOM 3.0  Dashboard/span_Store Management'))

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Export Data General Report/Page_JOM 3.0  Dashboard/span_General Report'))

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Export Data General Report/Page_JOM 3.0  General Report/button_Filter'))

WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Export Data General Report/Page_JOM 3.0  General Report/input_from_date'), 
    '2018-08-21 - 2018-08-21')

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Export Data General Report/Page_JOM 3.0  General Report/button_Apply'))

WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Export Data General Report/Page_JOM 3.0  General Report/span_'), 
    'Product Printing')

WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/OR Export Data General Report/Page_JOM 3.0  General Report/span_'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Export Data General Report/Page_JOM 3.0  General Report/input_select2-search__field'), 
    'Jonas Banda')

WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/OR Export Data General Report/Page_JOM 3.0  General Report/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Export Data General Report/Page_JOM 3.0  General Report/input_select2-search__field_1'), 
    'Closed')

WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/OR Export Data General Report/Page_JOM 3.0  General Report/input_select2-search__field_1'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Export Data General Report/Page_JOM 3.0  General Report/button_Export'))

