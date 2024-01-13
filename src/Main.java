import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;

public class Main {
    public static void main(String[] args) {

        Engine carEngine = new Engine(200, "XYZ Motors");


        Driver carDriver = new Driver("John Doe ", 45, 10);


        Car myCar = new Car("Toyota", "Sedan", 1500.0, carDriver, carEngine);


        myCar.start();
        myCar.turnLeft();
        myCar.turnRight();
        myCar.stop();


        System.out.println(myCar.toString());
    }
}
