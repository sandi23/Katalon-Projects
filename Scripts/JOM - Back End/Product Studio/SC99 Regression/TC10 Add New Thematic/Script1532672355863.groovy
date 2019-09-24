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

WebUI.scrollToElement(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Thematic/span_Product Studio'), 
    2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Thematic/span_Product Studio'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Thematic/span_Template'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Thematic/span_Thematics'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Thematic/a_Add New (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Thematic/span_Type (1)'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Thematic/input_select2-search__field (1)'), 
    'testing')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('JOM - Back End/Product Studio/Add New Thematic/input_select2-search__field (1)'), Keys.chord(
        Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Thematic/span_Template (2)'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Thematic/input_select2-search__field (1)'), 
    'katalon')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('JOM - Back End/Product Studio/Add New Thematic/input_select2-search__field (1)'), Keys.chord(
        Keys.ENTER))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Thematic/input_name (1)'), 'Tematik Testing')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Thematic/textarea_description'), 'Deskripsi')

WebUI.uploadFile(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Thematic/input_images1'), 'C:\\Users\\Sandi\\Pictures\\png.png')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Thematic/input_image_description'), 
    'deskripsi image 1')

WebUI.uploadFile(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Thematic/input_images2'), 'C:\\Users\\Sandi\\Pictures\\png.png')

WebUI.delay(2)

WebUI.setText(findTestObject('JOM - Back End/Product Studio/Add New Thematic/image description 2'), 'deskripsi image 2')

WebUI.delay(2)

not_run: WebUI.scrollToElement(findTestObject('JOM - Back End/Product Studio/Add New Thematic/button_Replace'), 0)

not_run: WebUI.uploadFile(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Thematic/button_Replace'), 
    'C:\\Users\\Sandi\\Pictures\\500.png')

not_run: WebUI.delay(2)

not_run: WebUI.uploadFile(findTestObject('JOM - Back End/Product Studio/Add New Thematic/button replace 2'), 'C:\\Users\\Sandi\\Pictures\\500.png')

not_run: WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Thematic/button_Save (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Thematic/validasi berhasil'), 
    5)

