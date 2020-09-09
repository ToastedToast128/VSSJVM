// Very Simple and Short JVM Benchmark (VSSJVM)
// By ToastedToast128

import java.util.ArrayList;

public class VSSJVM
{
   public static void main (String[] args)
   {
      long unixTimeStored = System.currentTimeMillis() / 1000L;
      long unixTime = System.currentTimeMillis() / 1000L;
	  ArrayList<Double> randomValList = new ArrayList<Double>();
	  while(unixTime <= unixTimeStored+10) {
		randomValList.add(Math.random());
      unixTime = System.currentTimeMillis() / 1000L;
	  }
	  System.out.println(randomValList.size());
   }     
}
