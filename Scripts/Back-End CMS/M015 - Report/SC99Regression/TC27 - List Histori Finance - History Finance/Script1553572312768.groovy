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

WebUI.click(findTestObject('Object Repository/Backend/OR Report/a_Report (3)'))

WebUI.click(findTestObject('Object Repository/Backend/OR Report/a_Finance (1)'))

WebUI.click(findTestObject('Object Repository/Backend/OR Report/a_History Finance'))

WebUI.click(findTestObject('Object Repository/Backend/OR Report/td_ESP1549436183D0MI'))

WebUI.setText(findTestObject('Object Repository/Backend/OR Report/input_History Finance_searchVa'), 'ESP1549436183D0MI')

WebUI.click(findTestObject('Object Repository/Backend/OR Report/button_History Finance_filterB'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Report/select_Transaction ID (1)'), 'order-id', true)

WebUI.click(findTestObject('Object Repository/Backend/OR Report/td_MOV060220197742'))

WebUI.click(findTestObject('Object Repository/Backend/OR Report/div_Transaction ID (1)'))

WebUI.setText(findTestObject('Object Repository/Backend/OR Report/input_History Finance_searchVa'), 'MOV060220197742')

WebUI.click(findTestObject('Object Repository/Backend/OR Report/button_History Finance_filterB'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Report/select_Transaction ID (1)'), 'va-no', true)

WebUI.click(findTestObject('Object Repository/Backend/OR Report/div_Transaction ID (1)'))

WebUI.click(findTestObject('Object Repository/Backend/OR Report/button_History Finance_filterB'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Report/select_Transaction ID (1)'), 'customer', true)

WebUI.click(findTestObject('Object Repository/Backend/OR Report/div_Transaction ID (1)'))

WebUI.setText(findTestObject('Object Repository/Backend/OR Report/input_History Finance_searchVa'), 'yunita')

WebUI.click(findTestObject('Object Repository/Backend/OR Report/button_History Finance_filterB'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Report/select_Transaction ID (1)'), 'rental', true)

WebUI.click(findTestObject('Object Repository/Backend/OR Report/div_Transaction ID (1)'))

WebUI.setText(findTestObject('Object Repository/Backend/OR Report/input_History Finance_searchVa'), 'kira')

WebUI.click(findTestObject('Object Repository/Backend/OR Report/button_History Finance_filterB'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Report/select_Transaction ID (1)'), 'period', true)

WebUI.click(findTestObject('Object Repository/Backend/OR Report/td_26 (1)'))

WebUI.click(findTestObject('Object Repository/Backend/OR Report/td_28 (1)'))

WebUI.click(findTestObject('Object Repository/Backend/OR Report/button_Apply (1)'))

WebUI.click(findTestObject('Object Repository/Backend/OR Report/button_History Finance_filterB'))

WebUI.click(findTestObject('Object Repository/Backend/OR Report/a_Export (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Report/select_Transaction ID (1)'), 'order-id', true)

WebUI.click(findTestObject('Object Repository/Backend/OR Report/button_Export_filterBtn'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Report/select_Transaction ID (1)'), 'rental', true)

WebUI.click(findTestObject('Object Repository/Backend/OR Report/button_Export_filterBtn'))

WebUI.click(findTestObject('Object Repository/Backend/OR Report/a_RELEASE_MANUAL_btn btn-warni'))

WebUI.click(findTestObject('Object Repository/Backend/OR Report/button_OK'))

