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

not_run: WebUI.callTestCase(findTestCase('Front-End/Payment/SC99 Regression/TC01 Review pesanan tanpa input voucher'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'Pilih Pembayaran via Credit Card Visa / Master'
WebUI.click(findTestObject('Object Repository/Front-End/OR Payment/OR Payment via credit card visa atau master/label_Credit Card Visa  Master'))

WebUI.delay(2)

'Lihat Rincian'
WebUI.click(findTestObject('Object Repository/Front-End/OR Payment/OR Payment via credit card visa atau master/a_Lihat rincian'))

WebUI.delay(2)

'Close Pop Up Rincian'
WebUI.click(findTestObject('Object Repository/Front-End/OR Payment/OR Payment via credit card visa atau master/span_'))

WebUI.delay(2)

'Klik button Bayar'
WebUI.click(findTestObject('Object Repository/Front-End/OR Payment/OR Payment via credit card visa atau master/a_Bayar'))

WebUI.delay(2)

'Input Credit Card Number'
WebUI.setText(findTestObject('Object Repository/Front-End/OR Payment/OR Payment via credit card visa atau master/input_Credit Card Information_'), 
    '4137 1803 0002 3783')

WebUI.delay(2)

'Input Name on Card'
WebUI.setText(findTestObject('Object Repository/Front-End/OR Payment/OR Payment via credit card visa atau master/input_Credit Card Information__1'), 
    'test')

WebUI.delay(2)

'Input Exp Month'
WebUI.setText(findTestObject('Object Repository/Front-End/OR Payment/OR Payment via credit card visa atau master/input__EXPIRYMONTH'), 
    '05')

WebUI.delay(2)

'Input Exp Year'
WebUI.setText(findTestObject('Object Repository/Front-End/OR Payment/OR Payment via credit card visa atau master/input__EXPIRYYEARBEFORE'), 
    '19')

WebUI.delay(2)

'Input CVV'
WebUI.setText(findTestObject('Front-End/OR Payment/OR Payment via credit card visa atau master/input__CARDCVC'), '783')

WebUI.delay(2)

'Input email'
WebUI.setText(findTestObject('Object Repository/Front-End/OR Payment/OR Payment via credit card visa atau master/input_Card Holder Email_CUSTEM'), 
    'test@sgo.co.id')

WebUI.click(findTestObject('Object Repository/Front-End/OR Payment/OR Payment via credit card visa atau master/button_Lanjutkan'))

WebUI.click(findTestObject('Object Repository/Front-End/OR Payment/OR Payment via credit card visa atau master/button_Selesai'))

not_run: WebUI.click(findTestObject('Object Repository/Front-End/OR Payment/OR Payment via credit card visa atau master/a_Lihat Pesanan'))

