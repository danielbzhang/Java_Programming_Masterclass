// The cats spend most of the day playing. In particular, they play if the temperature is btw 25 and 35 (inclusive). Unless is summer, then the upper limit is 45 instead of 35.


public class playingCat {

    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer && (temperature >= 25) && (temperature <= 45)){
            return true;
        } else if(!summer && (temperature >= 25) && (temperature <= 35)){

            return true;
        } else {
            return false;
        }
    }
}
