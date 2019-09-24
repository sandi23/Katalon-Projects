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

WebUI.callTestCase(findTestCase('JOM - Back End/Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Setting store 2/span_Store Management'))

WebUI.delay(2)

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Store/span_Order (SPV)'))

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Order/a_Add New'))

WebUI.waitForElementVisible(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/span_Customer'), 
    0)

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/span_Customer'))

WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
    'Ali Saputra')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/span_Order Type'))

WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
    'Printing')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

not_run: WebUI.uploadFile(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/button_Browse Images'), 
    'C:\\Users\\ALIMSAPUTRA\\Downloads\\pictures\\cetakan\\5 R.png')

CustomKeywords.'WebUICustomKeyword.uploadFile'(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/button_Browse Images'), 
    'C:\\Users\\ALIMSAPUTRA\\Downloads\\pictures\\cetakan\\5 R.png')

WebUI.delay(12)

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_cqt-retail'))

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/span_Product Printing Retail (1)'))

WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field (1)'), 
    'Cetak Photo 4R Instan')

WebUI.delay(4)

WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/span_Color (1)'))

WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field (1)'), 
    'Black and White')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_form-control input-print'), 
    '1')

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/button_Setting Image'))

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/span_Product Printing Retail'))

WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field_1'), 
    'Cetak Photo 16R - JPOP')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field_1'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/span_Color'))

WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field_1'), 
    'Black and White')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field_1'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/input_product_printing_retail_ - print'), 
    '1')

WebUI.delay(1)

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/a_btn btn-success btn-block bt'))

WebUI.click(findTestObject('JOM - Back End/Store Management/OR Order (SPV) - Product Printing - Retail (NO Print With Same Size) Delivery Store/Page_JOM 3.0  Add New Shipping Cost/button_Add To List'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/OR Order (SPV) - Product Merchandise - Delivery Address/Page_JOM 3.0  Add New Shipping Cost/button_Save'))

