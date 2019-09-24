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

WebUI.callTestCase(findTestCase('JOM - Back End/Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Temporary OR/Page_JOM 3.0  Dashboard/span_Studio Management'))

WebUI.scrollToElement(findTestObject('Temporary OR/Page_JOM 3.0  Dashboard/span_Studio'), 2)

WebUI.click(findTestObject('Object Repository/Temporary OR/Page_JOM 3.0  Dashboard/span_Studio'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Temporary OR/Page_JOM 3.0  Studio/td_Gedung Progo 9'), 2, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Temporary OR/Page_JOM 3.0  Studio/td_Gedung Progo 9'), 2, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Temporary OR/Page_JOM 3.0  Studio/td_BND - STD00043'), 2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Temporary OR/Page_JOM 3.0  Studio/a_2'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Temporary OR/Page_JOM 3.0  Studio/a_1'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Temporary OR/Page_JOM 3.0  Studio/td_Gedung Banda 38'), 2, FailureHandling.OPTIONAL)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Temporary OR/Page_JOM 3.0  Studio/td_Gedung Banda 38'), 
    2, FailureHandling.OPTIONAL)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Temporary OR/Page_JOM 3.0  Studio/td_BND - STD00050'), 2, 
    FailureHandling.OPTIONAL)

