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

WebUI.scrollToElement(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Dashboard/span_Product Printing'), 
    0)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Dashboard/span_Product Printing'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Dashboard/span_Printing Eceran'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Printing Eceran/input_form-control input-sm'), 
    'Dummy pemotretan 10 shoot')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Printing Eceran/i_fa fa-edit fa-lg'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/input_name'), 
    'Copy Paket Studio Action 8 & 10')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/span_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/input_select2-search__field'), 
    'copy paket studio')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/span_select2-selection__arrow_1'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/input_select2-search__field'), 
    '30x60cm Vertikal')

WebUI.sendKeys(findTestObject('JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/span_select2-selection__arrow_1_1'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/input_select2-search__field'), 
    'Photo')

WebUI.sendKeys(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/label_Yes'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/span_select2-selection__arrow_2'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/input_select2-search__field'), 
    'Direct Printing Copy Paket Studio')

WebUI.sendKeys(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/Weight'), 
    '1500')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/ins_iCheck-helper'))

not_run: WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/input_select2-search__field'), 
    'color')

not_run: WebUI.sendKeys(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/ins_iCheck-helper_1'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/textarea_description'), 
    'Ini adalah deskripsi')

WebUI.uploadFile(findTestObject('JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/Upload File'), 
    'C:\\Users\\ALIMSAPUTRA\\Downloads\\pictures\\cetakan\\4 R.png')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/a_Next'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/ins_iCheck-helper_2'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/a_Next'))

WebUI.click(findTestObject('JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/label_Variable (1)'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/a_Next'))

WebUI.click(findTestObject('JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/ins_iCheck-helper_4'))

WebUI.waitForElementClickable(findTestObject('JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/span_select2-selection__arrow_3'), 
    0)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/span_select2-selection__arrow_3'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/input_select2-search__field'), 
    'Cetak Kanvas')

WebUI.sendKeys(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/input_qty'), 
    '50')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/button_Add'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Printing/OR Edit Printing Eceran - All Customers/Page_JOM 3.0  Edit Printing Eceran/a_Close'))

not_run: WebUI.closeBrowser()

