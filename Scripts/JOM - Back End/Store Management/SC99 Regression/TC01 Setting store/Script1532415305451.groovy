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

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_Store Management'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_Store'))

WebUI.delay(2)

'fungsi filter'
not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/button_Filter'))

'fungsi filter\r\n'
not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_select2-selection select2'))

not_run: WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input_filter_name'), 
    'nama')

not_run: WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input_filter_email'), 
    'email')

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_select2-selection select2'))

not_run: WebUI.doubleClick(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input_open_min'))

not_run: for (def index : (0..7)) {
    WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_glyphicon glyphicon-chevr'))
}

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_glyphicon glyphicon-chevr_1'))

not_run: for (def index : (0..15)) {
    WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_glyphicon glyphicon-chevr_2'))
}

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_glyphicon glyphicon-chevr_3'))

not_run: WebUI.doubleClick(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input_open_min_1'))

not_run: for (def index : (0..7)) {
    WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_glyphicon glyphicon-chevr'))
}

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_glyphicon glyphicon-chevr_1'))

not_run: for (def index : (0..15)) {
    WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_glyphicon glyphicon-chevr_2'))
}

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_glyphicon glyphicon-chevr_3'))

not_run: WebUI.doubleClick(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input_open_max_1'))

not_run: for (def index : (0..7)) {
    WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_glyphicon glyphicon-chevr'))
}

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_glyphicon glyphicon-chevr_1'))

not_run: for (def index : (0..15)) {
    WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_glyphicon glyphicon-chevr_2'))
}

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_glyphicon glyphicon-chevr_3'))

not_run: WebUI.doubleClick(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input_open_max'))

not_run: for (def index : (0..7)) {
    WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_glyphicon glyphicon-chevr'))
}

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_glyphicon glyphicon-chevr_1'))

not_run: for (def index : (0..15)) {
    WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_glyphicon glyphicon-chevr_2'))
}

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_glyphicon glyphicon-chevr_3'))

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/button_Filter'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/label_Active'))

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/label_Inactive'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/ikon view'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/close view'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input_form-control input-sm'), 
    's102')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/ikon edit'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input_name'), 'name')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input_email'), 'jpop@jonasphoto.co.id')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/textarea_description'), 
    'deskripsi')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/warehouse'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input fieldset'), 'warehouse')

WebUI.sendKeys(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input fieldset'), Keys.chord(
        Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/cash on hand'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input fieldset'), 'cash on hand - bip')

WebUI.sendKeys(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input fieldset'), Keys.chord(
        Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/voucher spv'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input fieldset'), 'petty cash - ho')

WebUI.sendKeys(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input fieldset'), Keys.chord(
        Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/voucher return'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input fieldset'), 'petty cash - production')

WebUI.sendKeys(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input fieldset'), Keys.chord(
        Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/default'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input fieldset'), 'test wgs')

WebUI.sendKeys(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input fieldset'), Keys.chord(
        Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/province'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input fieldset'), 'jawa timur')

WebUI.sendKeys(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input fieldset'), Keys.chord(
        Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/city'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input fieldset'), 'jember')

WebUI.sendKeys(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input fieldset'), Keys.chord(
        Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/district'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input fieldset'), 'ambulu')

WebUI.sendKeys(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input fieldset'), Keys.chord(
        Keys.ENTER))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input_postcode'), '40115')

WebUI.doubleClick(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input_open'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_glyphicon glyphicon-chevr (1)'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_glyphicon glyphicon-chevr_1 (1)'))

WebUI.doubleClick(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input_close'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_glyphicon glyphicon-chevr_2 (1)'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_glyphicon glyphicon-chevr_3 (1)'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input_studio_first_id'), 
    'BDG')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input_spare_before_reservation'), 
    '11')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input_spare_per_photoshoot'), 
    '12')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input_remaining_queues'), 
    '3')

WebUI.scrollToElement(findTestObject('JOM - Back End/Store Management/Setting store 2/a_add_location'), 2)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input_location_name'), 'store')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/textarea_address'), 'address')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input_phone'), '087765451234')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/a_add_location'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/input_main'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('JOM - Back End/Store Management/Setting store 2/span_Select Bank Account'), 0)

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/a_btn btn-primary btn-xs edit-'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_Select Bank'))

WebUI.delay(1)

WebUI.setText(findTestObject('JOM - Back End/Store Management/Setting store 2/input bank'), 'bca')

WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/Setting store 2/input bank'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_Select Bank Branch'))

WebUI.delay(1)

WebUI.setText(findTestObject('JOM - Back End/Store Management/Setting store 2/input bank'), 'bca')

WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/Setting store 2/input bank'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/span_Select Bank Account'))

WebUI.delay(1)

WebUI.setText(findTestObject('JOM - Back End/Store Management/Setting store 2/input bank'), 'dewi')

WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/Setting store 2/input bank'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/a_add_bank_account'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/button_Save'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/Setting store 2/a_Close'))

