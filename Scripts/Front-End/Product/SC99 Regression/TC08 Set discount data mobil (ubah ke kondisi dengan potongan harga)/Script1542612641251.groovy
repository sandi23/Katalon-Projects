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

WebUI.delay(1)

'Klik Menu Kendaraan Saya'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set discount data mobil (ubah ke kondisi dengan potongan harga/img'))

WebUI.delay(1)

'Input Field Search'
WebUI.setText(findTestObject('Object Repository/Front-End/OR Product/OR Set discount data mobil (ubah ke kondisi dengan potongan harga/input_SORT BY _form-control ty'), 
    'kuda')

WebUI.delay(1)

WebUI.click(findTestObject('Front-End/OR Product/OR Edit Mobil/Page_Owner - Edit Car/img - search'))

'Klik Button Tiga Titik'
WebUI.click(findTestObject('Front-End/OR Product/OR Edit Mobil/Page_Owner - Edit Car/div_17'))

'Klik Button Tiga Titik'
not_run: WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set discount data mobil (ubah ke kondisi dengan potongan harga/button_Tersedia_btn btn-primar'))

'Klik Set Discount'
WebUI.click(findTestObject('Front-End/OR Product/OR Edit Mobil/Page_Owner - Edit Car/a_Set Discount - mit'))

WebUI.delay(1)

'Pilih Dengan Potongan Harga'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set discount data mobil (ubah ke kondisi dengan potongan harga/label_Dengan Potongan Harga'))

WebUI.delay(1)

'Input Diskon Weekdays'
WebUI.setText(findTestObject('Object Repository/Front-End/OR Product/OR Set discount data mobil (ubah ke kondisi dengan potongan harga/input_Weekday_form-control ng-'), 
    '10')

WebUI.delay(1)

'Input Diskon Weekends'
WebUI.setText(findTestObject('Object Repository/Front-End/OR Product/OR Set discount data mobil (ubah ke kondisi dengan potongan harga/input_Weekend  Hari Besar_form'), 
    '15')

WebUI.delay(1)

'Klik Button SImpan'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set discount data mobil (ubah ke kondisi dengan potongan harga/a_SIMPAN'))

'Verify Notifikasi Berhasil Edit Tampil'
WebUI.verifyElementVisible(findTestObject('Object Repository/Front-End/OR Product/OR Set discount data mobil (ubah ke kondisi dengan potongan harga/button_OK'))

