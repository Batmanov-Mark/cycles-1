public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //Task 1;
        System.out.println(" Task 1 ");

        int age = 20 ;
        if ( age >= 18 ) {
            System.out.println(" Если возраст человека равен " + age + " , он совершеннолетний");
        } else {
            System.out.println(" Если возраст человека равен " + age + " , он не достиг совершеннолетия, нужно немного подождать");
        }

        //Task 2;
        System.out.println(" Task 2 ");

        int airTemperature = 8;

        if ( airTemperature < 7) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки");
        }

        //Task 3;
        System.out.println(" Task 3 ");

        int speed = 60;
        if ( speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        } else {
            System.out.println("Если скорость  " + speed + " км/ч, то придется заплатить штраф");
        }

        //Task 4;
        System.out.println(" Task 4 ");

        int personAge = 23;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println(" Если возраст человека равен " + personAge + " лет, то ему нужно ходить в детский сад");
        }  else if ( personAge >= 7 && personAge <= 17 ) {
            System.out.println(" Если возраст человека равен " + personAge + " лет, то ему нужно ходить в школу");
        } else if ( personAge >= 18 && personAge <= 24 ) {
            System.out.println(" Если возраст человека равен " + personAge + " лет, то ему нужно ходить в университете");
        } else if ( personAge > 24 ) {
            System.out.println(" Если возраст человека равен " + personAge + " лет, то ему нужно ходить на работу");
        }



        //Task 5;
        System.out.println(" Task 5 ");
        int childAge = 7;

        if ( childAge >= 5 && childAge < 14 ) {
            System.out.println("Если возраст ребенка равен  " + childAge +
                    " , то ему можно кататься на аттракционе в сопровождении взрослого");
        }

        else if ( childAge < 5 ) {
            System.out.println("Если возраст ребенка равен   " + childAge +
                    " , то ему нельзя кататься на аттракционе");
        }

        else if ( childAge >=14 ) {
            System.out.println("Если возраст ребенка равен   " + childAge +
                    " , , то ему можно кататься на аттракционе без сопровождения взрослого.");
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
        int two = 33;
        int three = 30;

        if ( one >  two && one >  three) {
            System.out.println(" из трех чисел бо́льшее "+ one);
        } else {
            if (two > three) {
            System.out.println(" из трех чисел бо́льшее "+  two);
            } else {
            System.out.println(" из трех чисел бо́льшее "+ three);}}
    }




}