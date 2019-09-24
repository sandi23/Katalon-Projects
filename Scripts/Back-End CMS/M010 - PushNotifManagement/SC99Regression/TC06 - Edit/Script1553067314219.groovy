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

WebUI.click(findTestObject('Page_Dashboard/a_Push Notif Management'))

not_run: WebUI.callTestCase(findTestCase('Back-End CMS/M002 - User Management/SC99 Regression/TC53 - Sign in as Admin'), 
    [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/Backend/OR Voucher/a_Voucher Management'))

WebUI.click(findTestObject('Page_Push Notification Management/a_test dua message test dua me'))

WebUI.setText(findTestObject('Page_Push Notification Management/input_Title _title'), 'test dua update')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Push Notification Management/textarea_test dua message test'), 'test dua message test dua message test dua message update')

WebUI.delay(2)

WebUI.click(findTestObject('Page_Push Notification Management/p_test dua messagetest dua mes'))

WebUI.setText(findTestObject('Page_Push Notification Management/body_test dua messagetest dua '), '<p style="">test dua message&nbsp;test dua message&nbsp;test dua message update</p><div id="katalon" style="top: 0px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"><br></div></div><div id="katalon" style="top: 185px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.delay(2)

WebUI.click(findTestObject('Page_Push Notification Management/td_23'))

WebUI.selectOptionByValue(findTestObject('Page_Push Notification Management/select_00'), '12', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Page_Push Notification Management/select_00                     _1'), '14', true)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Push Notification Management/button_Save'))

WebUI.delay(2)

