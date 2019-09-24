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

WebUI.scrollToElement(findTestObject('JOM - Back End/Delivery Order Management/span_Delivery Order Management'), 3)

WebUI.click(findTestObject('JOM - Back End/Delivery Order Management/span_Delivery Order Management'))

WebUI.delay(5)

WebUI.click(findTestObject('JOM - Back End/Delivery Order Management/span_Delivery Order'))

WebUI.delay(5)

WebUI.click(findTestObject('JOM - Back End/Delivery Order Management/a_Add New (1)'))

WebUI.delay(3)

WebUI.setText(findTestObject('JOM - Back End/Delivery Order Management/input_store'), findTestData('Store dan SO Number').getValue(
        1, 1))

WebUI.delay(3)

WebUI.setText(findTestObject('JOM - Back End/Delivery Order Management/input_so_no'), findTestData('Store dan SO Number').getValue(
        2, 1))

WebUI.click(findTestObject('JOM - Back End/Delivery Order Management/button_Save (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('JOM - Back End/Delivery Order Management/button close'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('JOM - Back End/Delivery Order Management/span_Delivery Order Management (1)'))

WebUI.delay(3)

