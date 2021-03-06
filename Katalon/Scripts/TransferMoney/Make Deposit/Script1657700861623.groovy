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

WebUI.callTestCase(findTestCase('Login/TC001_Login'), [('username') : 'reza.maulana', ('password') : 'admin123'], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Menu Page/btn_Left menu'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('Menu Page/Menu Left Side Bar/Body/android.widget.CheckedTextView - Accounts'), GlobalVariable.timeOut)

Mobile.getText(findTestObject('Make Account Page/Body/Have account/account_balance'), 0)

Mobile.tap(findTestObject('Menu Page/btn_Left menu'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('Menu Page/Menu Left Side Bar/Body/android.widget.CheckedTextView - Make a Deposit'), GlobalVariable.timeOut)

Mobile.verifyElementVisible(findTestObject('Deposit/Make a deposit/android.widget.TextView - Select an Account to Deposit to'), 
    0)

Mobile.setText(findTestObject('Deposit/Make a deposit/android.widget.EditText - Enter Deposit Amount ()'), deposit, 0)

Mobile.tap(findTestObject('Deposit/Make a deposit/android.widget.Button - DEPOSIT'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

