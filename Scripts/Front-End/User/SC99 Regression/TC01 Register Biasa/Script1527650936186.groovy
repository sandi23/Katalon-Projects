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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

'Buka browser'
WebUI.openBrowser('')

WebUI.maximizeWindow()

'Akses Url'
WebUI.navigateToUrl('https://stg.movic.id/home')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Klik tombol \'Daftar\''
WebUI.click(findTestObject('Front-End/OR User/OR Register Biasa/Page_Home/a_Daftar'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Masukkan Nama Depan'
WebUI.setText(findTestObject('Front-End/OR User/OR Register Biasa/Page_Daftar/input_form-control ng-untouche'), 'Shy')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Masukkan Nama Belakang'
WebUI.setText(findTestObject('Front-End/OR User/OR Register Biasa/Page_Daftar/input_form-control ng-untouche_1'), 'Sir')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Masukkan email address'
WebUI.setText(findTestObject('Front-End/OR User/OR Register Biasa/Page_Daftar/input_form-control ng-untouche_2'), 'ShySir@mailinator.com')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Masukkan No. Handphone'
WebUI.setText(findTestObject('Front-End/OR User/OR Register Biasa/Page_Daftar/input_form-control ng-untouche_3'), '081292577423')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Masukkan password \'Walden1234\''
WebUI.setText(findTestObject('Front-End/OR User/OR Register Biasa/Page_Daftar/input_form-control ng-untouche_4'), 'Walden1234')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Klik tombol \'Daftar Member\''
WebUI.click(findTestObject('Front-End/OR User/OR Register Biasa/Page_Daftar/button_DAFTAR MEMBER'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Menunggu tombol verifikasi clickable'
WebUI.waitForElementClickable(findTestObject('Front-End/OR User/OR Register Biasa/Page_Daftar/button_Verifikasi'), 0)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Klik tombol verifikasi'
WebUI.click(findTestObject('Front-End/OR User/OR Register Biasa/Page_Daftar/button_Verifikasi'))

