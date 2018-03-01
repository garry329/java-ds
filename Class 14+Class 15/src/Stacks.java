
public class Stacks {
public static Stackl<Integer> reversestack(Stackl<Integer> s1) throws  
StackEmptyException{
	Stackl<Integer> s2=new Stackl<Integer>();
	while(s1.size()!= 0)
	{
		s2.push(s1.pop());
	}
	return s2;}
public static void main(String[] args) throws StackEmptyException {
	Stackl<Integer>  s1=new Stackl<Integer> ();
	s1.push(3);
	s1.push(1);
	s1.push(5);
	s1.push(6);
	s1.print();
reversestack(s1).print();	
}
}
