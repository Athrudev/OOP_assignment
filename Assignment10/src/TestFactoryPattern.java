import java.util.Scanner;

public class TestFactoryPattern {

    CarFactory carBuilder;
    Car car;

    public static void main(String[] args) {
        TestFactoryPattern client = new TestFactoryPattern();
        client.buildCarMethod();
    }

    public void buildCarMethod() {
        Scanner sc = new Scanner(System.in);
        while(true) {
        System.out.println("\n\nWelcome to car dealership, please enter your choice of car");
        System.out.println("1.Hatchback\n2.Sedan\n3.SUV\n4.Exit");
        int choice = sc.nextInt();
        
        switch(choice) {
            case 1:
                carBuilder = new HatchbackCarFactory();
                System.out.println("Choice of hatchback is\n1.Nissan Micra\n2.Volkswagen Polo\n3.Maruti Suzuki Swift");
                choice = sc.nextInt();
                switch(choice) {
                    case 1:
                        car = carBuilder.buildCar("Nissan Micra", "Goodyear", "1.2 HR12DE", "Metallic Silver", "XV", "Petrol");
                        break;
                    case 2:
                        car = carBuilder.buildCar("Volkswagen Polo", "Dunlop", "1.0 TSI", "Sunset Red", "Highline", "Petrol");
                        break;
                    case 3:
                        car = carBuilder.buildCar("Maruti Suzuki Swift", "MRF", "1.2 K12N", "Blazing Red", "ZXi", "Petrol");
                        break;
                    default:
                        System.out.println("Invalid option");
                        car = carBuilder.buildCar("NA", "NA", "NA", "NA", "NA", "NA");
                        break;
                }
                System.out.println(car.getdata());
                break;
                
            case 2:
                carBuilder = new SedanCarFactory();
                System.out.println("Choice of Sedan is\n1.Toyota Camry\n2.Honda Accord\n3.Skoda Superb");
                choice = sc.nextInt();
                switch(choice) {
                    case 1:
                        car = carBuilder.buildCar("Toyota Camry", "Yokohama", "2.5 A25A-FXS", "Celestial Silver Metallic", "XLE", "Petrol");
                        break;
                    case 2:
                        car = carBuilder.buildCar("Honda Accord", "Bridgestone", "1.5 L15B7", "Modern Steel Metallic", "EX-L", "Petrol");
                        break;
                    case 3:
                        car = carBuilder.buildCar("Skoda Superb", "Michelin", "2.0 TDI", "Quartz Grey Metallic", "L&K", "Diesel");
                        break;
                    default:
                        System.out.println("Invalid option");
                        car = carBuilder.buildCar("NA", "NA", "NA", "NA", "NA", "NA");
                        break;
                }
                System.out.println(car.getdata());
                break;
                
            case 3:
                carBuilder = new SUVCarFactory();
                System.out.println("Choice of SUV is\n1.Ford Endeavour\n2.Jeep Compass\n3.Mahindra XUV700");
                choice = sc.nextInt();
                switch(choice) {
                    case 1:
                        car = carBuilder.buildCar("Ford Endeavour", "Pirelli", "2.0 EcoBlue", "Agate Black", "Titanium 4x4", "Diesel");
                        break;
                    case 2:
                        car = carBuilder.buildCar("Jeep Compass", "Goodyear", "2.0 Multijet II", "Velvet Red", "Limited Plus", "Diesel");
                        break;
                    case 3:
                        car = carBuilder.buildCar("Mahindra XUV700", "Apollo", "2.2 mHawk", "Dazzling Silver", "AX7 7-Seater", "Diesel");
                        break;
                    default:
                        System.out.println("Invalid option");
                        car = carBuilder.buildCar("NA", "NA", "NA", "NA", "NA", "NA");
                        break;
                }
                System.out.println(car.getdata());
                break;
                
                
            case 4:
                System.out.println("Exiting the car dealership...");
                sc.close();
                System.exit(0);
                
             default:
            	 System.out.println("Invalid choice...!");
        }
        //System.out.println(car.getdata());
        }
        // Tomorrow if we want to build new type say MUV then we just hv to create new subclass of Car class and new subclass of CarFactory. No need to update exixtsing class.
        // This is beauty of factory method. Consumer always uses factory interface instead of implementation
    }
}