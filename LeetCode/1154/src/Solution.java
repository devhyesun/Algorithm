class Solution {
    public int dayOfYear(String date) {
        int result = 0;
        
        String splitDate[] = date.split("-");
        
        int year = Integer.valueOf(splitDate[0]);
        int month = Integer.valueOf(splitDate[1]);
        int day = Integer.valueOf(splitDate[2]);
        
        for(int i=1; i<month; i++) {
        	switch(i) {
	        	case 4:
	        	case 6:
	        	case 9:
	        	case 11:
	        		result += 30;
	        		break;
	        		
	        	case 2:
	        		if(year%400==0) {
	        			result += 29;
	        		} else if(year%4==0) {
	        			if(year%100==0) {
	        				result += 28;
	        			} else {
	        				result += 29;
	        			}
	        		} else {
	        			result += 28;
	        		}
	        		break;
        		
        		default : 
        			result += 31;
        	}
        }
        
        result += day;
        
        return result;
    }
}