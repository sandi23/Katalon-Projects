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

'Scroll Kebawah sampai Pilihan Mobil Lokasi Terdekat'
WebUI.scrollToPosition(660, 680)

WebUI.delay(1)

'Klik Buton Next 2 Kali'
not_run: for (def index : 2) {
    'klik button next (>)'
    WebUI.click(findTestObject('Front-End/OR Homepage/OR Cari mobil berdasarkan lokasi terdekat (Car available near me)/button_next'))
}

not_run: WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Klik mobil Accord'
WebUI.click(findTestObject('Front-End/OR Product/OR Edit Mobil/Page_Home/Page_Home/div_Rp950000_pict-car - mobil honda accord'))

WebUI.delay(5)

