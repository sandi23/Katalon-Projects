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

WebUI.callTestCase(findTestCase('JOM - Back End/User Management/SC99 Regression/TC01 Login As admin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Bug List/34 - Taking Order/Regression/span_Store Management'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Bug List/34 - Taking Order/Regression/span_Taking Order'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Bug List/34 - Taking Order/Page_JOM 3.0  Taking Order/a_btn btn-success btn-xs bs-to'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Bug List/34 - Taking Order/Page_JOM 3.0  Taking Order/td_1x Cetak Photo  Frame E03m'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Bug List/34 - Taking Order/Page_JOM 3.0  Taking Order/td_5x Cetak Photo 4R'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Bug List/34 - Taking Order/Page_JOM 3.0  Taking Order/td_1x CD  Amplop'))

