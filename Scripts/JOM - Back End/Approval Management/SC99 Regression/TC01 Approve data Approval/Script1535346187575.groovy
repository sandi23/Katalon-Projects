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

'HARAP DIBACA'
WebUI.comment('Sebelum dijalankan, pastikan item yang akan diapprove berada di row 1')

'Simulasi login'
WebUI.callTestCase(findTestCase('JOM - Back End/User Management/SC99 Regression/TC01 Login As admin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Simulasi mouse scroll ke menu \'Approval Management\''
WebUI.scrollToElement(findTestObject('JOM - Back End/Approval Management/OR Approve data Approval/Page_JOM 3.0  Dashboard/span_Approval Management'), 
    1)

'Simulasi klik menu \'Approval Management\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Approval Management/OR Approve data Approval/Page_JOM 3.0  Dashboard/span_Approval Management'))

'Simulasi klik submenu \'Approval\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Approval Management/OR Approve data Approval/Page_JOM 3.0  Dashboard/span_Approval'))

'Simulasi klik button Approve (checkmark)'
WebUI.click(findTestObject('Object Repository/JOM - Back End/Approval Management/OR Approve data Approval/Page_JOM 3.0  Approval/a_btn btn-primary btn-xs bs-to'))

'Simulasi klik button \'Approve\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Approval Management/OR Approve data Approval/Page_JOM 3.0  Approval/button_Approve'))

'Verifikasi muncul notifikasi data berhasil di-approve'
WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Back End/Approval Management/OR Approve data Approval/Page_JOM 3.0  Approval/div_Data has been successfully'))

