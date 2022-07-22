import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int  i,num,tempNum,sum=0,numPow=1,basamak;

        Scanner input =new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        num=input.nextInt();
        tempNum=num;
        i=0;
        //Sayının Kaç Basamaklı Olduğunu bulmak
        while (tempNum !=0){
            tempNum /=10;
            i++;
        }

        tempNum=num;

        while (tempNum != 0){
            basamak = tempNum %10;
            tempNum /= 10;
            numPow =1;
            for (int j=1; j<=i;j++){
                numPow *=basamak;

            }
            sum +=numPow;
        }
        if (num == sum){
            System.out.println(num + " Sayısı Bir Armstrong Sayıdır.");
        }else {
            System.out.println(num + " Sayısı Bir Armstrong Sayısı Değildir.");
        }







    }
}
