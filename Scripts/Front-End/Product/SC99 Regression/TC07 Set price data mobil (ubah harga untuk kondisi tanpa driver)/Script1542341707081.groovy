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

WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi tanpa driver)/img'))

'Input Field Search'
WebUI.setText(findTestObject('Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi tanpa driver)/input_field_search'), 
    'JAZZ')

WebUI.delay(15)

'Klik Button Tiga Titik'
WebUI.click(findTestObject('Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi tanpa driver)/button_tiga_titik'))

'Klik Button Tiga Titik'
WebUI.click(findTestObject('Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi tanpa driver)/button_tiga_titik'))

WebUI.delay(1)

'Klik Set Price'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi tanpa driver)/a_Set Price'))

WebUI.delay(1)

'Pilih Tanpa Driver'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi tanpa driver)/label_Tanpa driver'))

WebUI.delay(1)

'Input Harga Weekdays'
WebUI.setText(findTestObject('Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi tanpa driver)/input_harga_weekdays'), 
    '150000')

WebUI.delay(1)

'Input Harga Weekends'
WebUI.setText(findTestObject('Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi tanpa driver)/input_harga_weekends'), 
    '145000')

WebUI.delay(1)

'Input Harga Deposit'
WebUI.setText(findTestObject('Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi tanpa driver)/input_harga_deposit'), 
    '25000')

WebUI.delay(1)

'Klik Field Fasilitas'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi tanpa driver)/i_Fasilitas_fa fa-caret-down f'))

WebUI.delay(1)

'Pilih Fasilitas'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi tanpa driver)/a_Tissue Life Insurance Car On'))

WebUI.delay(1)

'Pilih Fasilitas'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi tanpa driver)/label_Life Insurance'))

WebUI.delay(1)

'Pilih Fasilitas'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi tanpa driver)/label_Trash Bin'))

WebUI.delay(1)

'Pilih Fasilitas'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi tanpa driver)/label_Car Seat Baby'))

WebUI.delay(1)

'Pilih Fasilitas'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi tanpa driver)/label_Emergency Tools'))

WebUI.delay(1)

'Pilih Fasilitas'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi tanpa driver)/label_Tissue'))

WebUI.delay(1)

'Pilih Fasilitas'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi tanpa driver)/label_Wifi'))

WebUI.delay(1)

'Pilih Fasilitas'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi tanpa driver)/label_Car Insurance'))

WebUI.delay(1)

'Klik Button Simpan'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set price data mobil (ubah harga untuk kondisi tanpa driver)/a_SIMPAN'))

