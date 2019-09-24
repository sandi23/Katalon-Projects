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

'Simulasi membuka browser, input URL, tunggu webpage loading'
WebUI.openBrowser('http://jom-demo-banda.stagingapps.net/')

'Simulasi membesarkan window'
WebUI.maximizeWindow()

'Memberi jeda untuk webpage selesai loading semua elemen'
WebUI.delay(3)

'Simulasi klik button Pesan Photo'
WebUI.click(findTestObject('Object Repository/Bug List/124/Page_Produk Anda  Jonas Photo/a_Pesan Photo'))

'Simulasi klik gambar Photo On Studio\r\n'
WebUI.doubleClick(findTestObject('Object Repository/Bug List/124/Page_Produk Anda  Jonas Photo/div_Photo On Studio'))

'Simulasi klik gambar Kids'
WebUI.doubleClick(findTestObject('Object Repository/Bug List/124/Page_Produk Anda  Jonas Photo/div_Kids'))

'Simulasi klik gambar Mini Poster'
WebUI.doubleClick(findTestObject('Object Repository/Bug List/124/Page_Produk Anda  Jonas Photo/div_Mini Poster'))

'Beri jeda untuk webpage loading'
WebUI.delay(3)

'Simulasi klik Cari Produk'
WebUI.click(findTestObject('Object Repository/Bug List/124/Page_Produk Anda  Jonas Photo/button_Cari Produk'))

'Simulasi klik button Tambahkan Ke Keranjang'
WebUI.click(findTestObject('Object Repository/Bug List/124/Page_Produk Anda  Jonas Photo/button_Tambahkan Ke Keranjang'))

'Simulasi klik button Selesai, Lanjutkan ke Order\r\n'
WebUI.click(findTestObject('Object Repository/Bug List/124/Page_Produk Anda  Jonas Photo/a_Selesai Lanjutkan ke Order'))

'Simulasi klik button OK, Lanjutkan'
WebUI.click(findTestObject('Object Repository/Bug List/124/Page_Produk Anda  Jonas Photo/button_OK Lanjutkan'))

'Simulasi login'
WebUI.callTestCase(findTestCase('JOM - Front End/FE Order/SC24  Regression/TC02 Login sebagai User'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

'Simulasi klik icon user'
WebUI.click(findTestObject('Object Repository/Bug List/124/Page_Buat Order  Jonas Photo/a_Test Beta'))

WebUI.delay(1)

'Simulasi klik option \'Keluar\''
WebUI.doubleClick(findTestObject('Object Repository/Bug List/124/Page_Buat Order  Jonas Photo/a_Keluar'))

'Verifikasi kembali ke landing page (Karakteristik dapat klik button \'Pesan Photo\')'
WebUI.verifyElementClickable(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio non-reservasi/Page_Buat Order  Jonas Photo/button_Buat Order'))

'Simulasi klik button Cart'
WebUI.click(findTestObject('Object Repository/Bug List/124/Page_Helo you look great today   Jo/img'))

'Verifikasi paket yang dipilih 0 (data reset setelah user logout)'
WebUI.verifyElementVisible(findTestObject('Object Repository/Bug List/124/Page_Helo you look great today   Jo/h4_Produk yang Anda pilih 0 pa'))

