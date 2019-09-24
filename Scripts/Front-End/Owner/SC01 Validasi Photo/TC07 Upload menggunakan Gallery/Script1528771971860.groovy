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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://movic.stagingapps.net/home')

WebUI.click(findTestObject('Front-End/OR Upload menggunakan Gallery/Page_Home/a_Masuk'))

WebUI.setText(findTestObject('Front-End/OR Upload menggunakan gallery 2/Page_Home/input_form-control ng-untouche'), 'ali.saputra@wgs.co.id')

WebUI.setText(findTestObject('Front-End/OR Upload menggunakan gallery 2/Page_Home/input_form-control ng-untouche_1'), 'Walden1234')

WebUI.click(findTestObject('Front-End/OR Upload menggunakan gallery 2/Page_Home/button_MASUK'))

WebUI.waitForPageLoad(0)

WebUI.refresh()

WebUI.delay(5)

WebUI.click(findTestObject('Front-End/OR Upload menggunakan gallery 2/Page_Home/a_Bergabung menjadi Vehicle Ow'))

WebUI.click(findTestObject('Front-End/OR Upload menggunakan Gallery/Page_Become Owner/a_Bergabung Menjadi Pemilik Mo'))

WebUI.click(findTestObject('Front-End/OR Upload menggunakan gallery 2/Page_Become Owner Register/span_Upload Gambar'))

WebUI.click(findTestObject('Front-End/OR Upload menggunakan gallery 2/Page_Become Owner Register/span_Upload Gambar'))

WebUI.click(findTestObject('Front-End/OR Upload menggunakan gallery 2/Page_Become Owner Register/span_Upload Gambar'))

WebUI.click(findTestObject('Front-End/OR Upload menggunakan gallery 2/Page_Become Owner Register/button_LANJUTKAN'))

not_run: WebUI.closeBrowser()

