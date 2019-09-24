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

WebUI.openBrowser('http://danamas.stagingapps.net/#/')

WebUI.click(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas/a_Daftar'))

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas/input_name'), 'Test Satu')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas/input_nomor_identitas'), '1234567890123456')

WebUI.click(findTestObject(null))

WebUI.click(findTestObject(null))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://danamas.stagingapps.net/#/login')

WebUI.click(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/a_Daftar'))

WebUI.click(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/a_Daftar sebagai Pemodal'))

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_name'), 'Te')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_name'), 'Test Sat')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_nomor_identitas'), 
    '1234567890123456')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_nomor_identitas'), 
    '12345678901234')

WebUI.click(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/div_select2-drop-mask'))

WebUI.click(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/td_1'))

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/textarea_alamat'), 'Jln. Jala')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/textarea_alamat'), 'Jln. Jalan')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_nama_perusahaan'), 
    'P.T. DEF')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_telepon'), '123456789')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_telepon'), '12345678901')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_email'), 'beta@e')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_email'), 'beta@')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_email'), 'beta@email.c')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_email'), 'beta@email')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_email'), 'beta@email.com')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_nomor_rekening'), 
    '13')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_nomor_rekening'), 
    '123')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_nomor_rekening'), 
    '123456')

WebUI.selectOptionByValue(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/select_Pilih Bank'), 
    'Bca', true)

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_npwp'), '123456789012345')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_npwp'), '12345678901')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_npwp'), '1234567890123')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_password'), 'P@ssw')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_password'), 'P@ssword123')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_password_confirm'), 
    'P@ssword123')

WebUI.setText(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/input_password_confirm'), 
    'P@ssword12')

WebUI.click(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/button_DAFTAR SEBAGAI PEMODAL'))

WebUI.click(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/button_DAFTAR SEBAGAI PEMODAL'))

WebUI.click(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/button_DAFTAR SEBAGAI PEMODAL'))

WebUI.click(findTestObject('Danamas - Front End/User/OR Daftar sebagai pemodal/Page_danamas (1)/button_DAFTAR SEBAGAI PEMODAL'))

WebUI.closeBrowser()

