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

'Simulasi login'
WebUI.callTestCase(findTestCase('JOM - Back End/User Management/SC99 Regression/TC01 Login As admin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Simulasi scroll ke menu \'ERP Management\''
WebUI.scrollToElement(findTestObject('JOM - Back End/ERP Management/Sync ERP Product Code/Page_JOM 3.0  Dashboard/span_ERP Management'), 
    3)

'Simulasi klik menu \'ERP Management\''
WebUI.click(findTestObject('JOM - Back End/ERP Management/Sync ERP Product Code/Page_JOM 3.0  Dashboard/span_ERP Management'))

'Beri jeda loading menu'
WebUI.delay(1)

'Simulasi klik submenu \'Product Code\''
WebUI.click(findTestObject('JOM - Back End/ERP Management/Sync ERP Product Code/Page_JOM 3.0  Dashboard/span_Product Code'))

'Beri jeda loading webpage'
WebUI.delay(1)

'Simulasi klik button \'Synchronize\''
WebUI.click(findTestObject('JOM - Back End/ERP Management/Sync ERP Product Code/Page_JOM 3.0  Product Code/a_Synchronize'))

'Verifikasi muncul notifikasi data berhasil di-sync'
WebUI.verifyElementVisible(findTestObject('JOM - Back End/ERP Management/Sync ERP Product Code/Page_JOM 3.0  Product Code/div_Data has been successfully'))

'Simulasi klik icon User'
WebUI.click(findTestObject('JOM - Back End/ERP Management/Sync ERP Product Code/Page_JOM 3.0  Product Code/a_Administrator'))

'Simulasi klik button Sign Out'
WebUI.click(findTestObject('JOM - Back End/ERP Management/Sync ERP Product Code/Page_JOM 3.0  Product Code/a_Sign Out'))

'Simulasi tutup browser'
WebUI.closeBrowser()

