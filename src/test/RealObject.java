package test;

public class RealObject implements Interface{
    @Override
    public void getMyname() {
        System.out.println("My name is xxx");
    }

    @Override
    public String getNameById(String id) {
        System.out.println("argument id:" + id);
        return "xxx";
    }
}
