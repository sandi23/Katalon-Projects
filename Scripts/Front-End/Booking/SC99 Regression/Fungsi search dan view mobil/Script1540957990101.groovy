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

WebUI.callTestCase(findTestCase('Front-End/User/SC99 Regression/TC04 Login Biasa with email'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Front-End/OR Booking/OR Fungsi search dan view mobil/input_Sewa Mobil Seharian Cuma'), 'bandung')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Front-End/OR Booking/OR Fungsi search dan view mobil/div_Bandung'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Front-End/OR Booking/OR Fungsi search dan view mobil/label_Car Only'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Front-End/OR Booking/OR Fungsi search dan view mobil/label_With Driver'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Front-End/OR Booking/OR Fungsi search dan view mobil/input_Wednesday_startdate'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Front-End/OR Booking/OR Fungsi search dan view mobil/span_25'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Front-End/OR Booking/OR Fungsi search dan view mobil/input_Thursday_enddate'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Front-End/OR Booking/OR Fungsi search dan view mobil/span_13'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Front-End/OR Booking/OR Fungsi search dan view mobil/button_Cari'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Front-End/OR Booking/OR Fungsi search dan view mobil/p_Toyota'))

