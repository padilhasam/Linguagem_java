public interface IFormaGeometrica{
	public int CalcularArea();
		//Inserir na classe pai (FormaGeometrica) a interface através da palavra implements;
		//As classes que herdam FormaGeometrica ainda serão obrigadas a implementar o CalcularArea();
}
public abstract class FormaGeometrica implements IFormaGeometrica{
	public static int cont = 0;
		FormaGeometrica(){
			cont++;	
		}
}		
public class Retangulo extends FormaGeometrica{
	private int base;
	private int altura;
		Retangulo(int base, int altura){
			super(); 
			this.base = base; //Referenciando Classe extendida.
			this.altura = altura;
		}
		Retangulo(int lado){
			this.(lado, lado); //Encadeando construtor anterior;
		}
			public int CalcularArea(){
				return base*altura;
			}
			public int CalcularPerimetro(){
				return (base+altura)*2;
			}
}
public class Quadrado extends Retangulo{
	private int lado;
		Quadrado(int lado){
			super(lado, lado); //Referenciando classe Pai
		}
}
public class Circulo extends FormaGeometrica{
	private int raio;
	private final double PI = 3.14; // final = constante;
		Circulo(int raio){
			this.raio = raio;
		}
		public int CalcularArea(){
				return PI*(raio*raio);
			}
		public int CalcularPerimetro(){
				return (PI*raio)*2;
		}
}
//Valores dos Objetos
List<FormaGeometrica> lista = new ArrayList <FormaGeometrica>()
	Quadrado q1 = new Quadrado(10);
	Retangulo r1 = new Retangulo(10,10);
	Retangulo r2 = new Retangulo (10);
	Circulo c1 = new Circulo(10);
		lista.add(q1);
		lista.add(r1);
		lista.add(r2);
		lista.add(c1);
	//Foreach
	for(FormaGeometrica f : lista){
		System.out.println(f.CalcularArea()); //Imprime a area de cada item da lista F
	}
	System.out.println(FormaGeometrica.cont);// cont = 4;
	System.out.println(q1.CalcularArea()); // Resultado = 100, pois Quadrado extende Retangulo que tem lado = 10;
	System.out.println(q1.CalcularPerimetro()); //Resultado = 40;
	System.out.println(c1.CalcularArea()); 
	System.out.println(c1.CalcularPerimetro());
	
	Retangulo r3 = new Quadrado(5);
	FormaGeometrica f1 = new Quadrado(20);
	
}