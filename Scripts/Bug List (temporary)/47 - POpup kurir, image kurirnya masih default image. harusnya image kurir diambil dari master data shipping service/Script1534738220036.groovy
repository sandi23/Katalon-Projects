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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By

'Simulasi buka browser, input URL, tunggu webpage loading'
WebUI.openBrowser('http://jom-demo-banda.stagingapps.net/')

'Simulasi membesarkan window'
WebUI.maximizeWindow()

'Method untuk aktivasi WebDriver Selenium (untuk ambil WebElement)'
driver = DriverFactory.getWebDriver()

'Simulasi klik button \'Cetak Foto\''
WebUI.click(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Helo you look great today   Jo/a_Cetak Photo'))

'Simulasi pilih \'Regular Print\''
WebUI.click(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Kategori Produk Printing  Jona/h4_Regular Print'))

'Simulasi upload foto'
WebUI.uploadFile(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Photo Printing  Jonas Photo/input_images'), 
    'C:\\Users\\Sandi\\Pictures\\500.png')

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

'Simulasi klik button \'OK, Lanjutkan\''
WebUI.doubleClick(findTestObject('Object Repository/Bug List/38 - FE Order Printing Eceran - save/Page_Photo Printing  Jonas Photo/button_OK Lanjutkan'))

'Simulasi klik button \'Kirim ke alamat\''
WebUI.click(findTestObject('Bug List/47/Page_Photo Printing  Jonas Photo/a_Kirim ke alamat'))

'Simulasi klik button \'Selesai, lanjutkan ke order\''
WebUI.click(findTestObject('Bug List/38 - FE Order Printing Eceran - save/Page_Photo Printing  Jonas Photo/a_Selesai Lanjutkan ke Order'))

'Simulasi login'
WebUI.callTestCase(findTestCase('JOM - Front End/FE Order/SC24  Regression/TC02 Login sebagai User'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

'Simulasi klik button \'Edit\' pada kurir'
WebUI.doubleClick(findTestObject('Bug List/47/Page_Review Order  Jonas Photo/button_Edit'))

WebUI.delay(2)

'Mengambil semua gambar dari list kurir yang ditampilkan'
List vendors = driver.findElements(By.xpath('id(\'accordion\')/div[@class=\'panel panel-default2\']/div[@class=\'panel-heading\']/table[1]/tbody[1]/tr[1]/td[1]/div[@class=\'img\']/a[1]/img[@id=\'vendor\']'))

'Setiap gambar diverifikasi apakah berasal dari URL master data shipping service'
for (def i : vendors) {
    String source = i.getAttribute('src').substring(0, 58)

    WebUI.verifyMatch(source, 'http://jonas-beta.stagingapps.net/uploads/shipping_service/', false)
}

