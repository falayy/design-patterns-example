import abstractfactory.*;
import builder.Smoothie;
import chainofresponsibility.CustomerSupport;
import chainofresponsibility.Level1CustomerSupport;
import chainofresponsibility.Level2CustomerSupport;
import chainofresponsibility.Level3CustomerSupport;
import decorator.*;
import facade.Food;
import facade.FoodOrderService;
import factory.eg1.Suv;
import factory.eg1.Truck;
import factory.eg1.Vehicle;
import factory.eg1.VehicleType;
import factory.eg2.*;
import iterator.BreakfastMenu;
import iterator.MenuItem;
import iterator.MenuIterator;
import mediator.ChatRoom;
import mediator.User;
import observer.UserWhatsApp;
import observer.WhatsAppFriend;
import proxy.ProxyImage;
import singleton.DataBaseService;
import singleton.DataBaseServices;
import state.VendingMachine;
import strategy.CreditCardPayment;
import strategy.CryptoCurrencyPayment;
import strategy.ShoppingCart;
import template.CarManufacturingProcess;
import template.SUVManufacturingProcess;
import template.SedanManufacturingProcess;

public class App {

    public static void main(String[] args) {
        Vehicle suv = new Suv();
        System.out.println(suv.createVehicle(VehicleType.SUV));
        Vehicle truck = new Truck();
        System.out.println(truck.createVehicle(VehicleType.TRUCK));


        Smoothie pineAppleGingerSmoothie =
                new Smoothie.Builder("Milk")
                        .withPineApple("Pineapple")
                        .withGinger("Ginger")
                        .build();

        Smoothie bananaMangoStrawBerrySmoothie =
                new Smoothie.Builder("Milk")
                        .withBanana("Banana")
                        .withMango("Mango")
                        .withStrawberry("Strawberry")
                        .build();

        System.out.println(pineAppleGingerSmoothie.toString());
        System.out.println(bananaMangoStrawBerrySmoothie.toString());


        DataBaseService dataBaseService1 = DataBaseService.getInstance();
        DataBaseService dataBaseService2 = DataBaseService.getInstance();

        System.out.println("dataBaseService1: " + dataBaseService1);
        System.out.println("dataBaseService2: " + dataBaseService2);

        DataBaseServices dataBaseService3 = new DataBaseServices();
        DataBaseServices dataBaseService4 = new DataBaseServices();

        System.out.println("dataBase3: " + dataBaseService3);
        System.out.println("dataBase4: " + dataBaseService4);


        PhoneFactory appleFactory = new IphoneFactory();
        Phone iPhone = appleFactory.createPhone();
        String iPhonePrice = iPhone.getPhonePrice();
        System.out.println(iPhonePrice);

        PhoneFactory samsungFactory = new SamsungFactory();
        Phone samsung = samsungFactory.createPhone();
        String samsungPrice = samsung.getPhonePrice();
        System.out.println(samsungPrice);

        PhoneFactory pixelFactory = new PixelFactory();
        Phone pixel = pixelFactory.createPhone();
        String pixelPrice = pixel.getPhonePrice();
        System.out.println(pixelPrice);

        appleFactory.distributePhones();
        samsungFactory.distributePhones();
        pixelFactory.distributePhones();


        FurnitureFactory woodenFactory = new WoodenFurnitureFactory();
        Chair woodenChair = woodenFactory.createChair();
        Table woodenTable = woodenFactory.createTable();
        Wardrobe woodenWardrobe = woodenFactory.createWardrobe();

        System.out.println("Wooden Factory makes " + woodenChair.createChair() + ", " + woodenTable.createTable() + ", " + woodenWardrobe.createWardrobe());

        FurnitureFactory plasticFactory = new PlasticFurnitureFactory();

        Chair plasticChair = plasticFactory.createChair();
        Table plasticTable = plasticFactory.createTable();
        Wardrobe plasticWardrobe = plasticFactory.createWardrobe();

        System.out.println("Plastic Factory makes " + plasticChair.createChair() + ", " + plasticTable.createTable() + ", " + plasticWardrobe.createWardrobe());

        FoodOrderService foodOrderService = new FoodOrderService();
        Food food = new Food("Jollof Rice", 2);
        foodOrderService.orderFood(food);

        ProxyImage proxyImageService = new ProxyImage();
        proxyImageService.loadImage("image");
        proxyImageService.loadImage("image");


        Juice juice = new WatermelonJuice();
        System.out.println("Drinking " + juice.drink() + " that costs $" + juice.cost());

        juice = new MangoFlavour(juice);
        System.out.println("Drinking " + juice.drink() + " that costs $" + juice.cost());

        juice = new OrangeFlavour(juice);
        System.out.println("Drinking " + juice.drink() + " that costs $" + juice.cost());

        juice = new PineAppleFlavour(juice);
        System.out.println("Drinking " + juice.drink() + " that costs $" + juice.cost());


        UserWhatsApp user = new UserWhatsApp();
        WhatsAppFriend john = new WhatsAppFriend("John");
        WhatsAppFriend cathy = new WhatsAppFriend("Cathy");

        user.addFriend(john);
        user.addFriend(cathy);
        user.setProfilePicture("new_picture.jpg");

        user.removeFriend(john);
        WhatsAppFriend peter = new WhatsAppFriend("Peter");
        user.addFriend(peter);

        user.setProfilePicture("new_picture2.jpg");


        CustomerSupport customerSupport1 = new Level1CustomerSupport();
        CustomerSupport customerSupport2 = new Level2CustomerSupport();
        CustomerSupport customerSupport3 = new Level3CustomerSupport();

        customerSupport1.setNextLevel(customerSupport2);
        customerSupport2.setNextLevel(customerSupport3);

        customerSupport1.handleIssue("basic");
        customerSupport1.handleIssue("intermediate");
        customerSupport1.handleIssue("complex");


        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.dispenseProduct();
        vendingMachine.selectProduct();
        vendingMachine.dispenseProduct();
        vendingMachine.selectProduct();
        vendingMachine.dispenseProduct();


        BreakfastMenu breakfastMenu = new BreakfastMenu();
        MenuIterator breakfastIterator = breakfastMenu.createIterator();

        System.out.println("Breakfast Menu:");
        displayMenu(breakfastIterator);


        CarManufacturingProcess sedanProcess = new SedanManufacturingProcess();
        sedanProcess.manufactureCar();

        System.out.println();

        CarManufacturingProcess suvProcess = new SUVManufacturingProcess();
        suvProcess.manufactureCar();


        ChatRoom facebookRoom = new ChatRoom();

        User alice = new User("Alice", facebookRoom);
        User bob = new User("Bob", facebookRoom);
        User matt = new User("Matt", facebookRoom);


        facebookRoom.addUser(alice);
        facebookRoom.addUser(bob);
        facebookRoom.addUser(matt);

        alice.send("Hi there!");
        bob.send("Hello, Alice!");
        alice.send("Hey bob, where is Matt?");
        matt.send("I am here");

        ShoppingCart amazonCart = new ShoppingCart();

        // Customer chooses to pay using credit card
        amazonCart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "John Doe"));
        amazonCart.checkout(500);

        // Customer chooses to pay using cryptocurrency
        amazonCart.setPaymentStrategy(new CryptoCurrencyPayment("1A2b3C4d5E6F"));
        amazonCart.checkout(300);

    }

    public static void displayMenu(MenuIterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + ": " + menuItem.getDescription() + " - $" + menuItem.getPrice());
        }
    }
}
