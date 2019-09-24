import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
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

'Simulasi membuka browser, input URL, dan menunggu webpage loading\r\n'
WebUI.openBrowser('http://jom-demo-banda.stagingapps.net/studio/studio')

'Simulasi membesarkan window'
WebUI.maximizeWindow()

'Simulasi input username'
WebUI.setText(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/Page_Studio  Jonas Photo/input_username'), 
    fotografer_email)

'Simulasi input password'
WebUI.setText(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/Page_Studio  Jonas Photo/input_password'), 
    fotografer_pass)

'Simulasi klik button Login'
WebUI.sendKeys(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/Page_Studio  Jonas Photo/input_password'), 
    Keys.chord(Keys.ENTER))

'Beri jeda tunggu webpage loading'
WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

'Simulasi klik div Antrian Selanjutnya'
not_run: WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/Page_Studio  Jonas Photo/div_Antrian Selanjutnya'))

'Simulasi klik dropdown antrian'
WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/img'))

WebUI.delay(5)

'Simulasi klik button Call'
WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/Page_Studio  Jonas Photo/a_Call'))

'Simulasi klik button Come In'
WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/Page_Pemanggilan Antrian  Jonas Pho/a_Come In'))

'Simulasi klik button Start'
WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/Page_Preparation  Jonas Photo/a_Start'))

'Simulasi klik button Edit SO'
WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/Page_Pemotretan  Jonas Photo/a_Edit SO'))

'Simulasi input jumlah orang'
WebUI.setText(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/Page_Edit SO  Jonas Photo/input_total_person'), 
    '5')

'Simulasi input jumlah pose'
WebUI.setText(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/Page_Edit SO  Jonas Photo/input_total_pose'), 
    '10')

'Simulasi klik button \'Simpan\''
WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/Page_Edit SO  Jonas Photo/button_Simpan'))

'Verifikasi penambahan upload foto minimal'
WebUI.verifyElementPresent(findTestObject('Bug List/154/Page_Pemotretan  Jonas Photo/min_text'), 2)

'Verifikasi penambahan upload foto maksimal'
WebUI.verifyElementPresent(findTestObject('Bug List/154/Page_Pemotretan  Jonas Photo/max_text'), 2)

'Simulasi klik button Edit SO'
WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/Page_Pemotretan  Jonas Photo/a_Edit SO'))

'Simulasi klik button \'Simpan\''
WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/Page_Edit SO  Jonas Photo/button_Simpan'))

'Verifikasi upload foto minimal tidak bertambah\r\n'
WebUI.verifyElementPresent(findTestObject('Bug List/154/Page_Pemotretan  Jonas Photo/min_text'), 2)

'Verifikasi upload foto maksimal tidak bertambah'
WebUI.verifyElementPresent(findTestObject('Bug List/154/Page_Pemotretan  Jonas Photo/max_text'), 2)

'Simulasi klik button Edit SO'
WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/Page_Pemotretan  Jonas Photo/a_Edit SO'))

'Simulasi klik button \'Simpan\''
WebUI.click(findTestObject('JOM - Front End/FE Studio Photographer/OR Call No. Antrian Studio Non Reservasi/Page_Edit SO  Jonas Photo/button_Simpan'))

'Verifikasi upload foto minimal tidak bertambah'
WebUI.verifyElementPresent(findTestObject('Bug List/154/Page_Pemotretan  Jonas Photo/min_text'), 2)

'Verifikasi upload foto maksimal tidak bertambah'
WebUI.verifyElementPresent(findTestObject('Bug List/154/Page_Pemotretan  Jonas Photo/max_text'), 2)

