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

'Simulasi membuka browser, input URL, menunggu webpage loading (bukan TC01)'
WebUI.openBrowser('http://danamas.stagingapps.net/#/')

'Simulasi klik button \'Masuk\' (bukan TC01)'
WebUI.click(findTestObject('Danamas - Front End/Dashboard Peminjam/OR Menampilkan page dashboard/Page_danamas/a_Masuk'))

'Simulasi input email (bukan TC01)'
WebUI.setText(findTestObject('Danamas - Front End/Dashboard Peminjam/OR Menampilkan page dashboard/Page_danamas/input_email'), 
    'test.wgs01@gmail.com')

'Simulasi input password (bukan TC01)'
WebUI.setText(findTestObject('Danamas - Front End/Dashboard Peminjam/OR Menampilkan page dashboard/Page_danamas/input_password_login'), 
    'P@ssword123')

'Simulasi klik button Login (bukan TC01)'
WebUI.click(findTestObject('Danamas - Front End/Dashboard Peminjam/OR Menampilkan page dashboard/Page_danamas/button_Login'))

'Verifikasi muncul text menyambut user sebagai Peminjam'
WebUI.verifyElementVisible(findTestObject('Danamas - Front End/Dashboard Peminjam/OR Menampilkan page dashboard/Page_danamas/p_Selamat datang di Danamas'))

'Verifikasi menutup browser'
WebUI.closeBrowser()

