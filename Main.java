package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	 patient patient = new patient("Harry",18,
             new Eye("Left eye","myopia", "",+2.25,true),
             new Eye("Right eye","normal", "blue",+1.23,true),
             new heart("Heart","complicated",50),
             new stomach("Stomach","gastric",true),
             new skin("skin","normal","brown",20));

        System.out.println("Name"+ patient.getName());
        System.out.println("Age" + patient.getAge());


         boolean finish = true;
         while(finish){
             System.out.println("\n\t1.Left eye");
             System.out.println("\n\t2.Right eye");
             System.out.println("\n\t3. Heart");
             System.out.println("\n\t4.Skin");
             System.out.println("\n\t5.Stomach");
             System.out.println("\n\t6.exit");

             Scanner scanner = new Scanner(System.in);
             int organ = scanner.nextInt();

             switch (organ){
                 case 1:
                     patient.getLefteye().details();
                     if (patient.getLefteye().isIsopened()) {
                         System.out.println("\t\t1.close the eye");
                         if(scanner.nextInt() ==1){
                            patient.getLefteye().close();
                         }else{
                             continue;
                         }
                     } else{
                         System.out.println("\t\t1.Ope the eye");
                         if(scanner.nextInt() ==1){
                             patient.getLefteye().close();
                         }else{
                             continue;
                         }

                     }
                     break;
                 case 2:
                     patient.getRighteye().details();
                      if (patient.getRighteye().isIsopened()) {
                         System.out.println("\t\t1.close the eye");
                         if(scanner.nextInt() ==1){
                             patient.getRighteye().close();
                         }else{
                             continue;
                         }
                     } else{
                         System.out.println("\t\t1.Ope the eye");
                         if(scanner.nextInt() ==1){
                             patient.getRighteye().close();
                         }else{
                             continue;
                         }

                     }
                     break;

                 case 3:
                     patient.getHeart().details();
                     System.out.println("\t\t1.Change the heart rate");
                     if(scanner.nextInt() ==1){
                         System.out.println("Enter the new heart rate");
                         int newrate = scanner.nextInt();
                         patient.getHeart().setRate(newrate);
                     }else {
                         continue;
                     }
                     break;

                 case 4:
                     patient.getStomach().details();
                     System.out.println("\t\t1.Digest");
                     if(scanner.nextInt() ==1){
                         patient.getStomach().digest();
                     }else{
                         continue;
                     }
                     break;
                 case 5:
                     patient.getSkin().details();
                     break;
                 default:
                     finish = false;
                     break;


             }


         }

    }
}
