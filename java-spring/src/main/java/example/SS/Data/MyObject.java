package example.SS.Data;

import org.springframework.data.annotation.Id;

public class MyObject {
    public MyObject(){

    }
    public MyObject( String myString, String myInt){
        this.myString=myString;
        this.myInt=myInt;
    }

    @Id
    public String id;

    public String myString;
    public String myInt;

    public void doIt(){
        System.out.println(myString + " " + myInt);
    }
}
