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

WebUI.setText(findTestObject('JOM - Back End/Product Printing/Add new Photo Size/Page_JOM 3.0  Sign In/input_username'), 
    'admin')

WebUI.setText(findTestObject('JOM - Back End/Product Printing/Add new Photo Size/Page_JOM 3.0  Sign In/input_password'), 
    'P@ssw0rd')

WebUI.click(findTestObject('JOM - Back End/Product Printing/Add new Photo Size/Page_JOM 3.0  Sign In/button_Sign In'))

WebUI.scrollToElement(findTestObject('JOM - Back End/Product Printing/Add new Photo Size/Page_JOM 3.0  Dashboard/a_Product Printing'), 
    2)

WebUI.click(findTestObject('JOM - Back End/Product Printing/Add new Photo Size/Page_JOM 3.0  Dashboard/a_Product Printing'))

WebUI.delay(0)

WebUI.click(findTestObject('JOM - Back End/Product Printing/Add new Photo Size/Page_JOM 3.0  Dashboard/span_Photo Size'))

WebUI.click(findTestObject('JOM - Back End/Product Printing/Add new Photo Size/Page_JOM 3.0  Photo Size/a_Add New'))

WebUI.setText(findTestObject('JOM - Back End/Product Printing/Add new Photo Size/Page_JOM 3.0  Photo Size/input_name'), 
    '4R')

WebUI.setText(findTestObject('JOM - Back End/Product Printing/Add new Photo Size/Page_JOM 3.0  Photo Size/input_ratio_width'), 
    '2')

WebUI.setText(findTestObject('JOM - Back End/Product Printing/Add new Photo Size/Page_JOM 3.0  Photo Size/input_ratio_height'), 
    '3')

WebUI.click(findTestObject('JOM - Back End/Product Printing/Add new Photo Size/Page_JOM 3.0  Photo Size/button_Save'))

not_run: WebUI.click(findTestObject('JOM - Back End/Product Printing/Add new Photo Size/Page_JOM 3.0  Photo Size/a_6'))

not_run: WebUI.click(findTestObject('JOM - Back End/Product Printing/Add new Photo Size/Page_JOM 3.0  Photo Size/td_4R'))

WebUI.click(findTestObject('JOM - Back End/Product Printing/Add new Photo Size/Page_JOM 3.0  Photo Size/a_Administrator'))

WebUI.click(findTestObject('JOM - Back End/Product Printing/Add new Photo Size/Page_JOM 3.0  Photo Size/a_Sign Out'))

not_run: WebUI.closeBrowser()

