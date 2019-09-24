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

'Simulasi buka browser, input URL, tunggu webpage loading'
WebUI.openBrowser('jonas-beta.stagingapps.net/cashier-login')

'Simulasi input email'
WebUI.setText(findTestObject('JOM - Front End/FE POS/OR Cancel and Return Transaction Order Studio Non Reservasi untuk Pengambilan di Store/Page_JOM 3.0  Sign In/input_username'), 
    tes)

'Simulasi input password (P@ssw0rd)'
WebUI.setEncryptedText(findTestObject('JOM - Front End/FE POS/OR Cancel and Return Transaction Order Studio Non Reservasi untuk Pengambilan di Store/Page_JOM 3.0  Sign In/input_password'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

'Simulasi klik button \'Sign In\''
WebUI.click(findTestObject('JOM - Front End/FE POS/OR Cancel and Return Transaction Order Studio Non Reservasi untuk Pengambilan di Store/Page_JOM 3.0  Sign In/button_Sign In'))

'Simulasi klik tab \'Cancel & Return Transaction\''
WebUI.click(findTestObject('JOM - Front End/FE POS/OR Cancel and Return Transaction Order Studio Non Reservasi untuk Pengambilan di Store/Page_JOM 3.0  Dashboard/span_Cancel  Return Transactio'))

'Simulasi input nomor kuitansi'
WebUI.setText(findTestObject('JOM - Front End/FE POS/OR Cancel and Return Transaction Order Studio Non Reservasi untuk Pengambilan di Store/Page_JOM 3.0  Cancel Transaction/input_pos1payment_number'), 
    'RCPS10118G-000172')

'Beri jeda loading nomor kuitansi'
WebUI.delay(2)

'Simulasi scroll down, klik nomor kuitansi'
WebUI.sendKeys(findTestObject('JOM - Front End/FE POS/OR Cancel and Return Transaction Order Studio Non Reservasi untuk Pengambilan di Store/Page_JOM 3.0  Cancel Transaction/input_pos1payment_number'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

'Simulasi klik checkbox'
WebUI.click(findTestObject('JOM - Front End/FE POS/OR Cancel and Return Transaction Order Studio Non Reservasi untuk Pengambilan di Store/Page_JOM 3.0  Cancel Transaction/input_pos1product_order73retur'))

'Simulasi klik button \'Submit\''
WebUI.doubleClick(findTestObject('JOM - Front End/FE POS/OR Cancel and Return Transaction Order Studio Non Reservasi untuk Pengambilan di Store/Page_JOM 3.0  Cancel Transaction/a_Submit'))

'Simulasi input username'
WebUI.setText(findTestObject('JOM - Front End/FE POS/OR Cancel and Return Transaction Order Studio Non Reservasi untuk Pengambilan di Store/Page_JOM 3.0  Cancel Transaction/input_username'), 
    'dianichief')

'Simulasi input password'
WebUI.setEncryptedText(findTestObject('JOM - Front End/FE POS/OR Cancel and Return Transaction Order Studio Non Reservasi untuk Pengambilan di Store/Page_JOM 3.0  Cancel Transaction/input_password'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

'Simulasi klik button \'Confirm\''
WebUI.click(findTestObject('JOM - Front End/FE POS/OR Cancel and Return Transaction Order Studio Non Reservasi untuk Pengambilan di Store/Page_JOM 3.0  Cancel Transaction/button_Confirm'))

'Beri jeda untuk loading preview kuitansi pembatalan'
WebUI.delay(20)

'Simulasi tutup browser'
WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

