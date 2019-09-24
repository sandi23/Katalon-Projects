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
import org.openqa.selenium.Keys as Keys

not_run: WebUI.callTestCase(findTestCase('JOM - Front End/FE Order/SC24  Regression/TC02 Login sebagai User'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Helo you look great today   Jo/a_Pesan Photo'), 
    0)

'Simulasi klik button \'Pesan Photo\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Helo you look great today   Jo/a_Pesan Photo'))

'Beri jeda untuk loading elemen'
WebUI.delay(1)

'Simulasi klik gambar \'Photo Studio\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Our Photography Services  Jona/img_img-responsive'))

'Simulasi klik gambar \'Family\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Our Photo Studio Product  Jona/h5_Family'))

'Simulasi klik gambar \'Platinum\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Product catalogue  Jonas Photo/img'))

'Simulasi klik button \'Cari Produk\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Cari Produk  Jonas Photo/button_Cari Produk'))

'Simulasi klik button \'Tambahkan ke Keranjang\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Produk Anda  Jonas Photo/button_Tambahkan Ke Keranjang'))

'Simulasi klik button \'Selesai, Lanjutkan ke Order\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Produk Anda  Jonas Photo/a_Selesai Lanjutkan ke Order'))

'Simulasi scroll ke bawah'
WebUI.scrollToElement(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Buat Order  Jonas Photo/button_OK Lanjutkan'), 
    0)

'Simulasi klik button \'OK, Lanjutkan\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio non-reservasi/Page_Buat Order  Jonas Photo/button_OK Lanjutkan'))

'Beri jeda untuk loading elemen'
WebUI.delay(1)

'Simulasi klik button \'Buat Order\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Buat Order  Jonas Photo/button_Buat Order'))

'Simulasi klik button \'Reservasi\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Buat Order  Jonas Photo/button_Reservasi'))

'Simulasi klik pada kolom tanggal'
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Reservation  Jonas Photo/input_date'))

'Simulasi pilih tanggal (input secara manual)'
WebUI.setText(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Reservation  Jonas Photo/input_date'), 
    '08/29/2018')

'Enter'
WebUI.sendKeys(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Reservation  Jonas Photo/input_date'), 
    Keys.chord(Keys.ENTER))

'Simulasi pilih jam yang tersedia'
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Reservation  Jonas Photo/span_Pilih Jam'), 
    FailureHandling.STOP_ON_FAILURE)

'Beri jeda untuk loading daftar jam yang tersedia'
WebUI.delay(1)

WebUI.sendKeys(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Reservation  Jonas Photo/span_Pilih Jam'), 
    '16')

WebUI.sendKeys(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Reservation  Jonas Photo/span_Pilih Jam'), 
    Keys.chord(Keys.ENTER))

'Simulasi pilih jam yang tersedia'
not_run: WebUI.sendKeys(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Reservation  Jonas Photo/span_Pilih Jam'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER))

'Simulasi klik button \'Pesan Sekarang\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Reservation  Jonas Photo/button_Pesan Sekarang'))

'Simulasi klik button \'Kembali ke Halaman Utama\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Buat Order  Jonas Photo/a_Kembali Ke Halaman Utama'))

'Simulasi menutup browser'
not_run: WebUI.closeBrowser()

