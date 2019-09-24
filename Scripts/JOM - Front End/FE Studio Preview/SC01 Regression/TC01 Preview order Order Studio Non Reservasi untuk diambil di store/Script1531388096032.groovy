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
import com.sun.jna.platform.mac.Carbon.EventHotKeyID.ByValue as ByValue
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

'Simulasi buka browser, input URL, loading webpage'
WebUI.openBrowser('http://jom-demo-banda.stagingapps.net/studio/preview')

WebUI.maximizeWindow()

'Case user login di awal saat melakukan order'
if (GlobalVariable.Loginawal == true) {
    'Simulasi input email\r\n'
    WebUI.setText(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Selamat Datang di Counter Prev/input_username'), 
        'ali.msaputra01@gmail.com')

    'Simulasi input password'
    WebUI.setText(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Selamat Datang di Counter Prev/input_password'), 
        '12345678')

    'Simulasi klik button \'Masuk\''
    WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Selamat Datang di Counter Prev/button_Masuk'))
} else {
    'Simulasi input email\r\n'
    WebUI.setText(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Selamat Datang di Counter Prev/input_username'), 
        'beta@email.com')

    'Simulasi input password'
    WebUI.setText(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Selamat Datang di Counter Prev/input_password'), 
        'P@ssw0rd')

    'Simulasi klik button \'Masuk\''
    WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Selamat Datang di Counter Prev/button_Masuk'))
}

'Beri jeda loading webpage'
WebUI.delay(5)

'Code untuk aktivasi WebDriver Selenium'
driver = DriverFactory.getWebDriver()

'Code untuk mendapatkan list paket-paket yang ada'
paket = driver.findElements(By.tagName('h2'))

'Code untuk mencari paket yang dipesan dari FE Order/TC06'
for (def i : paket) {
    if (i.getText() == '1 - Photo Studio Mini Poster') {
        i.click()

        break
    }
}

'Simulasi klik salah satu order pada list'
not_run: WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Daftar Paket  Jonas Photo/h2_1 - Photo Studio Mini Poste'))

'Simulasi klik template pertama'
WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/img_coordinate-0'))

'Beri jeda webpage loading foto'
WebUI.delay(1)

'Simulasi klik button \'Pilih\''
WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_pilih_1'))

'Simulasi klik template kedua'
WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/img_coordinate-1'))

'Beri jeda webpage loading foto'
WebUI.delay(5)

'Klik button \'>\' (selanjutnya)'
WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/i_fa fa-angle-right'))

'Beri jeda webpage loading foto selanjutnya'
WebUI.delay(1)

'Simulasi klik button \'Pilih\''
WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_pilih_2'))

'Simulasi klik template ketiga'
WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/img_coordinate-2'))

'Beri jeda webpage loading foto'
WebUI.delay(5)

'Simulasi klik button \'>\' (selanjutnya)'
WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/i_fa fa-angle-right'))

'Beri jeda webpage loading foto selanjutnya'
WebUI.delay(1)

'Simulasi klik button \'Pilih\''
WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_pilih_3'))

'Simulasi klik template keempat'
WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/img_coordinate-3'))

'Beri jeda webpage loading foto'
WebUI.delay(5)

'Simulasi klik button \'>\' (selanjutnya)'
WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/i_fa fa-angle-right'))

'Beri jeda webpage loading foto selanjutnya'
WebUI.delay(1)

'Simulasi klik button \'Pilih\''
WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_pilih_4'))

'Simulasi klik template kelima'
WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/img_coordinate-4'))

'Beri jeda webpage loading foto'
WebUI.delay(1)

'Simulasi klik button \'>\' (selanjutnya)\t'
WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/i_fa fa-angle-right'))

'Simulasi klik button \'Pilih\''
WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_pilih_5'))

'Simulasi klik button \'OK, Lanjutkan\''
WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_OK Lanjutkan'))

'Simulasi klik button \'Lanjut\''
WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_Lanjut'))

'Beri jeda webpage loading langkah selanjutnya'
WebUI.delay(3)

'Simulasi input judul'
WebUI.setText(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/input_text1'), 
    'Test')

'Simulasi klik button \'Finish\''
WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_Finish'))

'Simulasi klik button \'Tidak, Lewati\''
not_run: WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/a_Tidak Lewati'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Ya Saya Mau Pesan Foto'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/Pilih Sebagai Penambahan Photo'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/label_Pilih Semua Foto'))

WebUI.scrollToElement(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Selanjutnya'), 
    1)

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Selanjutnya'))

'Simulasi klik button \'Lanjutkan\''
WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/a_Lanjutkan'))

'Simulasi klik button \'Tidak, lanjutkan\''
WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_Tidak Lanjutkan'))

'Simulasi klik button \'OK, Lanjutkan\''
WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_OK Lanjutkan'))

'Simulasi klik button \'Bayar Sekarang\''
WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_Bayar Sekarang'))

'Simulasi klik elemen rating'
WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/span_glyphicon .glyphicon-star'))

'Simulasi input Reason'
WebUI.setText(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/textarea_message'), 
    'Good')

'Simulasi klik button \'OK\''
WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_OK'))

'Verifikasi muncul notifikasi \'Sudah Selesai, Terima Kasih\''
WebUI.verifyElementVisible(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/h2_Sudah Selesai. Terima Kasih'))

'Simulasi klik button \'OK Selesai\''
WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_OK Selesai'))

WebUI.scrollToElement(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Review Order  Jonas Photo/a_Tidak Preview Lain Kali'), 
    3)

'Simulasi klik button \'Tidak, preview lain kali\''
WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/a_Tidak Preview Lain Kali'))

'Simulasi tutup browser'
WebUI.closeBrowser()

