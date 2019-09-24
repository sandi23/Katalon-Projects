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

'Call test case select payment method'
not_run: WebUI.callTestCase(findTestCase('Mobile/Android/Payment/SC99 Regression/TC04 Select payment method'), [:], FailureHandling.STOP_ON_FAILURE)

'Pilih metode pembayaran credit card'
Mobile.tap(findTestObject('Mobile/OR Payment/android.widget.FrameLayout3 (1)'), 0)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Payment Selection', FailureHandling.STOP_ON_FAILURE)

'Credit card number'
Mobile.tap(findTestObject('Mobile/OR Payment/android.widget.EditText0'), 0)

'Input card number'
Mobile.setText(findTestObject('Mobile/OR Payment/android.widget.EditText0'), '4137180300023783', 0)

'Full name credit card'
Mobile.tap(findTestObject('Mobile/OR Payment/android.widget.EditText1'), 0)

'Input full name'
Mobile.setText(findTestObject('Mobile/OR Payment/android.widget.EditText1'), 'test', 0)

'Month credit card'
Mobile.tap(findTestObject('Mobile/OR Payment/android.widget.EditText2'), 0)

'Input month'
Mobile.setText(findTestObject('Mobile/OR Payment/android.widget.EditText2'), '05', 0)

'Year credit card'
Mobile.tap(findTestObject('Mobile/OR Payment/android.widget.EditText3'), 0)

'Input year'
Mobile.setText(findTestObject('Mobile/OR Payment/android.widget.EditText3'), '19', 0)

'Cvc credit card'
Mobile.tap(findTestObject('Mobile/OR Payment/android.widget.EditText4'), 0)

'Input cvc'
Mobile.setText(findTestObject('Mobile/OR Payment/android.widget.EditText4'), '783', 0)

'Email credit card'
Mobile.tap(findTestObject('Mobile/OR Payment/android.widget.EditText5'), 0)

'Input email pemilik credit card'
Mobile.setText(findTestObject('Mobile/OR Payment/android.widget.EditText5'), 'test@sgo.co.id', 0)

'Tap checkbox simpan data kartu kredit anda (terenkripsi)'
Mobile.tap(findTestObject('Mobile/OR Payment/android.widget.CheckBox0'), 0)

'Melakukan pembayaran by credit card'
Mobile.tap(findTestObject('Mobile/OR Payment/android.widget.Button0 - Lanjutkan'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

