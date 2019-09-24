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

'Menampilkan Semua Mobil di Sekitar Lokasi'
WebUI.click(findTestObject('Front-End/OR Homepage/OR Sort dan Filter untuk data mobil di lokasi terdekat/a_Lihat Semua (12)'))

WebUI.delay(2)

'Sort berdasarkan Termurah'
WebUI.selectOptionByValue(findTestObject('Front-End/OR Homepage/OR Sort dan Filter untuk data mobil di lokasi terdekat/select_Termurah        Termaha'), 
    'lowest-price', true)

WebUI.delay(2)

'Menampilkan Pilihan Filter'
WebUI.click(findTestObject('Front-End/OR Homepage/OR Sort dan Filter untuk data mobil di lokasi terdekat/a_FILTER'))

WebUI.delay(2)

'Filter Mobil Berdasarkan Plat Ganjil'
WebUI.click(findTestObject('Front-End/OR Homepage/OR Sort dan Filter untuk data mobil di lokasi terdekat/label_Ganjil'))

WebUI.delay(2)

'Filter Mobil Berdasarkan Brand BMW'
WebUI.click(findTestObject('Front-End/OR Homepage/OR Sort dan Filter untuk data mobil di lokasi terdekat/label_BMW'))

WebUI.delay(2)

'Scroll keatas'
WebUI.scrollToPosition(260, 125)

WebUI.delay(2)

'Klik Reset Filter'
WebUI.click(findTestObject('Front-End/OR Homepage/OR Sort dan Filter untuk data mobil di lokasi terdekat/a_Reset filter'))

WebUI.delay(2)

'Scroll keatas'
WebUI.scrollToPosition(450, 750)

WebUI.delay(2)

'Filter Mobil Berdasarkan Brand BMW'
WebUI.click(findTestObject('Front-End/OR Homepage/OR Sort dan Filter untuk data mobil di lokasi terdekat/h5_BMW X3'))

