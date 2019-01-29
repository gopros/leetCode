package test;

public class SimpleProxy implements Interface{

    private Interface proxied;

    public SimpleProxy(Interface proxied){
        this.proxied = proxied;
    }

    @Override
    public void getMyname() {
        System.out.println("proxy getmyname");
        proxied.getMyname();
    }

    @Override
    public String getNameById(String id) {
        System.out.println("proxy getnamebyid");
        return proxied.getNameById(id);
    }
}
