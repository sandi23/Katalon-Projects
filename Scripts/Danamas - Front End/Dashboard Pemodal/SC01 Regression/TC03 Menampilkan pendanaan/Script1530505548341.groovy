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

'Simulasi membuka browser, input URL, menunggu webpage loading (bukan TC03)'
WebUI.openBrowser('http://danamas.stagingapps.net/#/')

'Simulasi klik button \'Masuk\' (bukan TC03)'
WebUI.click(findTestObject('Danamas - Front End/Dashboard Pemodal/OR Menampilkan page dashboard/Page_danamas/a_Masuk'))

'Simulasi input email (bukan TC03)'
WebUI.setText(findTestObject('Danamas - Front End/Dashboard Pemodal/OR Menampilkan page dashboard/Page_danamas/input_email'), 'test.wgs02@gmail.com')

'Simulasi input password (bukan TC03)'
WebUI.setText(findTestObject('Danamas - Front End/Dashboard Pemodal/OR Menampilkan page dashboard/Page_danamas/input_password_login'), 'P@ssword123')

'Simulasi klik button Login (bukan TC03)'
WebUI.click(findTestObject('Danamas - Front End/Dashboard Pemodal/OR Menampilkan page dashboard/Page_danamas/button_Login'))

' Simulasi klik gambar \'danamas\' (bukan TC03)'
WebUI.click(findTestObject('Danamas - Front End/Dashboard Pemodal/OR Menampilkan page dashboard/Page_danamas/img'))

'Simulasi klik button menu \'Akun Saya\''
WebUI.click(findTestObject('Danamas - Front End/Dashboard Pemodal/OR Menampilkan page dashboard/Page_danamas/a_Akun Saya'))

'Simulasi klik pilihan \'Dashboard\''
WebUI.click(findTestObject('Danamas - Front End/Dashboard Pemodal/OR Menampilkan page dashboard/Page_danamas/a_Dashboard'))

'Simulasi klik tab pendanaan'
WebUI.doubleClick(findTestObject('Danamas - Front End/Dashboard Pemodal/OR Menampilkan pendanaan/Page_danamas/a_Pendanaan'))

'Verifikasi muncul tab dengan title \'Daftar Peminjaman\''
WebUI.verifyElementVisible(findTestObject('Danamas - Front End/Dashboard Pemodal/OR Menampilkan pendanaan/Page_danamas/h1_Daftar Peminjaman'))

'Verifikasi muncul div Daftar Peminjaman'
WebUI.verifyElementVisible(findTestObject('Danamas - Front End/Dashboard Pemodal/OR Menampilkan pendanaan/Page_danamas/div_Daftar Peminjam yang telah'))

'Verifikasi menutup browser'
WebUI.closeBrowser()

