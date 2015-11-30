public class fcfs {
	private int head,total,position[],ans[];
	fcfs(int head,int total,int[] position){
		this.head = head;
		this.total = total;
		this.position = new int[total];
		for(int i=0;i<total;i++)
			this.position[i] = position[i];
		this.ans = new int[total];
	}
	public void makeOrder(){
		for(int i=0;i<total;i++){
			ans[i] = position[i];
		}
	}
	public void printOrder(){
		for(int i=0;i<total;i++){
			System.out.print(ans[i] + " ");
		}
		System.out.print("\n");
	}
}
