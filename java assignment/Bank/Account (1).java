public class Account {

	   private String  id;
		private String name;
		private	int bal=0;
	
		public  Account(String id,String name)
		{
			
			this.id=id;
			this.name=name;
		
		}
			
		
		public Account(String id, String name, int bal) {
		
			this.id=id;
			this.name=name;
			this.bal=bal;
			
		
		}
		public String getid()
		{
			
			return id;
		}	
		public String  getName() {
			
			return name;
			
		}
		public int getBalance()
		{
		
		return bal;
		}
		public int  credit(int amount)
		{
			bal=bal+amount;
			System.out.println("amount credit is ="+bal);
			return bal;
		
			
		}
		public int debit(int amount) {
			if(amount<=bal)
			{
			bal=bal-amount;
			System.out.println("amount withdraw is="+bal);
			}
			else {
				System.out.println("Exceed amount");
			}
			return bal;
		}
		public int  transfer(String  id,int transferamount)
		{
			if(transferamount<=bal) {
				bal=bal-transferamount;
				System.out.println("transfered amount is="+bal);
				
			}
			else {
				System.out.println("Amount exceed");
			}
			return bal;
		}
		
	public String toString()
	{
		return "Account[id=" +id+ ", name=" +name+", bal= "+bal+"]";
	}
	

						
		}
