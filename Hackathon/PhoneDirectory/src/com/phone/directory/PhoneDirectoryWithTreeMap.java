package com.phone.directory;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectoryWithTreeMap {
	   private TreeMap<String,String> data;

	   /**
	    * Constructor creates an initially empty directory.
	    */
	   public PhoneDirectoryWithTreeMap() {
	       this.data = new TreeMap<String,String>();
	   }

	   /**
	    * Finds the phone number, if any, for a given name.
	    * @return The phone number associated with the name; if the name does
	    *    not occur in the phone directory, then the return value is null.
	    */
	   public String getNumber( String name ) {
	       return   this.data.get(name);
	   }

	   public void putNumber( String name, String number ) {
	       if (name == null || number == null)
	           throw new IllegalArgumentException("name and number cannot be null");
	       this.data.put(name,number);
	   }


	   /**
	    *  Write the contents of the phone directory to System.out.
	    */
	   public void print() {
	       for ( Map.Entry<String,String> entry :   this.data.entrySet() )
	           System.out.println( entry.getKey() + ":  " + entry.getValue() );
	   }

}
