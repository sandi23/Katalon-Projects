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

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Scroll Kebawah sampai Pilihan Popular Car Rental'
WebUI.scrollToPosition(750, 3580)

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Klik Button Next 2Kali'
for (def index : 2) {
    WebUI.click(findTestObject('Object Repository/Front-End/OR Homepage/OR Cari mobil via car rental populer/div_Jabodetabek_swiper-button-'))
}

WebUI.delay(findTestData('Delay Step').getValue(1, 1))

'Pilih Car Rental \'Kira Rental\''
WebUI.click(findTestObject('Object Repository/Front-End/OR Homepage/OR Cari mobil via car rental populer/div_Kira Car Rental Testing'))

'Scroll Kebawah sampai List Car'
WebUI.scrollToElement(findTestObject('Front-End/OR Homepage/OR Cari mobil via car rental populer/icon_car'), 0)

'Klik mobil utk view detail'
WebUI.click(findTestObject('Object Repository/Front-End/OR Homepage/OR Cari mobil via car rental populer/h5_BMW 7 Series'), 
    FailureHandling.STOP_ON_FAILURE)

