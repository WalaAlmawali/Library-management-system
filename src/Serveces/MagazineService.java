package Serveces;

import java.util.Scanner;

public class MagazineService {


    public Boolean handleMagazineMenu(Integer magazineOption) {

        Scanner scanner = new Scanner(System.in);

        switch (magazineOption) {
            case 1 -> {
                System.out.println("Add new Magazine ");

            }
            case 2 -> {
                System.out.println("Enter Magazine ID to show the Magazine details");


            }
            case 3 -> {
                System.out.println("Enter Magazine ID to delete the Magazine");


            }

            case 4 -> {
                System.out.println("Enter Magazine ID to update the Magazine");

            }
            case 5 -> {
                return false;
            }
        }
        return true;
    }
}
