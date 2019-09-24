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

'Simulasi membuka browser, input URL, tunggu webpage loading'
WebUI.openBrowser('http://jom-demo-banda.stagingapps.net/')

'Simulasi membesarkan window browser'
WebUI.maximizeWindow()

'Memberi jeda untuk webpage selesai loading semua elemen\r\n'
WebUI.delay(5)

'Simulasi klik button menu Login'
WebUI.click(findTestObject('JOM - Front End/Order/OR Biarkan kosong/Page_Hello you look great today   J/a_Login'))

'Simulasi klik tab Daftar pada menu Login'
WebUI.click(findTestObject('JOM - Front End/Order/OR Biarkan kosong/Page_Hello you look great today   J/span_Daftar'))

'Simulasi input email'
WebUI.setText(findTestObject('JOM - Front End/Order/OR Biarkan kosong/Page_Hello you look great today   J/input_email'), 
    '')

WebUI.delay(2)

'Simulasi input nomor telepon'
WebUI.setText(findTestObject('JOM - Front End/Order/OR Biarkan kosong/Page_Hello you look great today   J/input_phone'), 
    '123945678')

'Simulasi input password\r\n'
WebUI.setText(findTestObject('JOM - Front End/Order/OR Biarkan kosong/Page_Hello you look great today   J/input_password'), 
    'test1234')

'Simulasi input konfirmasi password\r\n'
WebUI.setText(findTestObject('JOM - Front End/Order/OR Biarkan kosong/Page_Hello you look great today   J/input_password_confirmation'), 
    'test1234')

'Simulasi klik button daftar'
WebUI.click(findTestObject('JOM - Front End/Order/OR Biarkan kosong/Page_Hello you look great today   J/button_Daftar'))

'Verifikasi muncul notifikasi email harus diisi pada label Email'
WebUI.verifyElementVisible(findTestObject('JOM - Front End/Order/OR Biarkan kosong/Page_Hello you look great today   J/label_Email'))

'Verifikasi tidak bisa klik button Selesai'
WebUI.verifyElementNotInViewport(findTestObject('JOM - Front End/Order/OR Biarkan kosong/Page_Hello you look great today   J/button_Selesai'), 
    2)

'Simulasi tutup browser'
WebUI.closeBrowser()

