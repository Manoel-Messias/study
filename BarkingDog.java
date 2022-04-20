public class BarkingDog {
    public static boolean shouldWakeUp (boolean barking, int hourOfDay){
        if (hourOfDay <0 || >23){
            System.out.println("false since the HourOfDay parameter needs to be in a range 0-23");
        }else if (!barking){
            System.out.println("dog is not barking");
        }else if (hourOfDay <8 || >23){
            return true;
        }else{
            return false;
        }


    }
}
