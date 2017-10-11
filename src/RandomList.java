import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RandomList{
	
	private List<Integer> list;
	private int minimumValue = 0;
	private int maximumValue = 100;

	public RandomList(int size){
		this.list = new LinkedList<Integer>();
		Random generator = new Random();
		for(int i = 0; i < size; i++){
			int newNum = generator.nextInt(maximumValue);
			Integer entry = new Integer(newNum);
			this.list.add(entry);
		}
	}

	public List<Integer> GetList(){
		return this.list;
	}


}