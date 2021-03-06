//Write another method getDaysInMonth with two parameters month and year. Both of type int.
//
//If parameter month is < 1 or > 12 return -1. If parameter year is < 1 or > 9999 then return -1.
//
//This method needs to return the number of days in the month. Be careful about leap years they have 29 days
//in month 2 (February). You should check if the year is a leap year using the method isLeapYear described above.
//
//Examples of input/output:
//* getDaysInMonth(1, 2020); → should return 31 since January has 31 days.
//* getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 is a leap year.
//* getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year and 2018 is not
// a leap year.
//* getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.
//* getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999.

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){
        if ((year < 1) || (year > 9999)){
            return false;
        } else if ((year % 4 == 0) && (year % 100 != 0)){
            return true;
        } else if (year % 400 == 0){
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){

        if ((month >= 1) && (month <= 12) && (year >= 1) && (year <= 9999)) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return (31);
                case 2:
                    if (isLeapYear(year)) {
                        return (29);
                    } else {
                        return (28);
                    }
                default:
                    return (30);
            }
        } return -1;
    }
}
