import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
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

WebUI.comment('Update 21/08/2018: button \'Export\' ada tapi disabled')

'Simulasi login'
WebUI.callTestCase(findTestCase('JOM - Back End/User Management/SC99 Regression/TC01 Login As admin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

'Simulasi klik menu \'Store Management\''
WebUI.click(findTestObject('Object Repository/Bug List/67/span_Store Management'))

'Simulasi klik submenu \'General Report\''
WebUI.click(findTestObject('Object Repository/Bug List/67/span_General Report'))

'Simulasi klik button \'Filter\''
WebUI.click(findTestObject('Object Repository/Bug List/67/button_Filter'))

'Verifikasi ada field untuk memfilter periode tanggal dari dan sampai'
WebUI.verifyElementVisible(findTestObject('Object Repository/Bug List/67/label_Order Date'))

'Verifikasi ada field untuk mengisi Store'
WebUI.verifyElementVisible(findTestObject('Object Repository/Bug List/67/label_Store'))

'Simulasi input tanggal dari dan sampai terbalik'
WebUI.setText(findTestObject('Object Repository/Bug List/67/input_from_date'), '2018-08-20 - 2018-08-19')

'Simulasi klik button \'Apply\' pada input tanggal dari step 8'
WebUI.click(findTestObject('Object Repository/Bug List/67/button_Apply'))

'Kode untuk mengambil value dari tanggal setelah step 9 berjalan'
driver = DriverFactory.getWebDriver()

'Kode untuk mengambil value dari tanggal setelah step 9 berjalan'
date_input = driver.findElement(By.xpath('//input[@type = \'text\' and @id = \'from-date\' and @name = \'from_date\' and @placeholder = \'From Date to Until Date\']'))

'Kode untuk mengambil value dari tanggal setelah step 9 berjalan'
text = date_input.getAttribute('value')

'Verifikasi input tanggal dari step 8 terhapus (tervalidasi secara otomatis)'
WebUI.verifyNotMatch(text, '2018-08-20 - 2018-08-19', false)

