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

'Maximaze browser'
WebUI.maximizeWindow()

'Buka halaman daftar\r\n'
WebUI.navigateToUrl('http://137.116.144.142/')

'Click button daftar'
WebUI.click(findTestObject('Front-End/OR User/OR Register with facebook/Page_Home/a_Daftar'))

'Click "Daftar dengan facebook"'
WebUI.click(findTestObject('Front-End/OR User/OR Register with facebook/Page_Daftar/button_Daftar dengan'))

'Switch window ke facebook window'
WebUI.switchToWindowTitle('Facebook')

'Input email'
WebUI.setText(findTestObject('Front-End/OR User/OR Register with facebook/Page_Facebook/input_email'), 'ali.saputra@wgs.co.id')

'Input password'
WebUI.setText(findTestObject('Front-End/OR User/OR Register with facebook/Page_Facebook/input_pass'), 'android2')

'Click button Login'
WebUI.click(findTestObject('Front-End/OR User/OR Register with facebook/Page_Facebook/input_login'))

'Click button continue di window facebook'
not_run: WebUI.click(findTestObject('Front-End/OR User/OR Register with facebook/Page_Log in With Facebook/button_Continue as Ali'))

'Click login'
not_run: WebUI.click(findTestObject('Front-End/OR User/OR Register with facebook/Page_Facebook/input_login'))

'Switch ke window utama'
WebUI.switchToDefaultContent()

'Input no. hp'
WebUI.setText(findTestObject('Front-End/OR User/OR Register with facebook/Page_Daftar/input_form-control ng-untouche'), 
    '081292577423')

'Input password'
WebUI.setText(findTestObject('Front-End/OR User/OR Register with facebook/Page_Daftar/input_form-control ng-untouche_1'), 
    'Walden1234')

'Click button daftar'
WebUI.click(findTestObject('Front-End/OR User/OR Register with facebook/Page_Daftar/button_DAFTAR MEMBER'))

'Menunggu button verifikasi clickable'
WebUI.waitForElementClickable(findTestObject('Front-End/OR User/OR Register with facebook/Page_Daftar/button_Verifikasi'), 
    0)

'Click button verifikasi'
WebUI.click(findTestObject('Front-End/OR User/OR Register with facebook/Page_Daftar/button_Verifikasi'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()

