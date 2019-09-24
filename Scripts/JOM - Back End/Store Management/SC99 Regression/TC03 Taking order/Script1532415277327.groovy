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

WebUI.callTestCase(findTestCase('JOM - Back End/Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('JOM - Back End/Store Management/Regression/span_Store Management'))

WebUI.delay(3)

WebUI.click(findTestObject('JOM - Back End/Store Management/Regression/span_Taking Order'))

WebUI.delay(3)

WebUI.click(findTestObject('JOM - Back End/Store Management/Regression/a_Add New'))

WebUI.delay(3)

WebUI.click(findTestObject('JOM - Back End/Store Management/Regression/span_Store'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/Regression/store text'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('JOM - Back End/Store Management/Regression/span_SO Number'))

WebUI.delay(2)

WebUI.setText(findTestObject('JOM - Back End/Store Management/Regression/store SO'), findTestData('Store dan SO Number').getValue(3, 1))

WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/Regression/store SO'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('JOM - Back End/Store Management/Regression/input_chkParent'))

WebUI.click(findTestObject('JOM - Back End/Store Management/Regression/button_Save'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('JOM - Back End/Store Management/Regression/div_Data has been successfully'), 5)

WebUI.setText(findTestObject('JOM - Back End/Store Management/Regression/input_form-control input-sm'), findTestData('Store dan SO Number').getValue(
        3, 1))

WebUI.delay(3)

WebUI.click(findTestObject('JOM - Back End/Store Management/Regression/a_btn btn-success btn-xs bs-to'))

WebUI.delay(10)

WebUI.click(findTestObject('JOM - Back End/Store Management/Regression/button_Close'))

WebUI.delay(10)

WebUI.closeBrowser()

