package setusingarray;

public class Set<T> {
	private T[] arrayElement;
	int size;

	public Set() {
		this.arrayElement = null;
		size=0;
	}

	public Set(T[] element) {
		arrayElement = element;
		size = arrayElement.length;
	}

	@SuppressWarnings("unchecked")
	public void add(T element) {
		if(arrayElement==null){
			arrayElement=(T[]) new Object[10];
			arrayElement[size++] = element;
		}
		else{
			if (!contains(element)) {
				if (size == arrayElement.length) {
					incrementArray();
				}
				arrayElement[size++] = element;
			}
			
		}
	}

  	@SuppressWarnings("unchecked")
	public void incrementArray(){
		T[] temp = arrayElement;
		int tempSize = size *2;
		arrayElement = (T[]) new Object[tempSize];
		System.arraycopy(temp, 0, arrayElement, 0, size);
	}
	
    
  	public void remove(){
  		if(arrayElement!=null){
  			if(arrayElement.length/4>=size && arrayElement.length>10){
  				decrementArray();
  			}
  			arrayElement[size-1]=null;
  			size=size-1;
  		}
  	}
  	@SuppressWarnings("unchecked")
	public void decrementArray(){
  		T[] temp =arrayElement;
  		int tempSize=arrayElement.length/2;
  		arrayElement=(T[]) new Object[tempSize];
  		System.arraycopy(temp, 0, arrayElement, 0, size);
  	}
  	public boolean contains(T element){
		if(element == null){
			for(int i =0;i<size;i++){
				if(arrayElement[i]==null)return true;
			}
		}else{
			for(int i=0;i<size;i++){
				if(element.equals(arrayElement[i])){
					return true;
				}
			}
		}
		return false;
	}
	
	public int size(){
		if(arrayElement !=null){
			return arrayElement.length;
		}else return 0;
	}
	
	public void clear(){
		arrayElement = null;
	}
	
	public String toString(){
		String toString;
		if(arrayElement == null || arrayElement.length == 0){
			return"[Empty]";
		}else{
			toString = "[";
			for(int i=0;i<arrayElement.length;i++){
				toString += arrayElement[i]+",";
			}
			toString += "]";
		}
		return toString;
	}
	
	public boolean isEmpty(){
		if(arrayElement == null || arrayElement.length==0){
			return true;
		}else return false;
	}
}
