
public class CalculadoraElipse extends Calculadora
{
   private double valor1Base;
   private double valor2Base;
   private double x,y;
  public CalculadoraElipse(){
	  System.out.print(" ********************");
	  System.out.println("*******************");
	  System.out.println("*****************");
	  System.out.print("*******************");
	  System.out.print("***************** *");

  }
   
   public void addValorDe(int v1,int v2, int xx, int yy){
	 if((xx & yy)>0){
	   this.valor1Base=v1;
	   this.valor2Base=v2;
	   this.x=xx;
	   this.y=yy;
	   }
	 
	
   }
   private double valor1Base1Raiz(){
	   return raiz(valor1Base);
   }
   private double valor1Base2Raiz(){
	   return raiz(valor2Base);
   }
   private double raiz(double raiz){
	return   java.lang.Math.sqrt(raiz);
   }
   public double valoresDoFocus(){
	  double c= raiz((double)valor1Base-valor2Base);
	   return c;
	   
   }
   public String vertice1E2(){
	   return "V1("+valor1Base1Raiz()+0+")"+"V2("+"-"+valor1Base1Raiz()+0+")";
   }
   public String vertice3E4(){
	   return "V2("+valor1Base2Raiz()+0+")"+"V3("+"-"+valor1Base2Raiz()+0+")";
   }
   

}
