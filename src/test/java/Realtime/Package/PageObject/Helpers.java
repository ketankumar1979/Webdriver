package Realtime.Package.PageObject;


import Realtime.Package.Factory.DriverFactory;

public class Helpers extends DriverFactory {
    public void sleep(int ms) {
        try{
            Thread.sleep(ms);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}
