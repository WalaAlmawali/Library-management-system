package Entity;

public class Member {
    private int id;
    private String name;
    private MemberAddress address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MemberAddress getAddress() {
        return address;
    }

    public void setAddress(MemberAddress address) {
        this.address = address;
    }
}
