package Exam01;

public class Program {
    String channel;
    Time time;
    String title;
    Program(String channel, String time, String title) {
        this.title = title;
        this.channel = channel;
        this.time = new Time();
        this.time.setTime(time);
    }

    public class Time {
        int hour;
        int minute;

        public String getTime(){
            String time = this.hour + ":" + this.minute;
            return time;
        }

        private void setTime(String time){
            char ch = 0;
            for (int i = 0; i < 5; i++) {
                ch = time.charAt(i);
                switch (i) {
                    case 0: {
                        if (ch == '0') break;
                        this.hour = (int)ch * 10;
                        break;
                    }
                    case 1: {
                        this.hour = this.hour + (int)ch;
                        break;
                    }
                    case 3: {
                        if(ch == '0') break;
                        this.minute = (int)ch * 10;
                        break;
                    }
                    case 4: {
                        this.minute = this.minute + (int)ch;
                        break;
                    }
                }
            }
        }
    }
}
