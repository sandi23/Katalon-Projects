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

WebUI.scrollToElement(findTestObject('JOM - Back End/Delivery Order Management/span_Delivery Order Management'), 3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('JOM - Back End/Delivery Order Management/span_Delivery Order Management'))

WebUI.delay(5)

WebUI.click(findTestObject('JOM - Back End/Delivery Order Management/span_Delivery Order'))

WebUI.delay(5)

WebUI.setText(findTestObject('JOM - Back End/Delivery Order Management/search DO'), findTestData('Store dan SO Number').getValue(3, 1))

WebUI.delay(3)

WebUI.click(findTestObject('JOM - Back End/Delivery Order Management/a_btn btn-primary btn-xs bs-to'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('JOM - Back End/Delivery Order Management/p_S10118G-000231.A'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('JOM - Back End/Delivery Order Management/input_so_number'), findTestData('Store dan SO Number').getValue(
        3, 1))

WebUI.scrollToElement(findTestObject('JOM - Back End/Delivery Order Management/textarea_note'), 3)

WebUI.delay(5)

WebUI.click(findTestObject('JOM - Back End/Delivery Order Management/ins_iCheck-helper'))

WebUI.scrollToElement(findTestObject('JOM - Back End/Delivery Order Management/textarea_note'), 3)

WebUI.setText(findTestObject('JOM - Back End/Delivery Order Management/textarea_note'), 'Catatan testing')

WebUI.click(findTestObject('JOM - Back End/Delivery Order Management/button_Save'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('JOM - Back End/Delivery Order Management/Validasi berhasil dikirim'), 10)

WebUI.closeBrowser()

