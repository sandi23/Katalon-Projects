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

not_run: WebUI.callTestCase(findTestCase('Front-End/Payment/SC99 Regression/TC01 Review pesanan tanpa input voucher'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'Pilih Pembayaran via Credit Card Visa / Master'
WebUI.click(findTestObject('Object Repository/Front-End/OR Payment/OR Payment via credit card visa atau master/label_Credit Card Visa  Master'))

WebUI.delay(2)

'Lihat Rincian'
WebUI.click(findTestObject('Object Repository/Front-End/OR Payment/OR Payment via credit card visa atau master/a_Lihat rincian'))

WebUI.delay(2)

'Close Pop Up Rincian'
WebUI.click(findTestObject('Object Repository/Front-End/OR Payment/OR Payment via credit card visa atau master/span_'))

WebUI.delay(2)

'Klik button Bayar'
WebUI.click(findTestObject('Object Repository/Front-End/OR Payment/OR Payment via credit card visa atau master/a_Bayar'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Front-End/OR Payment/OR Tambah rekening/select_Pilih Bank            B'), 
    '014', true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Front-End/OR Payment/OR Tambah rekening/input_Cabang_form-control type'), 
    'Cabang')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Front-End/OR Payment/OR Tambah rekening/input_Nama Lengkap_form-contro'), 
    'Belinda')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Front-End/OR Payment/OR Tambah rekening/input_Nomor Rekening_form-cont'), 
    '1234567654321')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setEncryptedText(findTestObject('Object Repository/Front-End/OR Payment/OR Tambah rekening/input_Password_form-control ty'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Front-End/OR Payment/OR Tambah rekening/a_Simpan'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Front-End/OR Payment/OR Tambah rekening/input_Kode Verifikasi_otp-a'), '1')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Front-End/OR Payment/OR Tambah rekening/input_Kode Verifikasi_otp-b'), '3')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Front-End/OR Payment/OR Tambah rekening/input_Kode Verifikasi_otp-c'), '4')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Front-End/OR Payment/OR Tambah rekening/input_Kode Verifikasi_otp-d'), '5')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Front-End/OR Payment/OR Tambah rekening/input_Kode Verifikasi_otp-e'), '6')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Front-End/OR Payment/OR Tambah rekening/input_Kode Verifikasi_otp-f'), '1')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Front-End/OR Payment/OR Tambah rekening/button_Verifikasi'))

