package practice;

class loopyThing{

public static void main (String abc[]){

//timeTable newObj = new timeTable();
MyString newObj2 = new MyString();
MyString newObj3 = new MyString();
//newObj.loop(); 
//newObj2.Find("Shafeeq Shafeeq is here ShafeeqS","Shafeeq");
	newObj2.replace("Shafeeq ShafeeqS is here ShafeeqS","Shafeeq","ABC");
}

}

class timeTable{

public void loop(){

int a = 1; 

while (a <= 10) {
	if (a % 2 == 0) {
		for (int t = 1; t <=a; t++) {
			System.out.println("--times table of " + t);
			for(int b = 1; b <=10; b++) {
				System.out.println(t + " x " + b + " = " + (t * b)); 
			}
			
		}
	
	}
	else {
	 
	for(int t2 = a;t2 >=a; ) { 
		
		
		
	}
	
}


}
}
}

class MyString{
	
	
	public void Find(String msg, String lookfor) {
		
	
		int i, found;
		
		
		i = found = 0; 
		
		for (; i < msg.length(); i++) {
		
		if(msg.substring(i, i + 1) .equals(lookfor.substring(0,1))) {
			
			if (msg.length() - i >= lookfor.length()){
				
			if (msg.substring(i, i + lookfor.length()) .equals(lookfor) ) {
				
				
				i = i + lookfor.length() - 1; 
			}
			
		}
			}
			
		}
		
		System.out.println("found " + lookfor + " "+ found + " times");
		System.out.println(msg); 
		
	}
	
	public void replace(String msg , String lookfor,String repl) {
		
		int i;
		String newmessage="";
		i = 0; 
		
		for (; i < msg.length(); i++) {
			if(msg.substring(i, i + 1) .equals(lookfor.substring(0,1))) {
				if (msg.length() - i >= lookfor.length()){
					if (msg.substring(i, i + lookfor.length()) .equals(lookfor) ) {		
						
					    newmessage+=repl;
						i = i + lookfor.length() - 1; 
					}
					else {
						newmessage+=msg.substring(i, i + 1);
					}
				}
			}
			else {
				newmessage+=msg.substring(i, i + 1);
			}
			
		}
		System.out.println(newmessage);
		
	}
}


	




