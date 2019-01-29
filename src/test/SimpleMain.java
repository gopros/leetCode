package test;

public class SimpleMain {

    private static void consume(Interface iface){
        iface.getMyname();;
        String name = iface.getNameById("10");
        System.out.println("name:"+name);
    }


    public static void main(String[] args) {

        consume(new RealObject());
        System.out.println("++++++++++++++++++++++++++++");
        consume(new SimpleProxy(new RealObject()));

    }

}
