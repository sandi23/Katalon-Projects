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

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Add new Product Printing Category/Page_JOM 3.0  Sign In/input_username'), 
    'admin')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Add new Product Printing Category/Page_JOM 3.0  Sign In/input_password'), 
    'P@ssw0rd')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Add new Product Printing Category/Page_JOM 3.0  Sign In/button_Sign In'))

WebUI.scrollToElement(findTestObject('JOM - Back End/Product Printing/OR Add new Product Printing Category/Page_JOM 3.0  Dashboard/span_Product Printing'), 
    0)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Add new Product Printing Category/Page_JOM 3.0  Dashboard/span_Product Printing'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Add new Product Printing Category/Page_JOM 3.0  Dashboard/span_Printing Categorization'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Add new Product Printing Category/Page_JOM 3.0  Dashboard/span_Printing Category'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Add new Product Printing Category/Page_JOM 3.0  Product Printing Cate/a_Add New'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Add new Product Printing Category/Page_JOM 3.0  Product Printing Cate/input_name'), 
    'Test Print')

not_run: CustomKeywords.'WebUICustomKeyword.uploadFile'(findTestObject('JOM - Back End/Product Printing/OR Add new Product Printing Category/Page_JOM 3.0  Product Printing Cate/input_image1'), 
    'C:\\Users\\ALIMSAPUTRA\\Downloads\\pictures\\200 x 150\\1.jpg')

not_run: CustomKeywords.'WebUICustomKeyword.uploadFile'(findTestObject('JOM - Back End/Product Printing/OR Add new Product Printing Category/Page_JOM 3.0  Product Printing Cate/input_image2'), 
    'C:\\Users\\ALIMSAPUTRA\\Downloads\\pictures\\200 x 150\\2.jpg')

not_run: CustomKeywords.'WebUICustomKeyword.uploadFile'(findTestObject('JOM - Back End/Product Printing/OR Add new Product Printing Category/Page_JOM 3.0  Product Printing Cate/input_image3'), 
    'C:\\Users\\ALIMSAPUTRA\\Downloads\\pictures\\200 x 150\\3.jpg')

WebUI.uploadFile(findTestObject('JOM - Back End/Product Printing/OR Add new Product Printing Category/Page_JOM 3.0  Product Printing Cate/input_image1'), 
    'C:\\Users\\ALIMSAPUTRA\\Downloads\\pictures\\200 x 150\\1.jpg')

WebUI.uploadFile(findTestObject('JOM - Back End/Product Printing/OR Add new Product Printing Category/Page_JOM 3.0  Product Printing Cate/input_image2'), 
    'C:\\Users\\ALIMSAPUTRA\\Downloads\\pictures\\200 x 150\\2.jpg')

WebUI.uploadFile(findTestObject('JOM - Back End/Product Printing/OR Add new Product Printing Category/Page_JOM 3.0  Product Printing Cate/input_image3'), 
    'C:\\Users\\ALIMSAPUTRA\\Downloads\\pictures\\200 x 150\\3.jpg')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Add new Product Printing Category/Page_JOM 3.0  Product Printing Cate/textarea_description'), 
    'Test Print Description')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Add new Product Printing Category/Page_JOM 3.0  Product Printing Cate/button_Save'))

