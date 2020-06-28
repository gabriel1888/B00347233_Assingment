

public class CompanyTest {
			private Company[] companys;
		    private Integer numberOfCompanys;
		
		    Node root;
		
		public void addNode(int project, String name) {
		
		Node newNode = new Node(project, name);	
			
		if(root == null) {
		
		
		root= newNode;
		
		} else { 
			
			Node focusNode = root;
			
			Node parent;
			
			while(true) {
		
				parent= focusNode;
				
				if(project < focusNode.project) {
				focusNode = focusNode.leftchild;
				
				if(focusNode ==null) {
					
					parent.leftchild = newNode;
					return;
					
				
				}
				
				} else {
					focusNode = focusNode.rightchild;
					
					if (focusNode == null) {
				          	
						parent.rightchild = newNode;
				          		
				          		return;
				          		
					}
			
					
					 
					 
					 
					 
					 
			}
		
		}
		
		
		}
		
		}
		
		public void inOrderTraverseTree(Node focusNode) {
		
		if(focusNode != null) {
			
		inOrderTraverseTree(focusNode.leftchild);
		
			System.out.println(focusNode);
			
			inOrderTraverseTree(focusNode.rightchild);
		}
			
		}
		
		public boolean remove(int project) {
			
		Node focusNode = root;
		Node parent = root;
		
		boolean isItALeftChild = true;
		
		while(focusNode.project != project) {
		
		
		parent = focusNode;
		 
		if(project < focusNode.project) {
		
			
			
			isItALeftChild = true;
			
			focusNode = focusNode.leftchild;
			
			
			
			
			
		} else  { 
			isItALeftChild = false;
			
			focusNode = focusNode.rightchild;
			
		}
		if (focusNode == null)
			return false;
			
		}
		
		if (focusNode.leftchild == null && focusNode.rightchild == null) {
			if(focusNode== root) {
				root=null;
			 
		} else if(isItALeftChild){
			
			parent.leftchild = null;
			
		
		} else {
			
			parent.rightchild = null;
			
			
		
			}
		}
			else if(focusNode.rightchild == null) {
		
				if(focusNode == root)
					root = focusNode.leftchild;
				
				else if(isItALeftChild)
					
					parent.leftchild = focusNode.leftchild;
				
				else parent.rightchild = focusNode.leftchild;
			
			}
		
			else if(focusNode.leftchild == null) {
				if(focusNode == root)
					root = focusNode.rightchild;
				
				else if(isItALeftChild)
					parent.leftchild = focusNode.rightchild;
				
				else
					
					parent.rightchild = focusNode.rightchild;
				
		
			}
		
			else {
				Node replacement = getReplacementNode(focusNode);
				
				if (focusNode== root)
					root = replacement;
				
				else if(isItALeftChild)
					parent.leftchild = replacement;
				
				else
					parent.rightchild = replacement;
				
				replacement.leftchild = focusNode.leftchild;
				
		
				
		}
		
		return true;
		}
		
		public Node getReplacementNode(Node replacedNode) {
		
		
		Node replacementParent = replacedNode;
		Node replacement = replacedNode;
		
		Node focusNode = replacedNode.rightchild;
		
		while (focusNode != null) {
			
			replacementParent = replacement;
			
			replacement = focusNode;
			
			focusNode = focusNode.leftchild;
			
			
			
		}
		
		if(replacement != replacedNode.rightchild) {
		
			replacementParent.leftchild = replacement.rightchild;
			replacement.rightchild = replacedNode.rightchild;
		
		}
		
		return replacement;
		
		
		}
		
		
		
		private void remove(String project) {
			// TODO Auto-generated method stub
			
		}
		
		class Node {
			
			
			int project;
			String name;
			
			Node leftchild;
			Node rightchild;
			
			Node(int project, String name){
			
			this.project = project;
				
			this.name =name;	
			
			}
		
			
		
		}
		
		
		public static void main(String [] args) {
		
			String Project = null;
			String teamMember = null;	
			Integer EmployeeNumber = null;
			String Division = null;
			String Date = null;
			
			int option = 0;
			
		Linklist theLinkedlist = new Linklist();
		
		do {
		System.out.println("0: Quit");
		System.out.println("1: Add project");
		System.out.println("2: Display project");
		System.out.println("3: Add team member");
		System.out.println("4: Display team member");
		
		        option = Input.getInteger("Option: ");
		        
			
			switch (option) {
				
			
			 case 0:
		         System.out.println("Quitting Program");
		         break;
			
			
			case 1:
			
				theLinkedlist.insertfirstlink(option, Project=Input.getString("Project name: "));
				theLinkedlist.insertfirstlink(option, Date=Input.getString("Project date: "));
			
			
				
				
				break;
				
				
		
		
		
		
			case 2:
				 
			
				System.out.println("Project:" + Project);
				System.out.println("Date:" + Date);
					
				break;
				
			
			case 3:
			
				theLinkedlist.insertfirstlink(option,teamMember =Input.getString("Team Member: "));
				theLinkedlist.insertfirstlink(option,EmployeeNumber =Input.getInteger("Employee Number: "));
				theLinkedlist.insertfirstlink(option,Division =Input.getString("Division: "));
				
				System.out.println( "Team Member added");
				
				break;
			
				
			
			case 4:
				
				System.out.println( "Team Member Name:  "+ teamMember );
				System.out.println( "Employee Number:   "+ EmployeeNumber );
				System.out.println( "Division:  "+ Division );
				break;
			
			
			case 5:
				
				theLinkedlist.removeFirst(teamMember + EmployeeNumber + Division);
				
				break;
			
			
			
			
			}
			
			}   while (option != 0);
				}
			

	
	}

