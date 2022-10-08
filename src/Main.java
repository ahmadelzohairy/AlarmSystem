public class Main {
    public static void main(String[] args) throws InterruptedException{
        Alarm alarm = new Alarm("Too High Temp");
        alarm.turnOn();
        alarm.snooze();
        Thread.sleep(6000);
        alarm.sendReport();
    }
}