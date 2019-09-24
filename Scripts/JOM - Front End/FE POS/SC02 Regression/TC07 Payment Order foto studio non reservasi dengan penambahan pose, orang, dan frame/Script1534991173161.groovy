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

'Simulasi buka browser, input URL, tunggu webpage loading'
WebUI.openBrowser('http://jonas-beta.stagingapps.net/cashier-login')

'Simulasi membesarkan window'
WebUI.maximizeWindow()

'Simulasi input username'
WebUI.setText(findTestObject('JOM - Front End/FE POS/OR Payment order foto studio non reservasi untuk pengambilan di store/Page_JOM 3.0  Sign In/input_username'), 
    'dianicashier')

'Simulasi input password'
WebUI.setText(findTestObject('JOM - Front End/FE POS/OR Payment order foto studio non reservasi untuk pengambilan di store/Page_JOM 3.0  Sign In/input_password'), 
    'P@ssw0rd')

'Simulasi klik button Login'
WebUI.click(findTestObject('JOM - Front End/FE POS/OR Payment order foto studio non reservasi untuk pengambilan di store/Page_JOM 3.0  Sign In/button_Sign In'))

'Simulasi klik tab \'Payment Transaction\''
WebUI.click(findTestObject('JOM - Front End/FE POS/OR Payment order foto studio non reservasi untuk pengambilan di store/Page_JOM 3.0  Payment Transaction/a_Payment Transaction'))

'Simulasi klik button \'Customer\''
WebUI.click(findTestObject('JOM - Front End/FE POS/OR Payment order foto studio non reservasi untuk pengambilan di store/Page_JOM 3.0  Payment Transaction/button_Customer'))

WebUI.setText(findTestObject('JOM - Front End/FE POS/OR Payment Order Foto Studio Reservasi/Page_JOM 3.0  Payment Transaction/input_form-control input-sm'), 
    'Ali')

WebUI.click(findTestObject('JOM - Front End/FE POS/OR Payment Order Foto Studio Reservasi/Page_JOM 3.0  Payment Transaction/td_Ali Saputra'))

'Beri jeda memilih Customer'
not_run: WebUI.delay(15)

'Simulasi klik page 4 pada table Customer'
not_run: WebUI.click(findTestObject('JOM - Front End/FE POS/OR Payment order foto studio non reservasi untuk pengambilan di store/Page_JOM 3.0  Payment Transaction/a_4'))

'Simulasi klik Customer bernama \'Test Beta\''
not_run: WebUI.click(findTestObject('JOM - Front End/FE POS/OR Payment order foto studio non reservasi untuk pengambilan di store/Page_JOM 3.0  Payment Transaction/td_Test Beta'))

'Simulasi klik button \'Order Process\''
WebUI.click(findTestObject('JOM - Front End/FE POS/OR Payment order foto studio non reservasi untuk pengambilan di store/Page_JOM 3.0  Payment Transaction/button_Order Process'))

'Beri jeda untuk memilih item order dengan penambahan pose, orang, dan frame'
WebUI.delay(15)

'Simulasi klik button \'Finish\''
WebUI.click(findTestObject('JOM - Front End/FE POS/OR Payment order foto studio non reservasi untuk pengambilan di store/Page_JOM 3.0  Payment Transaction/button_Finish'))

'Simulasi klik button \'Cash Banda\''
WebUI.doubleClick(findTestObject('JOM - Front End/FE POS/OR Payment order foto studio non reservasi untuk pengambilan di store/Page_JOM 3.0  Payment Transaction/div_1 - Cash - Banda'))

'Simulasi input harga order'
WebUI.setText(findTestObject('JOM - Front End/FE POS/OR Payment order foto studio non reservasi untuk pengambilan di store/Page_JOM 3.0  Payment Transaction/input_pos1type11amount'), 
    '355000')

WebUI.scrollToPosition(0, 0)

'Simulasi klik button \'Submit\''
WebUI.doubleClick(findTestObject('JOM - Front End/FE POS/OR Payment order foto studio non reservasi untuk pengambilan di store/Page_JOM 3.0  Payment Transaction/a_Submit'))

'Beri jeda untuk melihat hasil submit'
WebUI.delay(20)

not_run: WebUI.click(findTestObject('JOM - Front End/FE POS/OR Payment order foto studio non reservasi untuk pengambilan di store/Page_JOM 3.0  Payment Transaction/span_Log Off'))

'Simulasi tutup browser'
not_run: WebUI.closeBrowser()

