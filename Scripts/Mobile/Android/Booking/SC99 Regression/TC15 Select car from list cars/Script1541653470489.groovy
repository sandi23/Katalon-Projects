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

'Call test case search car use search bar renal city atau region'
not_run: WebUI.callTestCase(findTestCase('Mobile/Android/Homepage/SC99 Regression/TC01 Search car use search bar rental city atau region'), 
    [:], FailureHandling.STOP_ON_FAILURE)

'Select car yang ada di list of cars'
not_run: Mobile.tap(findTestObject('Mobile/OR Booking/android.support.v4.view.ViewPager0'), 0)

'Check packages'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Button0 - Check Packages'), 0)

'Membuat reservasi'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Button1 - Book Now'), 0)

'Scroll to text add additional benefits'
Mobile.scrollToText('Add additional benefits', FailureHandling.STOP_ON_FAILURE)

'Edit additional benefits'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.TextView2 - Edit'), 0)

'Checklist life insurance'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.CheckBox0'), 0)

'Tap arrow right untuk menampilkan life insurance by astralife'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.ImageView1'), 0)

'Menyimpan contact life insurance'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Button0 - Save'), 0)

'Menyetujui additional benefits'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Button0 - I Agree'), 0)

'Tap untuk menampilkan jam'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.EditText0'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Submit jam'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Button1 - OK'), 0)

'Pick up location'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.RelativeLayout7'), 0)

'Delay untuk load maps sesuai titik yang ditentukan'
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Mengkonfirmasi lokasi pick up'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Button0 - Confirm'), 0)

not_run: Mobile.scrollToText('Pick Up Rules', FailureHandling.STOP_ON_FAILURE)

'Return location'
not_run: Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.RelativeLayout8'), 0)

not_run: Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Mengkonfirmasi lokasi return '
not_run: Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Button0 - Confirm'), 0)

'Continue reserve'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Button0 - Continue'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

