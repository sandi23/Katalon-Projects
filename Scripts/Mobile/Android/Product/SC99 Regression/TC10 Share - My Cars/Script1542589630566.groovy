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

'Call test case search car - my cars'
not_run: WebUI.callTestCase(findTestCase('Mobile/Android/Product/SC99 Regression/TC02 Search Car - My Cars'), [:], FailureHandling.STOP_ON_FAILURE)

'Tap tab my cars'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Tab - My Cars'), 0)

'Tap icon menu titik 3'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.ImageView9 (1)'), 0)

'Select menu share'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout7 (2)'), 0)

'Select option share by copy link'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.LinearLayout5'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2))

