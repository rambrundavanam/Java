package setusingarray;

import setusingarray.Set;


class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> intArr=new Set<Integer>();
		System.out.println(intArr.toString());
		System.out.println("ActualSize: "+intArr.size+" "+"Length: "+intArr.size() );
		for(int i=0;i<12;i++){
			intArr.add(i);
		}
		System.out.println("ActualSize: "+intArr.size+" "+"Length: "+intArr.size() );
		System.out.println(intArr.toString());
		System.out.println("ActualSize: "+intArr.size+" "+"Length: "+intArr.size() );
		intArr.remove();
		intArr.remove();
		intArr.remove();
		intArr.remove();
		intArr.remove();
		intArr.remove();
		System.out.println(intArr.toString());
		intArr.remove();
		System.out.println(intArr.toString());
		intArr.remove();
		System.out.println(intArr.toString());
		intArr.remove();
		System.out.println(intArr.toString());
		System.out.println("ActualSize: "+intArr.size+" "+"Length: "+intArr.size() );
	}

}