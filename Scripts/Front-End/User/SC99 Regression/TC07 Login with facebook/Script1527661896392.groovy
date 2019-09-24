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

'Akses Url'
WebUI.navigateToUrl('http://137.116.144.142/')

'Klik tombol "Masuk"'
WebUI.click(findTestObject('Front-End/OR User/OR Login with facebook/Page_Home/a_Masuk'))

'Klik image facebook'
WebUI.click(findTestObject('Front-End/OR User/OR Login with facebook/Page_Home/img'))

'Switch window ke window "facebook"'
WebUI.switchToWindowTitle('Facebook')

'Masukkan No. HP'
WebUI.setText(findTestObject('Front-End/OR User/OR Login with facebook/Page_Facebook/input_email'), '081321720932')

'Masukkan Password'
WebUI.setText(findTestObject('Front-End/OR User/OR Login with facebook/Page_Facebook/input_pass'), 'android2')

'Klik login'
WebUI.click(findTestObject('Front-End/OR User/OR Login with facebook/Page_Facebook/input_login'))

'Verifikasi link become owner'
WebUI.verifyLinksAccessible(['https://movic.stagingapps.net/be-come-owner'])

not_run: WebUI.closeBrowser()

