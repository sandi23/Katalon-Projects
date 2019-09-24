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

'Buka Browser'
WebUI.openBrowser('')

WebUI.maximizeWindow()

'Akses Url'
WebUI.navigateToUrl('https://stg.movic.id/home')

'Klik Notification'
WebUI.click(findTestObject('Front-End/OR Homepage/OR Show More Promo/img'))

'Klik tab Promo'
WebUI.click(findTestObject('Front-End/OR Homepage/OR Show More Promo/a_Promo'))

'Klik Show More Promo'
WebUI.click(findTestObject('Front-End/OR Homepage/OR Show More Promo/a_Lihat Semua Promo'))

'Salin Kode Promo'
WebUI.click(findTestObject('Front-End/OR Homepage/OR Show More Promo/a_Salin'))

