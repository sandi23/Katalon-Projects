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

not_run: WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/button_Tambahkan Ke Keranjang'))

not_run: WebUI.setText(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/input_form-control text-center'), 
    '2')

not_run: WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/a_Pilih Paket Lain'))

not_run: WebUI.click(findTestObject('JOM - Front End/FE Order/Pilih Produk Studio/h4_Photo On Studio'))

not_run: WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/h5_Family'))

not_run: WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/img'))

not_run: WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/button_Cari Produk'))

not_run: WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/button_Tambahkan Ke Keranjang'))

not_run: WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/span_glyphicon glyphicon-minus'))

not_run: WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/a_Selesai Lanjutkan ke Order'))

'Ubah ke true jika hendak menjalankan skenario login di tengah order'
not_run: if (!(GlobalVariable.Loginawal == false)) {
    not_run: WebUI.click(findTestObject('JOM - Front End/FE Order/OR Login sebagai User/Page_/a_Login'), FailureHandling.OPTIONAL)

    WebUI.delay(2, FailureHandling.OPTIONAL)

    WebUI.scrollToElement(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/Login'), 2, FailureHandling.OPTIONAL)

    WebUI.setText(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Buat Order  Jonas Photo/input_username'), 
        'beta@email.com', FailureHandling.OPTIONAL)

    WebUI.setText(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Buat Order  Jonas Photo/input_password'), 
        'P@ssw0rd', FailureHandling.OPTIONAL)

    WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Buat Order Studio reservasi/Page_Buat Order  Jonas Photo/button_Login'), 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(2, FailureHandling.OPTIONAL)
}

WebUI.scrollToElement(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/b_Grand Total'), 
    2, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/a_2 - Photo Studio PremiumGold'), 
    FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/button_Buat Order'), 2, 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/button_Buat Order'), 
    FailureHandling.OPTIONAL)

WebUI.delay(4, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/button_Non-Reservasi'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/h2_Sudah Selesai. Terima Kasih'), 
    4, FailureHandling.OPTIONAL)

WebUI.closeBrowser()

