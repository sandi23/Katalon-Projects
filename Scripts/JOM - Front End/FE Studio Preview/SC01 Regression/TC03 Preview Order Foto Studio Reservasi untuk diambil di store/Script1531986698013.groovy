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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://jom-demo-banda.stagingapps.net/studio/preview')

WebUI.setText(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Selamat Datang di Counter Prev/input_username'), 
    'ali.msaputra01@gmail.com')

WebUI.setText(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Selamat Datang di Counter Prev/input_password'), 
    '12345678')

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Selamat Datang di Counter Prev/button_Masuk'))

WebUI.delay(2)

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/Choose Photo Studio'))

WebUI.delay(2)

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/img_coordinate-2'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Pilih'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/img_coordinate-3'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/i_fa fa-angle-right'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Pilih (1)'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/img_coordinate-4'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/i_fa fa-angle-right'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Pilih (2)'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/img_coordinate-5'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/i_fa fa-angle-right'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Pilih (3)'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/img_coordinate-6'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/i_fa fa-angle-right'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Pilih (4)'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/img_coordinate-7'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/i_fa fa-angle-right'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Pilih (5)'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/img_coordinate-8'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/i_fa fa-angle-right'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Pilih (6)'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/img_coordinate-9'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/i_fa fa-angle-right'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Pilih (7)'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/img_coordinate-10'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/i_fa fa-angle-right'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Pilih (8)'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/img_coordinate-11'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/i_fa fa-angle-right'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Pilih (9)'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/img_coordinate-12'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/i_fa fa-angle-right'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Pilih (10)'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/img_coordinate-13'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/i_fa fa-angle-right'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Pilih (11)'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/img_coordinate-14'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/i_fa fa-angle-right'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Pilih (12)'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/img_coordinate-15'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/i_fa fa-angle-right'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Pilih (13)'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/img_coordinate-image2'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/i_fa fa-angle-right'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Pilih (14)'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_OK Lanjutkan'))

not_run: WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/img'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Finish'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Ya Saya Mau Pesan Foto'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/Pilih Sebagai Penambahan Photo'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/label_Pilih Semua Foto'))

WebUI.scrollToElement(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Selanjutnya'), 
    0)

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Selanjutnya'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/a_Lanjutkan'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Ya Tambah Cetak'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Lanjutkan'))

not_run: WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Review Order  Jonas Photo/html_Review Order  Jonas Photo'))

WebUI.delay(2)

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Review Order  Jonas Photo/button_OK Lanjutkan'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Review Order  Jonas Photo/button_Bayar Sekarang'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Review Order  Jonas Photo/span_glyphicon .glyphicon-star'))

WebUI.setText(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Review Order  Jonas Photo/textarea_message'), 
    'Pelayanan Sangat Memuaskan')

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Review Order  Jonas Photo/button_OK'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Review Order  Jonas Photo/button_OK Selesai'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Review Order  Jonas Photo/a_Tidak Preview Lain Kali'))

