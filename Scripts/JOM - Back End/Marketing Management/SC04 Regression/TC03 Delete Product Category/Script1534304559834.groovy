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

'PENTING'
WebUI.comment('Sebelum dirun, Add New product category dengan nama "TEST_DELETE_PRODUCT_CATEGORY" di row 10 page 1')

'Simulasi login'
WebUI.callTestCase(findTestCase('JOM - Back End/User Management/SC99 Regression/TC01 Login As admin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Simulasi scroll ke menu \'Marketing Management\''
WebUI.scrollToElement(findTestObject('Object Repository/JOM - Back End/Marketing Management/Delete Product Category/Page_JOM 3.0  Dashboard/span_Marketing Management'), 
    1)

'Simulasi klik menu \'Marketing Management\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Marketing Management/Delete Product Category/Page_JOM 3.0  Dashboard/span_Marketing Management'))

'Simulasi klik submenu \'Product Category\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Marketing Management/Delete Product Category/Page_JOM 3.0  Dashboard/span_Product Category'))

'Simulasi klik button Delete pada salah satu data'
WebUI.click(findTestObject('JOM - Back End/Marketing Management/Delete Product Category/Page_JOM 3.0  Product Category/a_btn btn-danger btn-xs bs-too'))

'Simulasi klik button konfirmasi \'Delete\''
WebUI.click(findTestObject('JOM - Back End/Marketing Management/Delete Product Category/Page_JOM 3.0  Product Category/button_Delete'))

'Verifikasi notifikasi muncul bahwa data telah didelete'
WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Back End/Marketing Management/Delete Product Category/Page_JOM 3.0  Product Category/div_Data has been successfully'))

'Verifikasi tabel telah diupdate\r\n'
WebUI.verifyElementNotPresent(findTestObject('Object Repository/JOM - Back End/Marketing Management/Delete Product Category/Page_JOM 3.0  Product Category/td_TEST_DELETE_PRODUCT_CATEGOR'), 
    1)

