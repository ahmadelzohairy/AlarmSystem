import java.time.LocalDateTime;

public class Alarm {
    private boolean active;
    private final String message;
    private LocalDateTime snoozeUntil;

    Alarm(String message){

        this.message = message;
        stopSnoozing();
    }

    public void turnOn(){
        this.active = true;
        stopSnoozing();
    }
    public void turnOff(){
        this.active = false;
        stopSnoozing();
    }
    public String getReport(boolean uppercase){
        if(active && !isSnoozing()){
            if(uppercase){
                return message.toUpperCase();
            }else {
                return  message;
            }
        }
        return "";
    }
    public String getReport(){
        return getReport(false);
    }
    public void snooze(){
        if(active)
            snoozeUntil = LocalDateTime.now().plusSeconds(5);
    }
    public boolean isSnoozing(){
        return snoozeUntil.isAfter(LocalDateTime.now());
    }
    private void stopSnoozing(){
        snoozeUntil = LocalDateTime.now().minusSeconds(1);
    }
    public void sendReport(){

        System.out.println(getReport(true));
    }

}
