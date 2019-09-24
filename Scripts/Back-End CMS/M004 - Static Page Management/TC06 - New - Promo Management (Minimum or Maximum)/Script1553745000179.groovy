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

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/a_New'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_Title _title'), 'Katalon promo minmax transaction')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Web Management/Static Page/select_All'), 'Apps', 
    true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_Date _fromDate'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/th_December 2018'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/span_Dec'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/td_16'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Web Management/Static Page/select_00'), '16', true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Web Management/Static Page/select_00                     _1'), 
    '30', true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_To _toDate'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/th_December 2018'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/span_Dec'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/td_20'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Web Management/Static Page/select_00                     _2'), 
    '18', true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Web Management/Static Page/select_00                     _3'), 
    '25', true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_Promo Code _code'), 'kt23')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Web Management/Static Page/select_Value'), 'PERCENT', 
    true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_Discount _discount'), '20')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_Max Discount _max_discou'), 
    '15')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_No_options_quota'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_Yes_options_quota'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Web Management/Static Page/select_Per day'), 'PERIOD', 
    true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_Quota_quota'), '10')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/label_Active'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/label_Inactive'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Web Management/Static Page/select_Minimum transaction'), 
    'Maximum transaction', true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Web Management/Static Page/select_Minimum transaction'), 
    'Minimum number of days', true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Web Management/Static Page/select_Minimum transaction'), 
    'Minimum transaction', true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_Requirement _syarat-valu'), 
    '100000')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/a_Value is required  invalid_b'))

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR Web Management/Static Page/select_All                    _1'), 
    'OWNER', true)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Backend/OR Web Management/Static Page/textarea_characters left_messa'), 
    'message to owner')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.scrollToPosition(0, 0)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.uploadFile(findTestObject('Object Repository/Backend/OR Web Management/Static Page/input_Image _logo'), 'C:\\Users\\Sandi\\Pictures\\white-wallpaper10.jpg')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.switchToFrame(findTestObject('Backend/OR Web Management/Static Page/body_description'), 0)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Backend/OR Web Management/Static Page/html_Rich Text Editor descript'), 'description description description description description description description ')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.scrollToElement(findTestObject('Backend/OR Web Management/Static Page/ePromoCode'), 0)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.switchToFrame(findTestObject('Object Repository/Backend/OR Web Management/Static Page/body_rules'), 0)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Backend/OR Web Management/Static Page/html_Rich Text Editor descript'), 'rules rules rules rules rules rules rules rules rules rules rules rules ')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.switchToFrame(findTestObject('Object Repository/Backend/OR Web Management/Static Page/body_how'), 0)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.setText(findTestObject('Backend/OR Web Management/Static Page/html_Rich Text Editor descript'), 'how to use how to use how to use how to use how to use how to use how to use ')

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.scrollToPosition(0, 1000)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Backend/OR Web Management/Static Page/button_Save'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Backend/OR Web Management/FAQ/div_Insert data succeed'), 2)

