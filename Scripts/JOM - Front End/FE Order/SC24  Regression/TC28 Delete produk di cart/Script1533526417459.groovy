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

'Simulasi delete 1 produk'
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Delete produk dari cart/Page_Produk Anda  Jonas Photo/Hapus item'))

'Simulasi delete 1 produk'
not_run: WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Delete produk dari cart/Page_Produk Anda  Jonas Photo/i_fa fa-times'))

'Verifikasi muncul notifikasi bahwa cart kosong'
not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Front End/FE Order/OR Delete produk dari cart/Page_Produk Anda  Jonas Photo/h5_Keranjang belanja anda koso'))

'Simulasi klik button \'Selesai, Lanjutkan ke Order\''
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio non-reservasi/Page_Produk Anda  Jonas Photo/a_Selesai Lanjutkan ke Order'))

