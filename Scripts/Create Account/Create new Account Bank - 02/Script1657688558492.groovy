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

Mobile.tap(findTestObject('Menu Page/btn_Left menu'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('Menu Page/Menu Left Side Bar/Body/android.widget.CheckedTextView - Accounts'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('Make Account Page/Bottom/btn_Add account'), GlobalVariable.timeOut)

Mobile.comment('Verifikasi Data')

Mobile.verifyElementVisible(findTestObject('Make Account Page/Add an Account/text_Add an Account'), GlobalVariable.timeOut)

Mobile.verifyElementVisible(findTestObject('Make Account Page/Add an Account/android.widget.EditText - Account Name'), GlobalVariable.timeOut)

Mobile.verifyElementVisible(findTestObject('Make Account Page/Add an Account/android.widget.Button - ADD'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('Make Account Page/Add an Account/android.widget.EditText - Account Name'), 0)

Mobile.setText(findTestObject('Make Account Page/Add an Account/android.widget.EditText - Account Name'), account_name, 
    0)

Mobile.tap(findTestObject('Make Account Page/Add an Account/android.widget.EditText - Initial Balance (Optional)'), 0)

Mobile.setText(findTestObject('Make Account Page/Add an Account/android.widget.EditText - Initial Balance (Optional)'), 
    balance, 0)

Mobile.tap(findTestObject('Make Account Page/Add an Account/android.widget.Button - ADD'), 0)

