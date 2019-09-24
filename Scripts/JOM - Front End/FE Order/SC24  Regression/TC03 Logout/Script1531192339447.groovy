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

'Simulasi membuka browser'
WebUI.openBrowser('')

'Simulasi meng-input URL serta loading URL'
WebUI.navigateToUrl('http://jom-demo-banda.stagingapps.net/')

'Simulasi klik button menu Login (TC02)'
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Logout/Page_Helo you look great today   Jo/a_Login'))

'Simulasi meng-input email (TC02)'
WebUI.setText(findTestObject('JOM - Front End/FE Order/OR Logout/Page_Helo you look great today   Jo/input_username'), 'test1@test.com')

'Simulasi meng-input password (TC02)'
WebUI.setText(findTestObject('JOM - Front End/FE Order/OR Logout/Page_Helo you look great today   Jo/input_password'), '1sampai8')

'Simulasi klik button Login (TC02)'
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Logout/Page_Helo you look great today   Jo/button_Login'))

'Memberi jeda untuk webpage selesai loading semua elemen'
WebUI.delay(1)

'Simulasi klik dropdown menu User'
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Logout/Page_Helo you look great today   Jo/span_caret'))

'Simulasi klik option Logout pada dropdown menu User '
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Logout/Page_Helo you look great today   Jo/a_Keluar'))

'Simulasi menutup browser\r\n'
WebUI.closeBrowser()

