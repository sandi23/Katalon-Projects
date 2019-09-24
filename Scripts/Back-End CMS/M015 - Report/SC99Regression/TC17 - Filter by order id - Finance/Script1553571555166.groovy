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

WebUI.click(findTestObject('Object Repository/Backend/OR Report/a_Report (2)'))

WebUI.click(findTestObject('Object Repository/Backend/OR Report/a_Finance'))

WebUI.click(findTestObject('Object Repository/Backend/OR Report/a_Finance_1'))

WebUI.selectOptionByValue(findTestObject('Page_Report - Finance/select_Transaction ID         '), 'order-id', true)

WebUI.click(findTestObject('Page_Report - Finance/td_MOV041020188184'))

WebUI.setText(findTestObject('Page_Report - Finance/input_Finance_searchValue'), 'MOV041020188184')

WebUI.click(findTestObject('Page_Report - Finance/button_Finance_filterBtn'))

WebUI.delay(2)

