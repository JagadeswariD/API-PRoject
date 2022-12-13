	package org.example;

	import java.util.Arrays;

	public class ArrCopyMain {
	    public static void main(String[] args) throws Exception {
	        //setup
	        Chef[] chefs = new Chef[2];

	        chefs[0] = new Chef("waltuh", 52);
	        chefs[1] = new Chef("jesse", 23);

	        //method1
	        Chef[] moreChefs = new ArrCoppier<Chef>()
	                .copy(chefs, 10,
	                        () -> new Chef[chefs.length + 10],
	                        () -> new Chef("joe", 10));

	      // System.out.println(Arrays.toString(moreChefs));
	       System.out.println(Arrays.deepToString(moreChefs));


	        //alt method
	        System.out.println("alt method:\n");
	        var copy = new ObjCoppier<>(
	                () -> new Chef[chefs.length + 10])
	                .fill(
	                        chefs,
	                        () -> new Chef("jane", 10));

	        //System.out.println(Arrays.toString(copy));
	        System.out.println(Arrays.deepToString(copy));

	    }
	}
