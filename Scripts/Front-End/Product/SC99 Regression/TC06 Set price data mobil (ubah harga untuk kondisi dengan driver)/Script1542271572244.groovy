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

'Panggil TestCase Login Sebagai Owner'
not_run: WebUI.callTestCase(findTestCase('Front-End/User/SC99 Regression/TC12 Login Sebagai Owner'), [:], FailureHandling.STOP_ON_FAILURE)

'Klik Menu Kendaraan Saya'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi dengan driver)/img'))

'Input Field Search'
WebUI.setText(findTestObject('Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi dengan driver)/input_field_search'), 
    'kuda')

WebUI.delay(15)

'Klik Button Tiga Titik'
WebUI.click(findTestObject('Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi dengan driver)/button_tiga_titik'))

'Klik Button Tiga Titik'
not_run: WebUI.click(findTestObject('Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi dengan driver)/button_tiga_titik'))

'Klik Set Price'
WebUI.click(findTestObject('Front-End/OR Product/OR Edit Mobil/Page_Owner - Edit Car/price'))

WebUI.delay(1)

'Pilih Dengan Driver'
WebUI.click(findTestObject('Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi dengan driver)/dengan_driver'))

'Pilih 12 Jam'
WebUI.selectOptionByValue(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi dengan driver)/select_6 jam 12 jam 24 jam'), 
    '12 jam', true)

WebUI.delay(1)

'Input Harga Weekdays'
WebUI.setText(findTestObject('Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi dengan driver)/input_harga_weekdays'), 
    '115000')

WebUI.delay(1)

'Input Harga Weekends'
WebUI.setText(findTestObject('Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi dengan driver)/input_harga_weekends'), 
    '115500')

WebUI.delay(1)

'Klik Field Fasilitas'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi dengan driver)/a_Emergency Tools Car Insuranc'))

WebUI.delay(1)

'Pilih Fasilitas'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi dengan driver)/label_Trash Bin'))

WebUI.delay(1)

'Pilih Fasilitas'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi dengan driver)/label_Car Seat Baby'))

WebUI.delay(1)

'Pilih Fasilitas'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi dengan driver)/label_Emergency Tools'))

WebUI.delay(1)

'Pilih Fasilitas'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi dengan driver)/label_Tissue'))

WebUI.delay(1)

'Pilih Fasilitas'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi dengan driver)/label_Wifi'))

WebUI.delay(1)

'Klik Button Simpan'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi dengan driver)/a_SIMPAN'))

WebUI.delay(1)

