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

WebUI.click(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Dashboard/span_Store Management'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Dashboard/span_Order (SPV)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Order/a_Add New'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Add New Shipping Cost/span_select2-selection__arrow'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
    'Belinda')

WebUI.delay(4)

WebUI.sendKeys(findTestObject('Bug List/541/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Add New Shipping Cost/span_select2-selection__arrow_1'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
    'Printing')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Bug List/541/Page_JOM 3.0  Add New Shipping Cost/button_Browse Images'))

not_run: WebUI.click(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Add New Shipping Cost/button_Save'))

not_run: WebUI.delay(2)

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Dashboard/validasi sukses'), 
    3)

not_run: WebUI.click(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Order/a_btn btn-success btn-xs bs-to'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Dashboard/close'))

not_run: WebUI.uploadFile(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Add New Shipping Cost/button_Browse Images'), 
    'C:\\Users\\Sandi\\Pictures\\jom.png')

CustomKeywords.'WebUICustomKeyword.uploadFile'(findTestObject('Bug List/541/Page_JOM 3.0  Add New Shipping Cost/button_Browse Images'), 
    'C:\\Users\\Sandi\\Pictures\\jom.png')

WebUI.scrollToElement(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Add New Shipping Cost/button_Browse Images'), 
    1)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Add New Shipping Cost/input_cqt-retail'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Add New Shipping Cost/span_select2-selection__arrow_2'))

WebUI.setText(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
    '4r')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Add New Shipping Cost/span_select2-selection__arrow_3'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
    'sep')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Bug List/541/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Add New Shipping Cost/input_form-control input-print'), 
    '2')

WebUI.click(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Add New Shipping Cost/button_Setting Image'))

WebUI.click(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Add New Shipping Cost/button_Add To List'))

WebUI.rightClick(findTestObject('Object Repository/Bug List/541/Page_JOM 3.0  Add New Shipping Cost/input_product_printing_finish_'))

