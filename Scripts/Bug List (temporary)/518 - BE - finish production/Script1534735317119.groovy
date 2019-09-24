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

not_run: WebUI.callTestCase(findTestCase('JOM - Back End/User Management/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('JOM - Back End/Production Management/span_Production Management'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('JOM - Back End/Production Management/span_Finish Production'))

WebUI.delay(5)

WebUI.click(findTestObject('JOM - Back End/Production Management/a_Add New'))

WebUI.delay(5)

WebUI.setText(findTestObject('JOM - Back End/Production Management/input_so_number'), findTestData('Store dan SO Number').getValue(
        2, 1))

WebUI.click(findTestObject('JOM - Back End/Production Management/ikon close'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('JOM - Back End/Production Management/a_Add New'))

WebUI.delay(1)

WebUI.setText(findTestObject('JOM - Back End/Production Management/input_so_number'), findTestData('Store dan SO Number').getValue(
        2, 1))

WebUI.delay(1)

WebUI.click(findTestObject('JOM - Back End/Production Management/input_action'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('JOM - Back End/Production Management/input_action 2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('JOM - Back End/Production Management/input_action 3'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('JOM - Back End/Production Management/button_save  Continue'))

not_run: WebUI.click(findTestObject('JOM - Back End/Production Management/button cancel'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

not_run: WebUI.closeBrowser()

