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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('http://jonas-beta.stagingapps.net/login')

not_run: WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Add new Product Printing Sub Category/Page_JOM 3.0  Sign In/input_username'), 
    'admin')

not_run: WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Add new Product Printing Sub Category/Page_JOM 3.0  Sign In/input_password'), 
    'P@ssw0rd')

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Add new Product Printing Sub Category/Page_JOM 3.0  Sign In/button_Sign In'))

WebUI.scrollToElement(findTestObject('JOM - Back End/Product Printing/OR Add new Product Printing Sub Category/Page_JOM 3.0  Dashboard/span_Product Printing'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Add new Product Printing Sub Category/Page_JOM 3.0  Dashboard/span_Product Printing'))

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Add new Product Printing Sub Category/Page_JOM 3.0  Dashboard/span_Printing Categorization'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Add new Product Printing Sub Category/Page_JOM 3.0  Dashboard/span_Printing Sub Category'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Add new Product Printing Sub Category/Page_JOM 3.0  Product Printing Sub/a_Add New'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Add new Product Printing Sub Category/Page_JOM 3.0  Product Printing Sub/span_Select Product Printing C'))

WebUI.setText(findTestObject('JOM - Back End/Product Printing/OR Add new Product Printing Sub Category/Page_JOM 3.0  Product Printing Sub/Field category'), 
    'Test Print')

WebUI.sendKeys(findTestObject('JOM - Back End/Product Printing/OR Add new Product Printing Sub Category/Page_JOM 3.0  Product Printing Sub/Field category'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Add new Product Printing Sub Category/Page_JOM 3.0  Product Printing Sub/input_name'), 
    'Test Sub Print')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Add new Product Printing Sub Category/Page_JOM 3.0  Product Printing Sub/textarea_description'), 
    'Test Sub Print Description')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Add new Product Printing Sub Category/Page_JOM 3.0  Product Printing Sub/button_Save'))

