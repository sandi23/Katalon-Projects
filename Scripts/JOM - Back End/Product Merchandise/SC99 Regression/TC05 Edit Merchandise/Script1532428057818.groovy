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
WebUI.openBrowser('jonas-beta.stagingapps.net/login')

'Simulasi membesarkan window'
WebUI.maximizeWindow()

'Simulasi input username'
WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Sign In/input_username'), 
    'admin')

'Simulasi input password'
WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Sign In/input_password'), 
    'P@ssw0rd')

'Simulasi klik button \'Sign In\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Sign In/button_Sign In'))

'Simulasi scroll ke menu \'Product Merchandise\''
WebUI.scrollToElement(findTestObject('Object Repository/JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Dashboard/span_Product Merchandise'), 
    1)

'Simulasi klik menu \'Product Merchandise\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Dashboard/span_Product Merchandise'))

'Simulasi klik submenu \'Merchandise Setting\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Dashboard/span_Merchandise Setting'))

'Simulasi klik button \'Edit\' pada salah satu data Merchandise'
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/a_btn btn-primary btn-xs bs-to'))

'Simulasi klik dropdown \'Select Category\''
WebUI.click(findTestObject('JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/span_Select Category'))

'Simulasi masukkan input \'Fancy\''
WebUI.setText(findTestObject('JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/input_select2-search__field'), 
    'Fancy')

'Simulasi klik Enter pada input'
WebUI.sendKeys(findTestObject('JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

'Simulasi input nama Merchandise untuk dilihat customer'
WebUI.setText(findTestObject('JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/input_name_for_customer'), 
    'Album fancy')

'Simulasi pilih radio button \'Product Merchandise\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/label_Product Merchandise'))

'Simulasi klik dropdown \'Style\''
WebUI.click(findTestObject('JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/span_Style'))

'Simulasi input \'Klasik\''
WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/input_select2-search__field_1'), 
    'Klasik')

'Simulasi klik Enter pada input'
WebUI.sendKeys(findTestObject('JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/input_select2-search__field_1'), 
    Keys.chord(Keys.ENTER))

'Simulasi klik dropdown \'Material\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/span_Material'))

'Simulasi input \'Besi\''
WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/input_select2-search__field_2'), 
    'Besi')

'Simulasi klik Enter pada input'
WebUI.sendKeys(findTestObject('Object Repository/JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/input_select2-search__field_2'), 
    Keys.chord(Keys.ENTER))

'Simulasi klik dropdown \'Photo Size\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/span_Photo Size'))

'Simulasi input \'4R\''
WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/input_select2-search__field_3'), 
    '4R')

'Simulasi klik Enter pada input'
WebUI.sendKeys(findTestObject('Object Repository/JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/input_select2-search__field_3'), 
    Keys.chord(Keys.ENTER))

'Beri jeda untuk pilih warna \'Green\' secara manual'
WebUI.delay(15)

'Simulasi klik dropdown \'Marketing Category\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/span_Marketing Category'))

'Simulasi input \'Frame\''
WebUI.setText(findTestObject('JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/input_select2-search__field_4'), 
    'Frame')

'Simulasi klik Enter pada input'
WebUI.sendKeys(findTestObject('JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/input_select2-search__field_4'), 
    Keys.chord(Keys.ENTER))

'Simulasi input \'2000\' pada form weight'
WebUI.setText(findTestObject('JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/input_weight'), 
    '2000')

'Simulasi upload foto'
WebUI.uploadFile(findTestObject('Object Repository/JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/input_image0'), 
    'D:\\pictures\\500x500\\1.jpg')

WebUI.scrollToElement(findTestObject('JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/button_Save'), 
    2)

'Simulasi klik button \'Save\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/button_Save'))

'Simulasi muncul notifikasi data berhasil tersimpan, tapi harus diapprove terlebih dahulu'
WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/div_Data has been successfully'))

'Simulasi klik icon User'
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/a_Administrator'))

'Simulasi klik button \'Sign Out\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Merchandise/Edit Merchandise/Page_JOM 3.0  Merchandise/a_Sign Out'))

not_run: WebUI.closeBrowser()

