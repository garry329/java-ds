

public class dynamicpoly {
	dyna coeff;
	public dynamicpoly(){
		coeff =new dyna();	
	}
	public void setcoeff(int c,int d )
	{
		if(d<coeff.size()){
			coeff.set(c, d);
		}
		else{
			for(int i=0;i<d;i++){
				coeff.add(0);
			}
			coeff.set(c,d);
		}
	}
	public int getcoeff(int deg){
		return coeff.get(deg);
	}
	public int degree(){
		for(int i=coeff.size()-1;i>=1;i--)
		{
			if(coeff.get(i)!=0){
				return i;
			}
		}
		return 0;}
	public void print(){
		for(int i=0;i<coeff.size();i++){
			if(this.getcoeff(i)!=0)
			{System.out.print(this.getcoeff(i)+"x"+"^"+i+"+");
			}}
		System.out.println();
	}
	
	
	public void addp(dynamicpoly p){
	dynamicpoly p3=new dynamicpoly();
		for(int i=0;i<=(int)Math.max(this.degree(),p.degree());i++){
			p3.setcoeff(this.getcoeff(i)+p.getcoeff(i), i);
		}	
	p3.print();
	}
}
