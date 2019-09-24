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

'Simulasi klik div \'Kids\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order non reservasi dengan penambahan pose, orang, dan frame/Page_Our Photo Studio Product  Jona/h5_Kids'))

'Simulasi klik div \'Mini Poster\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order non reservasi dengan penambahan pose, orang, dan frame/Page_Product catalogue  Jonas Photo/h3_Mini Poster'))

'Simulasi klik button \'Cari Produk\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order non reservasi dengan penambahan pose, orang, dan frame/Page_Cari Produk  Jonas Photo/button_Cari Produk'))

'Simulasi klik button \'Tambahkan ke Keranjang\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order non reservasi dengan penambahan pose, orang, dan frame/Page_Produk Anda  Jonas Photo/button_Tambahkan Ke Keranjang'))

'Simulasi klik button \'Selesai, lanjutkan ke Order\''
not_run: WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Buat Order non reservasi dengan penambahan pose, orang, dan frame/Page_Produk Anda  Jonas Photo/a_Selesai Lanjutkan ke Order'))

