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

'Buka browser'
WebUI.openBrowser('')

'Maximize window'
WebUI.maximizeWindow()

'Akses Url'
WebUI.navigateToUrl('https://stg.movic.id/home')

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/a_Masuk (1)'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/input_EmailNomor Handphone_for'), 
    'belinda.natalia@wgs.co.id')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/input_Password_form-control ng'), 
    'P@ssw0rd')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/button_MASUK'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Masukkan Field Search'
WebUI.setText(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/input_Next_form-input-search h'), 
    'Bandung')

'Pilih Opsi Kota'
WebUI.click(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/div_Bandung'))

'Pilih Tanggal Awal'
WebUI.click(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/span_16'))

'Pilih Tanggal Akhir'
WebUI.click(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/span_17'))

'Pilih Car Only'
WebUI.click(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/label_Car Only'))

'Klik Button Cari'
WebUI.click(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/button_Cari'))

'Scroll kebawah'
WebUI.scrollToPosition(780, 380)

'Pilih Mobil utk View Detail'
WebUI.click(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/h5_JAZZ'))

WebUI.delay(2)

WebUI.delay(2)

'Scroll kebawah'
WebUI.scrollToPosition(530, 1240, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Klik Pilih Paket pada salah satu Paket'
WebUI.click(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/button_PILIH PAKET'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Klik Button Pesan Sekarang'
WebUI.click(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/a_Pesan Sekarang'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToPosition(610, 970)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

'Klik Edit Lokasi Pengembalian'
WebUI.click(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/a_Edit_1 (1)'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Scroll kebawah'
WebUI.scrollToElement(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/button_Simpan (2)'), 
    0)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Klik Field Lokasi'
WebUI.click(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/input_Report a map error_searc (1)'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Pilih Use Current Location'
WebUI.click(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/a_Use Current Location (1)'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Klik Button Simpan Lokasi Pengambilan'
WebUI.click(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/button_Simpan (2)'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Klik Button Lanjutkan Pesanan'
WebUI.click(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/a_LANJUTKAN PESANAN'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Klik Button Setuju Aturan & Kebijakan'
WebUI.click(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/button_Setuju'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Klik Button Yes Konfirmasi'
WebUI.click(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/button_Yes'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/h2_Sukses'))

'Verify Reservasi Berhasil Masuk Cart'
WebUI.verifyElementVisible(findTestObject('Front-End/OR Booking/OR Ubah lokasi pengembalian di reservasi/div_Mobil berhasil dimasukan k'))

