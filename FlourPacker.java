public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        int totalWeight = 5*bigCount + smallCount;

        if(bigCount>=0 && smallCount>=0 && goal>=0) {
            if (totalWeight == goal) {
                return true;
            } else {
                if (totalWeight>goal && goal-bigCount*5<= smallCount && goal-bigCount*5>0) {
                    return true;
                } else if (totalWeight > goal && smallCount >= goal%5){
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}

// Testing:
        System.out.println(FlourPacker.canPack(1, 0, 4));
        System.out.println(FlourPacker.canPack(1, 0, 5));
        System.out.println(FlourPacker.canPack(0, 5, 4));
        System.out.println(FlourPacker.canPack(2, 2, 11));
        System.out.println(FlourPacker.canPack(-3, 2, 12));
        System.out.println(FlourPacker.canPack(2, 1, 5));
        System.out.println(FlourPacker.canPack(4, 8, 19));
