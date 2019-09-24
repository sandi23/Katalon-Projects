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

WebUI.maximizeWindow()

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

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/button_Simpan'))

WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/span_Photo'))

WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/span_Color'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/span_glyphicon glyphicon-plus'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/button_Ya Cetak Dengan Ukuran'))

WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/a_ Tambah Cetakan_1'))

WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/label'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/button_Simpan'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/button_OK Lanjutkan'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/a_Kirim ke alamat'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Photo Printing  Jonas Photo/a_Selesai Lanjutkan ke Order'))

WebUI.callTestCase(findTestCase('JOM - Front End/FE Order/SC24  Regression/TC02 Login sebagai User'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/a_Lihat Foto'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/button_close modal-close-on-to'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/button_Edit'))

WebUI.delay(3)

WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/button_Pilih'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/button_Edit_1'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/a_JNE'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/label_OKE  Rp 150.000'))

WebUI.doubleClick(findTestObject('Bug List/144 - Select Courier Service/Page_Review Order  Jonas Photo/button_Pilih_kurir'))

WebUI.verifyElementVisible(findTestObject('Bug List/144 - Select Courier Service/Page_Review Order  Jonas Photo/p_JNE  Rp 155.000'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/button_Edit_1'))

WebUI.click(findTestObject('Bug List/144 - Select Courier Service/Page_Review Order  Jonas Photo/a_PANDA'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat order printing eceran untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/a_JNE'))

WebUI.click(findTestObject('Bug List/144 - Select Courier Service/Page_Review Order  Jonas Photo/a_JNT'))

WebUI.click(findTestObject('Bug List/144 - Select Courier Service/Page_Review Order  Jonas Photo/a_POS'))

WebUI.click(findTestObject('Bug List/144 - Select Courier Service/Page_Review Order  Jonas Photo/a_TIKI'))

WebUI.click(findTestObject('Bug List/144 - Select Courier Service/Page_Review Order  Jonas Photo/a_Batal'))

WebUI.verifyElementVisible(findTestObject('Bug List/144 - Select Courier Service/Page_Review Order  Jonas Photo/p_JNE  Rp 155.000'))

