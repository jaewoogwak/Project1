package project;

public class MileagePaper extends User {
    // 필드
    int retentionHour = 0; // 마일리지 보유시간
    int accumulatedHour = 0; // 누적 마일리지
    String HowToGet=null; // 어떻게 받았는지? ( 받은 이유 )
   
    int[] addHourList = new int[100]; // 마일리지 추가한 시간 기록
    int[] accumulatedHourList = new int[100]; // 마일리지 누적 시간 기록
    String[] arrDetailList = new String[100]; // 마일리지 받은 이유 기록
    int num1=0;
    int num2=0;
    int num3=0;
    
    // 생성자
    MileagePaper(String YourRank, String YourName) {
        super(YourRank, YourName);
        System.out.println(YourRank + " " + YourName + "의 마일리지 종이가 생성되었습니다.");
        System.out.println("");
    }
    
    // 메소드
    public void addMileage(int hour) {
        retentionHour = retentionHour + hour;
        accumulatedHour = accumulatedHour + hour;
        addHourList[num2++] = hour;
        accumulatedHourList[num3++] = accumulatedHour;
    }
    public void minusMileage(int hour) {
        retentionHour = retentionHour - hour;
    }
    public int getRetetionHour() {
        return retentionHour;
    }
    public int getAccumulatedHour() {
        return accumulatedHour;
    }
    public int exchangeMileageToVacation() {
        if(retentionHour == 0) return 0;
        else return (retentionHour / 20);
    }
    public void addDetail(String str) {
        arrDetailList[num1++] = str;
    }
    
    
  
}