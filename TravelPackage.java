import java.util.Scanner;
class TravelPackageinfo {
    String TravelCode;
    int NoofAdults;
    int NoofKids;
    int Kilometers;
    float TotalFare;
    TravelPackageinfo(){
        TravelCode ="NULL";
        NoofAdults=0;
        NoofKids=0;
         Kilometers=0;
         TotalFare=0;
    }
    void AssignFare(){
        int adultFare = 0;

        if(Kilometers>=1000){
            adultFare=500;
        } else if (Kilometers>=500) {
            adultFare=300;

        }
        else {
            adultFare=200;
        }
        int KidFare=adultFare/2;
        TotalFare = (NoofAdults * adultFare) + (NoofKids * KidFare);
    }
    void Entertour(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Travel Code: ");
        TravelCode = sc.nextLine();

        System.out.print("Enter No. of Adults: ");
        NoofAdults = sc.nextInt();

        System.out.print("Enter No. of Kids: ");
        NoofKids = sc.nextInt();

        System.out.print("Enter Kilometers: ");
        Kilometers = sc.nextInt();

        AssignFare();;
    }

     void ShowTour(){
        System.out.println("Travel Code: " + TravelCode);
        System.out.println("No. of Adults: " + NoofAdults);
        System.out.println("No. of Kids: " + NoofKids);
        System.out.println("Kilometers: " + Kilometers);
        System.out.println("Total Fare: Rs " + TotalFare);
    }


}

public class  TravelPackage{
    public static void main(String args[]){
        TravelPackageinfo tp = new TravelPackageinfo();
        tp.Entertour();
        System.out.println(" Tour Details ");
        tp.ShowTour();
    }
}
