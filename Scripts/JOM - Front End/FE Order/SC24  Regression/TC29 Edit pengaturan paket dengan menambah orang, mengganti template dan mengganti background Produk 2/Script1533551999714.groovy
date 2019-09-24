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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver

'Code untuk memanggil web driver (Selenium)'
driver = DriverFactory.getWebDriver()

'Code untuk membuat list objek yang memiliki xpath tertentu (input jumlah orang)'
List inputs = driver.findElements(By.xpath('//input[contains(@id,\'tour-checkout-2\')]'))

'Code untuk membuat list objek yang memiliki xpath tertentu (gambar background)'
List bgs = driver.findElements(By.xpath('//div[1]/div[@class="drag-slider-template"]/div[@class="data-u"]/div[2]/div[@class="form-group-on-jssor"]/label[1]/div[@class="box-template order-studio-box"]/img[1]'))

'Code untuk membuat list objek yang memiliki xpath tertentu (gambar template)'
List imgs = driver.findElements(By.xpath('//div[1]/div[@class="drag-slider-template"]/div[@class="data-u"]/div[3]/div[@class="form-group-on-jssor"]/label[1]/div[@class="box-template order-studio-box"]/img[1]'))

'Simulasi klik pengaturan paket kedua'
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Edit pengaturan paket dengan menambah orang, mengganti template, dan mengganti background Produk 2/Page_Buat Order  Jonas Photo/a_2 - Photo Studio MiniPoster'))

'Beri jeda webpage loading'
WebUI.delay(3)

'Simulasi menghapus isi default input jumlah orang'
inputs[1].clear()

'Simulasi input \'5\' pada jumlah orang'
inputs[1].sendKeys(Keys.NUMPAD5)

'Simulasi pilih template'
imgs[1].click()

'Jeda untuk memilih Background secara manual\t'
WebUI.delay(3)

'Simulasi pilih background'
bgs[3].click()

'Simulasi klik button \'OK, Lanjutkan\''
WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Edit pengaturan paket dengan menambah orang, mengganti template, dan mengganti background Produk 2/Page_Buat Order  Jonas Photo/button_OK Lanjutkan'))

not_run: WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Edit pengaturan paket dengan menambah orang, mengganti template, dan mengganti background Produk 2/Page_Buat Order  Jonas Photo/button_Buat Order'))

not_run: WebUI.delay(3)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Front End/FE Order/OR Edit pengaturan paket dengan menambah orang, mengganti template, dan mengganti background Produk 2/Page_Buat Order  Jonas Photo/h2_Sudah Selesai. Terima Kasih'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Front End/FE Order/OR Edit pengaturan paket dengan menambah orang, mengganti template, dan mengganti background Produk 2/Page_Buat Order  Jonas Photo/a_Login'))

