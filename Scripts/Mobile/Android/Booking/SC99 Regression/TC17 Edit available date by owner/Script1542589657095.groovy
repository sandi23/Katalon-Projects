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

'Call test case login'
not_run: WebUI.callTestCase(findTestCase('Mobile/Android/User/SC99 Regression/TC04 Login with email'), [:], FailureHandling.STOP_ON_FAILURE)

'Tap tab calendar'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Tab - Calendar'), 0)

'Tap button icon plus (add calendar)'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.TextView47 - 1'), 0)

'Tap available dates (every week) on'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Switch0 - OFF'), 0)

'Tap available dates (business day) on'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Switch1 - OFF'), 0)

'Tap status date open'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Button0 - Open'), 0)

'Menyimpan pengaturan available dates'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Button2 - Save'), 0)

'Tap status date closed'
not_run: Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Button1 - Closed'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

