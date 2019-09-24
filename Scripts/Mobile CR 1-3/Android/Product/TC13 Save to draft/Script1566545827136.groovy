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

'Tap Icon Add Car'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.ImageButton0 (1)'), 0)

'Pilih merk kendaraan \'Daihatsu\''
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView3 - Pilih merek Kendaraan (1)'), 
    0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView3 - Daihatsu'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView0 - SAVE (1)'), 0)

'Pilih model kendaraan \'Sigra\''
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView5 - Pilih model Kendaraan (1)'), 
    0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView2 - SIGRA'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView0 - SAVE (1)'), 0)

'Pilih tempat duduk \'2\''
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.Button1 - 4 Seats (1)'), 0)

'Pilih bagasi koper \'4\''
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.Button10 -  10 Koper'), 0)

'tap tombol save to draft'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView0 - SAVE TO DRAFT'), 0)

