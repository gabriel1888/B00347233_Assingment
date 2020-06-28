
public class TeamMember {

	public static String teamMember_no;
	public String members;
	
	public TeamMember next;
	
	public TeamMember(String teamMember_no) {

	this.teamMember_no = teamMember_no;
	
	
	  
    

	
	
	}
	
	public void display() {
	
	System.out.println(teamMember_no);
	
		
		
	}
		
		public String toString(){
			
			return teamMember_no;
		
		
		
		}
		
		public static void main(String [] args) {
			 
		    
			String teamMember = null;	
			Integer EmployeeNumber = null;
			String Division = null;
			int option = 0;
			
	Linklist theLinkedlist = new Linklist();

	do {
        System.out.println("0: Quit");
        System.out.println("1: Add Team Member Details");
        System.out.println("2: Display");
        System.out.println("3: Remove");
       
		        option = Input.getInteger("Option: ");
		        
			
			switch (option) {
				
			
			 case 0:
		         System.out.println("Quitting Program");
		         break;
			
			
			case 1:
			
				theLinkedlist.insertfirstlink(option, teamMember=Input.getString("Team Member name: "));
				
				theLinkedlist.insertfirstlink(option,EmployeeNumber =Input.getInteger("Employee Number: "));
			
				theLinkedlist.insertfirstlink(option, Division =Input.getString("Division: "));
				
				break;
				
				
	
		
		
	
			case 2:
				 
			
				System.out.println( "Team Member Name:  "+ teamMember );
				System.out.println( "Employee Number:  "+EmployeeNumber  );
				System.out.println( "Division:  "+ Division );
				
				break;
				
			case 3:
				
				theLinkedlist.removeFirst(teamMember + EmployeeNumber + Division);
				
				break;
			
			
			
			
			}
			
			}   while (option != 0);
				}
				
		}
		
		
		class Linklist{
		
			public TeamMember firstlink;
			
			Linklist(){
				
				firstlink= null;
						
			}
			
		public void removeFirst(String string) {
				// TODO Auto-generated method stub
				
			}

		public void insertfirstlink(int option, String string) {
				// TODO Auto-generated method stub
				
			}

		public void display(String teamMember) {
				
				
			}
		
		public void insertfirstlink(int option, Integer integer) {
			
				
			}
		
		public boolean isEmpty() {
			return(firstlink == null);
			
		}
		
		public void  insertfirstlink(String teamMember) {
		
			TeamMember newLink = new TeamMember( teamMember);
		
		
		newLink.next = firstlink;
		
		firstlink = newLink;
		
		
		
		}
		
		public TeamMember removeFirst(){
			TeamMember linkReference = firstlink;
			 
			if(isEmpty()){
				firstlink = firstlink.next;
				
				
			
			} else {
			
		System.out.println("Empty Linkedlist");
		
		
		
		
		}
		
		return linkReference;
		
		 
		}

			public void display() {
			
				TeamMember thelink = firstlink;
			
			while(thelink !=null) {
				
				thelink.display();
				
				System.out.println("Next link:" + thelink.next);
				
				
				
				thelink = thelink.next;
				
				System.out.println();
			
			
							}
							
				}
				
				
				
				public TeamMember find(String teamMember_no) {
				
					TeamMember thelink = firstlink;
				
				if(isEmpty()) {
					
					while (thelink.teamMember_no != teamMember_no) {
				if(thelink.next == null) {
					
					return null;
					} 
					else {
				thelink = thelink.next;
				
				
					}
				
					}
				
				} else {
					
					System.out.println("Empty linked list");
				
				
				}
				return thelink;
				
				}

		public TeamMember removelink(String teamMember_no) {

			TeamMember currentlink = firstlink;
			TeamMember previouslink =firstlink;

					while(currentlink.teamMember_no != teamMember_no) {

						if(currentlink.next == null) {

							return null;
							} else {
								previouslink = currentlink;
								
								currentlink = currentlink.next;
								
								
								
					}

		}
					if(currentlink == firstlink) {
						
						firstlink = firstlink.next;
						
					} else {
						
						previouslink.next = currentlink.next;
					
					
					}
			
					return currentlink;
		}
	
}
