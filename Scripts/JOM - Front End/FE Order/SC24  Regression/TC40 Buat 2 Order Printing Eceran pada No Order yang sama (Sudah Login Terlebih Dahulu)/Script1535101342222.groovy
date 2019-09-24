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

'Simulasi buka browser, input URL, loading webpage'
WebUI.openBrowser('http://jom-demo-banda.stagingapps.net/')

'Simulasi besarkan window\r\n'
WebUI.maximizeWindow()

'Simulasi klik button \'Cetak Photo\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Helo you look great today   Jo/a_Cetak Photo'))

'Simulasi klik \'Instant Print\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Kategori Produk Printing  Jona/h4_Instant Print'))

'Simulasi upload file'
WebUI.uploadFile(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/input_images'), 
    'D:\\pictures\\smallest\\1.jpg')

WebUI.waitForElementVisible(findTestObject('JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/label_Pilih Semua'), 
    0)

'Simulasi klik checkbox \'Pilih Semua\t\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/label_Pilih Semua'))

'Simulasi klik button \'Cetak Foto ini\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/button_Cetak Foto Ini'))

'Simulasi klik dropdown \'+ Tambah Cetakan\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/a_ Tambah Cetakan'))

'Beri jeda dropdown loading'
WebUI.delay(10)

'Simulasi klik checkbox \'4R\''
WebUI.doubleClick(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/label'))

'Simulasi klik button \'Simpan\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/button_Simpan'))

'Simulasi klik dropdown \'Photos\''
WebUI.doubleClick(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/span_Photo'))

'Simulasi klik dropdown \'Color\''
WebUI.doubleClick(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/span_Color'))

'Simulasi klik \'+\' pada jumlah cetakan'
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/span_glyphicon glyphicon-plus'))

'Simulasi klik button \'Ya, Cetak dengan ukuran diatas\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/button_Ya Cetak Dengan Ukuran'))

'Simulasi mouse scroll ke button \'OK, Lanjutkan\''
WebUI.scrollToElement(findTestObject('JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/button_OK Lanjutkan'), 
    2)

'Simulasi klik button \'OK. Lanjutkan\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/button_OK Lanjutkan'))

'Simulasi klik button \'Lanjukan\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/a_Lanjutkan'))

'Simulasi klik button \'Selesai, Lanjutkan ke Order\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/a_Selesai Lanjutkan ke Order'))

'Simulasi klik  gambar homepage'
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Login  Jonas Photo/a_brand-logo navbar-brand wave'))

'Simulasi klik button \'Cetak Photo\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Helo you look great today   Jo/a_Cetak Photo'))

'Simulasi klik button \'Instant Print\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Kategori Produk Printing  Jona/h4_Instant Print'))

'simulasi upload file'
WebUI.uploadFile(findTestObject('JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/input_images'), 
    'D:\\pictures\\smallest\\2.jpg')

WebUI.waitForElementVisible(findTestObject('JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/label_Pilih Semua'), 
    1)

'Simulasi klik checkbox \'Pilih Semua\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/label_Pilih Semua'))

'Simulasi klik button \'Cetak Foto Ini\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/button_Cetak Foto Ini'))

'Simulasi klik dropdown \'+ Tambah Cetakan\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/a_ Tambah Cetakan'))

'Beri jeda dropdown loading'
WebUI.delay(10)

'Simulasi klik checkbox \'5R\''
WebUI.doubleClick(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/label_1'))

'Simulasi klik button \'Simpan\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/button_Simpan'))

'Simulasi klik dropdown Photos'
WebUI.doubleClick(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/span_Photo'))

'Simulasi klik dropdown Colors\r\n'
WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/span_Color'))

'Simulasi klik \'+\' pada jumlah cetakan'
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/span_glyphicon glyphicon-plus'))

'Simulasi klik button \'Ya, Cetak dengan Ukuran diatas\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/button_Ya Cetak Dengan Ukuran'))

'Simulasi mouse scroll ke button \'OK, Lanjutkan\''
WebUI.scrollToElement(findTestObject('JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/button_OK Lanjutkan'), 
    2)

'Simulasi klik button \'OK, Lanjutkan\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/button_OK Lanjutkan'))

'Simulasi klik button \'Lanjutkan\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/a_Lanjutkan'))

'Simulasi klik button \'Selesai, Lanjutkan ke Order\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Photo Printing  Jonas Photo/a_Selesai Lanjutkan ke Order'))

'Simulasi login'
WebUI.callTestCase(findTestCase('JOM - Front End/FE Order/SC24  Regression/TC02 Login sebagai User'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Simulasi mouse scroll ke button \'Buat Order\''
WebUI.scrollToElement(findTestObject('JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Review Order  Jonas Photo/button_Buat Order'), 
    2)

'Simulasi klik button \'Buat Order\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Review Order  Jonas Photo/button_Buat Order'))

'Verifikasi muncul notifikasi bahwa order berhasil'
WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat 2 Order Printing Eceran pada No Order yang sama (Sudah Login Terlebih Dahulu)/Page_Selesai  Jonas Photo/h2_Sudah Selesai. Terima Kasih'))

'Simulasi tutup browser'
WebUI.closeBrowser()

