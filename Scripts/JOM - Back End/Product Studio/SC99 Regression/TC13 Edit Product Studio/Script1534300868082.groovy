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

WebUI.navigateToUrl('http://jonas-beta.stagingapps.net/login')

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Sign In/input_username'), 
    'admin')

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Sign In/input_password'), 
    'P@ssw0rd')

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Sign In/button_Sign In'))

WebUI.scrollToElement(findTestObject('JOM - Back End/Product Studio/OR Add New Component Preview/Page_JOM 3.0  Dashboard/span_Product Studio'), 
    0)

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Add New Component Preview/Page_JOM 3.0  Dashboard/span_Product Studio'))

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Dashboard/span_Product Studio Setting'))

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Product Studio/a_27'))

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Product Studio/i_fa fa-edit fa-lg'))

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Arrow Field Product Studio Category'))

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/li_PSSC00005 - Family'), 
    'Family')

WebUI.sendKeys(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/li_PSSC00005 - Family'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Arrow Field Product Studio Sub Category'))

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/li_Minimalis Black'), 
    'Minimalis Black')

WebUI.sendKeys(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/li_Minimalis Black'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Arrow Field Marketing Category'))

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/li_Minimalis Black_1'), 
    'Minimalis Black')

WebUI.sendKeys(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/li_Minimalis Black_1'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/input_name'), 
    'Minimalis Black B')

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/input_weight'), 
    '2000')

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/textarea_description'), 
    'Test Product Studio Edit')

WebUI.uploadFile(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/input_image'), 
    'C:\\Users\\ALIMSAPUTRA\\Downloads\\pictures\\500x500\\1.jpg')

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/label_Product Studio'))

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/label_True'))

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/input_duration_photoshoot'), 
    '100')

not_run: WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/label_False'))

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Arrow Field Queue'))

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Field input Queue'), 
    'Family')

WebUI.sendKeys(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Field input Queue'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/input_total_person'), 
    '15')

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/input_total_pose'), 
    '5')

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/a_Next'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/span_select2-selection__arrow_2'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/input_select2-search__field'), 
    'Putih')

WebUI.sendKeys(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/a_Next'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/span_select2-selection__arrow_3'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/input_select2-search__field'), 
    'Collase')

WebUI.sendKeys(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/input_photo_count'), 
    '4')

WebUI.delay(5)

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Select Template'))

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/a_Next'))

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/a_Next'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/input_select2-search__field_1'), 
    'Test')

WebUI.sendKeys(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/input_select2-search__field_1'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/input_main-component'), 
    'Frame')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/input_main-qty'), 
    '1')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/button_Add'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/span_Component'))

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Field Component'), 
    '999001000184 - Dummy Pemotretan 10 Shoot')

WebUI.sendKeys(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Field Component'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/input_qty'), 
    '1')

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/button_add 2'))

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/a_Next'))

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Sequence1'), 
    '1')

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Sequence2'), 
    '1')

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Arrow Type'))

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Field Type'), 
    'Frame')

WebUI.sendKeys(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Field Type'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Caption'), 
    'Frame')

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/a_Next'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/span_Component'))

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Field Component'), 
    'Dummy Pemotretan 9')

WebUI.sendKeys(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Field Component'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/input_qty'), 
    '1')

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/button_add 2'))

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/a_Next'))

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Sequence3'), 
    '1')

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Arrow Type 2'))

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Field Type 2'), 
    'Enlarge')

WebUI.sendKeys(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Field Type 2'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Caption 2'), 
    'Enlarge')

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/a_Next'))

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Arrow Additional People'))

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Field Additional People'), 
    '999001000150 - Penambahan Ganti Baju Photo Studio')

WebUI.sendKeys(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Field Additional People'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Arrow Additional Pose'))

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Field Additional Pose'), 
    '999001000150 - Penambahan Ganti Baju Photo Studio')

WebUI.sendKeys(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Field Additional Pose'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/a_Next'))

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Field Insentif'), 
    '100000')

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Edit Product Studio/Page_JOM 3.0  Edit Product Studio/Save'))

