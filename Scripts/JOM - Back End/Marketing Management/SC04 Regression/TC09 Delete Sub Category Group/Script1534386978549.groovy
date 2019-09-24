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

WebUI.comment('Sebelum dirun, harap add new Sub Category Group bernama \'TEST_DELETE_SUBCATEGORY_GROUP\' dulu')

'Simulasi login'
WebUI.callTestCase(findTestCase('JOM - Back End/User Management/SC99 Regression/TC01 Login As admin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Simulasi mouse scroll ke menu \'Marketing Management\''
WebUI.scrollToElement(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Delete Sub Category Group/Page_JOM 3.0  Dashboard/span_Marketing Management'), 
    1)

'Simulasi klik menu \'Marketing Management\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Delete Sub Category Group/Page_JOM 3.0  Dashboard/span_Marketing Management'))

'Simulasi klik submenu \'Sub Category Group\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Delete Sub Category Group/Page_JOM 3.0  Dashboard/span_Sub Category Group'))

'Simulasi klik button Delete pada salah satu data\r\n'
WebUI.click(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Delete Sub Category Group/Page_JOM 3.0  Sub Category Group/a_btn btn-danger btn-xs bs-too'))

'Simulasi klik button konfirmasi \'Delete\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Delete Sub Category Group/Page_JOM 3.0  Sub Category Group/button_Delete'))

'Verifikasi muncul notifikasi data telah didelete'
WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Delete Sub Category Group/Page_JOM 3.0  Sub Category Group/div_Data has been successfully'))

'Verifikasi data telah didelete'
WebUI.verifyElementNotPresent(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Delete Sub Category Group/Page_JOM 3.0  Sub Category Group/td_TEST_DELETE_SUBCATEGORY_GRO'), 
    1)

