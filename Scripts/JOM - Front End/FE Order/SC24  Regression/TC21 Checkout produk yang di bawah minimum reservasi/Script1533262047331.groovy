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

WebUI.scrollToElement(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio non-reservasi/Page_Produk Anda  Jonas Photo/button_OK Lanjutkan'), 
    3)

'Simulasi klik button OK, Lanjutkan'
WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio non-reservasi/Page_Produk Anda  Jonas Photo/button_OK Lanjutkan'))

'Simulasi klik button Buat Order'
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio non-reservasi/Page_Produk Anda  Jonas Photo/button_Buat Order'))

'Beri jeda untuk webpage loading'
WebUI.delay(5)

'Verifikasi muncul notifikasi order berhasil'
WebUI.verifyElementVisible(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio non-reservasi/Page_Produk Anda  Jonas Photo/h2_Sudah Selesai. Terima Kasih'))

'Verifikasi muncul notifikasi order berhasil'
WebUI.verifyElementVisible(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio non-reservasi/Page_Produk Anda  Jonas Photo/p_Silahkan check-in di counter'))

'Verifikasi muncul button Login sebagai tanda telah logout'
WebUI.verifyElementVisible(findTestObject('JOM - Front End/FE Order/OR Logout/Page_Helo you look great today   Jo/a_Login'))

'Simulasi tutup browser'
WebUI.closeBrowser()

