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

'PENTING'
WebUI.comment('Harap Add New Product Sub Category pada page 4 row 7 dengan nama TEST_PRODUCT_SUB_CATEGORY dulu sebelum ini')

'Simulasi login'
WebUI.callTestCase(findTestCase('JOM - Back End/User Management/SC99 Regression/TC01 Login As admin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Simulasi scroll mouse ke menu \'Marketing Management\''
WebUI.scrollToElement(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Edit Product Sub Category/span_Marketing Management'), 
    1)

'Simulasi klik menu \'Marketing Management\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Edit Product Sub Category/span_Marketing Management'))

'Simulasi klik submenu \'Product Sub Category\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Edit Product Sub Category/span_Product Sub Category'))

'Simulasi klik page 4'
WebUI.click(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Edit Product Sub Category/a_4'))

'Simulasi klik button edit pada data row 7, page 4'
WebUI.click(findTestObject('JOM - Back End/Marketing Management/OR Edit Product Sub Category/a_btn btn-primary btn-xs bs-to'))

'Simulasi klik dropdown \'Category\''
WebUI.click(findTestObject('JOM - Back End/Marketing Management/OR Edit Sub Category Group/Page_JOM 3.0  Sub Category Group/span_On Location Studio'))

'Beri jeda loading dropdown'
WebUI.delay(5)

'Simulasi pilih Category \'Product Merchandise Testing\''
WebUI.setText(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Edit Product Sub Category/input_Category'), 
    'Product Merchandise Testing')

'Simulasi pilih Category \'Product Merchandise Testing\''
WebUI.sendKeys(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Edit Product Sub Category/input_Category'), 
    Keys.chord(Keys.ENTER))

'Simulasi edit nama Sub Category'
WebUI.setText(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Edit Product Sub Category/input_sub_category_name'), 
    'Testing Sub Category Katalon')

'Simulasi klik button \'Save\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Edit Product Sub Category/button_Save'))

'Verifikasi notifikasi data sukses diedit muncul'
WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Edit Product Sub Category/div_Data has been successfully'))

'Simulasi klik page 4'
WebUI.click(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Edit Product Sub Category/a_4'))

'Verifikasi data diedit sesuai dengan ekspektasi'
WebUI.verifyElementVisible(findTestObject('JOM - Back End/Marketing Management/OR Edit Product Sub Category/td_Testing Sub Category Katalo'))

