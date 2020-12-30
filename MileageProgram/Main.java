package project;


import java.util.Scanner;

public class Main {
    public static MileagePaper[] userList = new MileagePaper[100];  // 여러 명의 마일리지 종이들
    public static Scanner sc = new Scanner(System.in);
    public static int cnt=0;
    public static void main(String[] args) {
        
        boolean run = true;
        
        
        // Run
        while(run) {
            System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.println("1. 마일리지 종이 뽑기 | 2. 마일리지 종이 보기 | 3. 마일리지 추가하기 | 4. 마일리지 삭감하기 | 5. 종료 ");
            System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = sc.nextInt();
            System.out.println("");
            
            if(selectNo == 1) {
                createMileagePaper();
            } else if(selectNo == 2) {
                showMileagePaper();
            } else if(selectNo == 3) {
               addToMileage();
            } else if(selectNo == 4) {
                minusToMileage();
            } else if(selectNo == 5) {
                run = false;
            } 
        }
        System.out.println("프로그램 종료"); 
        System.out.println("");
    }
    
    public static void createMileagePaper() {
        
        String YourRank; // 계급;
        String YourName; //이름 
        
        // 정보 입력
        System.out.println("당신의 관등성명을 알아야 합니다.");
        System.out.print("계급: ");
        YourRank = sc.next();
        System.out.print("이름: ");
        YourName = sc.next();
        // 나중에 관등성명 한 번에 입력받고 문자열 떼서 저장해보기
        
        // 마일리지 종이를 생성
        System.out.println("마일리지 종이를 생성합니다.");
        userList[cnt++] = new MileagePaper(YourRank, YourName);
        System.out.println("");
    }
    
    public static void showMileagePaper() {
        
        boolean run = true;
        
        while(run) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("3-1. 현재 보유한 마일리지 보기 | 3-2. 누적 마일리지 보기 | 3-3. 마일리지 종이 보기 | 3-4. 휴가 며칠로 바꿀 수 있는 지 보기 | 3-5. 이전으로 돌아가기");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = sc.nextInt();
            System.out.println("");
            
            if(selectNo == 1) {
                System.out.println("현재 보유한 마일리지는 " +userList[0].retentionHour + "시간 입니다.");
            } else if(selectNo == 2) {
                System.out.println("현재 누적 마일리지는 " + userList[0].accumulatedHour + "시간 입니다. ");
            } else if(selectNo == 3) {
                for(int j=0; j<100; j++) { // 계급 이름 | 받은 이유 | 받은 시간 | 누적 시간 | 확인서명
                    System.out.println("---------------------------------------------------------------------------------------------------------");
                    //System.out.println("|" + userList[0].rank + " " + userList[0].name + "|" +  userList[0].arrDetailList[j] + "|" + userList[0].addHourList[j] + "|" + userList[0].accumulatedHourList[j]); 
                    System.out.print("|" + userList[0].rank + " " + userList[0].name + "|");
                    System.out.printf("%-15s", userList[0].arrDetailList[j]); System.out.print("|");
                    System.out.printf("%3d", userList[0].addHourList[j]); System.out.print("|");
                    System.out.printf("%3d", userList[0].accumulatedHourList[j]); System.out.println("");
                    System.out.println("---------------------------------------------------------------------------------------------------------");
                } 
            } else if(selectNo == 4) {
                System.out.println("현재 보유한 마일리지를 휴가로 바꾸면 " + userList[0].exchangeMileageToVacation() + "일 입니다.");
            } else if(selectNo == 5) {
                System.out.println("이전으로 돌아갑니다.");
                run = false;
            }
            System.out.println("");
        }
        
        /** test * 
        System.out.println("누구의 마일리지 종이를 볼까요?");
        System.out.print("계급 : ");
        String rk = sc.next();
        System.out.print("이름: ");
        String nm = sc.next();
        */
        
        // test code //
        //System.out.println("test code: " + userList[2].name);
    }
        
        
        
    
    public static void addToMileage() {
        System.out.println("마일리지 종이에 받은 마일리지를 작성합니다. ");
        
        System.out.print("추가할 시간 : ");
        int h = sc.nextInt();
        sc.nextLine();
        System.out.print("마일리지를 받은 이유 : ");
        String str;
        str  = sc.nextLine();
        
        userList[0].addMileage(h);
        userList[0].addDetail(str);
        System.out.println("마일리지 기록을 완료했습니다.");
        System.out.println("");
        
    }
    
    public static void minusToMileage() {    
        System.out.println("마일리지 종이에 받은 마일리지를 삭감합니다. ");
        
        System.out.print("삭감할 시간 : ");
        int h = sc.nextInt();
        sc.nextLine();
        System.out.print("삭감한 이유 : ");
        String str;
        str = sc.nextLine();
        
        userList[0].minusMileage(h);
        userList[0].addDetail(str);
        System.out.println("마일리지 기록을 완료했습니다.");
        System.out.println("");
    }
    

}
