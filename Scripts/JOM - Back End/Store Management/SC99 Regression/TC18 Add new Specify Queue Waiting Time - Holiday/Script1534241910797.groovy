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

'Simulasi login'
WebUI.callTestCase(findTestCase('JOM - Back End/User Management/SC99 Regression/TC01 Login As admin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Simulasi klik menu \'Store Management\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/OR Add New Specify Queue - Holiday/Page_JOM 3.0  Dashboard/span_Store Management'))

'Simulasi klik submenu \'Avg Waiting Time\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/OR Add New Specify Queue - Holiday/Page_JOM 3.0  Dashboard/span_Avg Waiting Time'))

'Simulasi klik submenu \'Specify\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/OR Add New Specify Queue - Holiday/Page_JOM 3.0  Dashboard/span_Specify'))

'Simulasi klik button\'Add New\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/OR Add New Specify Queue - Holiday/Page_JOM 3.0  Specify Queue Waiting/a_Add New'))

'Simulasi klik radio button \'Holiday\''
WebUI.doubleClick(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue - Holiday/Page_JOM 3.0  Specify Queue Waiting/ins_iCheck-helper_3 (1)'))

'Simulasi klik dropdown \'Select Holiday\''
WebUI.click(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue - Holiday/Page_JOM 3.0  Specify Queue Waiting/span_Select Holiday (1)'))

'Beri jeda loading pilihan dropdown'
WebUI.delay(1)

'Simulasi pilih Hari Buruh Internasional'
WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue - Holiday/Page_JOM 3.0  Specify Queue Waiting/input_select2-search__field (1)'), 
    'Hari Buruh')

'Simulasi pilih Hari Buruh Internasional'
WebUI.delay(3)

'Simulasi pilih Hari Buruh Internasional'
WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue - Holiday/Page_JOM 3.0  Specify Queue Waiting/input_select2-search__field (1)'), 
    Keys.chord(Keys.ENTER))

'Simulasi input waktu mulai'
WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/OR Add New Specify Queue - Holiday/Page_JOM 3.0  Specify Queue Waiting/input_time_start'))

'Simulasi set waktu mulai menjadi 00:05'
for (def index : (0..4)) {
    'Simulasi set waktu mulai menjadi 00:05'
    WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue - Holiday/Page_JOM 3.0  Specify Queue Waiting/input_time_start'), 
        Keys.chord(Keys.ARROW_UP))
}

'Simulasi input waktu selesai'
WebUI.click(findTestObject('Object Repository/JOM - Back End/Store Management/OR Add New Specify Queue - Holiday/Page_JOM 3.0  Specify Queue Waiting/input_time_end'))

'Simulasi set waktu selesai menjadi 00:15'
for (def index : (0..14)) {
    'Simulasi set waktu selesai menjadi 00:15'
    WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue - Holiday/Page_JOM 3.0  Specify Queue Waiting/input_time_end'), 
        Keys.chord(Keys.ARROW_UP))
}

'Simulasi input interval'
WebUI.setText(findTestObject('Object Repository/JOM - Back End/Store Management/OR Add New Specify Queue - Holiday/Page_JOM 3.0  Specify Queue Waiting/input_interval'), 
    '5')

'Simulasi klik button \'Save\''
WebUI.click(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue - Holiday/Page_JOM 3.0  Specify Queue Waiting/i_fa fa-save'))

'Verifikasi muncul notifikasi data berhasil diadd'
WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Back End/Store Management/OR Add New Specify Queue - Holiday/Page_JOM 3.0  Specify Queue Waiting/div_Data has been successfully'))

'Verifikasi data berhasil diadd'
WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Back End/Store Management/OR Add New Specify Queue - Holiday/Page_JOM 3.0  Specify Queue Waiting/td_Hari Buruh Internasional'))

