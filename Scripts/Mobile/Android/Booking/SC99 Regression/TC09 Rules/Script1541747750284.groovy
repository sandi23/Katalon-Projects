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

'Call test case select car from list cars'
not_run: WebUI.callTestCase(findTestCase('Mobile/Android/Booking/SC99 Regression/TC15 Select car from list cars'), [:], 
    FailureHandling.STOP_ON_FAILURE)

'Menampilkan informasi yang ada di tab cancellation policy'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.TextView - CANCELLATION POLICY'), 0)

'Menyetujui segala ketentuan rules yang tertera'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Button0 - Agree'), 0)

not_run: Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Button0 - Pay Later'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

