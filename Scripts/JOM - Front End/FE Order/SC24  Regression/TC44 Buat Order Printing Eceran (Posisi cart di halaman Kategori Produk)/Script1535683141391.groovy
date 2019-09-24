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

'Simulasi buka browser, input URL, tunggu webpage loading'
WebUI.openBrowser('http://jom-demo-banda.stagingapps.net/')

'Simulasi membesarkan window'
WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Helo you look great today   Jo/a_Login'))

not_run: WebUI.setText(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Helo you look great today   Jo/input_username'), 
    'beta@email.com')

not_run: WebUI.setText(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Helo you look great today   Jo/input_password'), 
    'P@ssw0rd')

not_run: WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Helo you look great today   Jo/button_Login'))

'Simulasi mouse scroll ke button \'Cetak Photo\''
WebUI.scrollToElement(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Helo you look great today   Jo/a_Cetak Photo'), 
    1)

'Simulasi klik button \'Cetak Photo\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Helo you look great today   Jo/a_Cetak Photo'))

'Simulasi klik div \'Regular Print\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Kategori Produk Printing  Jona/h4_Regular Print'))

WebUI.delay(5)

'Simulasi upload 3 file'
WebUI.uploadFile(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Photo Printing  Jonas Photo (1)/input_images'), 
    'D:\\pictures\\smallest\\1.jpg')

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.uploadFile(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Photo Printing  Jonas Photo (1)/input_images'), 
    'D:\\pictures\\smallest\\2.jpg')

WebUI.delay(10)

WebUI.uploadFile(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Photo Printing  Jonas Photo (1)/input_images'), 
    'D:\\pictures\\smallest\\3.jpg')

not_run: WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Photo Printing  Jonas Photo/label'))

WebUI.waitForElementVisible(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Photo Printing  Jonas Photo/label_Pilih Semua'), 
    1)

'Simulasi klik checkbox \'Pilih Semua\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Photo Printing  Jonas Photo/label_Pilih Semua'))

'Simulasi klik button \'Cetak Foto Ini\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/button_Cetak Foto Ini'))

'Simulasi klik \'+ Tambah Cetakan\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/h5_Cetak Photo  Laminasi 3R'))

'Simulasi klik menu \'Small Print\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/a_Small Print'))

'Simulasi pilih salah satu option pada menu \'Small Print\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di Store (Instant Print)/Page_Photo Printing  Jonas Photo/fieldset_form-group no-border (1)'))

WebUI.waitForElementClickable(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/button_Simpan'), 
    1)

'Simulasi klik button \'Simpan\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/button_Simpan'))

'Simulasi pilih kertas Photo'
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/span_Photo'))

'Simulasi klik dropdown \'Color\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/span_Color'))

'Simulasi pilih Color \'Black and White\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/span_Black and White'))

'For loop untuk menambah jumlah cetakan menjadi 5'
for (def index : (0..3)) {
    WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/span_glyphicon glyphicon-plus'))
}

'Simulasi klik button \'Ya, Cetak dengan Ukuran Ini\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/button_Ya Cetak Dengan Ukuran'))

WebUI.delay(2)

'Simulasi klik button \'OK, Lanjutkan\''
WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Photo Printing  Jonas Photo (3)/button_OK Lanjutkan'))

'Simulasi klik button \'Ambil di store\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Photo Printing  Jonas Photo (3)/a_Ambil di store'))

'Verifikasi ada order printing yang dipesan'
WebUI.verifyElementVisible(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Photo Printing  Jonas Photo/li_Cetak Photo  Laminasi 8R'))

'Simulasi klik button \'Pilih Paket Lain\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Photo Printing  Jonas Photo/a_Pilih Paket Lain'))

'Simulasi klik icon Cart'
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Kategori Produk Printing  Jona/img'))

'Verifikasi masih ada order printing yang dipesan'
WebUI.verifyElementVisible(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Photo Printing  Jonas Photo/li_Cetak Photo  Laminasi 8R'))

'Simulasi klik button \'Selesai, Lanjutkan ke Order\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Photo Printing  Jonas Photo (3)/a_Selesai Lanjutkan ke Order'))

WebUI.callTestCase(findTestCase('JOM - Front End/FE Order/SC24  Regression/TC02 Login sebagai User'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Review Order  Jonas Photo/button_Buat Order'), 
    1)

'Simulasi klik button \'Buat Order\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran (Posisi cart di halaman Kategori Produk)/Page_Review Order  Jonas Photo/button_Buat Order'))

not_run: WebUI.closeBrowser()

