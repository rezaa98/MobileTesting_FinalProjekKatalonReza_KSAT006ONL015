import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication(GlobalVariable.appId, FailureHandling.STOP_ON_FAILURE)

Mobile.startApplication('C:\\Users\\rezay\\Documents\\project Amazon\\react-portfolio-master\\MobileTesting_FinalProjekKatalonReza_KSAT006ONL015\\APK\\app-debug.apk', 
    false)

Mobile.verifyElementVisible(findTestObject('Landing Screen Page/Body Landing Page/username'), GlobalVariable.timeOut)

Mobile.verifyElementVisible(findTestObject('Landing Screen Page/Body Landing Page/password'), 1)

Mobile.verifyElementVisible(findTestObject('Landing Screen Page/Body Landing Page/btn_LOGIN'), 3)

Mobile.verifyElementVisible(findTestObject('Landing Screen Page/Body Landing Page/text_Dont have a profile'), 0)

Mobile.verifyElementVisible(findTestObject('Landing Screen Page/Body Landing Page/btn_CREATE A PROFILE'), 0)

Mobile.waitForElementPresent(findTestObject('Landing Screen Page/Body Landing Page/username'), 5)

Mobile.tap(findTestObject('Landing Screen Page/Body Landing Page/username'), 0)

Mobile.setText(findTestObject('Landing Screen Page/Body Landing Page/username'), username, 0)

Mobile.waitForElementPresent(findTestObject('Landing Screen Page/Body Landing Page/password'), 5)

Mobile.tap(findTestObject('Landing Screen Page/Body Landing Page/password'), 0)

Mobile.setText(findTestObject('Landing Screen Page/Body Landing Page/password'), password, 0)

Mobile.waitForElementPresent(findTestObject('Landing Screen Page/Body Landing Page/btn_LOGIN'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('Landing Screen Page/Body Landing Page/btn_LOGIN'), GlobalVariable.timeOut)

Mobile.verifyElementNotExist(findTestObject('Dashboard Page/text_Good morning'), 0)

