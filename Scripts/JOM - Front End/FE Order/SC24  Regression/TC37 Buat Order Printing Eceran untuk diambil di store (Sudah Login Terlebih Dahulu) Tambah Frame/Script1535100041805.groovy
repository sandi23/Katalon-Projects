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

'Simulasi login'
WebUI.callTestCase(findTestCase('JOM - Front End/FE Order/SC24  Regression/TC02 Login sebagai User'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Beri jeda loading webpage'
WebUI.delay(4)

'Simulasi klik button \'Cetak Foto\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Helo you look great today   Jo/a_Cetak Photo'))

'Simulasi klik div \'Regular Print\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Kategori Produk Printing  Jona/h4_Regular Print'))

'Simulasi upload file'
WebUI.uploadFile(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Photo Printing  Jonas Photo/input_images'), 
    'D:\\pictures\\smallest\\1.jpg')

'Simulasi klik checkbox \'Pilih Semua\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Photo Printing  Jonas Photo/label_Pilih Semua'))

'Simulasi klik button \'Cetak Foto Ini\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Photo Printing  Jonas Photo/button_Cetak Foto Ini'))

'Simulasi klik dropdown \'+ Tambah Cetakan\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Photo Printing  Jonas Photo/a_ Tambah Cetakan'))

'Simulasi klik menu \'Small Print\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Photo Printing  Jonas Photo/a_Small Print'))

'Simulasi mouse scroll ke cetakan \'Cetak Photo + Laminasi 8RP\''
WebUI.scrollToElement(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Photo Printing  Jonas Photo/label'), 
    1)

'Simulasi klik checkbox \'Cetak Photo + Laminasi 8RP\''
WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Photo Printing  Jonas Photo/label'))

'Simulasi klik button \'Simpan\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Photo Printing  Jonas Photo/button_Simpan'))

'Simulasi pilih kertas Photo'
WebUI.doubleClick(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Photo Printing  Jonas Photo/span_Photo'))

'Simulasi pilih Color'
WebUI.doubleClick(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Photo Printing  Jonas Photo/span_Color'))

'Simulasi klik button \'Ya, Cetak dengan Ukuran Diatas\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Photo Printing  Jonas Photo/button_Ya Cetak Dengan Ukuran'))

'Simulasi klik div \'Tambah Cetakan\''
WebUI.doubleClick(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Photo Printing  Jonas Photo/a_ Tambah Cetakan_1'))

'Simulasi klik menu \'Photo Frame\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Photo Printing  Jonas Photo/a_Photo Frame'))

'Simulasi mouse scroll ke salah satu frame klasik\r\n'
WebUI.scrollToElement(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Photo Printing  Jonas Photo/label_1'), 
    1)

'Simulasi klik salah satu frame klasik'
WebUI.doubleClick(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Photo Printing  Jonas Photo/label_1'))

'Simulasi klik button \'Simpan\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Photo Printing  Jonas Photo/button_Simpan'))

'Simulasi mouse scroll ke button \'OK, Lanjutkan\''
WebUI.scrollToElement(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Photo Printing  Jonas Photo/button_OK Lanjutkan'), 
    1)

'Simulasi klik button \'OK, Lanjutkan\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Photo Printing  Jonas Photo/button_OK Lanjutkan'))

'Simulasi klik button \'Ambil di Store\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Photo Printing  Jonas Photo/a_Ambil di store'))

'Simulasi klik button \'Selesai, Lanjutkan ke Order\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Photo Printing  Jonas Photo/a_Selesai Lanjutkan ke Order'))

'Simulasi klik button \'Buat Order\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store (Sudah Login Terlebih Dahulu) Tambah Frame/Page_Review Order  Jonas Photo/button_Buat Order'))

'Simulasi tutup browser\r\n'
WebUI.closeBrowser()

