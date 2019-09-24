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

WebUI.comment('Sebelum dirun, harap Add New data pada page 4, row 9 category Basic Studio Family')

'Simulasi login'
WebUI.callTestCase(findTestCase('JOM - Back End/User Management/SC99 Regression/TC01 Login As admin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Simulasi mouse scroll ke menu \'Marketing Management\''
WebUI.scrollToElement(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Edit Sub Category Group/span_Marketing Management'), 
    1)

'Simulasi klik menu \'Marketing Management\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Edit Sub Category Group/span_Marketing Management'))

'Simulasi klik submenu \'Sub Category Group\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Edit Sub Category Group/span_Sub Category Group'))

'Simulasi klik Page 4'
WebUI.click(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Edit Sub Category Group/a_4'))

'Simulasi klik button Edit pada data row ke 9'
WebUI.click(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Edit Sub Category Group/a_btn btn-primary btn-xs bs-to'))

'Simulasi klik dropdown pilih Category'
WebUI.click(findTestObject('JOM - Back End/Marketing Management/OR Edit Sub Category Group/Page_JOM 3.0  Sub Category Group/span_Basic Studio Family'))

'Simulasi pilih \'Casual\''
WebUI.setText(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Edit Sub Category Group/input_select2-search__field'), 
    'Casual')

'Simulasi pilih \'Casual\''
WebUI.sendKeys(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Edit Sub Category Group/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

'Simulasi input nama Sub Category Group'
WebUI.setText(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Edit Sub Category Group/input_name'), 
    'Testing Katalon Sub Category Group ')

'Simulasi klik button \'Save\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Edit Sub Category Group/button_Save'))

'Verifikasi muncul notifikasi data berhasil diedit'
WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Back End/Marketing Management/OR Edit Sub Category Group/div_Data has been successfully'))

