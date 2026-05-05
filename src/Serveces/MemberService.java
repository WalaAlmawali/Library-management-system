package Serveces;

import Entity.Book;
import Entity.Magazine;
import Entity.Member;
import Entity.MemberAddress;
import Utils.Constant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberService {

    int idCount = 1;
    List<Member> memberList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Member AddNewMember(){

        Member member = new Member();

        member.setId(idCount);
        idCount++;

        System.out.println("Enter Member name");
        member.setName(scanner.nextLine());

        System.out.println("Enter Member Address : ");

        System.out.println("Enter Street");
        String street = scanner.nextLine();

        System.out.println("Enter City");
        String city = scanner.nextLine();

        System.out.println("Enter Postal Code");
        String postalCode = scanner.nextLine();

        MemberAddress memberAddress = new MemberAddress(street,city,postalCode);
        member.setAddress(memberAddress);



        return member;
    }

    public List<Member> AddNewMembers(){

        Boolean continueFlag = true;
        while (continueFlag) {

            memberList.add(AddNewMember());
            System.out.println(Constant.Member_ADDED_SUCCESSFULLY);

            System.out.println(Constant.INPUT_EXIT_CONTINUE_MESSAGE_BOOK);
            if (scanner.nextLine().equalsIgnoreCase("q")) {
                continueFlag = false;
            }
        }
        return memberList;

    }

    public void DisplayMember(int memberID){

        if(memberList.isEmpty()){
            System.out.println(Constant.MEMBER_LIST_IS_EMPTY);
        }

        for(Member member : memberList){

            if(member.getId() == memberID){

                System.out.println("Member ID : " + member.getId());
                System.out.println("Member name : " + member.getName());
                System.out.println("Member address : " + member.getAddress().getFormattedAddress());

            }
        }

    }




    public Boolean handleMemberMenu(Integer memberOption) {

        Scanner scanner = new Scanner(System.in);

        switch (memberOption) {
            case 1 -> {
                System.out.println("Add new Member ");
                AddNewMembers();

            }
            case 2 -> {
                System.out.println("Enter Member ID to show the Member information");
                DisplayMember(scanner.nextInt());


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
