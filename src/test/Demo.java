public class Demo {

    private int anInt = 10;

    public static void main(String[] args) {
        Demo demo = new Demo();
        int m = 30;
        demo.say(demo, m);
        System.out.print(m);//30
        System.out.print(demo.anInt);//20--say()中改变了
    }

    private void say(Demo demo, int m) {

        m = 0;
        demo.anInt = 20;
        change(demo);
        System.out.print(m);//0
    }

    private void change(Demo demo) {

        demo = new Demo();

        System.out.print(demo.anInt);//10
    }
}
