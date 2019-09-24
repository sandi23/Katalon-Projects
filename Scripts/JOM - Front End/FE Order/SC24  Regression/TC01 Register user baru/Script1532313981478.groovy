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

'Simulasi membuka browser'
WebUI.openBrowser('')

'Simulasi membesarkan window browser'
WebUI.maximizeWindow()

'Simulasi input URL serta loading webpage'
WebUI.navigateToUrl('http://jom-demo-banda.stagingapps.net/')

'Memberi jeda untuk webpage selesai loading semua elemen\r\n'
WebUI.delay(5)

'Simulasi klik button menu Login'
WebUI.click(findTestObject('JOM - Front End/Order/SC24 Regression/OR Register User Baru/Page_Helo you look great today   Jo/a_Login'))

'Simulasi klik tab Daftar pada menu Login'
WebUI.click(findTestObject('JOM - Front End/Order/SC24 Regression/OR Register User Baru/Page_Helo you look great today   Jo/span_Daftar'))

'Simulasi input email'
WebUI.setText(findTestObject('JOM - Front End/Order/SC24 Regression/OR Register User Baru/Page_Helo you look great today   Jo/input_email'), 'test20@test.com')

'Simulasi input nomor telepon'
WebUI.setText(findTestObject('JOM - Front End/Order/SC24 Regression/OR Register User Baru/Page_Helo you look great today   Jo/input_phone'), '123945678')

'Simulasi input password\r\n'
WebUI.setText(findTestObject('JOM - Front End/Order/SC24 Regression/OR Register User Baru/Page_Helo you look great today   Jo/input_password'), 'test1234')

'Simulasi input konfirmasi password\r\n'
WebUI.setText(findTestObject('JOM - Front End/Order/SC24 Regression/OR Register User Baru/Page_Helo you look great today   Jo/input_password_confirmation'), 
    'test1234')

'Simulasi klik button daftar'
WebUI.click(findTestObject('JOM - Front End/Order/SC24 Regression/OR Register User Baru/Page_Helo you look great today   Jo/button_Daftar'))

'Simulasi input nama lengkap'
WebUI.setText(findTestObject('JOM - Front End/Order/SC24 Regression/OR Register User Baru/Page_Helo you look great today   Jo/input_name'), 'test sembilan')

'Simulasi pilih tanggal lahir '
WebUI.sendKeys(findTestObject('JOM - Front End/Order/SC24 Regression/OR Register User Baru/Page_Helo you look great today   Jo/span_Tgl'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

'Simulasi pilih bulan lahir '
WebUI.sendKeys(findTestObject('JOM - Front End/Order/SC24 Regression/OR Register User Baru/Page_Helo you look great today   Jo/span_Bulan'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

'Simulasi pilih tahun lahir \r\n'
WebUI.sendKeys(findTestObject('JOM - Front End/Order/SC24 Regression/OR Register User Baru/Page_Helo you look great today   Jo/span_Tahun'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

'Simulasi klik label Laki-laki'
WebUI.click(findTestObject('JOM - Front End/Order/SC24 Regression/OR Register User Baru/Page_Helo you look great today   Jo/label_Laki-laki'))

'Simulasi pilih provinsi tempat tinggal'
WebUI.sendKeys(findTestObject('JOM - Front End/Order/SC24 Regression/OR Register User Baru/Page_Helo you look great today   Jo/span_Pilih Provinsi'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

'Simulasi pilih kota tempat tinggal'
WebUI.sendKeys(findTestObject('JOM - Front End/Order/SC24 Regression/OR Register User Baru/Page_Helo you look great today   Jo/span_Pilih Kota'), Keys.chord(
        Keys.ARROW_DOWN, Keys.ENTER))

'Simulasi pilih kecamatan tempat tinggal'
WebUI.sendKeys(findTestObject('JOM - Front End/Order/SC24 Regression/OR Register User Baru/Page_Helo you look great today   Jo/span_Pilih Kecamatan'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

'Simulasi input alamat tempat tinggal'
WebUI.setText(findTestObject('JOM - Front End/Order/SC24 Regression/OR Register User Baru/Page_Helo you look great today   Jo/textarea_address'), 'Jl. Soekarno Hatta')

'Simulasi input kode pos\r\n'
WebUI.setText(findTestObject('JOM - Front End/Order/SC24 Regression/OR Register User Baru/Page_Helo you look great today   Jo/input_postcode'), '123456')

'Simulasi klik button Selesai'
WebUI.click(findTestObject('JOM - Front End/Order/SC24 Regression/OR Register User Baru/Page_Helo you look great today   Jo/button_Selesai'))

'Verifikasi user telah ter-registrasi'
WebUI.verifyElementClickable(findTestObject('JOM - Front End/Order/SC24 Regression/OR Register User Baru/Page_Helo you look great today   Jo/a_test sembilan'))

'Simulasi tutup browser'
WebUI.closeBrowser()

