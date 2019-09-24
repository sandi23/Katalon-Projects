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

WebUI.scrollToElement(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template/span_Product Studio'), 
    2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template/span_Product Studio'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template/span_Template'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template/span_Template (1)'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template/a_Add New'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template/span_Type'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template/input_select2-search__field'), 
    'testing')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('JOM - Back End/Product Studio/Add New Template/input_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template/input_name'), 'Katalon Testing')

WebUI.uploadFile(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template/input_link_upload'), 'C:\\Users\\Sandi\\Pictures\\Screenshots\\Screenshot (8).png')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('JOM - Back End/Product Studio/Add New Template/button_Save'), 2)

WebUI.click(findTestObject('JOM - Back End/Product Studio/Add New Template/photo size'))

WebUI.setText(findTestObject('JOM - Back End/Product Studio/Add New Template/input photo size'), '4R')

WebUI.sendKeys(findTestObject('JOM - Back End/Product Studio/Add New Template/input photo size'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('JOM - Back End/Product Studio/Add New Template/add frame'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(10)

WebUI.click(findTestObject('JOM - Back End/Product Studio/Add New Template/add box'))

WebUI.delay(4)

WebUI.setText(findTestObject('JOM - Back End/Product Studio/Add New Template/input_vertical'), '3')

WebUI.setText(findTestObject('JOM - Back End/Product Studio/Add New Template/input_horizontal'), '3')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template/button_Save'))

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template/ikon delete'))

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Template/button delete'))

WebUI.verifyElementPresent(findTestObject('JOM - Back End/Product Studio/Add New Template/validasi berhasil'), 5)

