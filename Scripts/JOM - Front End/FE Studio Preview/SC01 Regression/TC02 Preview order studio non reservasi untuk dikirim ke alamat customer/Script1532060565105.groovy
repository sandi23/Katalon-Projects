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
//bila ingin menjalankan for loop dibawah, pastikan selalu import kedua package ini
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

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

'Sebuah test object yang berupa template foto'
TestObject template = findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio M/img_coordinate-0')

'Sebuah test object yang berupa button \'Pilih\''
TestObject btn_pilih = findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio M/button_pilih_1')

'variabel untuk for loop'
int template_index = 1

'variabel untuk for loop'
int button_index = 3

'Code untuk aktivasi WebDriver Selenium'
driver = DriverFactory.getWebDriver()

'Code untuk mendapatkan list orderan yang ada'
list_order = driver.findElements(By.tagName('h2'))

'Code untuk mengklik order yang dipesan dari FE Order/TC06'
for (def order : list_order) {
    nama_order = order.getText()

    panjang_nama_order = nama_order.length()

    if (nama_order.substring(4, panjang_nama_order) == 'Photo Studio Mini Poster') {
        order.click()

        break
    }
}

not_run: WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Daftar Paket  Jonas Photo/h2_1 - Photo Studio Mini Poste'))

WebUI.delay(2)

'Simulasi klik template foto pertama'
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio M/img_coordinate-0'))

WebUI.delay(1)

'Simulasi klik button \'Pilih\''
WebUI.doubleClick(findTestObject('Object Repository/JOM - Front End/FE Studio Preview/OR Tombol Detail Preview order Order Studio Non Reservasi dengan penambahan orang/Page_Pengaturan  1 - Photo Studio M/button_pilih_1'))

'For loop untuk memilih foto pada setiap template. Silahkan ubah index dengan rumus berikut: misalkan jumlah template  ada 5, maka index = jumlah template - 2 = 3 = 0 .. 3'
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

not_run: WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Pengaturan  1 - Photo Studio M/img_coordinate-0'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Pengaturan  1 - Photo Studio M/button_pilih_1'))

not_run: WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Pengaturan  1 - Photo Studio M/img_coordinate-1'))

not_run: WebUI.delay(1)

not_run: WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Pengaturan  1 - Photo Studio M/i_fa fa-angle-right'))

not_run: WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Pengaturan  1 - Photo Studio M/button_pilih_2'))

not_run: WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Pengaturan  1 - Photo Studio M/img_coordinate-2'))

not_run: WebUI.delay(1)

not_run: WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Pengaturan  1 - Photo Studio M/i_fa fa-angle-right'))

not_run: WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Pengaturan  1 - Photo Studio M/button_pilih_3'))

not_run: WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Pengaturan  1 - Photo Studio M/img_coordinate-3'))

not_run: WebUI.delay(1)

not_run: WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Pengaturan  1 - Photo Studio M/i_fa fa-angle-right'))

not_run: WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Pengaturan  1 - Photo Studio M/button_pilih_4'))

not_run: WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Pengaturan  1 - Photo Studio M/img_coordinate-4'))

not_run: WebUI.delay(1)

not_run: WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Pengaturan  1 - Photo Studio M/i_fa fa-angle-right'))

not_run: WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Pengaturan  1 - Photo Studio M/button_pilih_5'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Pengaturan  1 - Photo Studio M/button_OK Lanjutkan'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Pengaturan  1 - Photo Studio M/button_Lanjut'))

WebUI.setText(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Pengaturan  1 - Photo Studio M/input_text1'), 
    'Test Title')

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Pengaturan  1 - Photo Studio M/button_Finish'))

not_run: WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Pengaturan  1 - Photo Studio M/a_Tidak Lewati'))

WebUI.waitForElementClickable(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order Order Studio Non Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio M/button_Ya Saya Mau Pesan Foto'), 
    1)

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Ya Saya Mau Pesan Foto'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/Pilih Sebagai Penambahan Photo'))

WebUI.scrollToElement(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/label_Pilih Semua Foto'), 
    1)

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/label_Pilih Semua Foto'))

WebUI.scrollToElement(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Selanjutnya'), 
    1)

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview Order Foto Studio Reservasi untuk diambil di store/Page_Pengaturan  1 - Photo Studio P/button_Selanjutnya'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Pengaturan  1 - Photo Studio M/a_Lanjutkan'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Pengaturan  1 - Photo Studio M/button_Tidak Lanjutkan'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/button_Edit'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/label_Test Beta (Alamat Utama)'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/button_Pilih'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/button_Edit_1'))

WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/a_JNE'))

WebUI.delay(10)

WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/label_OKE'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/button_Pilih_1'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/button_OK Lanjutkan'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/button_Bayar Sekarang'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/span_glyphicon .glyphicon-star'))

WebUI.setText(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/textarea_message'), 
    'Good service')

WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/button_OK'))

WebUI.verifyElementVisible(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/h2_Sudah Selesai. Terima Kasih'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/button_OK Selesai'))

WebUI.scrollToElement(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/a_Tidak Preview Lain Kali'), 
    1)

WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Preview/OR Preview order studio non reservasi untuk dikirim ke alamat customer/Page_Review Order  Jonas Photo/a_Tidak Preview Lain Kali'))

WebUI.closeBrowser()

