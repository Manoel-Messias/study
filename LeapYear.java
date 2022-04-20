public class LeapYear {

        public static boolean isLeapYear(int year){
            if (year <1 || year>9999){
                System.out.println("not in the range (1-9999)");
                return false;
            }else if (year % 400 ==0){
                System.out.println(year + " is a leap year");
                return true;
            }else if ((year % 4 ==0) && (year % 100 !=0)){
                System.out.println(year + " is a leap year");
                return true;

            }else {
                System.out.println(year + " is not a leap year");
                return false;
            }

        }
}
