public class CarDemoapp {
    public static void main(String[] args) {

        int number = 7;
        String numberString = "Seven";

        Car golf6_G_876TU = new Car();
        Car fiatPanda_G_123RU = new Car();


        golf6_G_876TU.manufacturer = "Volkswagen";
        golf6_G_876TU.model = "GolfVI";
        golf6_G_876TU.horsePower = 90;
        golf6_G_876TU.colour = "black";
        golf6_G_876TU.co2Emission = 300;

        fiatPanda_G_123RU.manufacturer = "FIAT";
        fiatPanda_G_123RU.model = "Panda";
        fiatPanda_G_123RU.colour = "red";
        fiatPanda_G_123RU.horsePower = 75;
        fiatPanda_G_123RU.co2Emission = 120;


    }
}
