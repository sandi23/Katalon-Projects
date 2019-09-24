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

WebUI.maximizeWindow()

'Akses Url'
WebUI.navigateToUrl('https://stg.movic.id/home')

WebUI.waitForPageLoad(10)

'Klik textlink Masuk'
WebUI.click(findTestObject('Front-End/OR User/OR Login Biasa with email/a_Masuk (1)'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Klik Image "Google"'
WebUI.click(findTestObject('Front-End/OR User/OR Login with google/Page_Home/img'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Switch window ke login google'
WebUI.switchToWindowTitle('Sign in - Google Accounts')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Masukkan alamat email'
WebUI.setText(findTestObject('Front-End/OR User/OR Login with google/Page_Sign in - Google Accounts/input_identifier'), 
    'ali.msaputra01@gmail.com')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Klik tombol "Next"'
WebUI.click(findTestObject('Front-End/OR User/OR Login with google/Page_Sign in - Google Accounts/span_Next'))

'Delay 3 detik'
WebUI.delay(3)

'Masukkan password'
WebUI.setText(findTestObject('Front-End/OR User/OR Login with google/Page_Sign in - Google Accounts/input_password'), 'android1')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Klik tombol "Next"'
WebUI.click(findTestObject('Front-End/OR User/OR Login with google/Page_Sign in - Google Accounts/span_Next'))

'Tutup browser'
not_run: WebUI.closeBrowser()

