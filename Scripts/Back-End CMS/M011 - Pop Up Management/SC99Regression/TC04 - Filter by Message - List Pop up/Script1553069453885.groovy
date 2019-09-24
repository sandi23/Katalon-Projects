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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stg-cms.movic.id/login')

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Pop Up Management/select_Title (1)'), 'period', true)

WebUI.click(findTestObject('Object Repository/Backend/OR Pop Up Management/td_20'))

WebUI.click(findTestObject('Object Repository/Backend/OR Pop Up Management/td_30'))

WebUI.click(findTestObject('Object Repository/Backend/OR Pop Up Management/td_30'))

WebUI.click(findTestObject('Object Repository/Backend/OR Pop Up Management/td_30'))

WebUI.click(findTestObject('Object Repository/Backend/OR Pop Up Management/td_11'))

WebUI.click(findTestObject('Object Repository/Backend/OR Pop Up Management/td_30'))

WebUI.click(findTestObject('Object Repository/Backend/OR Pop Up Management/button_Apply'))

WebUI.click(findTestObject('Object Repository/Backend/OR Pop Up Management/td_11'))

WebUI.click(findTestObject('Object Repository/Backend/OR Pop Up Management/td_14'))

WebUI.click(findTestObject('Object Repository/Backend/OR Pop Up Management/button_Apply'))

