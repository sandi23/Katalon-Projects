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

not_run: WebUI.callTestCase(findTestCase('JOM - Front End/Credentials/Login User to Order'), [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.scrollToElement(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/a_Pesan Photo'), 
    1)

not_run: WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/a_Pesan Photo'))

not_run: WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/h4_Photo On Studio'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/h5_Family (1)'))

not_run: WebUI.scrollToElement(findTestObject('Bug List/516/minimalis'), 1)

not_run: WebUI.click(findTestObject('Bug List/516/minimalis'))

not_run: WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/button_Cari Produk'))

not_run: WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/button_Tambahkan Ke Keranjang'))

not_run: WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/span_glyphicon glyphicon-plus'))

not_run: WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/a_Selesai Lanjutkan ke Order'))

not_run: WebUI.callTestCase(findTestCase('JOM - Front End/FE Order/SC24  Regression/TC25 Edit pengaturan paket dengan menambah orang, mengganti template dan mengganti background'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('JOM - Front End/FE Order/SC24  Regression/TC20 Checkout produk dengan harga di atas minimum reservasi'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('JOM - Front End/Credentials/Login User to Check In'), [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.scrollToElement(findTestObject('JOM - Front End/FE Studio Checkin/OR Cetak Nomor Antrian Order Studio Non Reservasi/Page_Check In  Jonas Photo/button_Cetak Nomor Antrian'), 
    1)

not_run: WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Checkin/OR Cetak Nomor Antrian Order Studio Non Reservasi/Page_Check In  Jonas Photo/button_Cetak Nomor Antrian'))

not_run: WebUI.delay(3)

not_run: WebUI.switchToWindowIndex(1)

not_run: WebUI.verifyElementVisible(findTestObject('JOM - Front End/FE Studio Checkin/OR Cetak Nomor Antrian Order Studio Non Reservasi/Page_/b_SERVICE Z'))

not_run: WebUI.verifyElementVisible(findTestObject('JOM - Front End/FE Studio Checkin/OR Cetak Nomor Antrian Order Studio Non Reservasi/Page_/b_Z024'))

not_run: WebUI.switchToWindowIndex(0)

not_run: WebUI.verifyElementVisible(findTestObject('JOM - Front End/FE Studio Checkin/OR Cetak Nomor Antrian Order Studio Non Reservasi/Page_Check In  Jonas Photo/h5_Tidak ada produk'))

not_run: WebUI.closeBrowser()

not_run: WebUI.callTestCase(findTestCase('JOM - Front End/Credentials/Login User to Studio'), [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/img'))

'Simulasi klik button Call'
not_run: WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/Page_Studio  Jonas Photo/a_Call'))

'Simulasi klik button Come In'
not_run: WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/Page_Pemanggilan Antrian  Jonas Pho/a_Come In'))

'Simulasi klik button Start'
not_run: WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/Page_Preparation  Jonas Photo/a_Start'))

'Simulasi klik button \'Selesai Foto, Lanjutkan\''
not_run: WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/Page_Pemotretan  Jonas Photo/a_Selesai Foto Lanjutkan'))

'Beri jeda upload foto secara manual'
not_run: WebUI.delay(40)

'Simulasi klik button \'Upload Foto\''
not_run: WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/Page_Upload Foto  Jonas Photo/a_Upload Foto'))

'Verifikasi muncul notifikasi upload foto telah selesai'
not_run: WebUI.verifyElementVisible(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/Page_Pemanggilan Antrian  Jonas Pho/div_Upload foto telah selesai'))

WebUI.callTestCase(findTestCase('JOM - Front End/Credentials/Login User to Preview'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Bug List/516/preview'))

WebUI.delay(5)

WebUI.click(findTestObject('Bug List/516/foto1'))

WebUI.click(findTestObject('Bug List/516/input1'))

WebUI.delay(3)

WebUI.focus(findTestObject('Bug List/516/input1'))

WebUI.sendKeys(findTestObject('Bug List/516/input1'), Keys.chord(Keys.ESCAPE))

WebUI.delay(5)

WebUI.closeBrowser()

