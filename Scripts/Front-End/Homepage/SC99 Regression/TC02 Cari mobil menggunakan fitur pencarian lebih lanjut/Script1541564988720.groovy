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

not_run: WebUI.callTestCase(findTestCase('Front-End/User/SC99 Regression/TC04 Login Biasa with email'), [:], FailureHandling.STOP_ON_FAILURE)

'Masukkan Field Search'
WebUI.setText(findTestObject('Object Repository/Front-End/OR Homepage/OR Cari mobil menggunakan fitur pencarian lebih lanjut/input_Next_form-input-search h'), 
    'bandung')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Pilih Opsi Kota'
WebUI.click(findTestObject('Object Repository/Front-End/OR Homepage/OR Cari mobil menggunakan fitur pencarian lebih lanjut/div_Bandung'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Pilih Tanggal Awal'
WebUI.click(findTestObject('Object Repository/Front-End/OR Homepage/OR Cari mobil menggunakan fitur pencarian lebih lanjut/span_16'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Pilih Tanggal Akhir'
WebUI.click(findTestObject('Object Repository/Front-End/OR Homepage/OR Cari mobil menggunakan fitur pencarian lebih lanjut/span_17'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Pilih Car Only'
WebUI.click(findTestObject('Object Repository/Front-End/OR Homepage/OR Cari mobil menggunakan fitur pencarian lebih lanjut/label_Car Only'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Klik Button Pencarian Lebih lanjut'
WebUI.click(findTestObject('Object Repository/Front-End/OR Homepage/OR Cari mobil menggunakan fitur pencarian lebih lanjut/a_Pencarian Lebih Lanjut'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Input Harga Start'
WebUI.setText(findTestObject('Front-End/OR Homepage/OR Cari mobil menggunakan fitur pencarian lebih lanjut/harga_start'), 
    '100000')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Input Harga Akhir'
WebUI.setText(findTestObject('Front-End/OR Homepage/OR Cari mobil menggunakan fitur pencarian lebih lanjut/harga_end'), 
    '500000')

not_run: WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Pilih Plat Nomor \'Genap\''
not_run: WebUI.click(findTestObject('Object Repository/Front-End/OR Homepage/OR Cari mobil menggunakan fitur pencarian lebih lanjut/label_Genap'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Pilih Fasilitas \'Car Insurance\''
WebUI.click(findTestObject('Object Repository/Front-End/OR Homepage/OR Cari mobil menggunakan fitur pencarian lebih lanjut/label_Car Insurance'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Pilih Rating 5'
WebUI.click(findTestObject('Object Repository/Front-End/OR Homepage/OR Cari mobil menggunakan fitur pencarian lebih lanjut/span_Rating_fa fa-star clickab'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Klik button Cari'
WebUI.click(findTestObject('Object Repository/Front-End/OR Homepage/OR Cari mobil menggunakan fitur pencarian lebih lanjut/button_Cari'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Front-End/OR Homepage/OR Cari mobil menggunakan fitur pencarian lebih lanjut/select_car'))

WebUI.delay(5)

