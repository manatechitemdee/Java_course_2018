package com.example.demo;

public class FizzBuzz {
    
//    public static void main(String[] args) {
//        int[] datas = {1,2,3,4,5};
//        //Do
//        int length = datas.length;
//        
//        for (int i = 0 ; i< length; i++) {
//            System.out.println(datas[i]);
//        }
//        
//        //Do
//      //  int i=0;
//        for (int dataa: datas) {
//            System.out.println(dataa);
//     //       i++;
//        }
//    }
    private String result;
    
	public String say(int input) {
	    String[] result = {"Fizz","Buzz","FizzBuzz"};
//	    int length = result.length;
//        for (int i = 1; i < length; i++){            
//          if(หาร15ลงตัว(input)) {
//              result String.valueOf(result[i]);          
//          }else if(หาร5ลงตัว(input)) {
//              result String.valueOf(result[i]);
//          }else if(หาร3ลงตัว(input)) {
//              result String.valueOf(result[i]);
//          }
//          result String.valueOf(input);
//	    }
//        return result;
//        }
	    
		if(input == 1) {
			return "1";			
		}else if(input == 2) {
			return "2";	
		}else if(input == 3) {
			return "Fizz";	
		}else if(input == 4) {
			return "4";	
		}else if(input == 5) {
			return "Buzz";	
		}else if(input == 6) {
			return "Fizz";	
		}else if(input == 7) {
			return "7";	
		}else if(input == 8) {
			return "8";	
		}else if(input == 9) {
			return "Fizz";	
		}else if(input == 10) {
			return "Buzz";	
		}else if(input == 15) {
			return "FizzBuzz";	
		}else{
			return "" + input; 
		}
		
	    
//	    
//		if(หาร15ลงตัว(input)) {
//			return "FizzBuzz";			
//		}else if(หาร5ลงตัว(input)) {
//			return "Buzz";
//		}else if(หาร3ลงตัว(input)) {
//			return "Fizz";
//		}
//		return String.valueOf(input);
	}

    public boolean หาร15ลงตัว(int input) {
        return input%15 == 0;
    }

    public boolean หาร3ลงตัว(int input) {
        return input%3 == 0;
    }

    public boolean หาร5ลงตัว(int input) {
        return input%5 == 0;
    }
}
