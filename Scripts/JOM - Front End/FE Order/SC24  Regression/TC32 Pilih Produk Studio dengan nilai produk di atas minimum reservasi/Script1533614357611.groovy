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

if (GlobalVariable.Loginawal == false) {
    'Simulasi membuka browser\r\n'
    WebUI.openBrowser('')

    'Simulasi membesarkan window'
    WebUI.maximizeWindow()

    'Simulasi input URL dan loading webpage'
    WebUI.navigateToUrl('http://jom-demo-banda.stagingapps.net/')

    WebUI.delay(3)
}

switch (Produk) {
    case 1:
        WebUI.delay(4)

        WebUI.scrollToElement(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/a_Pesan Photo'), 
            1)

        WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/a_Pesan Photo'))

        WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/h4_Photo On Studio'))

        WebUI.delay(3)

        WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/h5_Family (1)'))

        WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/produk family 1'))

        WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/button_Cari Produk'))

        WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/button_Tambahkan Ke Keranjang'))

        WebUI.delay(3)

        WebUI.setText(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/input_form-control text-center'), 
            '2')

        WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/a_Pilih Paket Lain'))

        WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/h4_Photo On Studio'))

        WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/h5_Family'))

        WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/produk family 2'))

        WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/button_Cari Produk'))

        WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/button_Tambahkan Ke Keranjang'))

        WebUI.delay(3)

        WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/span_glyphicon glyphicon-minus'))

        WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/a_Selesai Lanjutkan ke Order'))

        not_run: WebUI.delay(3)

        not_run: WebUI.setText(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/input_total_person'), 
            '11')

        not_run: WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/button_OK Lanjutkan'))

        not_run: WebUI.delay(3)

        break
    case 2:
        WebUI.delay(4)

        WebUI.scrollToElement(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/a_Pesan Photo'), 
            1)

        WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/a_Pesan Photo'))

        WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/h4_Photo On Studio'))

        WebUI.delay(3)

        WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/Checkout diatas minimum reservasi/h5_Kids'))

        WebUI.scrollToElement(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/produk kids 1'), 
            1)

        WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/produk kids 1'))

        WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/button_Cari Produk'))

        WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/button_Tambahkan Ke Keranjang'))

        for (def index : (0..3)) {
            WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/span_glyphicon glyphicon-plus'))
        }
        
        WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/a_Selesai Lanjutkan ke Order'))

        not_run: WebUI.setText(findTestObject('Page_Buat Order  Jonas Photo/input_total_person'), '5')

        not_run: WebUI.click(findTestObject('Page_Buat Order  Jonas Photo/i_fa fa-long-arrow-right'))

        not_run: WebUI.click(findTestObject('Page_Buat Order  Jonas Photo/i_fa fa-long-arrow-right'))

        not_run: WebUI.click(findTestObject('Page_Buat Order  Jonas Photo/img'))

        not_run: WebUI.click(findTestObject('Page_Buat Order  Jonas Photo/img_1'))

        not_run: WebUI.click(findTestObject('Page_Buat Order  Jonas Photo/button_OK Lanjutkan'))

        not_run: WebUI.delay(3)

        break
}

