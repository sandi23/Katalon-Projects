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
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver

if (GlobalVariable.OrderSatuPaket == true) {
    WebUI.setText(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/input_total_person'), '11')

    WebUI.scrollToElement(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/template'), 1)

    WebUI.delay(1)

    not_run: WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/img'))

    WebUI.delay(1)

    WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/img_1'), FailureHandling.OPTIONAL)

    WebUI.scrollToElement(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/button_OK Lanjutkan'), 
        1)

    WebUI.click(findTestObject('JOM - Front End/FE Order/Checkout diatas minimum reservasi/button_OK Lanjutkan'), FailureHandling.OPTIONAL)

    WebUI.delay(3, FailureHandling.OPTIONAL)
} else if (GlobalVariable.OrderSatuPaket == false) {
    'Code untuk memanggil web driver (Selenium)'
    driver = DriverFactory.getWebDriver()

    'Code untuk membuat list objek yang memiliki xpath tertentu (input jumlah orang)'
    List inputs = driver.findElements(By.xpath('//input[contains(@id,\'tour-checkout-2\')]'))

    'Code untuk membuat list objek yang memiliki xpath tertentu (gambar background)'
    List bgs = driver.findElements(By.xpath('//div[1]/div[@class="drag-slider-template"]/div[@class="data-u"]/div[2]/div[@class="form-group-on-jssor"]/label[1]/div[@class="box-template order-studio-box"]/img[1]'))

    'Code untuk membuat list objek yang memiliki xpath tertentu (gambar template)'
    List imgs = driver.findElements(By.xpath('//div[1]/div[@class="drag-slider-template"]/div[@class="data-u"]/div[3]/div[@class="form-group-on-jssor"]/label[1]/div[@class="box-template order-studio-box"]/img[1]'))

    'Simulasi menghapus isi default input jumlah orang'
    inputs[0].clear()

    'Simulasi input \'5\' pada jumlah orang'
    inputs[0].sendKeys(Keys.NUMPAD5)

    'Beri jeda'
    WebUI.delay(2)

    'Simulasi pilih template'
    imgs[0].click()

    'Beri jeda'
    WebUI.delay(2)

    'Simulasi pilih background'
    bgs[1].click()
}

