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

WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Pilih Paket Lain di cart dengan harga produk di bawah minimum order reservasi/Page_Hello you look great today   J/a_Cart'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Pilih Paket Lain di cart dengan harga produk di bawah minimum order reservasi/Page_Produk Anda  Jonas Photo/a_Pilih Paket Lain'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Pilih Paket Lain di cart dengan harga produk di bawah minimum order reservasi/Page_Our Photography Services  Jona/div_Photo On Studio'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Pilih Paket Lain di cart dengan harga produk di bawah minimum order reservasi/Page_Our Photo Studio Product  Jona/h5_Kids'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Pilih Paket Lain di cart dengan harga produk di bawah minimum order reservasi/Page_Product catalogue  Jonas Photo/h3_Painting Kids'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Pilih Paket Lain di cart dengan harga produk di bawah minimum order reservasi/Page_Cari Produk  Jonas Photo/button_Cari Produk'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Pilih Paket Lain di cart dengan harga produk di bawah minimum order reservasi/Page_Produk Anda  Jonas Photo/button_Tambahkan Ke Keranjang'))

