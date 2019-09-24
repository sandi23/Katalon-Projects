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

'Maximize window'
WebUI.maximizeWindow()

'Akses Url'
WebUI.navigateToUrl('https://stg.movic.id/home')

WebUI.waitForPageLoad(10)

'Klik textlink Masuk'
WebUI.click(findTestObject('Front-End/OR User/OR Login Biasa with email/a_Masuk (1)'))

WebUI.delay(3)

'Input Email'
WebUI.setText(findTestObject('Object Repository/Front-End/OR User/OR Login Biasa with email/input_EmailNomor Handphone_for'), 
    'nandang@gmail.com')

WebUI.delay(3)

'Input Password'
WebUI.setText(findTestObject('Front-End/OR User/OR Login Biasa with email/input_Password_form-control ng'), 'password7')

WebUI.delay(3)

'Klik Button Masuk'
WebUI.click(findTestObject('Front-End/OR Product/OR Edit Mobil/Page_Home/Page_Home/button_Masuk - 2'))

'Verifikasi popup "Success" Visible'
not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Front-End/OR User/OR Login Biasa with email/div_i  SuccessTerimakasih Anda'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

