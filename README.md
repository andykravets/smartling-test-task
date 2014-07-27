smartling-test-task
===================

 A programmer drinks exactly goalPints of beer every evening. 
  One evening, the programmer opens his fridge and sees a number of smallBottles of beer (1 pint each) and  a number of bigBottles of beer (3 pints each). 
  The programmer needs to decide whether he can pick some bottles and start drinking, or has to run to the store to buy some more bottles. 
  The programmer is "greedy" and never consumes a bottle partially. 

  Write a Java-method which returns true if it is possible to make the goal by choosing from the given (whole) bottles, or false otherwise. 
  Note that it is not necessary to "take" all bottles — some may remain unused. 

  Method stub: 

    public boolean gotBeer(int goalPints, int smallBottles, int bigBottles) {
      // TODO: implement me
    }

  Examples: 
  
    gotBeer(6, 3, 1)  must return  true
    gotBeer(7, 3, 1)  must return  false
    gotBeer(6, 3, 2)  must return  true
    gotBeer(3, 0, 1)  must return  true
    gotBeer(1, 0, 1)  must return  false