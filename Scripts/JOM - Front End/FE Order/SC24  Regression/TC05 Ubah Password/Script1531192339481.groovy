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

'Simulasi membuka browser\t'
WebUI.openBrowser('')

'Simulasi input URL dan loading webpage'
WebUI.navigateToUrl('http://jom-demo-banda.stagingapps.net/')

'Simulasi klik button menu Login (TC02)'
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Ubah Password/Page_Helo you look great today   Jo/a_Login'))

'Simulasi input email (TC02)'
WebUI.setText(findTestObject('JOM - Front End/FE Order/OR Ubah Password/Page_Helo you look great today   Jo/input_username'), 
    'beta@email.com')

'Simulasi input password (TC02)'
WebUI.setText(findTestObject('JOM - Front End/FE Order/OR Ubah Password/Page_Helo you look great today   Jo/input_password'), 
    'P@ssw0rd')

'Simulasi klik button Login (TC02)'
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Ubah Password/Page_Helo you look great today   Jo/button_Login'))

'Memberi jeda untuk webpage selesai loading semua elemen'
WebUI.delay(1)

'Simulasi klik dropdown menu User'
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Ubah Password/Page_Helo you look great today   Jo/a_Test Beta'))

'Simulasi klik option Profil Saya pada dropdown menu User'
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Ubah Password/Page_Helo you look great today   Jo/a_Profil Saya'))

'Simulasi klik button Edit Profile'
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Ubah Password/Page_Profil  Jonas Photo/a_Edit Profile'))

WebUI.scrollToElement(findTestObject('JOM - Front End/FE Order/OR Ubah Password/Page_Profil  Jonas Photo/input_password_old'), 
    0)

'Simulasi input password lama\r\n'
WebUI.setText(findTestObject('JOM - Front End/FE Order/OR Ubah Password/Page_Profil  Jonas Photo/input_password_old'), 'P@ssw0rd')

'Simulasi input password baru'
WebUI.setText(findTestObject('JOM - Front End/FE Order/OR Ubah Password/Page_Profil  Jonas Photo/input_password'), 'P@ssw0rd')

'Simulasi ulangi input password baru'
WebUI.setText(findTestObject('JOM - Front End/FE Order/OR Ubah Password/Page_Profil  Jonas Photo/input_password_confirmation'), 
    'P@ssw0rd')

'Simulasi klik button Ubah'
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Ubah Password/Page_Profil  Jonas Photo/button_Ubah'))

'Verifikasi muncul notifikasi \'Password berhasil diubah\''
WebUI.verifyElementVisible(findTestObject('JOM - Front End/FE Order/OR Ubah Password/Page_Profil  Jonas Photo/div_Password berhasil diubah'))

'Simulasi menutup browser'
WebUI.closeBrowser()

