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

WebUI.scrollToElement(findTestObject('Bug List/132/Page_JOM 3.0  Dashboard/span_Product Studio'), 2)

WebUI.click(findTestObject('Bug List/132/Page_JOM 3.0  Dashboard/span_Product Studio'))

WebUI.scrollToElement(findTestObject('Bug List/132 (1)/Page_JOM 3.0  Dashboard/span_Product Studio Setting'), 2)

WebUI.click(findTestObject('Bug List/132 (1)/Page_JOM 3.0  Dashboard/span_Product Studio Setting'))

WebUI.setText(findTestObject('Bug List/132/Page_JOM 3.0  Dashboard/search'), '999001000009')

WebUI.delay(2)

WebUI.click(findTestObject('Bug List/132/Page_JOM 3.0  Product Studio Settin/a_btn btn-success btn-xs bs-to'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Bug List/132/Page_JOM 3.0  Product Studio Settin/legend_Item Information'), 2)

WebUI.scrollToElement(findTestObject('Bug List/132/Page_JOM 3.0  Product Studio Settin/legend_General Information'), 2)

WebUI.scrollToElement(findTestObject('Bug List/132/Page_JOM 3.0  Product Studio Settin/legend_Default Background'), 2)

WebUI.scrollToElement(findTestObject('Bug List/132/Page_JOM 3.0  Product Studio Settin/legend_Template'), 2)

WebUI.scrollToElement(findTestObject('Bug List/132/Page_JOM 3.0  Product Studio Settin/legend_Production'), 2)

WebUI.scrollToElement(findTestObject('Bug List/132/Page_JOM 3.0  Product Studio Settin/legend_Preview Component at Fr'), 
    2)

WebUI.scrollToElement(findTestObject('Bug List/132/Page_JOM 3.0  Product Studio Settin/legend_Component at Finish Pro'), 
    2)

WebUI.scrollToElement(findTestObject('Bug List/132/Page_JOM 3.0  Product Studio Settin/legend_Component for CP'), 2)

WebUI.scrollToElement(findTestObject('Bug List/132/Page_JOM 3.0  Product Studio Settin/legend_Additional People  Pose'), 
    2)

WebUI.scrollToElement(findTestObject('Bug List/132/Page_JOM 3.0  Product Studio Settin/legend_Insentif'), 2)

WebUI.click(findTestObject('Bug List/132/Page_JOM 3.0  Product Studio Settin/button_Close'))

WebUI.delay(2)

WebUI.click(findTestObject('Bug List/132/Page_JOM 3.0  Dashboard/edit'))

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('Object Repository/Bug List/132/Page_JOM 3.0  Edit Product Studio S/a_Next'), 1)

WebUI.click(findTestObject('Object Repository/Bug List/132/Page_JOM 3.0  Edit Product Studio S/a_Next'))

WebUI.scrollToElement(findTestObject('Object Repository/Bug List/132/Page_JOM 3.0  Edit Product Studio S/a_Next'), 1)

WebUI.click(findTestObject('Object Repository/Bug List/132/Page_JOM 3.0  Edit Product Studio S/a_Next'))

WebUI.scrollToElement(findTestObject('Object Repository/Bug List/132/Page_JOM 3.0  Edit Product Studio S/div_No'), 1)

WebUI.click(findTestObject('Object Repository/Bug List/132/Page_JOM 3.0  Edit Product Studio S/a_Next'))

WebUI.scrollToElement(findTestObject('Object Repository/Bug List/132/Page_JOM 3.0  Edit Product Studio S/a_Next'), 1)

WebUI.click(findTestObject('Object Repository/Bug List/132/Page_JOM 3.0  Edit Product Studio S/a_Next'))

WebUI.scrollToElement(findTestObject('Object Repository/Bug List/132/Page_JOM 3.0  Edit Product Studio S/b_Group  Pembesaran'), 
    1)

WebUI.click(findTestObject('Object Repository/Bug List/132/Page_JOM 3.0  Edit Product Studio S/a_Next'))

WebUI.click(findTestObject('Object Repository/Bug List/132/Page_JOM 3.0  Edit Product Studio S/a_Next'))

WebUI.click(findTestObject('Object Repository/Bug List/132/Page_JOM 3.0  Edit Product Studio S/a_Close'))

