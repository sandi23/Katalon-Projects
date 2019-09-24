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

WebUI.navigateToUrl('http://jonas-beta.stagingapps.net/login')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Employee Management/OR Create Role/Page_JOM 3.0  Sign In/input_username'), 
    'admin')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Employee Management/OR Create Role/Page_JOM 3.0  Sign In/input_password'), 
    'P@ssw0rd')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Employee Management/OR Create Role/Page_JOM 3.0  Sign In/button_Sign In'))

WebUI.scrollToElement(findTestObject('JOM - Back End/Employee Management/OR Create Role/Page_JOM 3.0  Dashboard/span_User Management'), 
    0)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Employee Management/OR Create Role/Page_JOM 3.0  Dashboard/span_User Management'))

WebUI.scrollToElement(findTestObject('JOM - Back End/Employee Management/OR Create Role/Page_JOM 3.0  Dashboard/span_Role'), 
    0)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Employee Management/OR Create Role/Page_JOM 3.0  Dashboard/span_Role'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Employee Management/OR Create Role/Page_JOM 3.0  Role/a_Add New'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Employee Management/OR Create Role/Page_JOM 3.0  Role/input_name'), 
    'Tester')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Employee Management/OR Create Role/Page_JOM 3.0  Role/button_Save'))

WebUI.delay(3)

