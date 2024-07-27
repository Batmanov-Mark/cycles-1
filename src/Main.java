public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //Task 1;
        System.out.println(" Task 1 ");

        int age = 20 ;
        if ( age >= 18 ) {
            System.out.println(" Возраст человека " + age + " , он совершеннолетний");
        } else System.out.println(" Возраст человека " + age + " , он не достиг совершеннолетия, нужно немного подождать");


        //Task 2;
        System.out.println(" Task 2 ");

        int airTemperature = 5;
        if ( airTemperature < 7) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку");
        } else System.out.println ("На улице " + airTemperature + " градусов, можно идти без шапки");


        //Task 3;
        System.out.println(" Task 3 ");

        int speed = 60;
        if ( speed <= 60) {
            System.out.println("Ваша скорость " + speed + " км/ч, можно ездить спокойно");
        } else System.out.println ("Ваша скорость  " + speed + " км/ч, придется заплатить штраф");


        //Task 4;
        System.out.println(" Task 4 ");

        int personAge = 23;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println(" Возраст человека равен " + personAge + " лет, ему нужно ходить в детский сад");
        }
        if ( personAge >= 7 && personAge <= 17 ) {
            System.out.println(" Возраст человека равен " + personAge + " лет, ему нужно нужно ходить в школу");
        }
        if ( personAge >= 18 && personAge <= 24 ) {
            System.out.println(" Возраст человека равен " + personAge + " лет, его место в университете");
        }

        if ( personAge > 24 ) {
            System.out.println(" Возраст человека равен " + personAge + " лет, ему пора ходить на работу");
        }



        //Task 5;
        System.out.println(" Task 5 ");
        int childAge = 7;

        if ( childAge >= 5 && childAge < 14 ) {
            System.out.println("возраст ребенка  " + childAge +
                    " лет, кататься он может только в сопровождении взрослого");
        }

        if ( childAge < 5 ) {
            System.out.println("возраст ребенка  " + childAge +
                    " лет, он не может кататься на аттракционе");
        }

        if ( childAge >=14 ) {
            System.out.println("возраст ребенка  " + childAge +
                    " лет, он может кататься без сопровождения взрослого. " +
                    "Если взрослого нет, то кататься нельзя.");
        }


        //Task 6;
        System.out.println(" Task 6 ");

        int human = 89;
        int totalPlaces = 102;
        int seatPlace = 60;

        if (human > totalPlaces) {
            System.out.println("В вагоне мест нет, уже полностью забит");}
        if (human >= seatPlace && human <= totalPlaces) {
            System.out.println("В вагоне сидячих мест нет, но есть стоячие места");}

        if (human <= seatPlace) {
            System.out.println("В вагоне есть сидячие и стоячие места");}



        //Task 7;
        System.out.println(" Task 7 ");

        int one = 29;
        int two = 17;
        int three = 3;

        if ( one >  two && one >  three) {
            System.out.println(" из трех чисел бо́льшее "+ one);}

        if ( three >  two && three >  one) {
            System.out.println(" из трех чисел бо́льшее "+ three);}

        if ( two >  one && two >  three) {
            System.out.println(" из трех чисел бо́льшее "+ two);}
    }




}