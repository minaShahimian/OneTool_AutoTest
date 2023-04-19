package oneTool;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.OneToolPage;

public class OneToolTest extends BaseTests {

    @Test
    public void SuccessfulLogin() {


        OneToolPage oneToolPage = homePage.LoginTo1Tool();





       /*   LoginPage: DevelKundenmeister
            Public Username and Password for https://devel.kundenmeister.com/welcome/logout :


        oneToolPage.setUsernameField("mina.shahimian91@gmail.com");
        oneToolPage.setPasswordField("DW6X-s{;hk$HZWt8ja]w");


        */

//TestScenario1/ LoginPage:
        oneToolPage.setUsernameField("testing@1tool.com");
        oneToolPage.setPasswordField("L.w2khMW!TEMYi.EXxQ!hpHyvedQNj8nBGH");
        oneToolPage.clickLoginButton();



        /*
          To execute each test scenario, you need to uncomment it separately:
         */




/*

//TestScenario2/ Search
        oneToolPage.clickSearch();

//TestScenario3/ BurgerMenu
        oneToolPage.clickBurgerMenu();


//TestScenario4/Users: UserdataTab --> change username
        oneToolPage.clickUsername();
        oneToolPage.clickSetting();
        oneToolPage.cleanUsername();
        oneToolPage.setChangeUsername("Auto-Test");


//TestScenario5/ Users: ViewTab
        oneToolPage.clickUsername();
        oneToolPage.clickSetting();
        oneToolPage.clickView();
        oneToolPage.clickStartPage();




//TestScenario6/ Contact:  NewContact:Test
        oneToolPage.clickContactMenu();
        oneToolPage.clickNewContactMenu1();
        // oneToolPage.ClickTest();

        oneToolPage.clickFirstNameField("Auto");
        oneToolPage.setLastNameField("Test");
        oneToolPage.clickSexField();
        oneToolPage.setMail("Auto.Test@koerbler.com");
        oneToolPage.clickMailCheckbox();
        //oneToolPage.ClickTestBox();
        // oneToolPage.clickSmsCheckbox();
        oneToolPage.ClickCompany("TestCompany");
        //oneToolPage.ClickVatin("TestVatin");
        // oneToolPage.ClickGetMailNewsletter();
        //oneToolPage. ClickGetSmsNewsletter();

        oneToolPage.ClickSaveButton1();
        //oneToolPage.ClickDeleteIcon();





//TestScenario7/ Marketing: NewNewsletter->SendNewsletter

        oneToolPage.clickMarketing();
        oneToolPage.clickCreateNewsletter();
        oneToolPage.clickChooseNewsletter();
        oneToolPage.clickLaden();
        oneToolPage.clearSubject();
        oneToolPage.clickSubject("Newsletter As a test");
        oneToolPage.clearPreHeader();
        oneToolPage.clickPreHeader( "This newsletter is only for testing and has no value." );
        oneToolPage.clickSaveButton3();

        oneToolPage.clickPreView();
        //oneToolPage.clickSendPerEmailField();
        //oneToolPage.setSendPerEmailField("mina.shahimian91@gmail.com");
        //oneToolPage.clickSendPerEmail();
        //oneToolPage.clickSaveSender();
        //oneToolPage.clickNoSaveSender();
        //oneToolPage.clickDeselectAll();
        //oneToolPage.clickKunde();
        //oneToolPage.clickSend();



//TestScenario8/ Sales:  Opportunities
        oneToolPage.ClickSales();
        oneToolPage.clickOpportunities();
        oneToolPage.clickNewOpportunity();
        oneToolPage.setAppellation("Test Appellation");
        ////oneToolPage.setContact1("");   //search field functioniert nicht zum autotest, weil kein eigenen Element hat.
        oneToolPage.clickOpportunitiesPhase();
        oneToolPage.clickCostCenter();
        oneToolPage.clickSource();
        oneToolPage.clickRevenue(1000);
        oneToolPage.clickResponsible();
        oneToolPage.clickProbabilityOfSuccess(50);
        oneToolPage.clickStatus();
        oneToolPage.clickCreateDate("01.01.2023");
        oneToolPage.clickFinishData();
        oneToolPage.clickDescription("This Opportunity is for test and don't have any value");
        oneToolPage.clickSaveButton4();


//TestScenario9/ Sales: Campaign
        //oneToolPage.ClickSales();
        oneToolPage.ClickSalesCampaign();
        oneToolPage.ClickNewCampaign();
        oneToolPage.ClickCampaignName("Auto-Test");
        oneToolPage.ClickAssociatedProducts("Auto-Test");
        oneToolPage.ClickSalesContactGroup();
        oneToolPage.ClickSaveCampaign();


//TestScenario10/ Finance: invoice  (DevelUrl)
        oneToolPage.ClickFinance();
        oneToolPage.ClickInvoice();
        oneToolPage.ClickCreateInvoice();
        oneToolPage.ClickChooseInvoice();
        oneToolPage.setInvoiceTitle("Test_Invoice");
        oneToolPage.setInvoiceCod("01111");
        //oneToolPage.setChoseProject("Test_Project");
        oneToolPage.ClickChosePaymentText();
        oneToolPage.ClickValuePaymentText();
        oneToolPage.ClickAction();
        oneToolPage.ClickInvoiceGenerate();


//TestScenario11/  Warehouse: Journal
        oneToolPage.clickWarehouse();
        oneToolPage.clickJournal();
        oneToolPage.clickWarehouseOverview();
        oneToolPage.clickNewTransferPosting();
        oneToolPage.clickWithSerialNumber();
        oneToolPage.clickNewTransferPostingProduct();
        oneToolPage.setNewTransferPostingProduct("Auto_Test");
        oneToolPage.clickProposalNumber(10000);
        oneToolPage.clickDeliveryNote(01111);
        ////oneToolPage.clickComment();
        oneToolPage.clickNewTransferPostingSave();

//TestScenario12/ Products: NewProduct
        oneToolPage.ClickProduct();
        oneToolPage.ClickProductOverview();
        oneToolPage.ClickNewProduct();
        oneToolPage.ClickAddProduct();
        oneToolPage.ClickNameProduct("Auto-Test");
        oneToolPage.ClickCategoryProductSearch();
        oneToolPage.ClickDemoCategory();
        oneToolPage.ClickChooseDemoCategory();
        oneToolPage.ClickPriceProduct(10000);
        oneToolPage.ClickSaveBtnProduct();


//TestScenario13/Products: Category
         oneToolPage.ClickProduct();
        oneToolPage.ClickCategory();
        oneToolPage.ClickNewProduct();
        oneToolPage.ClickAddProduct();
        oneToolPage.ClickProductName("Test");
        oneToolPage.ClickCategoryProductSearch();
        oneToolPage.ClickDemoCategory();
        oneToolPage.ClickChooseDemoCategory();
        oneToolPage.ClickPriceProduct(11111);
        oneToolPage.ClickSaveBtnProduct();

//TestScenario14/ Organisation: Project
        oneToolPage.clickOrganisation();
        oneToolPage.clickProject();
        oneToolPage.clickNewProject();
        oneToolPage.setProjectName("Test-Project");
        //oneToolPage.clickContact();
        //oneToolPage.setWritheContact("Auto-Test");
        // oneToolPage.clickResultContact();
        oneToolPage.clickPhase();
        oneToolPage.clickValue1Phase();
        oneToolPage.clickCategories();
        oneToolPage.clickValue1Categories();
        oneToolPage.clickProjectManager();
        oneToolPage.clickValue1ProjectManager();
        oneToolPage.clickSaveButton2();



//TestScenario15/ Administration: GlobalSettings: Layout:
        oneToolPage.ClickAdministration();
        oneToolPage.ClickGlobalSetting();
        oneToolPage.ClickLayout();
        oneToolPage.cleanHeaderColor();
        oneToolPage.setHeaderColor("#2d9b11");
        oneToolPage.clickSaveButton5();


  //TestScenario16/ Administration:  GlobalSettings: CustomerPortal
        oneToolPage.ClickAdministration();
        oneToolPage.ClickGlobalSetting();
        oneToolPage.clickCustomerPortal();
        oneToolPage.clickCustomerPortalOverview();
        oneToolPage.clickProjectCategory();
        oneToolPage.clickProjectCategoryValue();
        oneToolPage.clickAdmin_Email("1Tool.Test@koerbler.com");
        oneToolPage.clickNotifyManager();
        oneToolPage.clickAdminMail("This Email is only for testing and has no value.");
        oneToolPage.clickCustomerMail("This Email is only for testing and has no value.");
        oneToolPage.clickSavaBTN();

//TestScenario17/ Administration: Contacts
        oneToolPage.ClickAdministration();
        oneToolPage.ClickContacts();
        oneToolPage.ClickContactGroup();
        oneToolPage.SetNewContactGroup();
        oneToolPage.ClickSaveButton6();



 */


    }

}

