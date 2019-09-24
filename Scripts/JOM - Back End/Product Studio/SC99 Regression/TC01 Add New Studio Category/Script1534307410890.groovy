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

WebUI.callTestCase(findTestCase('JOM - Back End/Login/Login'), [:], FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('JOM - Back End/Product Studio/Add new studio gallery/span_Product Studio'), 2)

WebUI.click(findTestObject('JOM - Back End/Product Studio/Add new studio gallery/span_Product Studio'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('JOM - Back End/Product Studio/Add new studio gallery/span_P.Studio Categorization'), 
    2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new studio gallery/span_P.Studio Categorization'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new studio gallery/span_Studio Category'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new studio gallery/a_Add New'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new studio gallery/input_name'), 'Studio Testing')

WebUI.uploadFile(findTestObject('JOM - Back End/Product Studio/Add new studio gallery/input_image1'), 'C:\\Users\\Sandi\\Pictures\\jom.png')

WebUI.delay(4)

WebUI.uploadFile(findTestObject('JOM - Back End/Product Studio/Add new studio gallery/input_image2'), 'C:\\Users\\Sandi\\Pictures\\jom.png')

WebUI.delay(4)

WebUI.uploadFile(findTestObject('JOM - Back End/Product Studio/Add new studio gallery/input_image3'), 'C:\\Users\\Sandi\\Pictures\\jom.png')

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new studio gallery/textarea_description'), 
    'Deskripsi')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add new studio gallery/button_Save'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('JOM - Back End/Product Studio/Add new studio gallery/validasi berhasil'), 3)

