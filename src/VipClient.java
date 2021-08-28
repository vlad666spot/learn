public class VipClient {

    private String name;
    private int limit;
    private String email;

    public VipClient(){
        this("Vlad", 100, "as@u.so");
    }

    public VipClient(int limit, String email){
        this("Vlad", limit, email);
    }

    public VipClient(String name, int limit, String email){
        this.name=name;
        this.limit=limit;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public int getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}
