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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

'Simulasi membuka browser\r\n'
WebUI.openBrowser('')

'Simulasi membesarkan window'
WebUI.maximizeWindow()

'Simulasi input URL dan loading webpage'
WebUI.navigateToUrl('http://jom-demo-banda.stagingapps.net/')

WebUI.delay(3)

'Simulasi klik button menu Login'
WebUI.click(findTestObject('JOM - Front End/FE Order/OR Login sebagai User/Page_/a_Login'))

WebUI.delay(2)

'Simulasi input email/telepon'
WebUI.setText(findTestObject('JOM - Front End/FE Order/OR Login sebagai User/Page_Helo you look great today   Jo/input_username'), 
    'sandi.tsani@gmail.com')

'Simulasi input password'
WebUI.setText(findTestObject('JOM - Front End/FE Order/OR Login sebagai User/Page_Helo you look great today   Jo/input_password'), 
    'Katasandi23')

'Simulasi klik button Login'
WebUI.sendKeys(findTestObject('JOM - Front End/FE Order/OR Login sebagai User/Page_Helo you look great today   Jo/input_password'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(4)

