package Calk;
import java.util.Scanner;

 class ReadAnn {

   private String []array;
    private String oneNumber;
    private String twoNumber;
    private String operacia;

    public void  readA()  {
         Scanner sc=new Scanner(System.in);


        array=sc.nextLine().toUpperCase().toUpperCase().split(" ");
     }


public boolean RomanAndArabic(){
     boolean oneNumber=true;
    try {
        RomanAnn.valueOf(getOneNumber());
    } catch (IllegalArgumentException e) {
       oneNumber = false;
    }
    boolean twoNumber = true;
    try {
        RomanAnn.valueOf(getTwoNumber());
    } catch (IllegalArgumentException e) {
        twoNumber = false;
    }

    return (oneNumber && twoNumber);
}

public String getOneNumber(){
     this.oneNumber=array[0];
     return oneNumber;}

    public String getOperacia(){
        this.operacia=array[1];
     return operacia;}

    public String getTwoNumber(){
        this.twoNumber=array[2];
        return twoNumber;}}

