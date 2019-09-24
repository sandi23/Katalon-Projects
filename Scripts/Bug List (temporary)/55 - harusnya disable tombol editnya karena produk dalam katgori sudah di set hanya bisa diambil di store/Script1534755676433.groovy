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

'Simulasi buka browser, input URL, tunggu webpage login'
WebUI.openBrowser('http://jom-demo-banda.stagingapps.net/')

'Simulasi klik button \'Cetak Photo\''
WebUI.click(findTestObject('Object Repository/Bug List/55/Page_Helo you look great today   Jo/a_Cetak Photo'))

'Simulasi pilih \'Instant Print\' (Send to Customer = No)'
WebUI.click(findTestObject('Object Repository/Bug List/55/Page_Kategori Produk Printing  Jona/h4_Instant Print'))

'Simulasi upload foto'
WebUI.uploadFile(findTestObject('Bug List/52 - Alert for Empty Destination/Page_Photo Printing  Jonas Photo/input_images'), 
    'D:\\pictures\\smallest\\1.jpg')

'Simulasi klik checkbox \'Pilih Semua\''
WebUI.waitForElementVisible(findTestObject('Object Repository/Bug List/55/Page_Photo Printing  Jonas Photo/label_Pilih Semua'), 
    0)

'Simulasi klik checkbox \'Pilih Semua\''
WebUI.click(findTestObject('Object Repository/Bug List/55/Page_Photo Printing  Jonas Photo/label_Pilih Semua'))

'Simulasi klik button \'Cetak Foto Ini\''
WebUI.click(findTestObject('Object Repository/Bug List/55/Page_Photo Printing  Jonas Photo/button_Cetak Foto Ini'))

'Simulasi klik dropdown \'Tambah Cetakan\''
WebUI.click(findTestObject('Object Repository/Bug List/55/Page_Photo Printing  Jonas Photo/a_ Tambah Cetakan'))

WebUI.delay(5)

'Simulasi klik checkbox item pertama pada menu Tambah Cetakan'
WebUI.doubleClick(findTestObject('Object Repository/Bug List/55/Page_Photo Printing  Jonas Photo/label'))

'Simulasi klik button \'Simpan\''
WebUI.click(findTestObject('Bug List/26/Page_Photo Printing  Jonas Photo/button_Simpan'))

'Simulasi pilih kertas Photo'
WebUI.doubleClick(findTestObject('Object Repository/Bug List/55/Page_Photo Printing  Jonas Photo/span_Photo'))

'Simulasi pilih Color'
WebUI.doubleClick(findTestObject('Object Repository/Bug List/55/Page_Photo Printing  Jonas Photo/span_Color'))

'Simulasi tambah cetakan'
WebUI.click(findTestObject('Object Repository/Bug List/55/Page_Photo Printing  Jonas Photo/span_glyphicon glyphicon-plus'))

'Simulasi klik button \'Ya, Cetak dengan ukuran diatas\''
WebUI.click(findTestObject('Bug List/26/Page_Photo Printing  Jonas Photo/button_Ya Cetak Dengan Ukuran'))

WebUI.delay(2)

'Simulasi klik button \'OK, Lanjutkan\''
WebUI.doubleClick(findTestObject('Object Repository/Bug List/55/Page_Photo Printing  Jonas Photo/button_OK Lanjutkan'))

'Simulasi klik button \'Lanjutkan\''
WebUI.doubleClick(findTestObject('Object Repository/Bug List/55/Page_Photo Printing  Jonas Photo/a_Lanjutkan'))

'Simulasi klik button \'Selesai, Lanjutkan ke Order\''
WebUI.doubleClick(findTestObject('Object Repository/Bug List/55/Page_Photo Printing  Jonas Photo/a_Selesai Lanjutkan ke Order'))

'Simulasi login'
WebUI.callTestCase(findTestCase('JOM - Front End/FE Order/SC24  Regression/TC02 Login sebagai User'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

'Verifikasi button Edit pada alamat pengiriman tidak bisa diklik'
WebUI.verifyElementNotClickable(findTestObject('Bug List/55/Page_Review Order  Jonas Photo/button_Edit'))

'Verifikasi button Edit pada kurir tidak bisa diklik'
WebUI.verifyElementNotClickable(findTestObject('Bug List/55/Page_Review Order  Jonas Photo/button_Edit (1)'))

