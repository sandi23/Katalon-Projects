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

'Simulasi buka browser, input URL, loading webpage'
WebUI.openBrowser('http://jonas-beta.stagingapps.net/cashier-login')

'Simulasi besarkan window'
WebUI.maximizeWindow()

'Simulasi input username'
WebUI.setText(findTestObject('JOM - Front End/FE POS/OR Payment order printing eceran untuk dikirim ke alamat customer/Page_JOM 3.0  Sign In/input_username'), 
    'dianicashier')

'Simulasi input password'
WebUI.setText(findTestObject('JOM - Front End/FE POS/OR Payment order printing eceran untuk dikirim ke alamat customer/Page_JOM 3.0  Sign In/input_password'), 
    'P@ssw0rd')

'Simulasi klik button \'Sign In\''
WebUI.sendKeys(findTestObject('JOM - Front End/FE POS/OR Payment order printing eceran untuk dikirim ke alamat customer/Page_JOM 3.0  Sign In/input_password'), 
    Keys.chord(Keys.ENTER))

'Simulasi klik tab \'Payment Transaction\''
WebUI.click(findTestObject('JOM - Front End/FE POS/OR Payment order printing eceran untuk dikirim ke alamat customer/Page_JOM 3.0  Payment Transaction/a_Payment Transaction'))

'Simulasi klik button \'Customer\''
WebUI.click(findTestObject('JOM - Front End/FE POS/OR Payment order printing eceran untuk dikirim ke alamat customer/Page_JOM 3.0  Payment Transaction/button_Customer'))

'Beri jeda pilih Customer'
WebUI.delay(15)

'Simulasi klik link halaman ke 6'
not_run: WebUI.click(findTestObject('JOM - Front End/FE POS/OR Payment order printing eceran untuk dikirim ke alamat customer/Page_JOM 3.0  Payment Transaction/a_6'))

'Simulasi klik customer \'Test Beta\''
not_run: WebUI.click(findTestObject('JOM - Front End/FE POS/OR Payment order printing eceran untuk dikirim ke alamat customer/Page_JOM 3.0  Payment Transaction/td_Test Beta'))

'Simulasi klik button \'Order Process\''
WebUI.click(findTestObject('JOM - Front End/FE POS/OR Payment order printing eceran untuk dikirim ke alamat customer/Page_JOM 3.0  Payment Transaction/button_Order Process'))

'Beri jeda pilih paket'
WebUI.delay(15)

'Simulasi klik button \'Finish\''
WebUI.click(findTestObject('JOM - Front End/FE POS/OR Payment order printing eceran untuk dikirim ke alamat customer/Page_JOM 3.0  Payment Transaction/button_Finish'))

'Simulasi scroll webpage ke bawah'
WebUI.scrollToElement(findTestObject('JOM - Front End/FE POS/OR Payment order printing eceran untuk dikirim ke alamat customer/Page_JOM 3.0  Payment Transaction/div_1 - Cash - Banda'), 
    3)

'Simulasi klik option pembayaran \'Cash\''
WebUI.click(findTestObject('JOM - Front End/FE POS/OR Payment order printing eceran untuk dikirim ke alamat customer/Page_JOM 3.0  Payment Transaction/div_1 - Cash - Banda'))

'Beri jeda webpage loading'
WebUI.delay(3)

'Simulasi input jumlah pembayaran'
WebUI.setText(findTestObject('JOM - Front End/FE POS/OR Payment order printing eceran untuk dikirim ke alamat customer/Page_JOM 3.0  Payment Transaction/input_pos1type11amount'), 
    '1000000')

'Simulasi scroll webpage ke atas'
WebUI.scrollToPosition(0, 0)

'Beri jeda simulasi scroll'
WebUI.delay(1)

'Simulasi klik button \'Submit\''
WebUI.click(findTestObject('JOM - Front End/FE POS/OR Payment order printing eceran untuk dikirim ke alamat customer/Page_JOM 3.0  Payment Transaction/a_Submit'))

'Beri jeda verifikasi muncul kuitansi untuk diprint'
WebUI.delay(30)

not_run: WebUI.click(findTestObject('JOM - Front End/FE POS/OR Payment order printing eceran untuk dikirim ke alamat customer/Page_JOM 3.0  Payment Transaction/span_Log Off'))

'Simulasi tutup browser'
not_run: WebUI.closeBrowser()

