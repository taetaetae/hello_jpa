package hellojpa.entity;

import javax.persistence.*;

@Entity
public class Member {

    @Id
    private Long id;

    @Column(name = "USERNAME")
    private String name;
    private int age;

    @Enumerated(EnumType.STRING)
    private MemberType memberType;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MemberType getMemberType() {
        return memberType;
    }

    public void setMemberType(MemberType memberType) {
        this.memberType = memberType;
    }
}
