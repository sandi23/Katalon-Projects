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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://jom-demo-banda.stagingapps.net/')

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Helo you look great today   Jo/a_Login'))

WebUI.setText(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Helo you look great today   Jo/input_username'), 
    'ali.msaputra01@gmail.com')

WebUI.setText(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Helo you look great today   Jo/input_password'), 
    '12345678')

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Helo you look great today   Jo/button_Login'))

WebUI.scrollToElement(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Helo you look great today   Jo/a_Cetak Photo'), 
    0)

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Helo you look great today   Jo/a_Cetak Photo'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Kategori Produk Printing  Jona/h4_Regular Print'))

WebUI.scrollToElement(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo (1)/input_images'), 
    0)

not_run: WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo (1)/input_images'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'WebUICustomKeyword.uploadFile'(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo (1)/input_images'), 
    'C:\\Users\\ALIMSAPUTRA\\Downloads\\pictures\\family-on-caribbean-beach.jpg')

not_run: CustomKeywords.'WebUICustomKeyword.uploadFile'(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo (1)/input_images'), 
    'D:\\pictures\\smallest\\1.jpg')

not_run: WebUI.uploadFile(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo (1)/input_images'), 
    'C:\\Users\\ALIMSAPUTRA\\Downloads\\pictures\\family-on-caribbean-beach.jpg')

WebUI.waitForElementVisible(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/label'), 
    0)

WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/label'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/button_Cetak Foto Ini'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/h5_Cetak Photo  Laminasi 3R'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/a_Small Print'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo (2)/label'))

WebUI.waitForElementClickable(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/button_Simpan'), 
    0)

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/button_Simpan'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/span_Photo'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/span_Color'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/span_Black and White'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/span_glyphicon glyphicon-plus'))

not_run: WebUI.setText(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/input_qty'), 
    '2')

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/button_Ya Cetak Dengan Ukuran'))

WebUI.waitForElementVisible(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo (3)/a_ Tambah Cetakan'), 
    0)

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo (3)/a_ Tambah Cetakan'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo (3)/a_Large Print'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo (3)/td'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo/button_Simpan'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo (3)/button_OK Lanjutkan'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo (3)/a_Ambil di store'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo (3)/a_Selesai Lanjutkan ke Order'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Review Order  Jonas Photo/button_Buat Order'))

not_run: WebUI.closeBrowser()

