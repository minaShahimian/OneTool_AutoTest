package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OneToolPage {

    private final WebDriver driver;


    //LoginPage:
    //TestScenario: 1)Write Username and password.  2)Click login button. ->Navigate to OneTool page.
    private final By UsernameField = By.id("email");
    private final By PasswordField = By.id("password");
    private final By loginButton = By.xpath(" //button[@class='width-35 pull-right btn btn-sm btn-primary ']");

    public OneToolPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsernameField(String Username) {
        driver.findElement(UsernameField).sendKeys(Username);
    }

    public void setPasswordField(String passwordField) {
        driver.findElement(PasswordField).sendKeys(passwordField);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }


//---------------------------------------------------


    //Search
    private final By Search = new By.ByClassName("km-search");

    public void clickSearch() {
        driver.findElement(Search).click();
    }


//----------------------------------------------------------


    //Users: UserdataTab
    //TestScenario: 1)Click on User 2)Click on Setting ->Navigate to User data 3)Choose UserdataTab
    private final By Username = new By.ByClassName("user-name");
    private final By Setting = new By.ByClassName("menu-i-vue");
    private final By ChangeUsername = By.id("username");


    public void clickUsername() {
        driver.findElement(Username).click();
    }

    public void clickSetting() {
        driver.findElement(Setting).click();
    }

    public void cleanUsername() {
        driver.findElement(ChangeUsername).clear();
    }

    public void setChangeUsername(String Username) {
        driver.findElement(ChangeUsername).sendKeys(Username);
    }


//-------------------------------------------------------------------


    //Users: ViewTab
    //TestScenario: 1)Click on User 2)Click on Setting ->Navigate to User data 3)Choose ViewTab
    private final By View = By.xpath("/html/body/div[3]/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/ul/li[2]/a");
    private final By StartPage = By.xpath("//select[@name='startpage']//option[4]");

    public void clickView() {
        driver.findElement(View).click();
    }

    public void clickStartPage() {
        driver.findElement(StartPage).click();
    }


//-----------------------------------------------------------


    //BurgerMenu
    private final By BurgerMenu = By.cssSelector("#top-navigation");

    //private final By BurgerMenu = new By.ByClassName("km__menu--container");
    public void clickBurgerMenu() {
        driver.findElement(BurgerMenu).click();
    }
//-----------------------------------------------------------

    //Contact: NewContactPerson
    //TestScenario: 1)Go to BurgerMenu 2)Click on Contact 3)Click on NewContact 4)Write the text Field 5)Click on save button
    private final By ContactMenu = By.xpath("//span[text()='Contacts']");
    private final By NewContactMenu1 = By.xpath("//span[text()='New contact']");
    private final By Test = By.xpath("");

    private final By FirstNameField = By.xpath("//input[@id='vorname']");
    private final By LastNameField = By.xpath("//input[@id='name']");

    private final By testBox = By.xpath(" //input[@id='dynamics[c_2_0]']");
    private final By SexField = By.xpath("//select[@id='sex']//option[2]");
    private final By Mail = By.xpath("//input[@id='mail']");
    private final By MailCheckbox = By.xpath("//input[@id='mail']");
    private final By SmsCheckbox = By.xpath("//input[@id='sms_nl']");


    private final By Company = By.xpath("//input[@id='firma']");
    private final By Vatin = By.xpath("//input[@id='vatin']");

    private final By GetMailNewsletter = By.xpath("//input[@id='mail_nl']");
    private final By GetSmsNewsletter = By.xpath("//input[@id='sms_nl']");


    private final By SaveButton1 = By.xpath("//button[@class='btn btn-success btn-small']");
    private final By DeleteIcon = By.xpath("//button[@class='btn btn-small btn-km btn-danger tooltip-error']");


    public void clickContactMenu() {
        driver.findElement(ContactMenu).click();
    }

    public void clickNewContactMenu1() {
        driver.findElement(NewContactMenu1).click();
    }

    public void ClickTest() {
        driver.findElement(Test).click();
    }

    public void clickFirstNameField(String firsName) {
        driver.findElement(FirstNameField).sendKeys(firsName);
    }

    public void setLastNameField(String lastName) {
        driver.findElement(LastNameField).sendKeys(lastName);
    }

    public void ClickTestBox() {
        driver.findElement(testBox).click();
    }


    public void clickSexField() {
        driver.findElement(SexField).click();
    }

    public void setMail(String mail) {
        driver.findElement(Mail).sendKeys(mail);
    }

    public void clickMailCheckbox() {
        driver.findElement(MailCheckbox).click();
    }

    public void clickSmsCheckbox() {
        driver.findElement(SmsCheckbox).click();
    }


    public void ClickSaveButton1() {
        driver.findElement(SaveButton1).click();
    }

    public void ClickDeleteIcon() {
        driver.findElement(DeleteIcon).click();
    }


    public void ClickCompany(String CompanyName) {
        driver.findElement(Company).sendKeys(CompanyName);
    }

    public void ClickVatin(String VatinName) {
        driver.findElement(Vatin).sendKeys(VatinName);
    }

    public void ClickGetMailNewsletter() {
        driver.findElement(GetMailNewsletter).click();
    }

    public void ClickGetSmsNewsletter() {
        driver.findElement(GetSmsNewsletter).click();
    }


    //----------------------------------------------------------------
//Marketing: CreateNewNewsletter & SendNewsletter

    //TestScenario:
    // 1)Go to BurgerMenu 2)Click on Marketing 3)Click on create Newsletter 4)Choose on demo newsletter ->Navigate to Newsletter
    // 5)Write the text Field 6)Click on save button 6)Click on Preview ->Navigate to send Page 7)


    private final By Marketing = By.xpath("//span[text()='Marketing']");
    private final By CreateNewsletter = By.xpath("//span[text()='Create newsletter']");
    private final By ChooseNewsletter = By.xpath("//select[@class='width-100']//option[2]");
    private final By Laden = By.xpath("//button[@class='btn btn-inverse btn-white']");
    private final By Subject = By.xpath("//input[@name='betreff']");
    private final By PreHeader = By.xpath("//textarea[@id='nl_preheader']");
    private final By SaveButton3 = By.xpath("//button[@id='saveSubmit']");
    private final By PreView = By.xpath("//button[@id='formSubmit']");

    private final By sendPerEmailField = By.xpath("//input[@id='mail']");
    private final By sendPerEmail = By.xpath("//span[@class='ace-icon fa fa-send-o  icon-on-right bigger-110']");
    private final By SaveSender = By.xpath("//button[@class='btn btn-info']");//form[@id='nl_action_form']//button[3]

    private final By NoSaveSender = By.xpath("//button[@name='send_nosave']");
    private final By DeselectAll = By.xpath("//input[@id='check_uncheckall']");
    private final By Kunde = By.xpath("//input[@class='ace']");
    private final By Send = By.xpath("//button[@id='send_it']");


    public void clickMarketing() {
        driver.findElement(Marketing).click();
    }

    public void clickCreateNewsletter() {
        driver.findElement(CreateNewsletter).click();
    }

    public void clickChooseNewsletter() {
        driver.findElement(ChooseNewsletter).click();
    }

    public void clickLaden() {
        driver.findElement(Laden).click();
    }

    public void clearSubject() {
        driver.findElement(Subject).clear();
    }

    public void clickSubject(String subject) {
        driver.findElement(Subject).sendKeys(subject);
    }

    public void clearPreHeader() {
        driver.findElement(PreHeader).clear();
    }

    public void clickPreHeader(String preHeader) {
        driver.findElement(PreHeader).sendKeys(preHeader);
    }

    public void clickSaveButton3() {
        driver.findElement(SaveButton3).click();
    }

    public void clickPreView() {
        driver.findElement(PreView).click();
    }

    public void clickSendPerEmailField() {
        driver.findElement(sendPerEmailField).click();
    }

    public void setSendPerEmailField(String Email) {
        driver.findElement(sendPerEmailField).sendKeys(Email);
    }

    public void clickSendPerEmail() {
        driver.findElement(sendPerEmail).click();
    }

    public void clickSaveSender() {
        driver.findElement(SaveSender).click();
    }

    public void clickNoSaveSender() {
        driver.findElement(NoSaveSender).click();
    }

    public void clickDeselectAll() {
        driver.findElement(DeselectAll).click();
    }

    public void clickKunde() {
        driver.findElement(Kunde).click();
    }

    public void clickSend() {
        driver.findElement(Send).click();
    }



    //------------------Sales:  Opportunities-----------------
    //TestScenario: 1)Go to BurgerMenu 2)Click on Sales 3)Click on Opportunities 4)Click on new opportunity ->Navigate to Opportunities
    // 5)Write text Field 6)Click on save button


    private final By Sales = By.xpath("//span[text()='Sales']");
    private final By Opportunities = By.xpath("//span[text()='Opportunities']");
    private final By NewOpportunity = By.xpath("//span[text()='New opportunity']");
    private final By Appellation = By.xpath("//input[@id='opportunity']");
    private final By Contact1 = By.xpath("//input[@id='s2id_autogen1']");
    private final By OpportunitiesPhase = By.xpath("//select[@name='stage_id']//option[4]");
    private final By CostCenter = By.xpath("//select[@name='kostenstelle_id']//option[2]");
    private final By Source = By.xpath("//select[@name='source_id']//option[8]");
    private final By Revenue = By.xpath("//input[@id='revenue']");
    private final By Responsible = By.xpath("//select[@name='user_id']//option[2]");
    private final By ProbabilityOfSuccess= By.xpath("//input[@id='input_propability']");
    private final By Status = By.xpath("//div[@id='status']//input[@value='2']");
    private final By createDate = By.xpath("//input[@id='creation_date']");
    private final By FinishDate = By.xpath("//input[@id='finish_date']");
    private final By Description = By.xpath("//textarea[@id='description']");
    private final By SaveButton4 = By.xpath("//button[@class='btn btn-success']");

    public void ClickSales() {
        driver.findElement(Sales).click();
    }

    public void clickOpportunities() {
        driver.findElement(Opportunities).click();
    }

    public void clickNewOpportunity() {
        driver.findElement(NewOpportunity).click();
    }

    public void setAppellation(String appellation) {
        driver.findElement(Appellation).sendKeys(appellation);
    }

    public void setContact1(String contact1) {
        driver.findElement(Contact1).sendKeys(contact1);
    }
    public void clickOpportunitiesPhase() {
        driver.findElement(OpportunitiesPhase).click();
    }
    public void clickCostCenter() {
        driver.findElement(CostCenter).click();
    }
    public void clickSource() {
        driver.findElement(Source).click();
    }
    public void clickRevenue(Integer revenue) {
        driver.findElement(Revenue).sendKeys();
    }
    public void clickResponsible() {
        driver.findElement(Responsible).click();
    }
    public void clickProbabilityOfSuccess(Integer probabilityOfSuccess ) {
        driver.findElement(ProbabilityOfSuccess).sendKeys();
    }


    public void clickStatus() {
        driver.findElement(Status).click();
    }
    public void clickCreateDate(String date) {
        driver.findElement(createDate).sendKeys();
    }

    public void clickFinishData() {
        driver.findElement(FinishDate).click();
    }
    public void clickDescription(String description) {
        driver.findElement(Description).sendKeys();
    }

    public void clickSaveButton4() {
        driver.findElement(SaveButton4).click();
    }

//----Sales: Campaign ------------------------------------
    //TestScenario: 1)Go to BurgerMenu 2)Click on Sales 3)Click on Sales Campaign 4)Click on new Campaign ->Navigate to Create Campaign
    // 5)Fill text Field 6)Click on save button


    private final By SalesCampaign = By.xpath("//span[text()='Sales campaign']");
    private final By NewCampaign = By.xpath("//span[text()='New campaign']");
    private final By CampaignName = By.xpath("//input[@class='input-large']");
    private final By associatedProducts = By.xpath("//input[@id='s2id_autogen1']");
    private final By SalesContactGroup = By.xpath("//option[@value='2']");
    private final By SaveCampaign = By.xpath("//button[@value='save']");

    public void ClickSalesCampaign() {
        driver.findElement(SalesCampaign).click();
    }

    public void ClickNewCampaign() {
        driver.findElement(NewCampaign).click();
    }

    public void ClickCampaignName(String name) {
        driver.findElement(CampaignName).sendKeys(name);
    }

    public void ClickAssociatedProducts(String product) {
        driver.findElement(associatedProducts).sendKeys(product);
    }

    public void ClickSalesContactGroup() {
        driver.findElement(SalesContactGroup).click();
    }

    public void ClickSaveCampaign() {
        driver.findElement(SaveCampaign).click();
    }


//----------------------------------------------------------------------


//---------Finance: invoice ---------------------

    //Finance: invoice  (DevelUrl)
    //TestScenario: 1)Go to BurgerMenu 2)Click on Finance 3)Click on Invoice 4)Click on createInvoice ->Navigate to Create new invoice
    // 5)Write text Field 6)Click on invoiceGenerate button
    private final By Finance = By.xpath("//span[text()='Finance']");
    private final By Invoice = By.xpath("//span[text()='Invoices']");
    private final By CreateInvoice = By.xpath("//span[text()='Create Invoice']");
    private final By ChooseInvoice = By.xpath("//select[@id='option_id']//option[@value='1']");

    private final By InvoiceTitle = By.xpath("//textarea[@name='title']");
    private final By InvoiceCod = By.xpath("//input[@id='orderCode']");
    private final By ChoseProject = By.xpath("//input[@id='token-input-project']");


    private final By valueBereich = By.xpath("//select[@name='s_1_0']//option[2]");
    private final By choosVerantwortlicher = By.xpath("//select[@name='s_2_0']");
    private final By valueVerantwortlicher = By.xpath("//select[@name='s_2_0']//option[2]");
    private final By chosePaymentText = By.xpath("//select[@id='payment_type']");
    private final By valuePaymentText = By.xpath("//select[@id='payment_type']//option[3]");
    private final By action = By.xpath("//input[@value='email']");
    private final By invoiceGenerate = By.xpath("//input[@id='submitCreate']");

    public void ClickFinance() {
        driver.findElement(Finance).click();
    }

    public void ClickInvoice() {
        driver.findElement(Invoice).click();
    }

    public void ClickCreateInvoice() {
        driver.findElement(CreateInvoice).click();
    }

    public void ClickChooseInvoice() {        driver.findElement(ChooseInvoice).click();    }

    public void setInvoiceTitle(String invoiceTitle) {
        driver.findElement(InvoiceTitle).sendKeys(invoiceTitle);
    }

    public void setInvoiceCod(String invoiceCod) {
        driver.findElement(InvoiceCod).sendKeys(invoiceCod);
    }

    public void setChoseProject(String choseProject) {
        driver.findElement(ChoseProject).sendKeys(choseProject);
    }


    public void ClickChosePaymentText() {
        driver.findElement(chosePaymentText).click();
    }

    public void ClickValuePaymentText() {
        driver.findElement(valuePaymentText).click();
    }

    public void ClickAction() {
        driver.findElement(action).click();
    }

    public void ClickInvoiceGenerate() {
        driver.findElement(invoiceGenerate).click();
    }

//-------------------------------------------------
    //Warehouse: Journal  (DevelUrl)
    //TestScenario: 1)Go to BurgerMenu 2)Click on Warehouse 3)Click on Journal 4)Click on Overview ->Navigate to Journal
    // 5)click on new transfer posting  6) choose the with serial number
    //7)Write text Field   8)Click on save button

    private final By warehouse = By.xpath("//span[text()='Warehouse']");
    private final By Journal = By.xpath("//span[text()='Journal']");
    private final By warehouseOverview = By.xpath("//span[text()='Overview']");
    private final By newTransferPosting = By.xpath("//a[@id='new-transfer']"); //?
    private final By withSerialNumber = By.xpath("  //a[@class='accordion-toggle']");
    private final By newTransferPostingProduct = By.xpath("//input[@id='transfer_product_id']");
    private final By proposalNumber = By.xpath("//input[@id='transfer_proposal']");
    private final By deliveryNote = By.xpath("//input[@id='delivery_note']");
    private final By comment = By.xpath("");//?
    private final By newTransferPostingSave = By.xpath("//button[@id='btnEditTransferSave']");


    public void clickWarehouse() {
        driver.findElement(warehouse).click();
    }

    public void clickJournal() {
        driver.findElement(Journal).click();
    }

    public void clickWarehouseOverview() {
        driver.findElement(warehouseOverview).click();
    }


    public void clickNewTransferPosting() {
        driver.findElement(newTransferPosting).click();
    }


    public void clickWithSerialNumber() {
        driver.findElement(withSerialNumber).click();
    }


    public void clickNewTransferPostingProduct() {
        driver.findElement(newTransferPostingProduct).click();
    }

    public void setNewTransferPostingProduct(String product) {
        driver.findElement(newTransferPostingProduct).sendKeys(product);
    }

    public void clickProposalNumber(Integer ProposalNumber) {
        driver.findElement(proposalNumber).sendKeys();
    }

    public void clickDeliveryNote(Integer DeliveryNote) {
        driver.findElement(deliveryNote).click();
    }

    public void clickComment() {
        driver.findElement(comment).click();
    }

    public void clickNewTransferPostingSave() {
        driver.findElement(newTransferPostingSave).click();
    }

 //--------------------------------------------

    //Products: NewProduct

    //TestScenario: 1)Go to BurgerMenu 2)Click on Products 3)Click on Overview 4)Click on add Product ->Navigate to ProductInformation
    // 5)Fill text Field 6)Click on save button

    private final By Product = By.xpath("//span[text()='Products']");

    private final By ProductOverview = By.xpath("//a[@class='kmui-btn kmui-btn-gradiant']");

    private final By NewProduct = By.xpath("//a[@class='kmui-btn kmui-btn-gradiant']");

    private final By AddProduct = By.xpath("//a[@id='createProductLink_3']");

    private final By ProductName = By.xpath("//input[@id='bezeichnung']");

    private final By CategoryProductSearch = By.xpath("//i[@class='km-search']");
    private final By DemoCategory = By.xpath("//input[@class='dt-checkboxes']");
    private final By ChooseDemoCategory = By.xpath("//button[@class='btn btn-success']");

    private final By PriceProduct = By.xpath("//input[@id='preis_brutto']");

    private final By SaveBtnProduct = By.xpath("//input[@class='btn btn-success btn-xs submit-button']");


    public void ClickProduct() {
        driver.findElement(Product).click();
    }

    public void ClickProductOverview() {
        driver.findElement(ProductOverview).click();
    }

    public void ClickNewProduct() {
        driver.findElement(NewProduct).click();
    }

    public void ClickAddProduct() {
        driver.findElement(AddProduct).click();
    }

    public void ClickProductName(String name) {
        driver.findElement(ProductName).sendKeys(name);
    }

    public void ClickCategoryProductSearch() {
        driver.findElement(CategoryProductSearch).click();
    }

    public void ClickDemoCategory() {
        driver.findElement(DemoCategory).click();
    }

    public void ClickChooseDemoCategory() {
        driver.findElement(ChooseDemoCategory).click();
    }

    public void ClickPriceProduct(Integer number) {
        driver.findElement(PriceProduct).sendKeys();
    }

    public void ClickSaveBtnProduct() {
        driver.findElement(SaveBtnProduct).click();
    }
    //----------------------------------------------------------------------


    //Products: Category  (DevelUrl)
    //TestScenario: 1)Go to BurgerMenu 2)Click on Products 3)Click on Category ->Navigate to Category Information
    // 5)Write text Field 6)Click on Save button

    private final By Category = By.xpath("//span[text()='Categories']");

    private final By AddCategory = By.xpath("//button[@class='btn btn-primary']");
    private final By CategorySave = By.xpath("//button[@class='btn btn-success']");

    public void ClickCategory() {
        driver.findElement(Category).click();
    }
    public void ClickCategorySave() {
        driver.findElement(CategorySave).click();
    }



//---------------------------------------------------


    //Organisation: Project
    //TestScenario: 1)Go to BurgerMenu 2)Click on Organisation 3)Click on Project 4)Write text Field 5)Click on save button

    private final By Organisation = By.xpath("//span[text()='Organisation']");
    private final By Project = By.xpath("//span[text()='Projects']");
    private final By NewProject = By.xpath("//span[text()='New project']");
    private final By ProjectName = By.xpath("//input[@id='project[name]']");
    private final By Contact = By.xpath("//span[@class='select2-chosen']");
    private final By WriteContact = By.xpath("/html/body/div[17]/div/input");
    private final By ResultContact = By.xpath("/html/body/div[17]/ul/li/div");
    private final By Phase = By.xpath("//select[@name='project[phase]']");
    private final By Value1Phase = By.xpath("//select[@name='project[phase]']//option[2]");
    private final By Categories = By.xpath("//select[@id='project[type]']");
    private final By Value1Categories = By.xpath("//select[@name='project[type]']//option[3]");
    private final By ProjectManager = By.xpath("//select[@name='project[manager]']");
    private final By Value1ProjectManager = By.xpath("//select[@name='project[manager]']//option[1]");
    private final By SaveButton2 = By.xpath("//button[@class='btn btn-success no-border']");

    public void clickOrganisation() {
        driver.findElement(Organisation).click();
    }

    public void clickProject() {
        driver.findElement(Project).click();
    }

    public void clickNewProject() {
        driver.findElement(NewProject).click();
    }

    public void setProjectName(String projectName) {
        driver.findElement(ProjectName).sendKeys(projectName);
    }

    public void clickContact() {
        driver.findElement(Contact).click();
    }

    public void setWritheContact(String writeContact) {
        driver.findElement(WriteContact).sendKeys(writeContact);
    }

    public void clickResultContact() {
        driver.findElement(ResultContact).click();
    }

    public void clickPhase() {
        driver.findElement(Phase).click();
    }

    public void clickValue1Phase() {
        driver.findElement(Value1Phase).click();
    }

    public void clickCategories() {
        driver.findElement(Categories).click();
    }

    public void clickValue1Categories() {
        driver.findElement(Value1Categories).click();
    }

    public void clickProjectManager() {
        driver.findElement(ProjectManager).click();
    }

    public void clickValue1ProjectManager() {
        driver.findElement(Value1ProjectManager).click();
    }

    public void clickSaveButton2() {
        driver.findElement(SaveButton2).click();
    }


    //---------------------------------------------------------------------



    //administration _GlobalSetting_ Layout:
    //TestScenario: 1)Go to BurgerMenu 2)Click on administration 3)Click on GlobalSetting 4)Click on Layout ->Navigate to Layout
    // 5)Choose color Field 6)Click on save button
    private final By Administration = By.xpath("//span[text()='Administration']");
    private final By GlobalSetting = By.xpath("//span[text()='Global settings']"); //span[text()='Global settings')] //span[contains(text(),'Global settings')]/self::span")
    private final By Layout = By.xpath("//span[text()='Layout']");//span[contains(text(),'Layout')]/self::span
    private final By HeaderColor = By.xpath("//input[@id='header_color']");
    private final By SaveButton5 = By.xpath("//button[@class='btn btn-success']");


    public void ClickAdministration() {
        driver.findElement(Administration).click();
    }

    public void ClickGlobalSetting() {
        driver.findElement(GlobalSetting).click();
    }

    public void ClickLayout() {
        driver.findElement(Layout).click();
    }

    public void cleanHeaderColor() {
        driver.findElement(HeaderColor).clear();
    }

    public void setHeaderColor(String headerColor) {
        driver.findElement(HeaderColor).sendKeys(headerColor);
    }

    public void clickSaveButton5() {
        driver.findElement(SaveButton5).click();
    }


//----------------------------------------------------


    //Administration _GlobalSetting_ Customer portal:
    //TestScenario: 1)Go to BurgerMenu 2)Click on administration 3)Click on GlobalSetting 4)Click on Customer portal ->Navigate to Overview
    // 5)Tab: master data: fill out the form 6)Click on save button


    private final By CustomerPortal = By.xpath("//span[text()='Customer Portal']");
    private final By CustomerPortalOverview = By.xpath("/html/body/div[3]/div[1]/aside/div/div[1]/div/div[1]/nav/ul/li[18]/ul/li[4]/ul/li[9]/ul/li[2]/span/a/span");//span[text()='Overview']//span[contains(text(),'Overview')]/self::span

    private final By seo = By.xpath("//input[@name='seo']");
    private final By CustomerPortalName = By.xpath("//select[@name='setting[category_id]']//option[@value='3']");
    private final By SupportMail = By.xpath("//input[@name='support_mail']");

    private final By EntryUrl = By.xpath("//input[@name='entry_url']");

    private final By AlwaysShowTableFilter = By.xpath("//input[@name='always_show_filter']");
    private final By SMTPEmail = By.xpath("//input[@name='smtp_mail']");
    private final By savaBTN = By.xpath("//button[@class='btn btn-success']");

    public void clickCustomerPortal() {
        driver.findElement(CustomerPortal).click();
    }

    public void clickCustomerPortalOverview() {
        driver.findElement(CustomerPortalOverview).click();
    }

    public void clickSeo() {
        driver.findElement(seo).click();
    }

    public void clickCustomerPortalName() {
        driver.findElement(CustomerPortalName).click();
    }

    public void clickSupportMail(String email) {
        driver.findElement(SupportMail).sendKeys(email);
    }

    ;

    public void clickEntryUrl() {
        driver.findElement(EntryUrl).click();
    }

    ;

    public void clickAlwaysShowTableFilter() {
        driver.findElement(AlwaysShowTableFilter).click();
    }

    ;

    public void clickSMTPEmail(String email) {
        driver.findElement(SMTPEmail).sendKeys(email);
    }

    ;

    public void clickSavaBTN() {
        driver.findElement(savaBTN).click();
    }

    ;

    //-----------------------------------------------------------------------------

    //Administration: Contacts
    //TestScenario: 1)Go to BurgerMenu 2)Click on administration 3)Click on Contact 4)Click on ContactGroup ->Navigate to Manage contact groups
    // 5)Write text Field 6)Click on save button

    private final By Contacts = By.xpath("");//span[text()='Administration']//span[text()='Contacts']
    private final By ContactGroup = By.xpath("/html/body/div[3]/div/div[1]/aside/div/div[1]/div/div[1]/nav/ul/li[18]/ul/li[5]/ul/li[3]/span/a/span");
    private final By NewContactGroup = By.xpath("//input[@name='state']");
    private final By  SuperiorGroup = By.xpath("//select[@name='parent_id']//option[7]");
    private final By  ContactGroupDescription= By.xpath("//textarea[@name='description']");
    private final By  UserAccess= By.xpath("//select[@name='useraccess']//option[3]");
    private final By ContactType = By.xpath("//select[@name='contact_type']//option[4]");
    private final By SaveButton6 = By.xpath("//button[@class='ui-state-default float-left ui-corner-all ui-button']");
    public void ClickContacts() {
        driver.findElement(Contacts).click();
    }

    public void ClickContactGroup() {
        driver.findElement(ContactGroup).click();
    }

    public void SetNewContactGroup() {
        driver.findElement(NewContactGroup).sendKeys("TestGroup");
    }
    public void ClickSuperiorGroup() {
        driver.findElement(SuperiorGroup).click();
    }
    public void ClickContactGroupDescription(String description) {
        driver.findElement(ContactGroupDescription).sendKeys(description);
    }
    public void ClickUserAccess() {
        driver.findElement(UserAccess).click();
    }
    public void ClickContactType() {
        driver.findElement(ContactType).click();
    }


    public void ClickSaveButton6() {
        driver.findElement(SaveButton6).click();
    }


//-------------------------------------------------------

}
