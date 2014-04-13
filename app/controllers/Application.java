package controllers;

import play.*;
import play.mvc.*;
import pusher.Pusher;

import java.util.*;

import com.google.gson.JsonObject;

//import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void pusherNotification(){
    	Pusher pusher = new Pusher("71672","98a511e1fac903861c00","88fe0ac88ada93cbe91c");
    	//Pusher pusher = new Pusher("appID","key","secret");
    	
    	JsonObject  jsonMessage = new JsonObject();
    	jsonMessage.addProperty("message", "Hola!!!!!!!!!");
    	
    	String message = jsonMessage.toString();
    	
    	pusher.trigger("test_channel", "my_event", message);
    }

}