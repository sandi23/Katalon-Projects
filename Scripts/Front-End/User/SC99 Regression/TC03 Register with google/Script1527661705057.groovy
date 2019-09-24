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

'Buka browser'
WebUI.openBrowser('')

'Maximize window\r\n'
WebUI.maximizeWindow()

'Akses url'
WebUI.navigateToUrl('http://137.116.144.142/')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Click button daftar'
WebUI.click(findTestObject('Front-End/OR User/OR Register with google/Page_Home/a_Daftar'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Click "Daftar dengan google"'
WebUI.click(findTestObject('Front-End/OR User/OR Register with google/Page_Daftar/button_Daftar dengan Google'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Switch window ke google login'
WebUI.switchToWindowTitle('Sign in - Google Accounts')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Input email'
WebUI.setText(findTestObject('Front-End/OR User/OR Register with google/Page_Sign in - Google Accounts/input_identifier'), 
    'ali.msaputra01@gmail.com')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Click button next'
WebUI.click(findTestObject('Front-End/OR User/OR Register with google/Page_Sign in - Google Accounts/span_Next'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Input password'
WebUI.setText(findTestObject('Front-End/OR User/OR Register with google/Page_Sign in - Google Accounts/input_password'), 
    'android1')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Click button next'
WebUI.click(findTestObject('Front-End/OR User/OR Register with google/Page_Sign in - Google Accounts/span_Next'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Switch window ke halaman movic'
WebUI.switchToWindowUrl('http://movic.stagingapps.net/daftar?form=daftar_google')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

//WebUI.navigateToUrl('http://movic.stagingapps.net/daftar?form=daftar_google')
'Input no.hp'
WebUI.setText(findTestObject('Front-End/OR User/OR Register with google/Page_Daftar/input_form-control ng-untouche'), '081292577423')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Input password'
WebUI.setText(findTestObject('Front-End/OR User/OR Register with google/Page_Daftar/input_form-control ng-untouche_1'), 
    'Walden1234')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Click button daftar'
WebUI.click(findTestObject('Front-End/OR User/OR Register with google/Page_Daftar/button_DAFTAR MEMBER'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Menunggu button verifikasi clickable'
WebUI.waitForElementClickable(findTestObject('Front-End/OR User/OR Register with google/Page_Daftar/button_Verifikasi'), 
    0)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Click button verifikasi'
WebUI.click(findTestObject('Front-End/OR User/OR Register with google/Page_Daftar/button_Verifikasi'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()

