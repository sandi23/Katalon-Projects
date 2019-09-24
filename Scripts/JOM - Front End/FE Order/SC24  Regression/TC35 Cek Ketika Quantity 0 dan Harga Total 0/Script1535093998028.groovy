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

'Simulasi buka browser, loading URL, loading webpage'
WebUI.openBrowser('http://jom-demo-banda.stagingapps.net/')

WebUI.maximizeWindow()

'Simulasi klik button \'Cetak Foto\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Cek Ketika Quantity 0/Page_Helo you look great today   Jo/a_Cetak Photo'))

'Simulasi klik div \'Instant Print\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Cek Ketika Quantity 0/Page_Kategori Produk Printing  Jona/h4_Instant Print'))

'Simulasi upload file'
WebUI.uploadFile(findTestObject('Object Repository/JOM - Front End/FE Order/OR Cek Ketika Quantity 0/Page_Photo Printing  Jonas Photo/input_images'), 
    'D:\\pictures\\smallest\\1.jpg')

WebUI.waitForElementVisible(findTestObject('JOM - Front End/FE Order/OR Cek Ketika Quantity 0/Page_Photo Printing  Jonas Photo/label_Pilih Semua'), 
    0)

'Simulasi klik checkbox \'Pilih Semua\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Cek Ketika Quantity 0/Page_Photo Printing  Jonas Photo/label_Pilih Semua'))

'Simulasi klik button \'Cetak Foto Ini\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Cek Ketika Quantity 0/Page_Photo Printing  Jonas Photo/button_Cetak Foto Ini'))

'Simulasi klik Tidak, Cetak dengan Beragam Ukuran\r\n'
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Cek Ketika Quantity 0/Page_Photo Printing  Jonas Photo/a_Tidak  Cetak Dengan Beragam'))

'Simulasi klik button \'Tambah Cetakan\''
WebUI.doubleClick(findTestObject('Object Repository/JOM - Front End/FE Order/OR Cek Ketika Quantity 0/Page_Photo Printing  Jonas Photo/a_ Tambah Cetakan'))

'Beri jeda loading list ukuran'
WebUI.delay(10)

'Simulasi klik salah satu ukuran foto'
WebUI.doubleClick(findTestObject('Object Repository/JOM - Front End/FE Order/OR Cek Ketika Quantity 0/Page_Photo Printing  Jonas Photo/label'))

'Simulasi klik button \'Simpan\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Cek Ketika Quantity 0/Page_Photo Printing  Jonas Photo/button_Simpan'))

'Simulasi input \'0\' pada jumlah cetakan'
WebUI.setText(findTestObject('Object Repository/JOM - Front End/FE Order/OR Cek Ketika Quantity 0/Page_Photo Printing  Jonas Photo/input_qty02'), 
    '0')

'[FAILED] button \'OK, Lanjutkan\' masih enabled'
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Cek Ketika Quantity 0/Page_Photo Printing  Jonas Photo/button_OK Lanjutkan'))

'Simulasi klik button \'Lanjutkan\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Cek Ketika Quantity 0/Page_Photo Printing  Jonas Photo/a_Lanjutkan'))

'Simulasi klik button \'Selesai, Lanjutkan ke Order\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Cek Ketika Quantity 0/Page_Photo Printing  Jonas Photo/a_Selesai Lanjutkan ke Order'))

'Simulasi login'
WebUI.callTestCase(findTestCase('JOM - Front End/FE Order/SC24  Regression/TC02 Login sebagai User'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'[FAILED] Masih bisa sampai ke Review Order'
WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Front End/FE Order/OR Cek Ketika Quantity 0/Page_Review Order  Jonas Photo/h2_Review Order'))

'Simulasi tutup browser'
WebUI.closeBrowser()

