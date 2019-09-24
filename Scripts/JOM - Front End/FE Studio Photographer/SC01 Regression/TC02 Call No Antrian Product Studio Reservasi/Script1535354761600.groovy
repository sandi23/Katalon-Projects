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

WebUI.navigateToUrl('http://jom-demo-banda.stagingapps.net/studio/studio')

WebUI.setText(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Product Studio Reservasi/Page_Studio  Jonas Photo/input_username'), 
    'tesjom3+fotografer@gmail.com')

WebUI.setText(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Product Studio Reservasi/Page_Studio  Jonas Photo/input_password'), 
    'Jalan-Progo-12')

WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Product Studio Reservasi/Page_Studio  Jonas Photo/button_Masuk'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Product Studio Reservasi/Page_Studio  Jonas Photo/img'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Product Studio Reservasi/Page_Studio  Jonas Photo/a_Call'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Product Studio Reservasi/Page_Pemanggilan Antrian  Jonas Pho/a_Come In'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Product Studio Reservasi/Page_Preparation  Jonas Photo/a_Start'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Product Studio Reservasi/Page_Pemotretan  Jonas Photo/a_Edit SO'))

not_run: WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Product Studio Reservasi/Page_Edit SO  Jonas Photo/div_Pengaturan'))

WebUI.setText(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Product Studio Reservasi/Page_Edit SO  Jonas Photo/input_total_person'), 
    '12')

not_run: WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Product Studio Reservasi/Page_Edit SO  Jonas Photo/div_col-sm-6'))

WebUI.setText(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Product Studio Reservasi/Page_Edit SO  Jonas Photo/input_total_pose'), 
    '27')

WebUI.scrollToElement(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Product Studio Reservasi/Page_Edit SO  Jonas Photo/button_Simpan'), 
    0)

WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Product Studio Reservasi/Page_Edit SO  Jonas Photo/button_Simpan'))

WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Product Studio Reservasi/Page_Pemotretan  Jonas Photo/a_Selesai Foto Lanjutkan'))

WebUI.delay(30)

not_run: WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Product Studio Reservasi/Page_Upload Foto  Jonas Photo/input_upload'))

WebUI.scrollToElement(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Product Studio Reservasi/Page_Upload Foto  Jonas Photo/a_Upload Foto'), 
    0)

WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Product Studio Reservasi/Page_Upload Foto  Jonas Photo/a_Upload Foto'))

not_run: WebUI.closeBrowser()

