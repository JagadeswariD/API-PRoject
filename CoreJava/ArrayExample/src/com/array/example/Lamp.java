package com.array.example;

public class Lamp {

		 // TODO Auto-generated method stub
		  // stores the value for light
	      // true if light is on
	      // false if light is off
	      boolean isOn=false;

	      // Please implement method to turn on the light
	       void turnOn()
	      {
	    	 if(!isOn) 
	    	   isOn=true;
	    	 
	    	 System.out.println("Light on?"+isOn);
	      }
	      
	       void turnOff()
	      {
	    	   if(isOn)
	    		   isOn=false;
		    	 System.out.println("Light on?"+isOn);

	      }

	 

	      // Please implement  method to turnoff the light

	      
	    public static void main(String[] args) {
	        // 
	        // create objects led and halogen
	        Lamp led = new Lamp();
	        Lamp halogen = new Lamp();

	        // turn on the light by
	        // calling method turnOn()
	        led.turnOn();

	        // turn off the light by
	        // calling method turnOff()
	        halogen.turnOff();
	}

}
