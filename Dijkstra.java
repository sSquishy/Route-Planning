import java.util.Scanner;

public class Dijkstra {

        
    public static void main(String[] args)
    {
        int origTravelTime = 0, ADDnewRGA1 = 0, ADDnewDMMA = 0, ADDnewRGA2 = 0, ADDnewRPA1 = 0, ADDnewRPA2 = 0, ADDnewDMMA1 = 0, ADDnewDMMA2 = 0, ADDnewDMMA3 = 0, ADDnewRH1 = 0, ADDnewDMMA4 = 0, ADDnewMA = 0, ADDnewRH2 = 0, ADDnewDMMA5 = 0, ADDnewQH1 = 0, ADDnewQH2 = 0, ADDnewDA = 0;
        int RGA1 = 1, DMMA = 2, RGA2 = 3, RPA1 = 7, RPA2 = 8, DMMA1 = 15, DMMA2 = 9, DMMA3 = 2, RH1 = 5, DMMA4 = 4, MA = 3, RH2 = 3, DMMA5 = 6, QH1 = 2, QH2 = 3, DA = 6;
        
        Scanner sc = new Scanner(System.in);


        System.out.println("[1] Admin");
        System.out.println("[2] User");
        System.out.println("[3] Exit");
        System.out.print("Enter input: ");

        int inp = sc.nextInt();
        
        
        switch(inp){
            case 1:
                        System.out.println("Welcome to Admin settings!");
                        System.out.println("Update the street");

                        System.out.println("\n\n\n[1] Add traffic time");
                        
                        System.out.print("\tEnter Input: ");
                        int admin = sc.nextInt();

                        switch(admin){
                            case 1:
                                System.out.println("\n\n\tChoose street to add time ");
                                System.out.println("[01] Regalado Avenue 1");
                                System.out.println("[02] Don Mariano Marcos Avenue");
                                System.out.println("[03] Regalado Avenue 2");
                                System.out.println("[04] Republic Avenue 1");
                                System.out.println("[05] Republic Avenue 2");
                                System.out.println("[06] Don Mariano Marcos Avenue 1");
                                System.out.println("[07] Don Mariano Marcos Avenue 2");
                                System.out.println("[08] Don Mariano Marcos Avenue 3");
                                System.out.println("[09] Regalado Highway 1");
                                System.out.println("[10] Don Mariano Marcos Avenue 4");
                                System.out.println("[11] Mindanao Avenue");
                                System.out.println("[12] Regalado Highway 2");
                                System.out.println("[13] Don Mariano Marcos Avenue 5");
                                System.out.println("[14] Quirino Highway 1");
                                System.out.println("[15] Quirino Highway 2");
                                System.out.println("[16] Dahlia Avenue");
                                System.out.print("\tEnter Input: ");
                                int addStreet = sc.nextInt();

                                switch(addStreet){
                                        case 1:
                                                System.out.print("\nInput traffic time in Regalado Avenue 1: ");
                                                int newRGA1 = sc.nextInt();
                                                
                                                ADDnewRGA1 = newRGA1;        
                                                break;

                                        case 2:
                                                System.out.print("\nInput traffic time in Don Mariano Marcos Avenue: ");
                                                int newDMMA = sc.nextInt();

                                                ADDnewDMMA = newDMMA;
                                                break;

                                        case 3:
                                                System.out.print("\nInput traffic time in Regalado Avenue 2: ");
                                                int newRGA2 = sc.nextInt();

                                                ADDnewRGA2 = newRGA2;
                                                break;

                                        case 4:
                                                System.out.print("\nInput traffic time in Republic Avenue 1: ");
                                                int newRPA1 = sc.nextInt();

                                                ADDnewRPA1 = newRPA1;
                                                break;

                                        case 5:
                                                System.out.print("\nInput traffic time in Republic Avenue 2: ");
                                                int newRPA2 = sc.nextInt();

                                                ADDnewRPA2 = newRPA2;
                                                break;

                                        case 6:
                                                System.out.print("\nInput traffic time in Don Mariano Marcos Avenue 1: ");
                                                int newDMMA1 = sc.nextInt();

                                                ADDnewDMMA1 = newDMMA1;
                                                break;

                                        case 7:
                                                System.out.print("\nInput traffic time in Don Mariano Marcos Avenue 2: ");
                                                int newDMMA2 = sc.nextInt();

                                                ADDnewDMMA2 = newDMMA2;
                                                break;

                                        case 8:
                                                System.out.print("\nInput traffic time in Don Mariano Marcos Avenue 3: ");
                                                int newDMMA3 = sc.nextInt();

                                                ADDnewDMMA3 = newDMMA3;
                                                break;

                                        case 9:
                                                System.out.print("\nInput traffic time in Regalado Highway 1: ");
                                                int newRH1 = sc.nextInt();

                                                ADDnewRH1 = newRH1;
                                                break;

                                        case 10:
                                                System.out.print("\nInput traffic time in Don Mariano Marcos Avenue 4: ");
                                                int newDMMA4 = sc.nextInt();

                                                ADDnewDMMA4 = newDMMA4;
                                                break;

                                        case 11:
                                                System.out.print("\nInput traffic time in Mindanao Avenue: ");
                                                int newMA = sc.nextInt();
                                        
                                                ADDnewMA = newMA;
                                                break;
                                                
                                        case 12:
                                                System.out.print("\nInput traffic time in Regalado Highway 2: ");
                                                int newRH2 = sc.nextInt();

                                                ADDnewRH2 = newRH2;
                                                break;

                                        case 13:
                                                System.out.print("\nInput traffic time in Don Mariano Marcos Avenue 5: ");
                                                int newDMMA5 = sc.nextInt();

                                                ADDnewDMMA5 = newDMMA5;
                                                break;
                                        
                                        case 14:
                                                System.out.print("\nInput traffic time in Quirino Highway 1: ");
                                                int newQH1 = sc.nextInt();

                                                ADDnewQH1 = newQH1;
                                                break;
                                        
                                        case 15:
                                                System.out.print("\nInput traffic time in Quirino Highway 2: ");
                                                int newQH2 = sc.nextInt();
                                                
                                                ADDnewQH2 = newQH2;
                                                break;
                                        
                                        case 16:
                                                System.out.print("\nInput traffic time in Dahlia Avenue: ");
                                                int newDA = sc.nextInt();

                                                ADDnewDA = newDA;
                                                break;
        
                                        default:
                                                break;
                                        }
                                break;

                                        
                                                                
                            
                            default:
                                        System.out.println("Entering the User Settings");
                                break;
                        }
                        break;
            case 3:
                    System.out.println("Exiting the program");
                    System.exit(0);
                        break;
            default:
                    System.out.println("Not in the choices, please try again");        
                break;
        }

        

        while(true) {

                    System.out.println("\n\n\t\tWelcome to the Pizza Waze App! ");
                    System.out.println("Hello User!\n\n");

                    System.out.print("\n\n");
                    System.out.print("The following are the Possible Destination: ");
                    System.out.print("\n[1] FCM");
                    System.out.print("\n[2] North Fairview");
                    System.out.print("\n[3] Regalado, Mindanao Avenue");
                    System.out.print("\n[4] Sm Fairview");
                    System.out.print("\n[5] Bloomfields Subdivision");
                    System.out.print("\n[6] LTO");
                    System.out.print("\n[7] Mindanao Avenue");
                    System.out.print("\n[8] Wilcon Depot (Fairview)");
                    System.out.print("\n[9] Bahay Balangay");
                    System.out.print("\n[10] FEU");
                    System.out.print("\n[11] Lola Ising Buko Pie");
                    System.out.print("\n[12] Palawan Express");
                    System.out.print("\n[0] Exit the program");
                    System.out.print("\n\n\tEnter chosen destination: ");

                    int choices = sc.nextInt();

                        switch (choices) {
                                        case 1:
                                        
                                        
                                        int FCM = DMMA + ADDnewDMMA;
                                        int FCM2 = RGA1 + DA + DMMA3 + ADDnewRGA1 + ADDnewDA + ADDnewDMMA3; 

                                        System.out.println("");

                                                if(FCM <= FCM2){
                                                                origTravelTime = FCM;

                                                                        System.out.println("Options:");
                                                                      
                                                                        System.out.println("Navigation: \t store -> Don Mariano Marcos Avenue -> FCM");
                                                                        System.out.println("Total Travel Time: " + FCM + " MINUTES");

                                                                        System.out.println("\n\nNavigation: \t store -> Regalado Avenue -> Dahlia Avenue -> Don Mariano Marcos Avenue 2 -> FCM");
                                                                        System.out.println("Total Travel Time: " + FCM2 + " MINUTES");

                                                                        System.out.print("\nShortest Path");
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> FCM");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");

                                                }else{
                                                                origTravelTime = FCM2;
                                                                        
                                                                        System.out.println("Options:");
                                                       
                                                                        System.out.println("Navigation: \t store -> Don Mariano Marcos Avenue -> FCM");
                                                                        System.out.println("Total Travel Time: " + FCM + " MINUTES");

                                                                        System.out.println("\n\nNavigation: \t store -> Regalado Avenue -> Dahlia Avenue -> Don Mariano Marcos Avenue 2 -> FCM");
                                                                        System.out.println("Total Travel Time: " + FCM2 + " MINUTES");

                                                                        System.out.print("\nShortest Path");
                                                                        System.out.println("\nNavigation \t store -> Regalado Avenue -> Dahlia Avenue -> Don Mariano Marcos Avenue 2 -> FCM");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                }
                                        
                                        
                                                break;
                                        
                                        case 2:
                                        int NF = DMMA + DMMA3 + ADDnewDMMA + ADDnewDMMA3;
                                        int NF2 = RGA1 + DA + ADDnewRGA1 + ADDnewDA;

                                         System.out.print("");

                                                if(NF <= NF2){
                                                                origTravelTime = NF;
                                                                        
                                                                        System.out.println("Options:");
                                                                       
                                                                        System.out.println("Navigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> North Fairview");
                                                                        System.out.println("Total Travel Time: " + NF + " MINUTES");

                                                                        System.out.println("\n\nNavigation: \t store -> Regalado Avenue 1 -> Dahlia Avenue -> North Fairview");
                                                                        System.out.println("Total Travel Time: " + NF2 + " MINUTES");

                                                                        System.out.print("\nShortest Path");   
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> North Fairview");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                        
                                                }else{
                                                                origTravelTime = NF2;
                                                                                        
                                                                        System.out.println("Options:");
                                                                       
                                                                        System.out.println("Navigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> North Fairview");
                                                                        System.out.println("Total Travel Time: " + NF + " MINUTES");

                                                                        System.out.println("\n\nNavigation: \t store -> Regalado Avenue 1 -> Dahlia Avenue -> North Fairview");
                                                                        System.out.println("Total Travel Time: " + NF2 + " MINUTES");

                                                                        System.out.print("\nShortest Path");   
                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 -> Dahlia Avenue -> North Fairview");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                }                
                                                break;
                                        
                                        case 3:
                                        int RMA = DMMA + DMMA3 + RH1 + ADDnewDMMA + ADDnewDMMA3 + ADDnewRH1;
                                        int RMA2 = DMMA + DMMA3 + DMMA4 + MA + ADDnewDMMA + ADDnewDMMA3 + ADDnewDMMA4 + ADDnewMA;
                                        int RMA3 = RGA1 + DA + RH1 + ADDnewRGA1 + ADDnewDA + ADDnewRH1;
                                        
                                                if(RMA <= RMA2 && RMA <= RMA3){                                    
                                                                origTravelTime = RMA;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Regalado, Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + RMA + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Mindanao Avenue -> Regalado, Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + RMA2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store ->  Regalado Avenue -> Dahlia Avenue -> Regalado Highway 1 -> Regalado, Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + RMA3 + " MINUTES");


                                                                        System.out.print("\nShortest Path"); 
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Regalado, Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                                

                                                }else if(RMA2 <= RMA && RMA2 <= RMA3){
                                                                origTravelTime = RMA2;

                                                                        System.out.println("Options:");
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Regalado, Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + RMA + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Mindanao Avenue -> Regalado, Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + RMA2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store ->  Regalado Avenue -> Dahlia Avenue -> Regalado Highway 1 -> Regalado, Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + RMA3 + " MINUTES");


                                                                        System.out.print("\nShortest Path"); 
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Regalado, Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                }else{
                                                               origTravelTime = RMA3;

                                                                        System.out.println("Options:");
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Regalado, Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + RMA + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Mindanao Avenue -> Regalado, Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + RMA2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store ->  Regalado Avenue -> Dahlia Avenue -> Regalado Highway 1 -> Regalado, Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + RMA3 + " MINUTES");


                                                                        System.out.print("\nShortest Path"); 
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Regalado, Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                }
                                        break;
                                        
                                        case 4:
                                        int SM = DMMA + DMMA3 + RH1 + RH2 + ADDnewDMMA + ADDnewDMMA3 + ADDnewRH1 + ADDnewRH2;
                                        int SM2 = DMMA + DMMA3 + DMMA4 + MA + RH2 + ADDnewDMMA + ADDnewDMMA3 + ADDnewDMMA4 + ADDnewMA + ADDnewRH2;
                                        int SM3 = DMMA + DMMA3 + DMMA4 + DMMA5 + QH2 + QH1 + ADDnewDMMA + ADDnewDMMA3 + ADDnewDMMA4 + ADDnewDMMA5 + ADDnewQH2 + ADDnewQH1;
                                        int SM4 = RGA1 + DA + RH1 + RH2 + ADDnewRGA1 + ADDnewDA + ADDnewRH1 + ADDnewRH2;

                                                if(SM <= SM2 && SM <= SM3 && SM <= SM4){

                                                                origTravelTime = SM;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Regalado Highway 2 -> SM Fairview");
                                                                        System.out.println("Total Travel Time: " + SM + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos 4 -> Mindanao Avenue -> Regalado Highway 2 -> SM Fairview");
                                                                        System.out.println("Total Travel Time: " + SM2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Don Mariano Marcos Avenue 5 -> Quirino Highway 2 -> Quirino Highway 1 -> SM Fairview");
                                                                        System.out.println("Total Travel Time: " + SM3 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 -> Dahlia Avenue -> Regalado Highway 1 -> Regalado Highway 2  SM Fairview");
                                                                        System.out.println("Total Travel Time: " + SM4 + " MINUTES");

                                                                        System.out.print("\nShortest Path"); 
                                                                        System.out.println("\nNavigation: \t store -> store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Regalado Highway 2 -> SM Fairview");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                                        
                                                }else if(SM2 <= SM && SM2 <= SM3 && SM2 <= SM4){

                                                                origTravelTime = SM2;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Regalado Highway 2 -> SM Fairview");
                                                                        System.out.println("Total Travel Time: " + SM + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos 4 -> Mindanao Avenue -> Regalado Highway 2 -> SM Fairview");
                                                                        System.out.println("Total Travel Time: " + SM2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Don Mariano Marcos Avenue 5 -> Quirino Highway 2 -> Quirino Highway 1 -> SM Fairview");
                                                                        System.out.println("Total Travel Time: " + SM3 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 -> Dahlia Avenue -> Regalado Highway 1 -> Regalado Highway 2  SM Fairview");
                                                                        System.out.println("Total Travel Time: " + SM4 + " MINUTES");

                                                                        System.out.print("\nShortest Path"); 
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos 4 -> Mindanao Avenue -> Regalado Highway 2 -> SM Fairview");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                }else if(SM3 <= SM && SM3 <= SM2 && SM3 <= SM4){
                                                                       
                                                                origTravelTime = SM3;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Regalado Highway 2 -> SM Fairview");
                                                                        System.out.println("Total Travel Time: " + SM + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos 4 -> Mindanao Avenue -> Regalado Highway 2 -> SM Fairview");
                                                                        System.out.println("Total Travel Time: " + SM2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Don Mariano Marcos Avenue 5 -> Quirino Highway 2 -> Quirino Highway 1 -> SM Fairview");
                                                                        System.out.println("Total Travel Time: " + SM3 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 -> Dahlia Avenue -> Regalado Highway 1 -> Regalado Highway 2  SM Fairview");
                                                                        System.out.println("Total Travel Time: " + SM4 + " MINUTES");

                                                                        System.out.print("\nShortest Path"); 
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Don Mariano Marcos Avenue 5 -> Quirino Highway 2 -> Quirino Highway 1 -> SM Fairview");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                }else{
                                                                        
                                                                origTravelTime = SM4;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Regalado Highway 2 -> SM Fairview");
                                                                        System.out.println("Total Travel Time: " + SM + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos 4 -> Mindanao Avenue -> Regalado Highway 2 -> SM Fairview");
                                                                        System.out.println("Total Travel Time: " + SM2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Don Mariano Marcos Avenue 5 -> Quirino Highway 2 -> Quirino Highway 1 -> SM Fairview");
                                                                        System.out.println("Total Travel Time: " + SM3 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 -> Dahlia Avenue -> Regalado Highway 1 -> Regalado Highway 2  SM Fairview");
                                                                        System.out.println("Total Travel Time: " + SM4 + " MINUTES");

                                                                        System.out.print("\nShortest Path"); 
                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 -> Dahlia Avenue -> Regalado Highway 1 -> Regalado Highway 2  SM Fairview");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                }
                                        break;
                                        
                                        case 5:
                                        int BS = DMMA + DMMA3 + RH1 + RH2 + QH1 + ADDnewDMMA + ADDnewDMMA3 + ADDnewRH1 + ADDnewRH2 + ADDnewQH1;
                                        int BS2 = DMMA + DMMA3 + DMMA4 + DMMA5 + QH2 + ADDnewDMMA + ADDnewDMMA3 + ADDnewDMMA4 + ADDnewDMMA5 + ADDnewQH2;
                                        int BS3 = DMMA + DMMA3 + DMMA4 + MA + RH2 + QH1 + ADDnewDMMA + ADDnewDMMA3 + ADDnewDMMA4 + ADDnewMA + ADDnewRH2 + ADDnewQH1; 
                                        int BS4 = RGA1 + DA + RH1 + RH2 + QH1 + ADDnewRGA1 + ADDnewDA + ADDnewRH1 + ADDnewRH2 + ADDnewQH1;
                                        
                                        if(BS <= BS2 && BS <= BS3 && BS <= BS4){
                                                
                                                                origTravelTime = BS;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Regalado Highway 2 -> Quirino Highway 1 -> Bloomfields Sudvision");
                                                                        System.out.println("Total Travel Time: " + BS + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Don Mariano Marcos Avenue 5 -> Quirino Highway 2 -> Bloomfields Sudvision");
                                                                        System.out.println("Total Travel Time: " + BS2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Mindanao Avenue -> Regalado Highway 2 -> Quirino Highway 1 -> Bloomfields Sudvision");
                                                                        System.out.println("Total Travel Time: " + BS3 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 + Dahlia Avenue + Regalado Highway 1 -> Regalado Highway 2 -> Quirino 1 -> Bloomfields Sudvision");
                                                                        System.out.println("Total Travel Time: " + BS4 + " MINUTES");


                                                                        System.out.print("\nShortest Path"); 
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Regalado Highway 2 -> Quirino Highway 1 -> Bloomfields Sudvision");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");

                                        }else if(BS2 <= BS && BS2 <= BS3 && BS <= BS4){

                                                                origTravelTime = BS2;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Regalado Highway 2 -> Quirino Highway 1 -> Bloomfields Sudvision");
                                                                        System.out.println("Total Travel Time: " + BS + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Don Mariano Marcos Avenue 5 -> Quirino Highway 2 -> Bloomfields Sudvision");
                                                                        System.out.println("Total Travel Time: " + BS2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Mindanao Avenue -> Regalado Highway 2 -> Quirino Highway 1 -> Bloomfields Sudvision");
                                                                        System.out.println("Total Travel Time: " + BS3 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 + Dahlia Avenue + Regalado Highway 1 -> Regalado Highway 2 -> Quirino 1 -> Bloomfields Sudvision");
                                                                        System.out.println("Total Travel Time: " + BS4 + " MINUTES");

                                                                        System.out.print("\nShortest Path"); 
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Don Mariano Marcos Avenue 5 -> Quirino Highway 1 -> Bloomfields Sudvision");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");

                                        }else if(BS3 <= BS && BS3 <= BS2 && BS <= BS4){

                                                                origTravelTime = BS3;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Regalado Highway 2 -> Quirino Highway 1 -> Bloomfields Sudvision");
                                                                        System.out.println("Total Travel Time: " + BS + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Don Mariano Marcos Avenue 5 -> Quirino Highway 2 -> Bloomfields Sudvision");
                                                                        System.out.println("Total Travel Time: " + BS2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Mindanao Avenue -> Regalado Highway 2 -> Quirino Highway 1 -> Bloomfields Sudvision");
                                                                        System.out.println("Total Travel Time: " + BS3 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 + Dahlia Avenue + Regalado Highway 1 -> Regalado Highway 2 -> Quirino 1 -> Bloomfields Sudvision");
                                                                        System.out.println("Total Travel Time: " + BS4 + " MINUTES");

                                                                        System.out.print("\nShortest Path"); 
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Mindanao Avenue -> Regalado Highway 2 -> Quirino Highway 1 -> Bloomfields Sudvision");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");

                                        }else{
                                                                origTravelTime = BS4;
                                                                
                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Regalado Highway 2 -> Quirino Highway 1 -> Bloomfields Sudvision");
                                                                        System.out.println("Total Travel Time: " + BS + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Don Mariano Marcos Avenue 5 -> Quirino Highway 2 -> Bloomfields Sudvision");
                                                                        System.out.println("Total Travel Time: " + BS2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Mindanao Avenue -> Regalado Highway 2 -> Quirino Highway 1 -> Bloomfields Sudvision");
                                                                        System.out.println("Total Travel Time: " + BS3 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 + Dahlia Avenue + Regalado Highway 1 -> Regalado Highway 2 -> Quirino 1 -> Bloomfields Sudvision");
                                                                        System.out.println("Total Travel Time: " + BS4 + " MINUTES");

                                                                        System.out.print("\nShortest Path"); 
                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 + Dahlia Avenue + Regalado Highway 1 -> Regalado Highway 2 -> Quirino 1 -> Bloomfields Sudvision");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                        }

                                        break;
                                        
                                        case 6:
                                        int LTO = DMMA + DMMA3 + DMMA4 + DMMA5 + ADDnewDMMA + ADDnewDMMA3 + ADDnewDMMA4 + ADDnewDMMA5;
                                        int LTO2 = DMMA + DMMA3 + RH1 + RH2 + QH1 + QH2 +    ADDnewDMMA + ADDnewDMMA3 + ADDnewRH1 + ADDnewRH2 + ADDnewQH1 + ADDnewQH2; 
                                        int LTO3 = RGA1 + DA + DMMA4 + DMMA5 +  ADDnewRGA1 + ADDnewDA + ADDnewDMMA4 + ADDnewDMMA5;

                                                if(LTO <= LTO2 && LTO <= LTO3){
                                                        
                                                                origTravelTime = LTO;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Don Mariano Marcos Avenue 5 -> LTO");
                                                                        System.out.println("Total Travel Time: " + LTO + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Regalado Highway 2 -> Quirino Highway 1 -> Quirino Highway 2 -> LTO");
                                                                        System.out.println("Total Travel Time: " + LTO2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 + Dahlia Avenue ->  Don Mariano Marcos Avenue 4 -> Don Mariano Marcos Avenue 5 -> LTO");
                                                                        System.out.println("Total Travel Time: " + LTO3 + " MINUTES");


                                                                        System.out.print("\nShortest Path"); 
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Don Mariano Marcos Avenue 5 -> LTO");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");

                                                }else if(LTO2 <= LTO && LTO2 <= LTO3){

                                                                origTravelTime = LTO2;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Don Mariano Marcos Avenue 5 -> LTO");
                                                                        System.out.println("Total Travel Time: " + LTO + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Regalado Highway 2 -> Quirino Highway 1 -> Quirino Highway 2 -> LTO");
                                                                        System.out.println("Total Travel Time: " + LTO2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 + Dahlia Avenue ->  Don Mariano Marcos Avenue 4 -> Don Mariano Marcos Avenue 5 -> LTO");
                                                                        System.out.println("Total Travel Time: " + LTO3 + " MINUTES");


                                                                        System.out.print("\nShortest Path"); 
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Regalado Highway 2 -> Quirino Highway 1 -> Quirino Highway 2 -> LTO");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");

                                                }else{
                                                                origTravelTime = LTO3;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Don Mariano Marcos Avenue 5 -> LTO");
                                                                        System.out.println("Total Travel Time: " + LTO + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Regalado Highway 2 -> Quirino Highway 1 -> Quirino Highway 2 -> LTO");
                                                                        System.out.println("Total Travel Time: " + LTO2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 + Dahlia Avenue ->  Don Mariano Marcos Avenue 4 -> Don Mariano Marcos Avenue 5 -> LTO");
                                                                        System.out.println("Total Travel Time: " + LTO3 + " MINUTES");


                                                                        System.out.print("\nShortest Path"); 
                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 + Dahlia Avenue ->  Don Mariano Marcos Avenue 4 -> Don Mariano Marcos Avenue 5 -> LTO");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                }

                                        break;

                                       case 7:
                                        int dMA = DMMA + DMMA3 + DMMA4 + ADDnewDMMA + ADDnewDMMA3 + ADDnewDMMA4;
                                        int dMA2 = DMMA + DMMA3 + RH1 + MA  + ADDnewDMMA + ADDnewDMMA3 + ADDnewRH1 + ADDnewMA;
                                        int dMA3 = RGA1 + DA + DMMA4 + ADDnewRGA1 + ADDnewDA + ADDnewDMMA4;

                                                if(dMA <= dMA2 && dMA <= dMA3){

                                                                origTravelTime = dMA;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + dMA + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Mindanao Avenue ->  Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + dMA2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 -> Dahlia Avenue -> Don Mariano Marcos Avenue 4 -> Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + dMA3 + " MINUTES");

                                                                        System.out.print("\nShortest Path");
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");

                                                                        break;
                                                }else if(dMA2 <= dMA && dMA2 <= dMA3){

                                                                origTravelTime = dMA2;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + dMA + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Mindanao Avenue ->  Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + dMA2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 -> Dahlia Avenue -> Don Mariano Marcos Avenue 4 -> Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + dMA3 + " MINUTES");

                                                                        System.out.print("\nShortest Path");
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Mindanao Avenue ->  Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");

                                                }else{
                                                                origTravelTime = dMA3;

                                                                        System.out.println("Options:");
                                                                                
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Don Mariano Marcos Avenue 4 -> Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + dMA + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Regalado Highway 1 -> Mindanao Avenue ->  Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + dMA2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 -> Dahlia Avenue -> Don Mariano Marcos Avenue 4 -> Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + dMA3 + " MINUTES");

                                                                        System.out.print("\nShortest Path");
                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 -> Dahlia Avenue -> Don Mariano Marcos Avenue 4 -> Mindanao Avenue");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                }


                                        break;

                                        case 8:
                                        int WD = DMMA2 + ADDnewDMMA2;
                                        int WD2 = RGA1 + RGA2 + RPA1 + DMMA1 + ADDnewRGA1 + ADDnewRGA2 + ADDnewRPA1 + ADDnewDMMA1;
                                        
                                                if(WD <= WD2){
                                                                origTravelTime = WD;

                                                                        System.out.println("Options:");
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue 2 -> Wilcon Depot (Fairview)");
                                                                        System.out.println("Total Travel Time: " + WD + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Ragalado Avenue 1 -> Regalado Avenue 2 -> Republic Avenue 1 -> Don Mariano Marcos Avenue 1 -> Wilcon Depot (Fairview)");
                                                                        System.out.println("Total Travel Time: " + WD2 + " MINUTES");

                                                                        System.out.print("\nShortest Path"); 
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue 2 -> Wilcon Depot (Fairview)");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                
                                                }else{
                                                                origTravelTime = WD2;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue 2 -> Wilcon Depot (Fairview)");
                                                                        System.out.println("Total Travel Time: " + WD + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Ragalado Avenue 1 -> Regalado Avenue 2 -> Republic Avenue 1 -> Don Mariano Marcos Avenue 1 -> Wilcon Depot (Fairview)");
                                                                        System.out.println("Total Travel Time: " + WD2 + " MINUTES");

                                                                        System.out.print("\nShortest Path"); 
                                                                        System.out.println("\nNavigation: \t store -> Ragalado Avenue 1 -> Regalado Avenue 2 -> Republic Avenue 1 -> Don Mariano Marcos Avenue 1 -> Wilcon Depot (Fairview)");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                }
                                                                        break;

                                        case 9:
                                        int BB = RGA1 + RGA2 + RPA1 + ADDnewRGA1 + ADDnewRGA2 + ADDnewRPA1;
                                        int BB2 = DMMA2 + DMMA1 + ADDnewDMMA2 + ADDnewDMMA1;
                                        
                                                if(BB <= BB2){

                                                                origTravelTime = BB;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 ->  Regalado Avenue 2 -> Republic Avenue 1 -> Bahay Balangay");
                                                                        System.out.println("Total Travel Time: " + BB + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue 2 -> Don Mariano Marcos Avenue ->   Bahay Balangay");
                                                                        System.out.println("Total Travel Time: " + BB2 + " MINUTES");

                                                                        System.out.print("\nShortest Path"); 
                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 ->  Regalado Avenue 2 -> Republic Avenue 1 -> Bahay Balangay ");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                }else{
                                                                origTravelTime = BB;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 ->  Regalado Avenue 2 -> Republic Avenue 1 -> Bahay Balangay");
                                                                        System.out.println("Total Travel Time: " + BB + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue 2 -> Don Mariano Marcos Avenue ->   Bahay Balangay");
                                                                        System.out.println("Total Travel Time: " + BB2 + " MINUTES");

                                                                        System.out.print("\nShortest Path"); 
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue 2 -> Don Mariano Marcos Avenue ->   Bahay Balangay");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                }
                                                break;

                                        case 10:
                                        int FEU = RGA1 + RGA2 + ADDnewRGA1 + ADDnewRGA2;
                                        int FEU2 = DMMA + DMMA3 + DA + RGA2 + ADDnewDMMA + ADDnewDMMA3 + ADDnewDA + ADDnewRGA2;
                                        int FEU3 = DMMA2 + DMMA1 + RPA1 + ADDnewDMMA2 + ADDnewDMMA1 + ADDnewRPA1;

                                                if(FEU <= FEU2 && FEU <= FEU3){

                                                                origTravelTime = FEU;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 ->  Regalado Avenue 2 -> FEU");
                                                                        System.out.println("Total Travel Time: " + FEU + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Dahlia Avenue -> Regalado Avenue 2 -> FEU");
                                                                        System.out.println("Total Travel Time: " + FEU2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue 2 -> Don Mariano Marcos Avenue 1 -> Republic Avenue 1 -> FEU");
                                                                        System.out.println("Total Travel Time: " + FEU3 + " MINUTES");

                                                                        System.out.print("\nShortest Path"); 
                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 ->  Regalado Avenue 2 -> FEU");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");

                                                }else if(FEU2 <= FEU && FEU2 <= FEU3){

                                                                origTravelTime = FEU2;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 ->  Regalado Avenue 2 -> FEU");
                                                                        System.out.println("Total Travel Time: " + FEU + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Dahlia Avenue -> Regalado Avenue 2 -> FEU");
                                                                        System.out.println("Total Travel Time: " + FEU2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue 2 -> Don Mariano Marcos Avenue 1 -> Republic Avenue 1 -> FEU");
                                                                        System.out.println("Total Travel Time: " + FEU3 + " MINUTES");

                                                                        System.out.print("\nShortest Path"); 
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Dahlia Avenue -> Regalado Avenue 2 -> FEU");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                }else{

                                                                origTravelTime = FEU3;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 ->  Regalado Avenue 2 -> FEU");
                                                                        System.out.println("Total Travel Time: " + FEU + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Dahlia Avenue -> Regalado Avenue 2 -> FEU");
                                                                        System.out.println("Total Travel Time: " + FEU2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue 2 -> Don Mariano Marcos Avenue 1 -> Republic Avenue 1 -> FEU");
                                                                        System.out.println("Total Travel Time: " + FEU3 + " MINUTES");

                                                                        System.out.print("\nShortest Path"); 
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue 2 -> Don Mariano Marcos Avenue 1 -> Republic Avenue 1 -> FEU");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                }
                                        
                                                break;

                                        case 11:
                                        int LIBP = RGA1 + ADDnewRGA1;
                                        int LIBP2 = DMMA + DMMA3 + DA + ADDnewDMMA + ADDnewDMMA3 + ADDnewDA;

                                                if(LIBP <= LIBP2){
                                                                origTravelTime = LIBP;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 ->  Lola Ising Buko Pie");
                                                                        System.out.println("Total Travel Time: " + LIBP + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Donr Mariano Marcos Avenue 3 -> Dahlia Avenue ->  Lola Ising Buko Pie");
                                                                        System.out.println("Total Travel Time: " + LIBP2 + " MINUTES");

                                                                        System.out.print("\nShortest Path");
                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 ->  Lola Ising Buko Pie");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                }else{
                                                                origTravelTime = LIBP2;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 ->  Lola Ising Buko Pie");
                                                                        System.out.println("Total Travel Time: " + LIBP + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Donr Mariano Marcos Avenue 3 -> Dahlia Avenue ->  Lola Ising Buko Pie");
                                                                        System.out.println("Total Travel Time: " + LIBP2 + " MINUTES");

                                                                        System.out.print("\nShortest Path");
                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 ->  Lola Ising Buko Pie");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                }
                                        
                                                break;

                                        case 12:
                                        int PE = RGA1 + RGA2 + RPA2 + ADDnewRGA1 + ADDnewRGA2 + ADDnewRPA2;
                                        int PE2 = DMMA + DMMA3 + DA + RGA2 + RPA2 + ADDnewDMMA + ADDnewDMMA3 + ADDnewDA + ADDnewRGA2 + ADDnewRPA2;
                                        int PE3 = DMMA2 + DMMA1 + RPA1 + RPA2 + ADDnewDMMA2 + ADDnewDMMA1 + ADDnewRPA1 + ADDnewRPA2;

                                                if(PE <= PE2 && PE <= PE3){

                                                                origTravelTime = PE;
                                                                
                                                                        System.out.println("Options:");
                                                                
                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 ->  Regalado Avenue 2 -> Republic Avenue 2 -> Palawan Express ");
                                                                        System.out.println("Total Travel Time: " + PE + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Dahlia Avenue -> Regalado Avenue 2 -> Republic Avenue 2 -> Palawan Express ");
                                                                        System.out.println("Total Travel Time: " + PE2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue 2 -> Don Mariano Marcos Avenue 3 -> Republic Avenue 1 -> Republic Avenue 2 -> Palawan Express ");
                                                                        System.out.println("Total Travel Time: " + PE3 + " MINUTES");


                                                                        System.out.print("\nShortest Path");
                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 ->  Regalado Avenue 2 -> Republic Avenue 2 -> Palawan Express ");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                }else if(PE2 <= PE && PE2 <= PE3 ){

                                                                origTravelTime = PE2;
                                                                
                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 ->  Regalado Avenue 2 -> Republic Avenue 2 -> Palawan Express ");
                                                                        System.out.println("Total Travel Time: " + PE + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Dahlia Avenue -> Regalado Avenue 2 -> Republic Avenue 2 -> Palawan Express ");
                                                                        System.out.println("Total Travel Time: " + PE2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue 2 -> Don Mariano Marcos Avenue 3 -> Republic Avenue 1 -> Republic Avenue 2 -> Palawan Express ");
                                                                        System.out.println("Total Travel Time: " + PE3 + " MINUTES");


                                                                        System.out.print("\nShortest Path");
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Dahlia Avenue -> Regalado Avenue 2 -> Republic Avenue 2 -> Palawan Express ");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                }else{

                                                                origTravelTime = PE3;

                                                                        System.out.println("Options:");

                                                                        System.out.println("\nNavigation: \t store -> Regalado Avenue 1 ->  Regalado Avenue 2 -> Republic Avenue 2 -> Palawan Express ");
                                                                        System.out.println("Total Travel Time: " + PE + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue -> Don Mariano Marcos Avenue 3 -> Dahlia Avenue -> Regalado Avenue 2 -> Republic Avenue 2 -> Palawan Express ");
                                                                        System.out.println("Total Travel Time: " + PE2 + " MINUTES");

                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue 2 -> Don Mariano Marcos Avenue 3 -> Republic Avenue 1 -> Republic Avenue 2 -> Palawan Express ");
                                                                        System.out.println("Total Travel Time: " + PE3 + " MINUTES");


                                                                        System.out.print("\nShortest Path");
                                                                        System.out.println("\nNavigation: \t store -> Don Mariano Marcos Avenue 2 -> Don Mariano Marcos Avenue 3 -> Republic Avenue 1 -> Republic Avenue 2 -> Palawan Express ");
                                                                        System.out.println("Total Travel Time: " + origTravelTime + " MINUTES");
                                                }
                                        break;

                                        case 0:
                                                System.out.println("Exiting the program");
                                        
                                                System.exit(0);
                                        break;
                                        default:
                                        System.out.println("\t\tNot in the choices");
                                        break;
                                        }
                }
    }
}
