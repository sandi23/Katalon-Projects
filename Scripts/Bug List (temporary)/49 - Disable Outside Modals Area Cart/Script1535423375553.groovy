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

'Simulasi login'
WebUI.callTestCase(findTestCase('JOM - Front End/FE Order/SC24  Regression/TC02 Login sebagai User'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Simulasi mouse scroll ke button \'Cetak Photo\''
WebUI.scrollToElement(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Helo you look great today   Jo/a_Cetak Photo'), 
    1)

'Simulasi klik button \'Cetak Photo\''
WebUI.click(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Helo you look great today   Jo/a_Cetak Photo'))

'Simulasi klik div \'Regular Print\''
WebUI.click(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Kategori Produk Printing  Jona/h4_Regular Print'))

'Simulasi mouse scroll ke button \'Browse\''
WebUI.scrollToElement(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo (1)/input_images'), 
    1)

not_run: CustomKeywords.'WebUICustomKeyword.uploadFile'(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo (1)/input_images'), 
    'C:\\Users\\ALIMSAPUTRA\\Downloads\\pictures\\IMG0015.jpg')

'Simulasi upload file'
not_run: WebUI.uploadFile(findTestObject('JOM - Front End/FE Order/OR Buat Order Printing Eceran untuk diambil di store/Page_Photo Printing  Jonas Photo (1)/input_images'), 
    '')

CustomKeywords.'WebUICustomKeyword.uploadFile'(findTestObject('Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo (1)/input_images'), 
    'D:\\pictures\\smallest\\1.jpg')

'Simulasi klik foto yang akan dicetak'
WebUI.waitForElementVisible(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo/label'), 
    0)

'Simulasi klik foto yang akan dicetak'
WebUI.doubleClick(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo/label'))

'Simulasi klik button \'Cetak Foto Ini\''
WebUI.click(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo/button_Cetak Foto Ini'))

'Simulasi pilih tambahan cetakan'
WebUI.click(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo/h5_Cetak Photo  Laminasi 3R'))

WebUI.click(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo/a_Small Print'))

WebUI.click(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo (2)/label'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo/button_Simpan'), 
    1)

WebUI.click(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo/button_Simpan'))

'Simulasi pilih kertas Photo'
WebUI.click(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo/span_Photo'))

'Simulasi klik dropdown \'Color\'\r\n'
WebUI.click(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo/span_Color'))

'Simulasi pilih option \'Black and White\''
WebUI.click(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo/span_Black and White'))

'Simulasi tambah jumlah cetakan'
WebUI.click(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo/span_glyphicon glyphicon-plus'))

'Simulasi klik button \'Ya, Cetak dengan Ukuran diatas\''
WebUI.click(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo/button_Ya Cetak Dengan Ukuran'))

'Penjelasan for loop'
WebUI.comment('Looping dibawah mengecek 4 kali apakah item di cart tetap visible saat item di luar cart diklik. Akan throw error di step 22.4 apabila item di cart tetap visible (always on top)')

for (def index : (0..4)) {
    WebUI.scrollToElement(findTestObject('Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo (3)/button_OK Lanjutkan'), 
        1)

    WebUI.click(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo (3)/button_OK Lanjutkan'))

    WebUI.click(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo (3)/a_Ambil di store'))

    WebUI.click(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo/td_1'))

    WebUI.verifyElementVisible(findTestObject('Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo/div_Produk yang Anda pilih 1 p'))

    WebUI.click(findTestObject('Object Repository/Bug List/49 - Disable Outside Modals Area Cart/Page_Photo Printing  Jonas Photo/button_close modal-close-on-to'))
}

