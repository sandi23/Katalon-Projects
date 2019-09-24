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

WebUI.scrollToElement(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new studio sub category group/span_Product Studio'), 
    2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new studio sub category group/span_Product Studio'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new studio sub category group/span_P.Studio Categorization'), 
    2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new studio sub category group/span_P.Studio Categorization'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new studio sub category group/span_Studio Sub Category Group'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new studio sub category group/a_Add New'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new studio sub category group/span_Select Product Studio Sub'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new studio sub category group/input_select2-search__field (1)'), 
    'kategori testing')

WebUI.sendKeys(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new studio sub category group/input_select2-search__field (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new studio sub category group/input_name'), 
    'kategori group testing')

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new studio sub category group/input_image1'), 
    'C:\\Users\\Sandi\\Pictures\\500.png')

WebUI.scrollToElement(findTestObject('JOM - Back End/Product Studio/Add new studio sub category group/button_Save'), 2)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new studio sub category group/textarea_description'), 
    'deskripsi testing katalon')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new studio sub category group/button_Save'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new studio sub category group/validasi berhasil'), 
    3)

