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

WebUI.click(findTestObject('Bug List/534/Page_JOM 3.0  Dashboard/span_Store Management'))

WebUI.delay(2)

WebUI.click(findTestObject('Bug List/534/Page_JOM 3.0  Dashboard/span_Order (SPV)'))

WebUI.delay(2)

WebUI.click(findTestObject('Bug List/534/Page_JOM 3.0  Order/a_Add New'))

WebUI.delay(2)

WebUI.click(findTestObject('Bug List/534/Page_JOM 3.0  Add New Shipping Cost/span_select2-selection__arrow'))

WebUI.delay(2)

WebUI.setText(findTestObject('Bug List/534/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 'rian')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Bug List/534/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Bug List/534/Page_JOM 3.0  Add New Shipping Cost/span_select2-selection__arrow_1'))

WebUI.delay(2)

WebUI.setText(findTestObject('Bug List/534/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 'Merchandise')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Bug List/534/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Bug List/534/Page_JOM 3.0  Add New Shipping Cost/arrow 3'))

WebUI.delay(2)

WebUI.setText(findTestObject('Bug List/534/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 'frame')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Bug List/534/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Bug List/534/Page_JOM 3.0  Add New Shipping Cost/input_product_merchandise_tota'), 
    1)

WebUI.verifyElementPresent(findTestObject('Bug List/534/Page_JOM 3.0  Add New Shipping Cost/input_product_merchandise_tota_1'), 
    1)

WebUI.setText(findTestObject('Bug List/534/Page_JOM 3.0  Add New Shipping Cost/input_product_merchandise_qty'), '2')

WebUI.setText(findTestObject('Bug List/534/Page_JOM 3.0  Add New Shipping Cost/textarea_product_merchandise_d'), 'merchandise testing')

WebUI.scrollToElement(findTestObject('Bug List/534/Page_JOM 3.0  Add New Shipping Cost/textarea_product_merchandise_d'), 
    2)

WebUI.click(findTestObject('Bug List/534/Page_JOM 3.0  Add New Shipping Cost/a_Add to List'))

WebUI.delay(2)

WebUI.setText(findTestObject('Bug List/534/Page_JOM 3.0  Add New Shipping Cost/input_product_merchandise_fini'), '2018-08-30')

WebUI.sendKeys(findTestObject('Bug List/534/Page_JOM 3.0  Add New Shipping Cost/input_product_merchandise_fini'), Keys.chord(
        Keys.ENTER))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Bug List/534/Page_JOM 3.0  Add New Shipping Cost/button_Save'), 3)

WebUI.click(findTestObject('Bug List/534/Page_JOM 3.0  Add New Shipping Cost/button_Save'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Bug List/534/Page_JOM 3.0  Dashboard/validasi sukses'), 3)

WebUI.click(findTestObject('Bug List/534/Page_JOM 3.0  Order/a_btn btn-success btn-xs bs-to'))

WebUI.delay(5)

WebUI.click(findTestObject('Bug List/534/Page_JOM 3.0  Dashboard/close'))

