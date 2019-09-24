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

WebUI.openBrowser('jonas-beta.stagingapps.net/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('JOM - Back End/Product Merchandise/Add new Material/Page_JOM 3.0  Sign In/input_username'), 
    'admin')

WebUI.setText(findTestObject('JOM - Back End/Product Merchandise/Add new Material/Page_JOM 3.0  Sign In/input_password'), 
    'P@ssw0rd')

WebUI.click(findTestObject('JOM - Back End/Product Merchandise/Add new Material/Page_JOM 3.0  Sign In/button_Sign In'))

WebUI.scrollToElement(findTestObject('JOM - Back End/Product Merchandise/Add new Material/Page_JOM 3.0  Dashboard/span_Product Merchandise'), 
    1)

WebUI.click(findTestObject('JOM - Back End/Product Merchandise/Add new Material/Page_JOM 3.0  Dashboard/span_Product Merchandise'))

WebUI.click(findTestObject('JOM - Back End/Product Merchandise/Add new Material/Page_JOM 3.0  Dashboard/span_Material'))

WebUI.click(findTestObject('JOM - Back End/Product Merchandise/Add new Material/Page_JOM 3.0  Material/a_Add New'))

WebUI.setText(findTestObject('JOM - Back End/Product Merchandise/Add new Material/Page_JOM 3.0  Material/input_name'), 'Besi')

WebUI.click(findTestObject('JOM - Back End/Product Merchandise/Add new Material/Page_JOM 3.0  Material/button_Save'))

not_run: WebUI.verifyElementVisible(findTestObject('JOM - Back End/Product Merchandise/Add new Material/Page_JOM 3.0  Material/td_Besi'))

WebUI.click(findTestObject('JOM - Back End/Product Merchandise/Add new Material/Page_JOM 3.0  Material/a_Administrator'))

WebUI.click(findTestObject('JOM - Back End/Product Merchandise/Add new Material/Page_JOM 3.0  Material/a_Sign Out'))

not_run: WebUI.closeBrowser()

