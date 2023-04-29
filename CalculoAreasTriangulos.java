import java.util.Scanner;

//instrução1
//Pergunta ao usuario o 1 Base Maior do triangulo
//instrução2
//Guardar o valor da Base Maior do triangulo
//instrução3
//Pergunta ao usuario a Base Menor do triangulo
//instrução4
//Guarda o valor da altura do triangulo
//instrução5
//Fazer a multiplicação da Base pela Altura
//instrução6
//Fazer a divisao da multiplicação por 2 para obiter a areas 
//instrução7
//Guarda o resula da divisao
//intrução8
//Exibir para o usuario o valor da area do triangulo
//introdução9
//Finalizar o codigo
//...

class CalculoAreaTriangulos {
  
	public static void main(String args[]){  
   
    	Scanner CalculoAreaTriangulos = new Scanner(System.in);
		
		double mult;
		double X ;
		double Y ;
		double Z ;
		
		System.out.printf("Por farvor insira o Lado X do triangulo: \n\n"); 
		X = CalculoAreaTriangulos.nextDouble();
		
		System.out.printf("\nPor farvor insira o Lado Y do triangulo: \n\n"); 
		Y = CalculoAreaTriangulos.nextDouble();
		
		System.out.printf("\nPor farvor insira o Lado Z do triangulo: \n\n"); 
		Z = CalculoAreaTriangulos.nextDouble();
		
		if(X > 0 && Y > 0 && Z > 0)
		{
			//Equilatero 3 lados inguas
			if(X == Y && X == Z)
			{
				System.out.printf("\n\nEquilatero 3 lados iguais\n"); 	
			}
			//Escaleno 3 lados diferente
			if(X != Y && Y != Z && X != Z)
			{
				if(X > Y)
				{
					System.out.printf("\n\nEscaleno 3 lados diferentes e a Hipotenuza e X\n");
				}
				else if(Y > Z)
				{
					System.out.printf("\n\nEscaleno 3 diferentes e a Hipotenuza e Y\n");
				}
				else
				{
					System.out.printf("\n\nEscaleno 3 diferentese a Hipotenuza e Z\n");
				}
			}
				
			//Exociles 2 lados iguais e 1 diferente
			if(X == Y && X != Z || X == Z && X != Y || X != Y && Y == Z )
			{
				if(X > Y)
				{
					System.out.printf("\n\nExociles 2 lados iguais e 1 diferente e a Hipotenuza e X\n");
				}
				else if(Y > Z)
				{
					System.out.printf("\n\nExociles 2 lados iguais e 1 diferente e a Hipotenuza e Y\n");
				}
				else
				{
					System.out.printf("\nExociles 2 lados iguais e 1 diferente e a Hipotenuza e Z\n");
				} 
			}
		}
		else
		{
			System.out.printf("\nOs valores digitados sao menores ou iguais a 0"); 
		}
			
    	System.exit(0);
		
	}

}
