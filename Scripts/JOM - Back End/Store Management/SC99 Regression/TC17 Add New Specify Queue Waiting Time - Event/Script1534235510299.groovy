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

'Simulasi login'
WebUI.callTestCase(findTestCase('JOM - Back End/User Management/SC99 Regression/TC01 Login As admin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Simulasi klik menu \'Store Management\''
WebUI.click(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue Waiting Time - Event/Page_JOM 3.0  Dashboard/span_Store Management'))

'Simulasi klik submenu \'Avg Waiting Time\''
WebUI.click(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue Waiting Time - Event/Page_JOM 3.0  Dashboard/span_Avg Waiting Time'))

'Simulasi klik submenu \'Specify\''
WebUI.click(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue Waiting Time - Event/Page_JOM 3.0  Dashboard/span_Specify'))

'Simulasi klik button\'Add New\''
WebUI.click(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue Waiting Time - Event/Page_JOM 3.0  Specify Queue Waiting/a_Add New'))

'Simulasi klik radio button \'Event\''
WebUI.click(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue Waiting Time - Event/Page_JOM 3.0  Specify Queue Waiting/ins_iCheck-helper'))

'Simulasi klik pada input \'Select Store\''
WebUI.click(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue Waiting Time - Event/Page_JOM 3.0  Specify Queue Waiting/div_Select Stores'))

'Simulasi input \'Jonas Banda\''
WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue Waiting Time - Event/Page_JOM 3.0  Specify Queue Waiting/input_select2-search__field'), 
    'Jonas Banda')

'Simulasi pilih \'Jonas Banda\' dari dropdown'
WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue Waiting Time - Event/Page_JOM 3.0  Specify Queue Waiting/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

'Simulasi input nama  event'
WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue Waiting Time - Event/Page_JOM 3.0  Specify Queue Waiting/input_event'), 
    'Event Testing')

'Simulasi set tanggal mulai / selesai'
WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue Waiting Time - Event/Page_JOM 3.0  Specify Queue Waiting/input_date'), 
    '2018-08-31 - 2018-09-30')

'Simulasi set waktu mulai'
WebUI.doubleClick(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue Waiting Time - Event/Page_JOM 3.0  Specify Queue Waiting/input_time_start'))

for (def index : (0..4)) {
    WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue Waiting Time - Event/Page_JOM 3.0  Specify Queue Waiting/input_time_start'), 
        Keys.chord(Keys.ARROW_UP))
}

WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue Waiting Time - Event/Page_JOM 3.0  Specify Queue Waiting/input_time_start'), 
    Keys.chord(Keys.ENTER))

'Simulasi set waktu selesai'
WebUI.doubleClick(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue Waiting Time - Event/Page_JOM 3.0  Specify Queue Waiting/input_time_end'))

for (def index : (0..14)) {
    WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue Waiting Time - Event/Page_JOM 3.0  Specify Queue Waiting/input_time_end'), 
        Keys.chord(Keys.ARROW_UP))
}

WebUI.sendKeys(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue Waiting Time - Event/Page_JOM 3.0  Specify Queue Waiting/input_time_end'), 
    Keys.chord(Keys.ENTER))

'Simulasi input interval'
WebUI.setText(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue Waiting Time - Event/Page_JOM 3.0  Specify Queue Waiting/input_interval'), 
    '5')

'Simulasi klik button \'Save\''
WebUI.click(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue Waiting Time - Event/Page_JOM 3.0  Specify Queue Waiting/button_Save'))

'Verifikasi muncul notifikasi data berhasil disimpan'
WebUI.verifyElementVisible(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue Waiting Time - Event/Page_JOM 3.0  Specify Queue Waiting/div_Data has been successfully'))

'Verifikasi muncul data yang baru'
WebUI.verifyElementVisible(findTestObject('JOM - Back End/Store Management/OR Add New Specify Queue Waiting Time - Event/Page_JOM 3.0  Specify Queue Waiting/td_Event Testing'))

