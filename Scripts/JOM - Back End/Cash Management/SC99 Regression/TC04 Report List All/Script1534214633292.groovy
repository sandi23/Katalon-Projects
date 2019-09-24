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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://jonas-beta.stagingapps.net/login')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Cash Management/User/input_username'), 'admin')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Cash Management/User/input_password'), 'P@ssw0rd')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Cash Management/User/button_Sign In'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Cash Management/Page_JOM 3.0  Dashboard/span_Cash Management'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Cash Management/Page_JOM 3.0  Dashboard/span_Report'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Cash Management/Page_JOM 3.0  Dashboard/span_Sales'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Cash Management/Page_JOM 3.0  Sales Report/strong_Detail'))

not_run: WebUI.closeBrowser()

