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
WebUI.openBrowser('jom-demo-banda.stagingapps.net')

'Simulasi klik div \'Cetak Photo\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Hello you look great today   J/a_Cetak Photo'))

'Simulasi klik div \'Regular Print\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Kategori Produk Printing  Jona/h4_Regular Print'))

'Simulasi upload file'
WebUI.uploadFile(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/input_images'), 
    'D:\\pictures\\smallest\\1.jpg')

'Simulasi klik foto yang telah diupload'
WebUI.waitForElementVisible(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/img'), 
    0)

'Simulasi klik foto yang telah diupload'
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/img'))

'Simulasi klik button \'Cetak Foto Ini\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/button_Cetak Foto Ini'))

'Simulasi klik button \'Tambah Cetakan\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/a_ Tambah Cetakan'))

'Simulasi klik salah satu tambahan cetakan'
WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/label'))

'Simulasi klik button \'Simpan\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/button_Simpan'))

'Simulasi pilih kertas Photo'
WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/span_Photo'))

'Simulasi pilih Color'
WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/span_Color'))

'Simulasi tambah cetakan'
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/span_glyphicon glyphicon-plus'))

'Simulasi klik button \'Ya, Cetak dengan ukuran diatas\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/button_Ya Cetak Dengan Ukuran'))

not_run: WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/a_ Tambah Cetakan_1'))

not_run: WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/label'))

not_run: WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/button_Simpan'))

'Simulasi mouse scroll ke button \'OK, Lanjutkan\''
WebUI.scrollToElement(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo (3)/button_OK Lanjutkan'), 
    3)

'Simulasi klik button \'OK, Lanjutkan\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/button_OK Lanjutkan'))

'Simulasi klik button \'Kirim ke alamat\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/a_Kirim ke alamat'))

'Simulasi klik button \'Selesai, Lanjukan ke Order\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/a_Selesai Lanjutkan ke Order'))

'Simulasi login'
WebUI.callTestCase(findTestCase('JOM - Front End/FE Order/SC24  Regression/TC02 Login sebagai User'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Simulasi mouse scroll ke button \'Buat Order\''
WebUI.scrollToElement(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Review Order  Jonas Photo/button_Buat Order'), 
    3)

'Simulasi klik button \'Buat Order\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/button_Buat Order'))

'Verifikasi muncul notifikasi bahwa alamat dan kurir harus diisi'
WebUI.verifyElementVisible(findTestObject('Bug List/52 - Alert for Empty Destination/Page_Review Order  Jonas Photo/div_Transaksi tidak dapat dila'))

