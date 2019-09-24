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

WebUI.callTestCase(findTestCase('JOM - Back End/User Management/SC99 Regression/TC01 Login As admin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Simulasi scroll ke menu \'ERP Management\''
WebUI.scrollToElement(findTestObject('JOM - Back End/ERP Management/Setting Maping Item/Page_JOM 3.0  Dashboard/span_ERP Management'), 
    1)

'Simulasi klik menu \'ERP Management\''
WebUI.click(findTestObject('JOM - Back End/ERP Management/Setting Maping Item/Page_JOM 3.0  Dashboard/span_ERP Management'))

'Beri jeda submenu loading'
WebUI.delay(1)

'Simulasi klik submenu Mapping Item'
WebUI.click(findTestObject('JOM - Back End/ERP Management/Setting Maping Item/Page_JOM 3.0  Mapping Item/a_Mapping Item'))

'Beri jeda tabel loading'
WebUI.delay(1)

'Simulasi klik button \'Edit\' pada row \'Printing Eceran\''
WebUI.click(findTestObject('JOM - Back End/ERP Management/Setting Maping Item/Page_JOM 3.0  Mapping Item/a_btn btn-primary btn-xs bs-to'))

'Simulasi klik item \'FG-201 PRITING PHOTO PRINTING\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/ERP Management/Setting Maping Item/Page_JOM 3.0  Mapping Item/li_FG-201  PRINTING PHOTO PRIN'))

'Simulasi memilih item \'FG-201 PRINTING PHOTO PRINTING\' pada dropdown textbox Family Code'
WebUI.sendKeys(findTestObject('JOM - Back End/ERP Management/Setting Maping Item/Page_JOM 3.0  Mapping Item/input_Family_Code'), 
    Keys.chord(Keys.ENTER))

'Simulasi klik item \'999001000001\''
WebUI.click(findTestObject('JOM - Back End/ERP Management/Setting Maping Item/Page_JOM 3.0  Mapping Item/li_999002000459  Cetak Pasfoto'))

'Simulasi klik textbox Item Code'
WebUI.click(findTestObject('JOM - Back End/ERP Management/Setting Maping Item/Page_JOM 3.0  Mapping Item/input_Item_Code'))

'Beri jeda database loading list Item Code'
WebUI.delay(2)

'Simulasi pilih item pada dropdown textbox Item Code'
WebUI.sendKeys(findTestObject('JOM - Back End/ERP Management/Setting Maping Item/Page_JOM 3.0  Mapping Item/input_Item_Code'), 
    Keys.chord(Keys.ENTER))

'Simulasi klik button \'Save\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/ERP Management/Setting Maping Item/Page_JOM 3.0  Mapping Item/button_Save'))

'Verifikasi muncul notifikasi \'Data has been successfully edited\''
WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Back End/ERP Management/Setting Maping Item/Page_JOM 3.0  Mapping Item/div_Data has been successfully'))

'Simulasi klik icon User'
WebUI.click(findTestObject('Object Repository/JOM - Back End/ERP Management/Setting Maping Item/Page_JOM 3.0  Mapping Item/span_Administrator'))

'Simulasi klik button Log Out'
WebUI.click(findTestObject('Object Repository/JOM - Back End/ERP Management/Setting Maping Item/Page_JOM 3.0  Mapping Item/a_Sign Out'))

'Simulasi menutup browser'
WebUI.closeBrowser()

