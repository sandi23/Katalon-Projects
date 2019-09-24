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

WebUI.navigateToUrl('http://jom-demo-banda.stagingapps.net/')

WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Edit Profile/Page_Helo you look great today   Jo/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/JOM - Front End/FE Order/OR Edit Profile/Page_Helo you look great today   Jo/input_username'), 
    'ali.msaputra01@gmail.com')

WebUI.setText(findTestObject('Object Repository/JOM - Front End/FE Order/OR Edit Profile/Page_Helo you look great today   Jo/input_password'), 
    '12345678')

WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Edit Profile/Page_Helo you look great today   Jo/button_Masuk'))

WebUI.doubleClick(findTestObject('JOM - Front End/FE Order/OR Edit Profile/Page_Helo you look great today   Jo/Menu Profile'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Edit Profile/Page_Helo you look great today   Jo/a_Profil Saya'))

WebUI.doubleClick(findTestObject('Object Repository/JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/a_Edit Profile'))

WebUI.setText(findTestObject('Object Repository/JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/input_name'), 
    'Alicia Saputri')

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/Date'))

WebUI.sendKeys(findTestObject('JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/Date'), '5')

WebUI.sendKeys(findTestObject('JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/Date'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/Month'))

WebUI.sendKeys(findTestObject('JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/Month'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/Years'))

WebUI.sendKeys(findTestObject('JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/Years'), Keys.chord('1993'))

WebUI.sendKeys(findTestObject('JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/Years'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/label_Perempuan'))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/Province'))

WebUI.sendKeys(findTestObject('JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/Province'), Keys.chord(
        Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/Province'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/Kota'))

WebUI.sendKeys(findTestObject('JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/Kota'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/Kota'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/Kecamatan'))

WebUI.sendKeys(findTestObject('JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/Kecamatan'), Keys.chord(
        Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/Kecamatan'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/textarea_Jl. Babakan Sari II N'), 
    'Jl. Babakan Sari II No. 5  Bandung Selatan')

WebUI.setText(findTestObject('Object Repository/JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/input_postcode'), 
    '40284')

WebUI.click(findTestObject('Object Repository/JOM - Front End/FE Order/OR Edit Profile/Page_Profil  Jonas Photo/button_Simpan'))

