import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Buka Browser\r\n'
WebUI.openBrowser('')

WebUI.maximizeWindow()

'Akses Url'
WebUI.navigateToUrl('https://stg.movic.id/home')

'Menampilkan Semua Mobil di Kota Bandung\r\n'
WebUI.click(findTestObject('Object Repository/Front-End/OR Homepage/OR Sort dan Filter untuk data mobil di destinasi populer/a_Bandung'))

WebUI.delay(2)

'Sort berdasarkan Termurah'
WebUI.selectOptionByValue(findTestObject('Object Repository/Front-End/OR Homepage/OR Sort dan Filter untuk data mobil di destinasi populer/select_Termurah        Termaha'), 
    'lowest-price', true)

WebUI.delay(2)

'Menampilkan Pilihan Filter'
WebUI.click(findTestObject('Object Repository/Front-End/OR Homepage/OR Sort dan Filter untuk data mobil di destinasi populer/a_FILTER'))

WebUI.delay(2)

'Filter Mobil Berdasarkan Plat Ganjil'
WebUI.click(findTestObject('Object Repository/Front-End/OR Homepage/OR Sort dan Filter untuk data mobil di destinasi populer/label_Ganjil'))

WebUI.delay(2)

'Filter Mobil Berdasarkan Brand BMW'
WebUI.click(findTestObject('Object Repository/Front-End/OR Homepage/OR Sort dan Filter untuk data mobil di destinasi populer/label_BMW'))

WebUI.delay(2)

'Scroll keatas'
WebUI.scrollToPosition(260, 125)

WebUI.delay(2)

'Klik Reset Filter'
WebUI.click(findTestObject('Object Repository/Front-End/OR Homepage/OR Sort dan Filter untuk data mobil di destinasi populer/a_Reset filter'))

