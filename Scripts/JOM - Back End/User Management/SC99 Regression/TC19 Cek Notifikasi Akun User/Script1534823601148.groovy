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

WebUI.callTestCase(findTestCase('JOM - Back End/Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('JOM - Back End/User Management/OR Create User Front End/Page_JOM 3.0  Dashboard/span_User Management'), 
    0)

WebUI.click(findTestObject('JOM - Back End/User Management/OR Create User Front End/Page_JOM 3.0  Dashboard/span_User Management'))

WebUI.click(findTestObject('JOM - Back End/User Management/OR Create User Front End/Page_JOM 3.0  Dashboard/span_User Registration'))

WebUI.click(findTestObject('JOM - Back End/User Management/OR Create User Front End/Page_JOM 3.0  Dashboard/span_User Frontend'))

WebUI.setText(findTestObject('JOM - Back End/User Management/OR Cek Notifikasi Aktivasi Akun/Page_JOM 3.0  User Frontend/input_form-control input-sm'), 
    'ali.saputra')

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

//Go in to new tab
WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('http://www.gmail.com')

not_run: WebUI.navigateToUrl('https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/User Management/OR Cek Notifikasi Aktivasi Akun/Page_Gmail/input_identifier'), 
    'ali.saputra@wgs.co.id')

WebUI.click(findTestObject('Object Repository/JOM - Back End/User Management/OR Cek Notifikasi Aktivasi Akun/Page_Gmail/span_Berikutnya'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/User Management/OR Cek Notifikasi Aktivasi Akun/Page_Gmail/input_password'), 
    'android1')

WebUI.click(findTestObject('Object Repository/JOM - Back End/User Management/OR Cek Notifikasi Aktivasi Akun/Page_Gmail/span_Berikutnya'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/JOM - Back End/User Management/OR Cek Notifikasi Aktivasi Akun/Page_Inbox (1) - ali.saputrawgs.co./span_More'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/User Management/OR Cek Notifikasi Aktivasi Akun/Page_Inbox (1) - ali.saputrawgs.co./div_Spam (6)'))

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/User Management/OR Cek Notifikasi Aktivasi Akun/Page_Spam (6) - ali.saputrawgs.co.i/div_Jonas Photo'))

WebUI.waitForElementVisible(findTestObject('Object Repository/JOM - Back End/User Management/OR Cek Notifikasi Aktivasi Akun/Page_User Activation - ali.saputraw/a_Aktifkan'), 
    0)

WebUI.click(findTestObject('Object Repository/JOM - Back End/User Management/OR Cek Notifikasi Aktivasi Akun/Page_User Activation - ali.saputraw/a_Aktifkan'))

currentWindow = WebUI.getWindowIndex()

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/User Management/OR Cek Notifikasi Aktivasi Akun/Page_JOM 3.0  User Activation/input_password'), 
    'P@ssw0rd')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/User Management/OR Cek Notifikasi Aktivasi Akun/Page_JOM 3.0  User Activation/input_password_confirmation'), 
    'P@ssw0rd')

WebUI.click(findTestObject('Object Repository/JOM - Back End/User Management/OR Cek Notifikasi Aktivasi Akun/Page_JOM 3.0  User Activation/button_Save'))

WebUI.delay(10)

