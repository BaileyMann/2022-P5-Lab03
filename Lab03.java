public class Lab03 {
    public static void main(String args[]){
        System.out.println();
        System.out.println("Lab 03, 100 Point Version");
        System.out.println();
        int startingvalue = 10000123;
        System.out.println("Starting milli-seconds:\t" + startingvalue);
        int Hours = startingvalue/3600000;
        System.out.println("Hours:\t\t\t\t\t" + Hours);
        int Minutes = 2800/60;
        System.out.println("Minutes:\t\t\t\t" + Minutes);
        int Seconds = 2800 % 60;
        System.out.println("Seconds:\t\t\t\t" + Seconds);
        int MilliSeconds = startingvalue % 1000;
        System.out.println("Milli Seconds:\t\t\t" + MilliSeconds);




    }

}
