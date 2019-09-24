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

'Klik Menu Kendaraan Saya'
WebUI.click(findTestObject('Front-End/OR Product/OR Delete data mobil/img'))

WebUI.delay(1)

'Input Field Search'
WebUI.setText(findTestObject('Object Repository/Front-End/OR Product/OR Delete data mobil/input_SORT BY _form-control ty'), 
    'COLORADO')

WebUI.delay(15)

'Klik Button Tiga Titik'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Delete data mobil/button_Tersedia_btn btn-primar'))

'Klik Button Tiga Titik'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Delete data mobil/button_Tersedia_btn btn-primar'))

WebUI.delay(1)

'Klik Button Delete'
WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Delete data mobil/a_Delete'))

WebUI.delay(1)

'Klik Button Ya'
WebUI.click(findTestObject('Front-End/OR Product/OR Delete data mobil/button_Ya'))

