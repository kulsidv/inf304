package Exam02;

import java.io.File;

public class Main {
    static MyReader reader0;
    static MyReader reader1;
    static MyReader reader2;
    static MyReader reader3;
    static MyReader reader4;
    static MyReader reader5;
    static MyReader reader6;

    public static void main(String[] args) {
        File file0 = new File("C:\\Users\\kulsi\\IdeaProjects\\inf304\\src\\Exam02\\v13\\v13_task_20cfbb4c-5ae7-4714-b6b3-6b1473921f92");
        File file1 = new File("C:\\Users\\kulsi\\IdeaProjects\\inf304\\src\\Exam02\\v13\\v13_task_58d35672-b359-4af7-b7ab-45cb3895adea");
        File file2 = new File("C:\\Users\\kulsi\\IdeaProjects\\inf304\\src\\Exam02\\v13\\v13_task_73e31177-a9c5-446d-a3ed-3910bbcb4289");
        File file3 = new File("C:\\Users\\kulsi\\IdeaProjects\\inf304\\src\\Exam02\\v13\\v13_task_95d14a8c-8f3d-4e3a-b0fe-3116f347f7f5");
        File file4 = new File("C:\\Users\\kulsi\\IdeaProjects\\inf304\\src\\Exam02\\v13\\v13_task_ea632a47-de86-43b0-beae-69dbb77f831d");
        File file5 = new File("C:\\Users\\kulsi\\IdeaProjects\\inf304\\src\\Exam02\\v13\\v13_task_ec743f76-47ad-4dca-9c09-8fedaeb81383");
        File file6 = new File("C:\\Users\\kulsi\\IdeaProjects\\inf304\\src\\Exam02\\v13\\v13_task_fe0e63fb-7aee-4a8c-bf4a-bbd5aa8c4466");
        reader0 = new MyReader(file0);
        reader0.start();

        reader1 = new MyReader(file0);
        reader1.start();

        reader2 = new MyReader(file0);
        reader2.start();

        reader3 = new MyReader(file0);
        reader3.start();

        reader4 = new MyReader(file0);
        reader4.start();

        reader5 = new MyReader(file0);
        reader5.start();

        reader6 = new MyReader(file0);
        reader6.start();
    }
}
