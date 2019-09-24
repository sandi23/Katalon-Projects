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

'SC26 TC02 Login'
WebUI.callTestCase(findTestCase('JOM - Front End/FE Order/SC24  Regression/TC02 Login sebagai User'), [:], FailureHandling.STOP_ON_FAILURE)

'Memberi jeda untuk webpage loading'
WebUI.delay(3)

'Simulasi klik button Pesan Photo'
WebUI.click(findTestObject('JOM - Front End/Order/SC24 Regression/OR Buat Order Studio non-reservasi dengan kondisi Customer sudah login/Page_Helo you look great today   Jo/a_Pesan Photo'))

'Simulasi klik gambar Photo On Studio\r\n'
WebUI.click(findTestObject('JOM - Front End/Order/SC24 Regression/OR Buat Order Studio non-reservasi dengan kondisi Customer sudah login/Page_Our Photography Services  Jona/div_Photo On Studio'))

'Simulasi klik gambar Kids'
WebUI.click(findTestObject('JOM - Front End/Order/SC24 Regression/OR Buat Order Studio non-reservasi dengan kondisi Customer sudah login/Page_Our Photo Studio Product  Jona/div_Kids'))

'Simulasi klik gambar Mini Poster'
WebUI.click(findTestObject('JOM - Front End/Order/SC24 Regression/OR Buat Order Studio non-reservasi dengan kondisi Customer sudah login/Page_Product catalogue  Jonas Photo/div_Mini Poster'))

'Beri jeda untuk webpage loading'
WebUI.delay(3)

'Simulasi klik Cari Produk'
WebUI.click(findTestObject('JOM - Front End/Order/SC24 Regression/OR Buat Order Studio non-reservasi dengan kondisi Customer sudah login/Page_Cari Produk  Jonas Photo/button_Cari Produk'))

'Simulasi klik button Tambahkan Ke Keranjang'
WebUI.click(findTestObject('JOM - Front End/Order/SC24 Regression/OR Buat Order Studio non-reservasi dengan kondisi Customer sudah login/Page_Produk Anda  Jonas Photo/button_Tambahkan Ke Keranjang'))

'Simulasi klik button Selesai, Lanjutkan ke Order\r\n'
WebUI.click(findTestObject('JOM - Front End/Order/SC24 Regression/OR Buat Order Studio non-reservasi dengan kondisi Customer sudah login/Page_Produk Anda  Jonas Photo/a_Selesai Lanjutkan ke Order'))

'Simulasi klik button OK, Lanjutkan'
WebUI.click(findTestObject('JOM - Front End/Order/SC24 Regression/OR Buat Order Studio non-reservasi dengan kondisi Customer sudah login/Page_Produk Anda  Jonas Photo/button_OK Lanjutkan'))

'Simulasi klik button Buat Order'
WebUI.click(findTestObject('JOM - Front End/Order/SC24 Regression/OR Buat Order Studio non-reservasi dengan kondisi Customer sudah login/Page_Produk Anda  Jonas Photo/button_Buat Order'))

'Beri jeda untuk webpage loading'
WebUI.delay(2)

'Verifikasi muncul notifikasi order berhasil'
WebUI.verifyElementVisible(findTestObject('JOM - Front End/Order/SC24 Regression/OR Buat Order Studio non-reservasi dengan kondisi Customer sudah login/Page_Produk Anda  Jonas Photo/h2_Sudah Selesai. Terima Kasih'))

'Verifikasi muncul notifikasi order berhasil'
WebUI.verifyElementVisible(findTestObject('JOM - Front End/Order/SC24 Regression/OR Buat Order Studio non-reservasi dengan kondisi Customer sudah login/Page_Produk Anda  Jonas Photo/p_Silahkan check-in di counter'))

'Simulasi tutup browser'
WebUI.closeBrowser()

