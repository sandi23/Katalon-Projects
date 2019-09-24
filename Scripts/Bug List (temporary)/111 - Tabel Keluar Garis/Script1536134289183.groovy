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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://jonas-beta.stagingapps.net/cashier-login')

WebUI.setText(findTestObject('JOM - Front End/FE POS/OR Pembayaran Downpayment Order Reservasi/Page_JOM 3.0  Sign In/input_username'), 
    'dianicashier')

WebUI.setText(findTestObject('JOM - Front End/FE POS/OR Pembayaran Downpayment Order Reservasi/Page_JOM 3.0  Sign In/input_password'), 
    'P@ssw0rd')

WebUI.click(findTestObject('JOM - Front End/FE POS/OR Pembayaran Downpayment Order Reservasi/Page_JOM 3.0  Sign In/button_Sign In'))

WebUI.click(findTestObject('JOM - Front End/FE POS/OR Pembayaran Downpayment Order Reservasi/Page_JOM 3.0  Payment Transaction/span_Payment Transaction'))

WebUI.click(findTestObject('JOM - Front End/FE POS/OR Pembayaran Downpayment Order Reservasi/Page_JOM 3.0  Payment Transaction/button_Customer'))

WebUI.setText(findTestObject('JOM - Front End/FE POS/OR Pembayaran Downpayment Order Reservasi/Page_JOM 3.0  Payment Transaction/input_form-control input-sm'), 
    'Ali')

WebUI.click(findTestObject('JOM - Front End/FE POS/OR Pembayaran Downpayment Order Reservasi/Page_JOM 3.0  Payment Transaction/td_Riansyah Ramdani S.'))

WebUI.click(findTestObject('JOM - Front End/FE POS/OR Pembayaran Downpayment Order Reservasi/Page_JOM 3.0  Payment Transaction/button_Order Process'))

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

