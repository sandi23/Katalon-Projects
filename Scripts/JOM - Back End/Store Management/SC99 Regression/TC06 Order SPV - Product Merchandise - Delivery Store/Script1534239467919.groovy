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

WebUI.callTestCase(findTestCase('JOM - Back End/Login/Login'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Store/Setting store 2/span_Store Management'))

WebUI.delay(2)

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Store/Page_JOM 3.0  Store/span_Order (SPV)'))

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Store/Page_JOM 3.0  Order/a_Add New'))

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Store/Page_JOM 3.0  Add New Shipping Cost/span_Customer'))

WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
    'Ali Saputra')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Store/Page_JOM 3.0  Add New Shipping Cost/span_Order Type'))

WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
    'Product Merchandise')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Store/Page_JOM 3.0  Add New Shipping Cost/span_Product Merchandise'))

WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
    'Frame 10x10 Minimalis 188TM Hitam')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_product_merchandise_qty'), 
    '5')

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Store/Page_JOM 3.0  Add New Shipping Cost/a_Add to List'))

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Store/Page_JOM 3.0  Add New Shipping Cost/span_Product Merchandise_1'))

WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
    'Frame 10x10 Minimalis 188TM Hitam')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_product_merchandise_qty'), 
    '2')

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Store/Page_JOM 3.0  Add New Shipping Cost/a_Add to List'))

WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_product_merchandise_fini'), 
    '2018-08-07')

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Store/Page_JOM 3.0  Add New Shipping Cost/button_Save'))

