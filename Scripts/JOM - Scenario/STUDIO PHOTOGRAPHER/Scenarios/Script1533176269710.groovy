import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.comment('Sebelum dirun, lakukan langkah2 berikut:')

WebUI.comment('1. Ganti value PilihSkenario (di tab \'Variables\')')

WebUI.comment('2. Ganti profile \'default\' ke \'Jom - Scenario\' (pojok kanan atas)')

switch (PilihSkenario) {
    case 1:
        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Login'), [:], FailureHandling.OPTIONAL)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Calling'), [:], FailureHandling.OPTIONAL)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Come In'), [:], FailureHandling.OPTIONAL)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Start'), [:], FailureHandling.OPTIONAL)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Upload'), [:], FailureHandling.OPTIONAL)

        break
    case 2:
        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Login'), [:], FailureHandling.OPTIONAL)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Calling'), [:], FailureHandling.OPTIONAL)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Come In'), [:], FailureHandling.OPTIONAL)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Pending'), [:], FailureHandling.OPTIONAL)

        break
    case 3:
        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Login'), [:], FailureHandling.OPTIONAL)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Calling'), [:], FailureHandling.OPTIONAL)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Come In'), [:], FailureHandling.OPTIONAL)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Start'), [:], FailureHandling.OPTIONAL)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Pending'), [:], FailureHandling.OPTIONAL)

        WebUI.callTestCase(findTestCase('JOM - Front End/FE Studio Checkin/SC01 Regression/TC01 Cetak Nomor Antrian Order Studio Non Reservasi'), 
            [:], FailureHandling.OPTIONAL)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Login'), [:], FailureHandling.OPTIONAL)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Calling'), [:], FailureHandling.OPTIONAL)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Come In'), [:], FailureHandling.OPTIONAL)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Start'), [:], FailureHandling.OPTIONAL)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Upload'), [:], FailureHandling.OPTIONAL)

        break
    case 4:
        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Login'), [:], FailureHandling.OPTIONAL)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Calling'), [:], FailureHandling.OPTIONAL)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Come In'), [:], FailureHandling.OPTIONAL)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Start'), [:], FailureHandling.OPTIONAL)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Upload tapi pending'), [:], FailureHandling.OPTIONAL)

        break
    case 5:
        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Login'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Calling'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Come In'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Start'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Edit SO'), [(GlobalVariable.Orang) : '6'
                , (GlobalVariable.Pose) : '65'], FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Edit SO'), [(GlobalVariable.Orang) : '7'
                , (GlobalVariable.Pose) : '75'], FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Edit SO'), [(GlobalVariable.Orang) : '5'
                , (GlobalVariable.Pose) : '55'], FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('JOM - Scenario/STUDIO PHOTOGRAPHER/Test Cases/Upload'), [:], FailureHandling.STOP_ON_FAILURE)

        break
}

