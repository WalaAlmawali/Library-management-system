package Entity;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> bookList;
    private List<Magazine> magazinList;
    private List<Member> memberList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String address;
    private  String name;

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Magazine> getMagazineList() {
        return magazinList;
    }

    public void setMagazineList(List<Magazine> magazinList) {
        this.magazinList = magazinList;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
