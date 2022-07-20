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

Mobile.tap(findTestObject('Menu Page/btn_Left menu'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('Menu Page/Menu Left Side Bar/Body/android.widget.CheckedTextView - Make a Payment'), GlobalVariable.timeOut)

Mobile.waitForElementPresent(findTestObject('Payment Page/Add a Payment Page/android.widget.EditText - Payee Name'), GlobalVariable.timeOut)

Mobile.verifyElementVisible(findTestObject('Payment Page/Body Page/Select payee/android.widget.Button - Make Payment'), 
    GlobalVariable.timeOut)

Mobile.verifyElementVisible(findTestObject('Payment Page/Body Page/Select payee/spinner_Payee'), GlobalVariable.timeOut)

Mobile.verifyElementVisible(findTestObject('Payment Page/Body Page/Select payee/android.widget.TextView - Select a Payee'), 
    GlobalVariable.timeOut)

Mobile.tap(findTestObject('Payment Page/Body Page/Select payee/spinner_Payee'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('Payment Page/Body Page/Select payee/android.widget.CheckedTextView - ejakkkk(P1)'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('Payment Page/Body Page/Select payee/android.widget.EditText - Amount'), GlobalVariable.timeOut)

Mobile.setText(findTestObject('Payment Page/Body Page/Select payee/android.widget.EditText - Amount'), amount, GlobalVariable.timeOut)

String payFrom = Mobile.getText(findTestObject('Payment Page/Body Page/android.widget.TextView - tes1 (12.00)'), 0)

Mobile.tap(findTestObject('Payment Page/Body Page/Select payee/android.widget.Button - Make Payment'), 0)

