package Serveces;

import java.util.Scanner;

public class MemberService {

    public Boolean handleMemberMenu(Integer memberOption) {

        Scanner scanner = new Scanner(System.in);

        switch (memberOption) {
            case 1 -> {
                System.out.println("Add new Member ");


            }
            case 2 -> {
                System.out.println("Enter Member ID to show the Member information");


            }
            case 3 -> {
                System.out.println("Enter Member ID to delete the Member");

            }

            case 4 -> {
                System.out.println("Enter Member ID to update the Member");

            }
            case 5 -> {
                return false;
            }
        }
        return true;
    }


}
