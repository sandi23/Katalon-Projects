import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Back-End CMS/M002 - User Management/SC99 Regression/TC53 - Sign in as Admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Backend/OR Web Management/Banner/span_Web Management'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/span_Static Page Management'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/a_Promo'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR User Management/Owner/input_Search_form-control inpu'), 'Katalon promo minmax')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Backend/OR Web Management/Static Page/btnEdit'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_Title _title'), 'Katalon promo minmax edited')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Web Management/Static Page/select_All'), 'Web', true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_Date _fromDate'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Backend/OR Web Management/Static Page/editTD-00'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Web Management/Static Page/select_00'), '20', true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Web Management/Static Page/select_00                     _1'), 
    '45', true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_To _toDate'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Backend/OR Web Management/Static Page/editTD-01'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Web Management/Static Page/select_00                     _2'), 
    '22', true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Web Management/Static Page/select_00                     _3'), 
    '23', true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_Promo Code _code'), 'KTE-011')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Web Management/Static Page/select_Value'), 'PERCENT', 
    true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_Discount _discount'), '30')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_Max Discount _max_discou'), 
    '20')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_No_options_quota'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(findTestData('Delay Step').getValue(1, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_Yes_options_quota'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(findTestData('Delay Step').getValue(1, 1), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Web Management/Static Page/select_Per day'), 'DAY', 
    true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_Quota_quota'), '16')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/label_Active'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/label_Inactive'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Web Management/Static Page/select_Minimum transaction'), 
    'Maximum transaction', true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_Requirement _syarat-valu'), 
    '2500000')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/a_Value is required  invalid_b'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.scrollToPosition(0, 0)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.uploadFile(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_Image _logo'), 'C:\\Users\\Sandi\\Pictures\\banner.png')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.switchToFrame(findTestObject('Backend/OR Web Management/Static Page/body_description'), 0)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Backend/OR Web Management/Static Page/html_Rich Text Editor descript'), 'description edited description edited description edited description edited description edited description edited description edited description edited description edited ')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.scrollToElement(findTestObject('Backend/OR Web Management/Static Page/ePromoCode'), 0)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.switchToFrame(findTestObject('Object Repository/Backend/OR Web Management/Static Page/body_rules'), 0)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Backend/OR Web Management/Static Page/html_Rich Text Editor descript'), 'rules edited rules edited rules edited rules edited rules edited rules edited rules edited rules edited ')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.switchToFrame(findTestObject('Object Repository/Backend/OR Web Management/Static Page/body_how'), 0)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Backend/OR Web Management/Static Page/html_Rich Text Editor descript'), 'how to use edited how to use edited how to use edited how to use edited how to use edited how to use edited how to use edited how to use edited ')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.scrollToPosition(0, 1000)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/button_Save'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Backend/OR Web Management/FAQ/div_Insert data succeed'), 2)

