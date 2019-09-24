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

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/Backend/OR Voucher/a_Voucher Management'))

WebUI.click(findTestObject('Page_Push Notification Management/a_New'))

WebUI.setText(findTestObject('Page_Push Notification Management/input_Title _title'), 'test dua')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Page_Push Notification Management/select_All'), 'OWNER', true)

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Push Notification Management/textarea_characters left_messa'), 'test dua message')

WebUI.delay(2)

WebUI.click(findTestObject('Page_Push Notification Management/div_Message'))

WebUI.setText(findTestObject('Page_Push Notification Management/textarea_characters left_messa'), 'test dua message test dua message test dua message')

WebUI.delay(2)

WebUI.click(findTestObject('Page_Push Notification Management/html_Rich Text Editor descript'))

WebUI.setText(findTestObject('Page_Push Notification Management/body_test dua messagetest dua '), '<p style="">test dua message&nbsp;test dua message&nbsp;test dua message<br></p><div id="katalon" style="top: 185px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.click(findTestObject('Page_Push Notification Management/td_29'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Page_Push Notification Management/select_00                     '), '17', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Page_Push Notification Management/select_00                     _1'), '25', true)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Push Notification Management/button_Save'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

