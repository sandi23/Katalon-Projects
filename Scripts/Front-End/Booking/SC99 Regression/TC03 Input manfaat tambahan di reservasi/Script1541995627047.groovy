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

WebUI.delay(2)

'Scroll kebawah'
WebUI.scrollToPosition(530, 1240, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Klik Pilih Paket pada salah satu Paket'
WebUI.click(findTestObject('Front-End/OR Booking/OR Input manfaat tambahan di reservasi/button_PILIH PAKET'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Klik Button Pesan Sekarang'
WebUI.click(findTestObject('Front-End/OR Booking/OR Input manfaat tambahan di reservasi/a_Pesan Sekarang'))

'Edit Asuransi'
WebUI.click(findTestObject('Front-End/OR Booking/OR Reservasi Mobil/Page_Detail Order/a_Ubah - manfaat tambahan'))

'Pilih Title'
WebUI.selectOptionByValue(findTestObject('Front-End/OR Booking/OR Input manfaat tambahan di reservasi/select_Tuan'), 'Ny.', 
    true)

'Input Nama Depan'
WebUI.setText(findTestObject('Front-End/OR Booking/OR Input manfaat tambahan di reservasi/input_Nama Depan_form-control'), 
    'Belinda Natalia')

'Scroll kebawah'
WebUI.scrollToElement(findTestObject('Front-End/OR Booking/OR Input manfaat tambahan di reservasi/button_Simpan'), 0)

'Klik field Birthday'
WebUI.click(findTestObject('Front-End/OR Booking/OR Input manfaat tambahan di reservasi/input_Tanggal Lahir_form-date-'))

'Ganti tanggal'
WebUI.click(findTestObject('Front-End/OR Booking/OR Input manfaat tambahan di reservasi/span_2'))

'Save Editan Asuransi'
WebUI.click(findTestObject('Front-End/OR Booking/OR Input manfaat tambahan di reservasi/button_Simpan'))

WebUI.scrollToPosition(610, 970)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

'klik ubah pada bagian lokasi penjemputan\r\n'
WebUI.click(findTestObject('Front-End/OR Booking/OR Reservasi Mobil/div_Ubah - lokasi penjemputan'))

WebUI.delay(3)

'Klik tombol simpan'
WebUI.click(findTestObject('Front-End/OR Booking/OR Reservasi Mobil/button_Simpan - lokasi penjemputan'))

'Klik Button Lanjutkan Pesanan'
WebUI.click(findTestObject('Front-End/OR Booking/OR Input manfaat tambahan di reservasi/a_LANJUTKAN PESANAN'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Klik Button Setuju Aturan & Kebijakan'
WebUI.click(findTestObject('Front-End/OR Booking/OR Input manfaat tambahan di reservasi/button_Setuju'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Klik Button Yes Konfirmasi'
WebUI.click(findTestObject('Front-End/OR Booking/OR Input manfaat tambahan di reservasi/button_Yes'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Front-End/OR Booking/OR Input manfaat tambahan di reservasi/h2_Sukses'))

'Verify Reservasi Berhasil Masuk Cart'
WebUI.verifyElementVisible(findTestObject('Front-End/OR Booking/OR Input manfaat tambahan di reservasi/div_Mobil berhasil dimasukan k'))

