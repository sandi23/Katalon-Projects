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

'Mohon dibaca sebelum dirun'
WebUI.comment('Hanya akan berjalan bila user FE pada row 6 page 7 statusnya deactivated')

'Simulasi login'
WebUI.callTestCase(findTestCase('JOM - Back End/User Management/SC99 Regression/TC01 Login As admin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Simulasi mouse scroll ke menu \'User Management\''
WebUI.scrollToElement(findTestObject('Bug List/525 - Ketika aktivasi user error/Page_JOM 3.0  Dashboard/span_User Management'), 
    1)

'Simulasi klik menu \'User Management\''
WebUI.click(findTestObject('Bug List/525 - Ketika aktivasi user error/Page_JOM 3.0  Dashboard/span_User Management'))

'Simulasi klik submenu \'User Registration\''
WebUI.click(findTestObject('Bug List/525 - Ketika aktivasi user error/Page_JOM 3.0  Dashboard/span_User Registration'))

'Simulasi klik submenu \'User Frontend\''
WebUI.click(findTestObject('Bug List/525 - Ketika aktivasi user error/Page_JOM 3.0  User Backend/span_User Frontend'))

'Simulasi klik page 7'
WebUI.click(findTestObject('Bug List/525 - Ketika aktivasi user error/Page_JOM 3.0  User Frontend/a_7'))

'Simulasi klik button Activate pada user row ke-6'
WebUI.click(findTestObject('Bug List/525 - Ketika aktivasi user error/Page_JOM 3.0  User Frontend/a_btn btn-success btn-xs bs-to'))

'Simulasi klik button \'Activate\''
WebUI.click(findTestObject('Bug List/525 - Ketika aktivasi user error/Page_JOM 3.0  User Frontend/button_Activate'))

'Verifikasi muncul notifkasi user berhasil diaktivasi'
WebUI.verifyElementVisible(findTestObject('Bug List/525 - Ketika aktivasi user error/Page_JOM 3.0  User Frontend/div_User frontend has been suc'))

