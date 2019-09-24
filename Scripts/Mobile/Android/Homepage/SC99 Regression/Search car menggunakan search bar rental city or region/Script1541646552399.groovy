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

'Open apps on phone'
Mobile.startApplication('C:\\Users\\WGS-LAP199\\Downloads\\Movic apk\\Movic_0.9.7_2018-10-14-stable-debug.apk', false)

Mobile.tap(findTestObject('Mobile/OR Homepage/android.widget.TextView0 - Car Rental CityRegion'), 0)

'Search available car for you by city'
Mobile.setText(findTestObject('Mobile/OR Homepage/android.widget.EditText0 - Search available car for you'), 'Bandung', 
    0)

'Tap location yang dipilih'
Mobile.tap(findTestObject('Mobile/OR Homepage/android.widget.LinearLayout7'), 0)

'Memilih mobilnya saja'
Mobile.tap(findTestObject('Mobile/OR Homepage/android.widget.TextView1 - Car Only'), 0)

'Memilih mobil dan supirnya'
Mobile.tap(findTestObject('Mobile/OR Homepage/android.widget.TextView2 - Car With Driver'), 0)

Mobile.tap(findTestObject('Mobile/OR Homepage/android.widget.Button0 - Next'), 0)

'Delay untuk menentukan tanggal secara manual'
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Mencari list car sesuai date dan type yang ditentukan'
Mobile.tap(findTestObject('Mobile/OR Homepage/android.widget.Button0 - Search'), 0)

