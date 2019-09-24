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

WebUI.callTestCase(findTestCase('Front-End/User/SC99 Regression/TC12 Login Sebagai Owner'), [:], FailureHandling.STOP_ON_FAILURE)

'Klik Menu Kendaraan Saya'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set available data mobil/img'))

WebUI.delay(1)

'Klik Tab Tidak Tersedia'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set available data mobil/a_Tidak Tersedia (1)'))

WebUI.delay(1)

'Klik Button Tiga Titik'
WebUI.click(findTestObject('Front-End/OR Product/OR Set available data mobil/button_tiga_titik'))

WebUI.delay(1)

'Klik Set Available'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set available data mobil/a_Set Available'))

WebUI.delay(1)

'Klik Tab Tersedia'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Set available data mobil/a_Tersedia (13)'))

WebUI.delay(1)

'Search Mobil Untuk Cek'
WebUI.setText(findTestObject('Object Repository/Front-End/OR Product/OR Set available data mobil/input_SORT BY _form-control ty'), 
    'AGYA')

WebUI.delay(1)

