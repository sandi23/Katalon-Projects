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

WebUI.maximizeWindow()

'Case user login di awal saat melakukan order'
if (GlobalVariable.Loginawal == true) {
    'Simulasi input email\r\n'
    WebUI.setText(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Selamat Datang di Counter Prev/input_username'), 
        'ali.msaputra01@gmail.com')

    'Simulasi input password'
    WebUI.setText(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Selamat Datang di Counter Prev/input_password'), 
        '12345678')

    'Simulasi klik button \'Masuk\''
    WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Selamat Datang di Counter Prev/button_Masuk'))
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

'Simulasi pilih foto yang akan dipreview'
WebUI.waitForElementClickable(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio P/Choose Photo Studio'), 
    3)

WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio P/Choose Photo Studio'))

'Sebuah test object yang berupa template foto'
TestObject template = findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio M/img_coordinate-0')

'Sebuah test object yang berupa button \'Pilih\''
TestObject btn_pilih = findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio M/button_pilih_1')

'variabel untuk for loop'
int template_index = 1

'variabel untuk for loop'
int button_index = 3

WebUI.delay(2)

'Simulasi klik template foto pertama'
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio M/img_coordinate-0'))

WebUI.delay(1)

'Simulasi klik button \'Pilih\''
WebUI.doubleClick(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio M/button_pilih_1'))

'For loop untuk memilih foto pada setiap template. Silahkan ubah index dengan rumus berikut: misalkan jumlah template  ada 5, maka index = jumlah template - 2 = 3'
for (def index : (0..3)) {
    'Simulasi fokus ke template foto ke-n (sesuai template_index)'
    template.findProperty('id').setValue("coordinate-$template_index")

    'Simulasi klik template foto ke-n (dari step sebelumnya)'
    WebUI.click(template)

    'Simulasi klik button \'>\' (foto selanjutnya)'
    WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ARROW_RIGHT))

    'Simulasi fokus ke button pilih pada foto ke-n (sesuai button_index)'
    btn_pilih.findProperty('xpath').setValue("//*[@id='template-photo-all']/div/div/div[3]/div[$button_index]/div[1]/label/div/button")

    WebUI.waitForElementClickable(btn_pilih, 1)

    'Simulasi klik button \'Pilih\' pada foto ke-n (sesuai step sebelumnya)'
    WebUI.doubleClick(btn_pilih)

    'Step untuk for loop'
    template_index = (template_index + 1)

    'Step untuk for loop'
    button_index = (button_index + 1)
}

'Simulasi klik button \'OK, Lanjutkan\''
WebUI.doubleClick(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio M/button_OK Lanjutkan'))

'Simulasi klik button \'Lanjut\''
WebUI.doubleClick(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio M/button_Lanjut'))

'Beri jeda webpage loading langkah selanjutnya'
WebUI.delay(3)

'Simulasi input judul'
WebUI.setText(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio M/input_text1'), 
    'Test')

'Simulasi klik button \'Finish\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio M/button_Finish'))

'Simulasi klik button \'Tidak, Lewati\' (disable step ini apabila button ini disabled)'
not_run: WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio M/a_Tidak Lewati'))

'Simulasi klik button \'Ya, Saya mau pesan foto ini\' (disable 25-27 apabila ingin jalankan step 24)'
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio P/button_Ya Saya Mau Pesan Foto'))

WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio P/Pilih Sebagai Penambahan Photo'))

WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio P/label_Pilih Semua Foto'))

WebUI.scrollToElement(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio P/button_Selanjutnya'), 
    1)

WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio P/button_Selanjutnya'))

'Simulasi klik button \'Lanjutkan\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio M/a_Lanjutkan'))

WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio M/button_Ya Tambah Cetak'))

'Simulasi klik div \'+ Tambah Cetak\' pada foto pertama'
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio M/a_ Tambah Cetak'))

WebUI.waitForElementClickable(findTestObject('JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio M/button_Pilih'), 
    1)

'Simulasi klik button \'Pilih\' pada option Tambah Cetak pertama'
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio M/button_Pilih'))

WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio M/button_Lanjutkan'))

WebUI.scrollToElement(findTestObject('JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Review Order  Jonas Photo/button_...'), 
    1)

'Simulasi klik button \'...\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Review Order  Jonas Photo/button_...'))

'Verifikasi tambahan sesuai dengan yang sudah diklik'
WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Review Order  Jonas Photo/td_Photo Studio Penambahan Sho'))

WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Review Order  Jonas Photo/td_Penambahan Ganti Baju Photo'))

WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Review Order  Jonas Photo/h4_Rp 250.000'))

'Simulasi tutup browser'
not_run: WebUI.closeBrowser()

