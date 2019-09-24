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

'Simulasi buka browser, input URL, loading webpage'
WebUI.openBrowser('http://jom-demo-backend.stagingapps.net/login')

'Simulasi besarkan window'
WebUI.maximizeWindow()

'Simulasi input username'
WebUI.setText(findTestObject('JOM - Back End/Product Studio/Add new photoshoot guide/Page_JOM 3.0  Sign In/input_username'), 
    'admin')

'Simulasi input password (P@ssw0rd)'
WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new photoshoot guide/Page_JOM 3.0  Sign In/input_password'), 
    'P@ssw0rd')

'Simulasi klik button Sign In'
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new photoshoot guide/Page_JOM 3.0  Sign In/button_Sign In'))

'Simulasi scroll ke menu \'Product Studio\''
WebUI.scrollToElement(findTestObject('JOM - Back End/Product Studio/Add new photoshoot guide/Page_JOM 3.0  Dashboard/a_Product Studio'), 
    3)

'Simulasi klik menu \'Product Studio\''
WebUI.click(findTestObject('JOM - Back End/Product Studio/Add new photoshoot guide/Page_JOM 3.0  Dashboard/a_Product Studio'))

'Simulasi klik submenu \'Photoshoot Guide Setting\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new photoshoot guide/Page_JOM 3.0  Dashboard/a_Photoshoot Guide Setting'))

'Simulasi klik submenu \'Photoshoot Guide\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new photoshoot guide/Page_JOM 3.0  Dashboard/span_Photoshoot Guide'))

'Simulasi klik button \'Add New\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new photoshoot guide/Page_JOM 3.0  Photoshoot Guide/a_Add New'))

'Simulasi klik dropdown \'Select Category\''
WebUI.click(findTestObject('JOM - Back End/Product Studio/Add new photoshoot guide/Page_JOM 3.0  Photoshoot Guide/span_Select Category'))

'Simulasi input pada textbox dropdown'
WebUI.setText(findTestObject('JOM - Back End/Product Studio/Add new photoshoot guide/Page_JOM 3.0  Photoshoot Guide/input_select2-search__field'), 
    'Lighting')

'Simulasi klik Enter pada textbox dropdown'
WebUI.sendKeys(findTestObject('JOM - Back End/Product Studio/Add new photoshoot guide/Page_JOM 3.0  Photoshoot Guide/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

'Simulasi input nama Photoshoot Guide'
WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new photoshoot guide/Page_JOM 3.0  Photoshoot Guide/input_name'), 
    'Background Setting untuk foto couple')

'Simulasi upload gambar'
WebUI.uploadFile(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new photoshoot guide/Page_JOM 3.0  Photoshoot Guide/input_image'), 
    'D:\\pictures\\smallest\\1.jpg')

'Simulasi input tag'
WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new photoshoot guide/Page_JOM 3.0  Photoshoot Guide/input_ui-widget-content ui-aut'), 
    'background')

'Simulasi klik Enter pada input'
WebUI.sendKeys(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new photoshoot guide/Page_JOM 3.0  Photoshoot Guide/input_ui-widget-content ui-aut'), 
    Keys.chord(Keys.ENTER))

'Simulasi klik button \'Save\''
WebUI.click(findTestObject('JOM - Back End/Product Studio/Add new photoshoot guide/Page_JOM 3.0  Photoshoot Guide/button_Save'))

'Verifikasi muncul notifikasi data berhasil disave'
WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new photoshoot guide/Page_JOM 3.0  Photoshoot Guide/div_Data has been successfully'))

'Verifikasi muncul row \'Background Setting untuk foto couple\''
WebUI.verifyElementVisible(findTestObject('JOM - Back End/Product Studio/Add new photoshoot guide/Page_JOM 3.0  Photoshoot Guide/td_Background Setting untuk fo'))

'Simulasi klik icon User'
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new photoshoot guide/Page_JOM 3.0  Photoshoot Guide/span_Administrator'))

'Simulasi klik button Sign Out'
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new photoshoot guide/Page_JOM 3.0  Photoshoot Guide/a_Sign Out'))

'Simulasi tutup browser'
WebUI.closeBrowser()

