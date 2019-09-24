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

WebUI.openBrowser('')

WebUI.maximizeWindow()

not_run: WebUI.executeJavaScript('window.open();', [])

not_run: currentWindow = WebUI.getWindowIndex()

//Go in to new tab
not_run: WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('http://jom-demo-banda.stagingapps.net/studio/checkin')

WebUI.setText(findTestObject('JOM - Front End/FE Studio Checkin/OR Cetak Nomor Antrian Order Studio Reservasi/Page_Check In  Jonas Photo/input_username'), 
    'ali.msaputra01@gmail.com')

WebUI.setText(findTestObject('JOM - Front End/FE Studio Checkin/OR Cetak Nomor Antrian Order Studio Reservasi/Page_Check In  Jonas Photo/input_password'), 
    '12345678')

WebUI.click(findTestObject('JOM - Front End/FE Studio Checkin/OR Cetak Nomor Antrian Order Studio Reservasi/Page_Check In  Jonas Photo/button_Check In'))

WebUI.scrollToElement(findTestObject('JOM - Front End/FE Studio Checkin/OR Cetak Nomor Antrian Order Studio Reservasi/Page_Check In  Jonas Photo/button_Cetak Nomor Antrian'), 
    0)

WebUI.click(findTestObject('JOM - Front End/FE Studio Checkin/OR Cetak Nomor Antrian Order Studio Reservasi/Page_Check In  Jonas Photo/button_Cetak Nomor Antrian'))

