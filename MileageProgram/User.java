package project;

public class User {
    public String name="___"; // 이름
    public String rank="__"; // 계급
    
    // 필드에 붙이는 static 개념 숙지
    
    // 생성자
    User(String YourRank, String YourName) {
        this.rank = YourRank;
        this.name = YourName;
    }
    
    // 메소드
    public void userImformation() {
        System.out.println("관등성명 : " + rank + " " + name);
    }
    
}