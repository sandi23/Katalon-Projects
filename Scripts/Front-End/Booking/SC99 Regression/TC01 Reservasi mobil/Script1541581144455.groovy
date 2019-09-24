import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

not_run: WebUI.callTestCase(findTestCase('Front-End/Homepage/SC99 Regression/TC01 Cari mobil menggunakan field pencarian biasa di homepage'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'Scroll kebawah'
WebUI.scrollToPosition(530, 1240, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Klik Pilih Paket pada salah satu Paket'
WebUI.click(findTestObject('Front-End/OR Booking/OR Reservasi Mobil/button_PILIH PAKET'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Klik Button Pesan Sekarang'
WebUI.click(findTestObject('Front-End/OR Booking/OR Reservasi Mobil/a_Pesan Sekarang'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToPosition(610, 970)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Front-End/OR Booking/OR Reservasi Mobil/div_Ubah - lokasi penjemputan'))

WebUI.delay(4)

WebUI.click(findTestObject('Front-End/OR Booking/OR Reservasi Mobil/button_Simpan - lokasi penjemputan'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Klik Button Lanjutkan Pesanan'
WebUI.click(findTestObject('Front-End/OR Booking/OR Reservasi Mobil/a_LANJUTKAN PESANAN'))

'Klik Button Setuju Aturan & Kebijakan'
WebUI.click(findTestObject('Front-End/OR Booking/OR Reservasi Mobil/button_Setuju'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Klik Button Yes Konfirmasi'
not_run: WebUI.click(findTestObject('Front-End/OR Booking/OR Reservasi Mobil/button_Yes'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Front-End/OR Booking/OR Reservasi Mobil/h2_Sukses'))

'Verify Reservasi Berhasil Masuk Cart'
WebUI.verifyElementVisible(findTestObject('Object Repository/Front-End/OR Booking/OR Reservasi Mobil/div_Mobil berhasil dimasukan k'))

WebUI.delay(2)

