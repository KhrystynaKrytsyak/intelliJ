package reviewclass10;

public class FinalKeyDemo {
    final String company;
    FinalKeyDemo(String company){
        this.company=company;
    }
    void changeCompany(){
        //  company="Facebook"; Can't reassign it because it is final
    }
}
/*class Child extends FinalDemo{
}*/

