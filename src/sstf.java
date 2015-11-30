public class sstf {
	private int head,total,position[],ans[];
	sstf(int head,int total,int[] position){
		this.head = head;
		this.total = total;
		this.position = new int[total];
		for(int i=0;i<total;i++)
			this.position[i] = position[i];
		this.ans = new int[total];
	}
	public void makeOrder(){
		int min,j=0,index=0;
		for(int i=0;i<total;i++){
			min = 10000;
			for(int k=0;k<total;k++){
				if(min>Math.abs(head-position[k])){
					min = Math.abs(head-position[k]);
					index = k;
				}
			}
			ans[j] = position[index];
			j++;
			head = position[index];
			position[index] = 100000;
		}
	}
	public void printOrder(){
		for(int i=0;i<total;i++){
			System.out.print(ans[i] + " ");
		}
		System.out.print("\n");
	}
}
