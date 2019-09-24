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
WebUI.setText(findTestObject('Front-End/OR Homepage/OR Cari mobil menggunakan field pencarian biasa di homepage/input_Next_form-input-search h'), 
    'Bandung')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Pilih Opsi Kota'
WebUI.click(findTestObject('Front-End/OR Homepage/OR Cari mobil menggunakan field pencarian biasa di homepage/div_Bandung'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Pilih Tanggal Awal'
WebUI.click(findTestObject('Front-End/OR Homepage/OR Cari mobil menggunakan field pencarian biasa di homepage/span_16'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Pilih Tanggal Akhir'
WebUI.click(findTestObject('Front-End/OR Homepage/OR Cari mobil menggunakan field pencarian biasa di homepage/span_17'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Pilih Car Only'
WebUI.click(findTestObject('Front-End/OR Homepage/OR Cari mobil menggunakan field pencarian biasa di homepage/label_Car Only'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Klik Button Cari'
WebUI.click(findTestObject('Front-End/OR Homepage/OR Cari mobil menggunakan field pencarian biasa di homepage/button_Cari'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Scroll kebawah'
WebUI.scrollToPosition(780, 380)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Front-End/OR Homepage/OR Cari mobil menggunakan field pencarian biasa di homepage/h5_JAZZ'))

WebUI.delay(5)

