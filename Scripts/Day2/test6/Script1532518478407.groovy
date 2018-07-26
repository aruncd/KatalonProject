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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.seleniumeasy.com/test/')

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy - Best Demo webs/a_Input Forms'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy - Best Demo webs/a_Simple Form Demo'))

WebUI.setText(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy Demo - Simple Fo/input_user-message'), 'Hi')

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy Demo - Simple Fo/button_Show Message'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy Demo - Simple Fo/label_Your Message'))

WebUI.setText(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy Demo - Simple Fo/input_sum1'), '1')

WebUI.setText(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy Demo - Simple Fo/input_sum2'), '2')

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy Demo - Simple Fo/button_Get Total'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy Demo - Simple Fo/span_3'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy Demo - Simple Fo/a_Date pickers'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy Demo - Simple Fo/a_Input Forms'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy Demo - Simple Fo/a_Checkbox Demo'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy - Checkbox demo/input_isAgeSelected'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy - Checkbox demo/div_Success - Check box is che'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy - Checkbox demo/label_Option 1'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy - Checkbox demo/input_check1'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy - Checkbox demo/a_Input Forms'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy - Checkbox demo/a_Radio Buttons Demo'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy Demo - Radio but/label_Female'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy Demo - Radio but/button_Get Checked value'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy Demo - Radio but/p_Radio button Female is check'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy Demo - Radio but/input_gender'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy Demo - Radio but/label_5 to 15'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy Demo - Radio but/button_Get values'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy Demo - Radio but/p_Sex  Male Age group 5 - 15'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy Demo - Radio but/a_Table'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy Demo - Radio but/a_Table Pagination'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy - Table with Pag/td_Table cell'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy - Table with Pag/a_2'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy - Table with Pag/a_3'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy - Table with Pag/a_Progress Bars  Sliders'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy - Table with Pag/a_JQuery Download Progress bar'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy - JQuery Downloa/a_List Box'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy - JQuery Downloa/li_Bootstrap List Box'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy - JQuery Downloa/a_Bootstrap List Box'))

WebUI.setText(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy - Dual List box/input_SearchDualList'), 'sd')

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy - Dual List box/li_Morbi leo risus'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy - Dual List box/div_col-md-2'))

WebUI.doubleClick(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy - Dual List box/span_glyphicon glyphicon-chevr'))

WebUI.click(findTestObject('Object Repository/Day2Ass/Page_Selenium Easy - Dual List box/span_glyphicon glyphicon-chevr_1'))

