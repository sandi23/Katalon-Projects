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

WebUI.callTestCase(findTestCase('Mobile CR 1-3/Android/User/SC99 Regression/TC03 Login with email'), [:], FailureHandling.STOP_ON_FAILURE)

'Tap icon profile'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/User/android.widget.LinearLayout14 switch to owner'), 0)

'tap box "Klik disini untuk lihat statistik rental kamu" dihalaman dashboard owner'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.RelativeLayout13'), 0)

'Tap Change date'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.TextView4 - Change dates'), 0)

'pilih rentang tanggal'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.TextView20 - 12'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.TextView39 - 31'), 0)

'Tap tombol save'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.Button0 - Save (2)'), 0)

