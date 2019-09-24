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

'Buka browser'
WebUI.openBrowser('')

'Maximize window'
WebUI.maximizeWindow()

'Akses Url'
WebUI.navigateToUrl('https://stg.movic.id/home')

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Front-End/OR Booking/OR Pencarian di My Booking/a_Masuk'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Front-End/OR Booking/OR Pencarian di My Booking/input_EmailNomor Handphone_for'), 
    'belinda.natalia@wgs.co.id')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Front-End/OR Booking/OR Pencarian di My Booking/input_Password_form-control ng'), 'P@ssw0rd')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Front-End/OR Booking/OR Pencarian di My Booking/button_MASUK'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Klik Menu Pesanan Saya'
WebUI.click(findTestObject('Object Repository/Front-End/OR Booking/OR Pencarian di My Booking/img'))

WebUI.delay(5)

'Input Field Search'
WebUI.setText(findTestObject('Object Repository/Front-End/OR Booking/OR Pencarian di My Booking/input_My Booking_form-control'), 
    'Agya')

'Enter di Field Search'
WebUI.sendKeys(findTestObject('Object Repository/Front-End/OR Booking/OR Pencarian di My Booking/input_My Booking_form-control'), 
    Keys.chord(Keys.ENTER))

