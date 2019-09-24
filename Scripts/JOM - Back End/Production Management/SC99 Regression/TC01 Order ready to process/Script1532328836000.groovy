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

WebUI.callTestCase(findTestCase('JOM - Back End/User Management/SC99 Regression/TC01 Login As admin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('JOM - Back End/Production Management/a_Production Management'))

WebUI.delay(5)

WebUI.click(findTestObject('JOM - Back End/Production Management/a_Order Ready to Process'))

WebUI.delay(5)

WebUI.setText(findTestObject('JOM - Back End/Production Management/input_form-control input-sm'), findTestData('Store dan SO Number').getValue(
        2, 1))

WebUI.delay(5)

WebUI.click(findTestObject('JOM - Back End/Production Management/a_Process'))

WebUI.waitForJQueryLoad(7)

WebUI.setText(findTestObject('JOM - Back End/Production Management/textarea_note'), 'Catatan')

WebUI.click(findTestObject('JOM - Back End/Production Management/button_Save'))

WebUI.delay(5)

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('JOM - Back End/Production Management/b_S10118G-000123.A'), findTestData('Store dan SO Number').getValue(
        2, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToPosition(600, 0, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.delay(2)

WebUI.click(findTestObject('JOM - Back End/Production Management/span_Production Management'), FailureHandling.CONTINUE_ON_FAILURE)

