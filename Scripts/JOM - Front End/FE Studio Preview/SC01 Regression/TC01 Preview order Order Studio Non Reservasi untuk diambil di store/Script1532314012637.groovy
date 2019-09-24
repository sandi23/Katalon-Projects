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

'Simulasi buka browser, input URL, loading webpage'
WebUI.openBrowser('http://jom-demo-banda.stagingapps.net/studio/preview')

'Simulasi input email\r\n'
WebUI.setText(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Selamat Datang di Counter Prev/input_username'), 
    'beta@email.com')

'Simulasi input password'
WebUI.setText(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Selamat Datang di Counter Prev/input_password'), 
    'P@ssw0rd')

'Simulasi klik button \'Masuk\''
WebUI.click(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Selamat Datang di Counter Prev/button_Masuk'))

'Beri jeda loading webpage'
WebUI.delay(5)

'Simulasi klik salah satu order pada list'
WebUI.doubleClick(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Daftar Paket  Jonas Photo/h2_1 - Photo Studio Mini Poste'))

'Simulasi klik template pertama'
WebUI.click(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/img_coordinate-0'))

'Beri jeda webpage loading foto'
WebUI.delay(1)

'Simulasi klik button \'Pilih\''
WebUI.doubleClick(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_pilih_1'))

'Simulasi klik template kedua'
WebUI.click(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/img_coordinate-1'))

'Beri jeda webpage loading foto'
WebUI.delay(5)

'Klik button \'>\' (selanjutnya)'
WebUI.click(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/i_fa fa-angle-right'))

'Beri jeda webpage loading foto selanjutnya'
WebUI.delay(1)

'Simulasi klik button \'Pilih\''
WebUI.doubleClick(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_pilih_2'))

'Simulasi klik template ketiga'
WebUI.click(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/img_coordinate-2'))

'Beri jeda webpage loading foto'
WebUI.delay(5)

'Simulasi klik button \'>\' (selanjutnya)'
WebUI.click(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/i_fa fa-angle-right'))

'Beri jeda webpage loading foto selanjutnya'
WebUI.delay(1)

'Simulasi klik button \'Pilih\''
WebUI.doubleClick(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_pilih_3'))

'Simulasi klik template keempat'
WebUI.click(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/img_coordinate-3'))

'Beri jeda webpage loading foto'
WebUI.delay(5)

'Simulasi klik button \'>\' (selanjutnya)'
WebUI.click(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/i_fa fa-angle-right'))

'Beri jeda webpage loading foto selanjutnya'
WebUI.delay(1)

'Simulasi klik button \'Pilih\''
WebUI.doubleClick(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_pilih_4'))

'Simulasi klik template kelima'
WebUI.click(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/img_coordinate-4'))

'Beri jeda webpage loading foto'
WebUI.delay(1)

'Simulasi klik button \'>\' (selanjutnya)\t'
WebUI.click(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/i_fa fa-angle-right'))

'Simulasi klik button \'Pilih\''
WebUI.doubleClick(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_pilih_5'))

'Simulasi klik button \'OK, Lanjutkan\''
WebUI.doubleClick(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_OK Lanjutkan'))

'Simulasi klik button \'Lanjut\''
WebUI.doubleClick(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_Lanjut'))

'Beri jeda webpage loading langkah selanjutnya'
WebUI.delay(3)

'Simulasi input judul'
WebUI.setText(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/input_text1'), 
    'Test')

'Simulasi klik button \'Finish\''
WebUI.click(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_Finish'))

'Simulasi klik button \'Tidak, Lewati\''
WebUI.click(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/a_Tidak Lewati'))

'Simulasi klik button \'Lanjutkan\''
WebUI.click(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/a_Lanjutkan'))

'Simulasi klik button \'Tidak, lanjutkan\''
WebUI.click(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_Tidak Lanjutkan'))

'Simulasi klik button \'OK, Lanjutkan\''
WebUI.click(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_OK Lanjutkan'))

'Simulasi klik button \'Bayar Sekarang\''
WebUI.click(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_Bayar Sekarang'))

'Simulasi klik elemen rating'
WebUI.click(findTestObject('Object Repository/JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/span_glyphicon .glyphicon-star'))

'Simulasi input Reason'
WebUI.setText(findTestObject('Object Repository/JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/textarea_message'), 
    'Good')

'Simulasi klik button \'OK\''
WebUI.click(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_OK'))

'Verifikasi muncul notifikasi \'Sudah Selesai, Terima Kasih\''
WebUI.verifyElementVisible(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/h2_Sudah Selesai. Terima Kasih'))

'Simulasi klik button \'OK Selesai\''
WebUI.click(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_OK Selesai'))

not_run: WebUI.scrollToElement(findTestObject('null'), 3)

'Simulasi klik button \'Tidak, preview lain kali\''
WebUI.click(findTestObject('JOM - Front End/Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/a_Tidak Preview Lain Kali'))

'Simulasi tutup browser'
WebUI.closeBrowser()

