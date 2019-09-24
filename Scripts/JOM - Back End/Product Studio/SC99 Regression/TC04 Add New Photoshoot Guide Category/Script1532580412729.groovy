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

WebUI.openBrowser('http://jom-demo-backend.stagingapps.net/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('JOM - Back End/Product Studio/Add new photoshoot guide category/Page_JOM 3.0  Sign In/input_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('JOM - Back End/Product Studio/Add new photoshoot guide category/Page_JOM 3.0  Sign In/input_password'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('JOM - Back End/Product Studio/Add new photoshoot guide category/Page_JOM 3.0  Sign In/button_Sign In'))

WebUI.scrollToElement(findTestObject('JOM - Back End/Product Studio/Add new photoshoot guide category/Page_JOM 3.0  Dashboard/a_Product Studio'), 
    1)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new photoshoot guide category/Page_JOM 3.0  Dashboard/a_Product Studio'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new photoshoot guide category/Page_JOM 3.0  Dashboard/span_Photoshoot Guide Setting'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new photoshoot guide category/Page_JOM 3.0  Dashboard/span_Photoshoot Guide Category'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new photoshoot guide category/Page_JOM 3.0  Photoshoot Guide Cate/a_Add New'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new photoshoot guide category/Page_JOM 3.0  Photoshoot Guide Cate/input_name'), 
    'Background')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new photoshoot guide category/Page_JOM 3.0  Photoshoot Guide Cate/button_Save'))

WebUI.doubleClick(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new photoshoot guide category/Page_JOM 3.0  Photoshoot Guide Cate/div_Data has been successfully'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new photoshoot guide category/Page_JOM 3.0  Photoshoot Guide Cate/a_Administrator'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new photoshoot guide category/Page_JOM 3.0  Photoshoot Guide Cate/a_Sign Out'))

WebUI.closeBrowser()

