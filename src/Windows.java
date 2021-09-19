import java.awt.*;

public class Windows {
    private int quantity;

    public Windows(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
       return this.quantity;
    }

    public void getWindows(){
        System.out.println("Room has: "+ getQuantity()+ " windows");
    }
}
