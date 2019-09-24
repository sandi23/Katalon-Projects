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

WebUI.callTestCase(findTestCase('JOM - Back End/Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('JOM - Back End/Store Management/Regression/span_Store Management'))

WebUI.delay(3)

WebUI.click(findTestObject('JOM - Back End/Store Management/Regression/span_Finish Good Receipt'))

not_run: WebUI.delay(5)

not_run: WebUI.acceptAlert()

WebUI.delay(5)

WebUI.click(findTestObject('JOM - Back End/Store Management/Regression/add New'))

WebUI.delay(5)

'harus diubah tiap session'
WebUI.setText(findTestObject('JOM - Back End/Store Management/Regression/input SJ'), findTestData('SJ Number').getValue(
        1, 1))

WebUI.delay(3)

WebUI.setText(findTestObject('JOM - Back End/Store Management/Regression/input SO'), findTestData('Store dan SO Number').getValue(
        3, 1))

WebUI.delay(3)

WebUI.setText(findTestObject('JOM - Back End/Store Management/Regression/text area'), 'deskripsi testing')

WebUI.click(findTestObject('JOM - Back End/Store Management/Regression/button save'))

WebUI.delay(10)

WebUI.acceptAlert(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('JOM - Back End/Store Management/Regression/validasi berhasil'), 5, FailureHandling.CONTINUE_ON_FAILURE)

