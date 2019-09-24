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

'Simulasi buka browser, input URL, tunggu webpage loading'
WebUI.openBrowser('http://jom-demo-banda.stagingapps.net/')

'Simulasi membesarkan window'
WebUI.maximizeWindow()

'Simulasi klik button \'Cetak Photo\''
WebUI.click(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Helo you look great today   Jo/a_Cetak Photo'))

'Simulasi pilih \'Regular Print\''
WebUI.click(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Kategori Produk Printing  Jona/h4_Regular Print'))

'Simulasi upload foto'
WebUI.uploadFile(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Photo Printing  Jonas Photo/input_images'), 
    'D:\\pictures\\smallest\\1.jpg')

'Simulasi klik button \'Pilih Semua\''
WebUI.waitForElementVisible(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Photo Printing  Jonas Photo/label_Pilih Semua'), 
    0)

'Simulasi klik button \'Pilih Semua\''
WebUI.click(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Photo Printing  Jonas Photo/label_Pilih Semua'))

'Simulasi klik button \'Cetak Foto Ini\''
WebUI.click(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Photo Printing  Jonas Photo/button_Cetak Foto Ini'))

'Simulasi klik dropdown \'Tambah Cetakan\''
WebUI.click(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Photo Printing  Jonas Photo/a_ Tambah Cetakan'))

'Simulasi klik menu \'Photo Frame\''
WebUI.click(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Photo Printing  Jonas Photo/a_Photo Frame'))

WebUI.delay(5)

'Simulasi klik pilihan pertama pada menu \'Photo Frame\''
WebUI.doubleClick(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Photo Printing  Jonas Photo/label'))

'Simulasi klik button \'Simpan\''
WebUI.click(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Photo Printing  Jonas Photo/button_Simpan'))

'Simulasi klik dropdown \'Photo\''
WebUI.doubleClick(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Photo Printing  Jonas Photo/span_Photo'))

'Simulasi klik dropdown \'Color\''
WebUI.doubleClick(findTestObject('Bug List/38 - FE Order Printing Eceran - save/Page_Photo Printing  Jonas Photo/span_Color'))

'Simulasi tambah cetakan'
WebUI.click(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Photo Printing  Jonas Photo/span_glyphicon glyphicon-plus'))

'Simulasi klik button \'Ya, cetak dengan ukuran diatas\''
WebUI.click(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Photo Printing  Jonas Photo/button_Ya Cetak Dengan Ukuran'))

WebUI.delay(5)

'Verifikasi muncul 1 order printing + frame'
WebUI.doubleClick(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Photo Printing  Jonas Photo/td_1'))

'Verifikasi hanya 1 order printing + frame yang muncul'
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Photo Printing  Jonas Photo/td_2'), 
    1)

not_run: WebUI.click(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Photo Printing  Jonas Photo/button_OK Lanjutkan'))

not_run: WebUI.click(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Photo Printing  Jonas Photo/a_Ambil di store'))

not_run: WebUI.click(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Photo Printing  Jonas Photo/a_Selesai Lanjutkan ke Order'))

not_run: WebUI.callTestCase(findTestCase('JOM - Front End/FE Order/SC24  Regression/TC02 Login sebagai User'), [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.scrollToElement(findTestObject('Bug List/38 - FE Order Printing Eceran - save/Page_Review Order  Jonas Photo/button_Buat Order'), 
    2)

not_run: WebUI.click(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Review Order  Jonas Photo/button_Buat Order'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Selesai  Jonas Photo/h2_Sudah Selesai. Terima Kasih'))

