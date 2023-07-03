import demolar.DortIslem;
import demolar.InheritanceDemo.KrediUI;
import demolar.InheritanceDemo.OgretmenKrediManager;
import video24_37_Arasi.Overloading;
import video24_37_Arasi.Product;
import video24_37_Arasi.ProductManager;

public class Main {
    public static void main(String[] args) {

     /*   Product product1 = new Product();
        //set value
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");


        //get
        //System.out.println(product1.name);

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("image2.jpg");


        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image3.jpg");


        Product[] products = {product1,product2,product3};

        for (Product product : products) {
            System.out.println(product.getName());
        }
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("0535355454354");
        individualCustomer.setCustomerNumber("5234");
        individualCustomer.setFirstName("Abdullah");
        individualCustomer.setLastName("Dursun");

        CorporateCustomer corporateCustomer = new CorporateCustomer();

        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Abdullah's Bakery");
        corporateCustomer.setTaxNumber("1356546745675");

        Customer[] customers={individualCustomer,corporateCustomer};


        Methods.sayiBulmaca();
        String Sehir = Methods2.city();
        System.out.println(Sehir);
        int toplama = Methods2.topla(8,6);
        System.out.println(toplama);
        int toplama2 = Methods2.topla2(3,354645,2,5476);
        System.out.println(toplama2);
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.topla(15,56);
        System.out.println(sonuc);
        Product product =new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Monster Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
        Overloading overloading =new Overloading();
        System.out.println(overloading.toplama(5,4,9,3));
        OgretmenKrediManager ogretmenKrediManager= new OgretmenKrediManager();
        ogretmenKrediManager.hesapla();*/
        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new OgretmenKrediManager());
    }


}