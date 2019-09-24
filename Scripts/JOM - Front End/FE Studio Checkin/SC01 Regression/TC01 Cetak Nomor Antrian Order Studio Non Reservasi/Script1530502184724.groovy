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

WebUI.openBrowser('http://jom-demo-banda.stagingapps.net/studio/checkin')

if (GlobalVariable.Loginawal == true) {
    WebUI.setText(findTestObject('JOM - Front End/FE Studio Checkin/OR Cetak Nomor Antrian Order Studio Non Reservasi/Page_Check In  Jonas Photo/input_username'), 
        'ali.msaputra01@gmail.com')

    WebUI.setText(findTestObject('JOM - Front End/FE Studio Checkin/OR Cetak Nomor Antrian Order Studio Non Reservasi/Page_Check In  Jonas Photo/input_password'), 
        '12345678')

    WebUI.sendKeys(findTestObject('JOM - Front End/FE Studio Checkin/OR Cetak Nomor Antrian Order Studio Non Reservasi/Page_Check In  Jonas Photo/input_password'), 
        Keys.chord(Keys.ENTER))
} else {
    WebUI.setText(findTestObject('JOM - Front End/FE Studio Checkin/OR Cetak Nomor Antrian Order Studio Non Reservasi/Page_Check In  Jonas Photo/input_username'), 
        'beta@email.com')

    WebUI.setText(findTestObject('JOM - Front End/FE Studio Checkin/OR Cetak Nomor Antrian Order Studio Non Reservasi/Page_Check In  Jonas Photo/input_password'), 
        'P@ssw0rd')

    WebUI.sendKeys(findTestObject('JOM - Front End/FE Studio Checkin/OR Cetak Nomor Antrian Order Studio Non Reservasi/Page_Check In  Jonas Photo/input_password'), 
        Keys.chord(Keys.ENTER))
}

WebUI.delay(5)

WebUI.doubleClick(findTestObject('JOM - Front End/FE Studio Checkin/OR Cetak Nomor Antrian Order Studio Non Reservasi/Page_Check In  Jonas Photo/button_Cetak Nomor Antrian'))

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

WebUI.verifyElementVisible(findTestObject('JOM - Front End/FE Studio Checkin/OR Cetak Nomor Antrian Order Studio Non Reservasi/Page_/b_SERVICE Z'))

WebUI.verifyElementVisible(findTestObject('JOM - Front End/FE Studio Checkin/OR Cetak Nomor Antrian Order Studio Non Reservasi/Page_/b_Z024'))

WebUI.switchToWindowIndex(0)

WebUI.verifyElementVisible(findTestObject('JOM - Front End/FE Studio Checkin/OR Cetak Nomor Antrian Order Studio Non Reservasi/Page_Check In  Jonas Photo/h5_Tidak ada produk'))

WebUI.closeBrowser()

