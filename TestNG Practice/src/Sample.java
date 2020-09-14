/**
 * Created by Sabab on 8/2/2016.
 */

public class Sample {

    private String message;

    //Constructor
    //@param message to be printed
    public Sample(String message){
        this.message = message;
    }

    // prints the message
    public String printMessage(){
        System.out.println(message);
        return message;
    }

}

