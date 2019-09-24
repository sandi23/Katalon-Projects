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

WebUI.click(findTestObject('Object Repository/Bug List/535/Page_JOM 3.0  Dashboard/span_Store Management'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Bug List/535/Page_JOM 3.0  Dashboard/span_Order (SPV)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Bug List/535/Page_JOM 3.0  Order/a_Add New'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Bug List/535/Page_JOM 3.0  Add New Shipping Cost/span_select2-selection__arrow'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Bug List/535/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
    'rian')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/Bug List/535/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Bug List/535/Page_JOM 3.0  Add New Shipping Cost/span_select2-selection__arrow_1'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Bug List/535/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
    'Studio')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Bug List/535/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.delay(2)

for (def index : (0..1)) {
    WebUI.scrollToElement(findTestObject('Bug List/535/Page_JOM 3.0  Add New Shipping Cost/checkpoint'), 1)

    WebUI.click(findTestObject('Bug List/535/Page_JOM 3.0  Add New Shipping Cost/span_select2-selection__arrow_2'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Bug List/535/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 'Studio')

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Bug List/535/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), Keys.chord(
            Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Bug List/535/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), Keys.chord(
            Keys.ENTER))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Bug List/535/Page_JOM 3.0  Add New Shipping Cost/input_bgd'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/Bug List/535/Page_JOM 3.0  Add New Shipping Cost/input_tmp'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Object Repository/Bug List/535/Page_JOM 3.0  Add New Shipping Cost/input_number_of_people'), 
        '9')

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/Bug List/535/Page_JOM 3.0  Add New Shipping Cost/ins_iCheck-helper'))

    WebUI.click(findTestObject('Object Repository/Bug List/535/Page_JOM 3.0  Add New Shipping Cost/span_select2-selection__arrow_3'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Object Repository/Bug List/535/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
        'cas')

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('Object Repository/Bug List/535/Page_JOM 3.0  Add New Shipping Cost/input_select2-search__field'), 
        Keys.chord(Keys.ENTER))

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/Bug List/535/Page_JOM 3.0  Add New Shipping Cost/a_Add to List'))
}

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Bug List/535/Page_JOM 3.0  Add New Shipping Cost/shipping'), 2)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Bug List/535/Page_JOM 3.0  Add New Shipping Cost/destination'), 2)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Bug List/535/Page_JOM 3.0  Add New Shipping Cost/button_Save'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Bug List/535/Page_JOM 3.0  Dashboard/validasi sukses'), 3)

WebUI.click(findTestObject('Object Repository/Bug List/535/Page_JOM 3.0  Order/a_btn btn-success btn-xs bs-to'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Bug List/535/Page_JOM 3.0  Dashboard/close'))

