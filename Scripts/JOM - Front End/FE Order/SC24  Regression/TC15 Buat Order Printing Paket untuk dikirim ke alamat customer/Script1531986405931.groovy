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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://jom-demo-banda.stagingapps.net/')

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_Hello you look great today   J/a_Cetak Photo'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_Kategori Produk Printing  Jona/h4_Package Print'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_Package Print  Jonas Photo/p_Photo Mix 16RP New Style I'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_product_group terpilih  Jonas/a_Pilih Produk Ini'))

WebUI.delay(20)

WebUI.waitForElementVisible(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_Foto Pilihan Anda  Jonas Photo/label_Pilih Semua'), 
    0)

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_Foto Pilihan Anda  Jonas Photo/label_Pilih Semua'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_Foto Pilihan Anda  Jonas Photo/a_Ok Lanjutkan'))

WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_Pengaturan  Jonas Photo/img'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_Pengaturan  Jonas Photo/a_Photo Utama 01'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_Pengaturan  Jonas Photo/button_OK Lanjutkan'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_Pengaturan  Jonas Photo/a_Kirim ke alamat'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_Pengaturan  Jonas Photo/a_Selesai Lanjutkan ke Order'))

WebUI.setText(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_Login  Jonas Photo/input_username'), 
    'ali.msaputra01@gmail.com')

WebUI.setText(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_Login  Jonas Photo/input_password'), 
    '12345678')

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_Login  Jonas Photo/button_Login'))

WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/button_Edit'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/button_Pilih'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/button_Edit_1'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/a_JNE'))

'Time tadinya 1'
WebUI.delay(5)

not_run: WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/label_OKE  Rp 62.000'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/button_Pilih_1'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Paket untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/button_Buat Order'))

