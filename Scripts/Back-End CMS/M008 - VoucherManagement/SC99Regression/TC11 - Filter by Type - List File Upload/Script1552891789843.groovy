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

not_run: WebUI.callTestCase(findTestCase('Back-End CMS/M002 - User Management/SC99 Regression/TC53 - Sign in as Admin'), 
    [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Dashboard/span_Voucher Management'))

WebUI.click(findTestObject('Object Repository/Backend/OR Voucher/a_Voucher Management'))

WebUI.click(findTestObject('Page_Voucher Management/a_Go to list files page'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Page_Voucher Management/select_File Name              '), 'type', true)

WebUI.selectOptionByValue(findTestObject('Page_Voucher Management/select_Register'), 'VOUCHER_REFERRAL', true)

WebUI.click(findTestObject('Page_Voucher Management/button_Import_filterBtn'))

WebUI.delay(2)

