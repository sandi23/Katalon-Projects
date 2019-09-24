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

WebUI.callTestCase(findTestCase('Front-End/User/SC99 Regression/TC12 Login Sebagai Owner'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Edit Mobil/Page_Owner - Dashboard/img'))

WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Edit Mobil/Page_Owner - List Car/button_Tersedia_btn btn-primar'))

WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Edit Mobil/Page_Owner - List Car/i_Edit_fa movic-green fa-edit'))

WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Edit Mobil/Page_Owner - Edit Car/a_Edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Front-End/OR Product/OR Edit Mobil/Page_Owner - Edit Car/select_PeugeotDanDaihatsuHonda'), 
    '309917c1-01d7-4ff8-97aa-6abf10cb8623', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Front-End/OR Product/OR Edit Mobil/Page_Owner - Edit Car/select_CIVICACCORDStepwagonStr'), 
    '4856abc2-055d-4fd0-b532-0a88f1408a3f', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Front-End/OR Product/OR Edit Mobil/Page_Owner - Edit Car/select_19901991199219931994199'), 
    '2000', true)

WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Edit Mobil/Page_Owner - Edit Car/button_'))

WebUI.click(findTestObject('Object Repository/Front-End/OR Product/OR Edit Mobil/Page_Owner - Edit Car/a_SIMPAN'))

