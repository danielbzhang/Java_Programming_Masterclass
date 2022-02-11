// sum numbers btw 1 and 1000 which are divisible by 3 and 5, and print out those numbers.

        int ct = 0;
        int total = 0;
        for (int i = 1; i <= 1000; i++){
            if ((i%3==0) && (i%5==0)){
                ct ++;
                total += i;
                System.out.println("Satisfied numbers are: "+i);
                if (ct == 5){
                    break;
                }
            }
        }
        System.out.println("Total sum: "+total);
