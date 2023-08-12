public class Product implements Comparable{
	
	int pid;
	String pname;
	int cost;
	
	
	public Product(int pid,String pname,int cost){
		this.pid = pid;
		this.pname = pname;
		this.cost = cost;
	}
	
	public void getProductDetails(){
		System.out.println("pid  :"+ pid+ " pname: "+ pname + " cost  :"+ cost);
		System.out.println("----------------------------------------");
	}
	
	// Compare Bsed on Id
	public int compareTo(Object obj){
		Product pr = (Product)obj;
		if(this.pid<pr.pid){
			return -1;
			
		}else if(this.pid>pr.pid){
			return 1;
		}
		else
			return 0;
		
	}
	
	//Compare Based on pname
/**	public int compareTo(Object obj){
		Product pr = (Product)obj;
		return this.pname.compareTo(pr.pname);
		
	}*/
	
	//Compare Based on Cost
	/**public int compareTo(Object obj){
		Product pr = (Product)obj;
		if(this.cost<pr.cost){
			return -1;
			
		}else if(this.cost>pr.cost){
			return 1;
		}
		else
			return 0;
		
	}*/
	
}