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

WebUI.openBrowser('')

WebUI.maximizeWindow()

not_run: WebUI.executeJavaScript('window.open();', [])

not_run: currentWindow = WebUI.getWindowIndex()

//Go in to new tab
not_run: WebUI.switchToWindowIndex(currentWindow + 1)

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

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.waitForElementClickable(findTestObject('JOM - Front End/FE POS/OR Pembayaran Downpayment Order Reservasi/Page_JOM 3.0  Payment Transaction/i_glyphicon glyphicon glyphico'), 
    0)

not_run: WebUI.click(findTestObject('JOM - Front End/FE POS/OR Pembayaran Downpayment Order Reservasi/Page_JOM 3.0  Payment Transaction/i_glyphicon glyphicon glyphico'))

WebUI.click(findTestObject('JOM - Front End/FE POS/OR Pembayaran Downpayment Order Reservasi/Page_JOM 3.0  Payment Transaction/button_Finish'))

WebUI.scrollToElement(findTestObject('JOM - Front End/FE POS/OR Pembayaran Downpayment Order Reservasi/Page_JOM 3.0  Payment Transaction/img'), 
    0)

WebUI.click(findTestObject('JOM - Front End/FE POS/OR Pembayaran Downpayment Order Reservasi/Page_JOM 3.0  Payment Transaction/img'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('JOM - Front End/FE POS/OR Pembayaran Downpayment Order Reservasi/Page_JOM 3.0  Payment Transaction/input_pos1type11amount'), 
    Keys.chord(Keys.ENTER))

not_run: WebUI.scrollToPosition(0, 0)

not_run: WebUI.click(findTestObject('JOM - Front End/FE POS/OR Pembayaran Downpayment Order Reservasi/Page_JOM 3.0  Payment Transaction/a_Submit'))

not_run: WebUI.closeBrowser()

