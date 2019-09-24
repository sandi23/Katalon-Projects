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

'Simulasi buka browser, input URL, tunggu webpage loading'
WebUI.openBrowser('http://jonas-beta.stagingapps.net/login')

'Simulasi input username'
WebUI.setText(findTestObject('Object Repository/JOM - Back End/POS Management/Add New Open Pos/Page_JOM 3.0  Sign In/input_username'), 
    'admin')

'Simulasi input password'
WebUI.setText(findTestObject('Object Repository/JOM - Back End/POS Management/Add New Open Pos/Page_JOM 3.0  Sign In/input_password'), 
    'P@ssw0rd')

'Simulasi klik button Sign In'
WebUI.click(findTestObject('Object Repository/JOM - Back End/POS Management/Add New Open Pos/Page_JOM 3.0  Sign In/button_Sign In'))

'Simulasi klik menu POS Management'
WebUI.click(findTestObject('Object Repository/JOM - Back End/POS Management/Add New Open Pos/Page_JOM 3.0  Open Pos/a_POS Management'))

'Simulasi klik submenu Opening Pos'
WebUI.click(findTestObject('Object Repository/JOM - Back End/POS Management/Add New Open Pos/Page_JOM 3.0  Open Pos/a_Opening Pos'))

'Simulasi klik button \'Add New\' (FAILED: Open Pos gagal di-add)'
WebUI.click(findTestObject('Object Repository/JOM - Back End/POS Management/Add New Open Pos/Page_JOM 3.0  Open Pos/a_Add New'))

'Simulasi klik icon User'
WebUI.click(findTestObject('Object Repository/JOM - Back End/POS Management/Add New Open Pos/Page_JOM 3.0  Open Pos/a_Administrator'))

'Simulasi klik button Sign Out'
WebUI.click(findTestObject('Object Repository/JOM - Back End/POS Management/Add New Open Pos/Page_JOM 3.0  Open Pos/a_Sign Out'))

'Simulasi tutup browser'
WebUI.closeBrowser()

