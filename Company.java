
public class Company {
	 private String project;
	    private Integer project_no;

	    public Company(String project, Integer project_no) {
	        this.project = project;
	        this.project_no = project_no;
	    }

	    public String toString(){
	        String companyDetails=new String();
	        companyDetails+=this.project_no;
	        companyDetails+=" "+this.project;
	        companyDetails=String.format("%-20s%-20s",this.project_no,this.project);
	        return companyDetails;
	    }
}
