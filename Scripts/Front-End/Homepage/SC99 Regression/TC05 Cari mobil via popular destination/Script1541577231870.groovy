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

WebUI.delay(1)

'Scroll Kebawah sampai Pilihan Popular Destination'
WebUI.scrollToPosition(970, 2450)

WebUI.delay(1)

'Klik destination'
WebUI.click(findTestObject('Object Repository/Front-End/OR Homepage/OR Cari mobil via popular destination/a_Bandung'))

WebUI.scrollToPosition(400, 250)

'Klik mobil utk view detail'
WebUI.click(findTestObject('Front-End/OR Homepage/OR Cari mobil via popular destination/h5_BMW 7 Series'))

