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

WebUI.click(findTestObject('Object Repository/Backend/OR Voucher/a_Available_btn btn-primary bt'))

WebUI.click(findTestObject('Object Repository/Backend/OR Voucher/div_Name'))

WebUI.setText(findTestObject('Object Repository/Backend/OR Voucher/input_Name _name'), 'test edit name')

WebUI.click(findTestObject('Object Repository/Backend/OR Voucher/div_Edit Voucher'))

WebUI.setText(findTestObject('Object Repository/Backend/OR Voucher/input_Title _title'), 'test edit title')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Backend/OR Voucher/div_Sub Title'))

WebUI.setText(findTestObject('Object Repository/Backend/OR Voucher/input_Sub Title_subTitle'), 'test edit sub')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Backend/OR Voucher/li_All'))

WebUI.click(findTestObject('Object Repository/Backend/OR Voucher/span_'))

WebUI.setText(findTestObject('Object Repository/Backend/OR Voucher/input_City_select2-search__fie'), 'all')

WebUI.click(findTestObject('Object Repository/Backend/OR Voucher/input_For All Rental_options_r'))

WebUI.click(findTestObject('Object Repository/Backend/OR Voucher/td_19'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Voucher/select_00'), '16', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Voucher/select_00                     _1'), '19', 
    true)

WebUI.click(findTestObject('Object Repository/Backend/OR Voucher/td_27'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Voucher/select_00                     _2'), '13', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Voucher/select_00                     _3'), '19', 
    true)

WebUI.click(findTestObject('Object Repository/Backend/OR Voucher/div_Value'))

WebUI.setText(findTestObject('Object Repository/Backend/OR Voucher/input_Discount _discount'), '20000')

WebUI.setText(findTestObject('Object Repository/Backend/OR Voucher/input_Validity Period _validit'), '4')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Backend/OR Voucher/td_19'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Voucher/select_00                     _4'), '19', 
    true)

WebUI.setText(findTestObject('Object Repository/Backend/OR Voucher/input_Number Voucher _numVouch'), '4')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Backend/OR Voucher/input_Requirement _syarat-valu'), '')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Backend/OR Voucher/div_Edit Voucher'))

WebUI.click(findTestObject('Object Repository/Backend/OR Voucher/html_Rich Text Editor term_con'))

WebUI.setText(findTestObject('Object Repository/Backend/OR Voucher/body_vocuher tiga test'), '<p>vocuher tiga test</p><div id="katalon" style="top: 0px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.click(findTestObject('Object Repository/Backend/OR Voucher/html_Rich Text Editor how_to_u (1)'))

WebUI.click(findTestObject('Object Repository/Backend/OR Voucher/html_Rich Text Editor how_to_u (1)'))

WebUI.setText(findTestObject('Object Repository/Backend/OR Voucher/body_vocuher tiga test'), '<p style="">vocuher tiga test</p><div id="katalon" style="top: 0px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.click(findTestObject('Object Repository/Backend/OR Voucher/button_Save'))

