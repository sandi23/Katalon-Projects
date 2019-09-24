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

'Call test case advanced search car use search bar rental city atau region'
not_run: WebUI.callTestCase(findTestCase('Mobile/Android/Homepage/SC99 Regression/TC02 Advanced Search Car Use Search Bar Rental City atau Region'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Mobile/Android/Homepage/SC99 Regression/TC01 Search car use search bar rental city atau region'), 
    [:], FailureHandling.STOP_ON_FAILURE)

'Menampilkan option sort & filter'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView5 - Sort  Filter'), 0)

'Menampilkan dropdown option list sort by'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.EditText0 - Popularity'), 0)

'Select lowest price'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Lowest price'), 0)

'Delay untuk select sort by'
Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Select bintang 1'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView4 - 1'), 0)

'Select bintang 2'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView7 - 2'), 0)

'Select bintang 3'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView8 - 3'), 0)

'Select bintang 4'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView9 - 4'), 0)

'Select bintang 5'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView10 - 5'), 0)

'Delay untuk select price range'
Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Looping untuk menentukan jumlah seat'
for (def index : (1..5)) {
    'Tap total seat'
    Mobile.tap(findTestObject('Mobile/OR Product/android.widget.ImageView2'), 0)
}

Mobile.scrollToText('Seat', FailureHandling.STOP_ON_FAILURE)

'Select plate number even'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView18 - Even'), 0)

'Select plate number odd'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView20 - Odd'), 0)

'Scroll to text facilities'
Mobile.scrollToText('Facilities', FailureHandling.STOP_ON_FAILURE)

'Show all facilities'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Show all facilities'), 0)

'Select facilities life insurance'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView6 - Life Insurance'), 0)

'Select facilities wifi'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView11 - Wifi'), 0)

Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Emergency Tools'), 0)

'Scroll to text car category'
Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Car categories', FailureHandling.STOP_ON_FAILURE)

'Show all category'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Show all category'), 0)

'Select car categories MPV'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.MPV'), 0)

'Select car categories Minibus'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Minibus'), 0)

'Select car categories Sport'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Sport'), 0)

'Select car category SUV'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.SUV'), 0)

'Select car categories Sedan'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Sedan'), 0)

'Scroll to text brand'
Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Brands', FailureHandling.STOP_ON_FAILURE)

'Show all brand'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Show all brand'), 0)

'Select brands honda'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView5 - Honda'), 0)

Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView18 - Jeep'), 0)

'Select brands chevrolet'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView9 - Chevrolet'), 0)

'Select brands toyota'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView11 - Toyota'), 0)

'Tap arrow right untuk select model'
Mobile.tap(findTestObject('Mobile/OR Homepage/android.widget.ImageView1'), 0)

'Delay untuk select model'
not_run: Mobile.delay(findTestData('Delay Step').getValue(1, 3), FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Mobile/OR Product/android.widget.EditText0 - Search model'), 'Renegade', 0)

Mobile.tap(findTestObject('Mobile/OR Product/android.widget.CheckBox0'), 0)

not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView1 - SPORTAGE'), 0)

not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView2 - SPORT CLASS'), 0)

not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView10 - CITY'), 0)

not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView12 - RANGER'), 0)

'Submit model yang dipilih'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Save'), 0)

Mobile.scrollToText('Transmission', FailureHandling.STOP_ON_FAILURE)

'Select type of fuel diesel'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView10 - Diesel'), 0)

'Select type of fuel petrol'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView13 - Petrol'), 0)

'Select type of fuel electric'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView14 - Electric'), 0)

'Select transmission manual'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView16 - Manual'), 0)

'Select transmission automatic'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView19 - Automatic'), 0)

'Search car sesuai sort dan filter yang telah ditentukan'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Search'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

