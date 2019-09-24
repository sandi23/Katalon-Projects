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

'Simulasi login'
WebUI.callTestCase(findTestCase('JOM - Back End/User Management/SC99 Regression/TC01 Login As admin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Simulasi klik menu \'Store Management\''
WebUI.click(findTestObject('JOM - Back End/Store Management/OR Edit Default Queue Waiting Time/Page_JOM 3.0  Dashboard/span_Store Management'))

'Simulasi klik submenu \'Avg Waiting Time\''
WebUI.click(findTestObject('JOM - Back End/Store Management/OR Edit Default Queue Waiting Time/Page_JOM 3.0  Dashboard/span_Avg Waiting Time'))

'Simulasi klik submenu \'Default\''
WebUI.click(findTestObject('JOM - Back End/Store Management/OR Edit Default Queue Waiting Time/Page_JOM 3.0  Dashboard/span_Default'))

'Simulasi klik button \'Edit\' pada row \'Holiday\''
WebUI.click(findTestObject('JOM - Back End/Store Management/OR Edit Default Queue Waiting Time/Page_JOM 3.0  Default Queue Waiting/a_btn btn-primary btn-xs bs-to'))

'Simulasi ganti input menjadi 40'
WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Edit Default Queue Waiting Time/Page_JOM 3.0  Default Queue Waiting/input_minute'), 
    '40')

'Simulasi klik button \'Save\''
WebUI.click(findTestObject('JOM - Back End/Store Management/OR Edit Default Queue Waiting Time/Page_JOM 3.0  Default Queue Waiting/button_Save'))

'Verifikasi muncul notifikasi Avg Waiting Time berhasil diubah'
WebUI.verifyElementVisible(findTestObject('JOM - Back End/Store Management/OR Edit Default Queue Waiting Time/Page_JOM 3.0  Default Queue Waiting/div_Data has been successfully'))

'Verifikasi data pada tabel diubah'
WebUI.verifyElementVisible(findTestObject('JOM - Back End/Store Management/OR Edit Default Queue Waiting Time/Page_JOM 3.0  Default Queue Waiting/td_40'))

