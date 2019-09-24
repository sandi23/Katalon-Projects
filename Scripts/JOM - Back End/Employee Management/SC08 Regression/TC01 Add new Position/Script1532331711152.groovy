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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('http://jom-demo-backend.stagingapps.net/login')

not_run: WebUI.setText(findTestObject('Object Repository/JOM - Back End/Employee Management/OR Add new Position/Page_JOM 3.0  Sign In/input_username'), 
    'admin')

not_run: WebUI.setText(findTestObject('Object Repository/JOM - Back End/Employee Management/OR Add new Position/Page_JOM 3.0  Sign In/input_password'), 
    'P@ssw0rd')

not_run: WebUI.click(findTestObject('JOM - Back End/User Management/OR Login as Admin/Page_JOM 3.0  Sign In/button_Sign In'))

WebUI.scrollToElement(findTestObject('JOM - Back End/Employee Management/OR Add new Position/Page_JOM 3.0  Dashboard/span_Employee Management'), 
    0)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Employee Management/OR Add new Position/Page_JOM 3.0  Dashboard/span_Employee Management'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Employee Management/OR Add new Position/Page_JOM 3.0  Dashboard/span_Position'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Employee Management/OR Add new Position/Page_JOM 3.0  Position/a_Add New'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Employee Management/OR Add new Position/Page_JOM 3.0  Position/input_name'), 
    'Tester')

WebUI.click(findTestObject('JOM - Back End/Employee Management/OR Add new Position/Page_JOM 3.0  Position/div_Yes'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Employee Management/OR Add new Position/Page_JOM 3.0  Position/button_Save'))

WebUI.delay(3)

