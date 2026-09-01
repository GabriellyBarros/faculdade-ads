#include<stdio.h>
#include<stdlib.h>

void Questao01()
{
  //declacação de variáveis do tipo inteiro	
  int a, b, resultado_da_multiplicacao;
  
  printf("Questao 1: Faca um algoritmo que recebe dois valores inteiros e mostre o resultado da multiplicacao.\n");
  printf("\nDigite um valor: ");
  scanf("%d", &a);
  
  printf("\nDigite outro valor: ");
  scanf("%d", &b);
  
 resultado_da_multiplicacao = a * b;
   
 printf("\n valor da multiplicacao = %d\n",resultado_da_multiplicacao);   
 			
}

void Questao02()
{
	//declaracao da variável tipo inteiro
	int numero;

	printf("\nQuestao 2:Fazer um algoritmo que leia um numero e mostre o seu antecessor e o seu sucessor\n");	
	
	printf("\nDigite um numero: ");
	scanf("%d", &numero);
	printf("\nO antecessor de %d eh %d, e seu sucessor eh %d\n",numero, numero - 1, numero + 1);
		
}

void Questao03()
{
   //declacação de variáveis do tipo inteiro	
  int x, y,quociente, resto;
  
  
	
	printf("\nQuestao 3:Fazer um algoritmo que obtenha dois numeros inteiros,  x e y, mostre o quociente e o resto da divisao inteira entre eles\n");
	
	printf("\nDigite o valor do dividendo: ");
	scanf("%d", &x);
	
	printf("\nDigite o valor do divisor: ");
	scanf("%d", &y);
	
	if(y !=0){
		quociente = x /y;
		resto = x % y;
		
		printf("\nQuociente da divisao de %d / %d = %d", x, y, quociente);
		printf("\nResto da divisao= %d\n", resto);
			
	} 
	else{
		printf("\nErro: nao e possivel dividir por zero!\n");
	}
}

void Questao04()
{
	//Declaracao de variáveis 
	float a, b, soma, produto, quociente;
	
	printf("\nQuestao 4 : Fazer um algoritmo que calcule e mostre:");
	printf("\na)A soma entre dois numeros.");
	printf("\nb)O produto entre eles." );
	printf("\nc)O quociente entre eles.\n");
	
	printf("\nDigite o primeiro valor: ");
	scanf("%f", &a);
	
	printf("\nDigite o segundo valor: ");
	scanf("%f", &b);	
	
	//Cálculos
	soma = a + b;
	produto = a * b;
	
	printf("\na)O valor da soma = %.2f\n", soma);
	printf("\nb) O valor do produto = %.2f", produto);
	
	if (b != 0)
	{
		quociente = a / b;	
		printf("\nc) O valor do quociente = %.2f\n", quociente);
	}
	else{
		
		printf("\nc) Nao e possivel calcular o quociente (divisao por zero.\n");
	}
	
}

void Questao05()
{
		float conversao_para_polegadas( float cm);
	
	printf("\nQuestao 5: Fazer um algoritmo que converta centimetros para polegadas (obs.: 1pol = 2.54cm).\n");
 
    float cm, conv;
    printf("\nDigite o valor de centimetros:");
    scanf("%f", &cm);
    
    conv = conversao_para_polegadas(cm);
    
    printf("O valor da conversao de %.2f cm para polegadas e: %.2f\n",cm, conv);	

}
float conversao_para_polegadas(float cm){

	float pol;
	pol = cm / 2.54;
	return pol;		

}

void Questao06()
{	
	printf("\nQuestao 6 : Faca um algoritmo que recebe o valor do raio de um circulo e apresenta o valor da area desse circulo.\n");
	
	float raio = 0;
	float pi = 3.14;
	
	printf("\n Digite o valor do raio:");
	scanf("%f", &raio);
	
	printf("\nA area do circulo e = %0.2f",pi*(raio*raio));	
}

void Questao07()
{
	printf("\nQuestao 7: Fazer um algoritmo que calcule e mostre a area e o volume de um cilindro.(A = 2pr(h + r), V = pr2h)\n");
	
	float raio, altura, A, V;
	float pi = 3.14;
	
	printf("\nDigite o raio:");
	scanf("%f", &raio);
	
	printf("\nDigite a altura:");
	scanf("%f", &altura);
	
	A = 2 * pi * raio *(altura + raio);
	V = pi *(raio*raio)* altura;
	
	printf("\nA area e:%0.2f", A);
	printf("\nO volume e: %0.2f\n", V); 
	
}

void Questao08()
{
	double salario_fixo, total_vendas, salario_final; 
	
	printf("\nQuestao 8: Escreva um algoritmo que recebe o valor do salario fixo\n"); 
    printf(" e o total de vendas efetuadas por um vendedor de uma loja durante o mes (em dinheiro).\n");
	printf("Sabendo que este vendedor ganha 15%% de comissao sobre suas vendas efetuadas,\n");
	printf("informe o salario fixo e salario no final do mes.\n\n");
	
    printf("\nDigite o salario fixo: ");
    scanf("%lf", &salario_fixo);
	
	printf("\nDigite o total de vendas(em dinheiro): ");
	scanf("%lf", &total_vendas);
	
	salario_final = salario_fixo + (total_vendas * 0.15);
	
	printf("\nResultado:\n");
	printf("\nSalario fixo: R$ %lf", salario_fixo);
	printf("\nSalario final mes: R$ %lf\n", salario_final);	
}

void Questao09()
{
	int a, b, c;
	
	printf("\nQuestao 9: Ler dois valores para as variaveis  A e B,\n"); 
	printf(" e efetuar as trocas dos valores de forma que a variavel A passe a possuir o valor da\n");
	printf("variavel B e a variavel  B passe a possuir o valor da variavel  A. Apresentar os valores trocados.\n\n");
	
	printf("\nDigite o primeiro valor:");
	scanf("%d", &a);
	
	printf("\nDigite o segundo valor:");
	scanf("%d", &b);
	
	printf("\nValores lidos: a: %d\tb: %d\n", a, b);
	
	c = a;
	a = b;
	b = c;
	
	printf("Valores trocados: a: %d\tb: %d\n", a, b);
	
}

void Questao10()
{
	printf("\nQuestao 10: Faca um algoritmo que mostra a quantidade de cedulas de um caixa eletronico de\n");
	printf("um banco. O algoritmo recebe como entrada o valor inteiro a ser sacado pelo cliente, em seguida\n");
	printf("apresente a quantidade de cada cedula que o cliente dever a receber,\n");
    printf("de forma que a quantidadede cedulas seja o menor possivel.\n\n");
    
    int valor;
    int valores_notas[] = {100,50,20,10,5,2,1};
    int quant_notas[7] = {0};
    
    printf("Digite o valor a ser sacado:");
    scanf("%d", &valor);
    
    int valor_original = valor;
    
    printf("para o valor R$ %d, voce recebe:\n", valor_original);
    
    for(int i = 0; i<7; i++) {
		if(valor >= valores_notas[i]){
			quant_notas[i] = valor / valores_notas[i];
			valor = valor % valores_notas[i];
			
			printf("%d notas(s) de R$ %d\n", quant_notas[i], valores_notas[i]);	
		}		
	}
	
}

void Questao11()
{
	printf("Faca um algoritmo que auxiliara um funcionario de um caixa de supermercado.\n");
	printf("O algoritmo devera receber como entrada o valor da compra do cliente e o valor pago pelo cliente,\n");
    printf("em seguida o algoritmo devera apresentar o troco da compra, de forma que o mesmo deve\n");
    printf("apresentar a quantidade de cedulas e moedas para compor o troco do cliente.\n\n ");
    
    float valor_compra, valor_pago, troco;
    int valores[]={10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
    
    printf("Digite o valor da compra:\n");
    scanf("%f", &valor_compra);
    
    printf("Valor_pago:");
    scanf(" %f", &valor_pago);
    
    troco = valor_pago - valor_compra;
    
    int centavos = (int)(troco * 100 + 0.5);
    
    if(centavos < 0){
    	printf("Valor insuficiente!\n");
    	return;	
	}
	
	printf("\nValor total do troco: R$ %.2f\n",troco);
	printf("\nTroco detalhado:\n");
	
	for(int i = 0 ; i < 12; i++){
		int quantidade = centavos / valores[i];
		centavos %= valores[i];
		
		if(quantidade > 0){
			printf("%d x R$ %.2f\n", quantidade, valores[i]/100.0);	
		}	
	}	
}
void Questao12()
{
	printf("\nQuestao 12: Fazer um algoritmo que calcule a media aritmetica dos numeros 7, 8 e 9 e a media nos numeros 4, 5 e 6.");
	printf(" \nMostre a soma das duas medias e a media das medias.\n\n");
	
	float media_1 = (7 + 8 + 9) / 3.0;
	float media_2 = (4 + 5 + 6) / 3.0;
	
	float soma = media_1 + media_2;
	
	float media_das_medias =soma / 2.0;
	
	printf("\nA media dos numeros 7, 8 e 9 e: %.2f\n", media_1);
	printf("\nA media dos numeros 4, 5 e 6 e: %.2f\n", media_2);
	printf("\nA soma das duas medias e: %.2f\n", soma);
	printf("\nA media das medias e: %.2f\n", media_das_medias);	
}

void Questao13()
{
	printf("O preco de um automovel e calculado pela soma do preco de fabrica, o preco dos impostos (45%% do preco de fabrica) e a\n");
	printf(" porcentagem do revendedor (28%% do preco de fabrica).Fazer um algoritmo que leia o preco de fabrica.\n");
	printf(" Calcule e mostre o preco final do carro.\n\n");
	
	float preco_de_fabrica, preco_dos_impostos, revendedor, preco_final;
	
	printf("Digite o preco de fabrica do veiculo: \n");
	scanf("%f", &preco_de_fabrica);
	
	preco_dos_impostos = preco_de_fabrica * 0.45;
	revendedor = preco_de_fabrica * 0.28;
	preco_final = preco_de_fabrica + preco_dos_impostos + revendedor;
	
	printf("Detalhamento do preco\n");
	
	printf("Preco de fabrica: R$ %.3f\n", preco_de_fabrica);
	printf("Impostos (45%%): R$ %.3f\n", preco_dos_impostos);
	printf("Revendedor (28%%): R$ %.3f\n", revendedor);
	printf("Preco final: R$ %.3f\n", preco_final);	
}


int main(void)
{
	int opcao; 
    	
    	do{
    	    system("cls");
    		printf("**************************\n");
    		printf(" 1 - Questao01          \n");
    		printf(" 2 - Questao02          \n");
    		printf(" 3 - Questao03          \n");
    		printf(" 4 - Questao04          \n");
    		printf(" 5 - Questao05          \n");
    		printf(" 6 - Questao06          \n");
    		printf(" 7 - Questao07          \n");
    		printf(" 8 - Questao08          \n");
    		printf(" 9 - Questao09          \n");
    		printf(" 10 - Questao10          \n");
    		printf(" 11 - Questao11          \n");
    		printf(" 12 - Questao12          \n");
    		printf(" 13 - Questao13          \n");
  	  	    printf(" 0 - Sair\n");
    		printf("**************************\n");
    		printf("Digite uma opcao: [01-14]:");
    		scanf("%d", &opcao);
		
	    	switch(opcao){
			
			 case 1: Questao01(); break;
			 case 2: Questao02(); break;
			 case 3: Questao03() ; break;
			 case 4: Questao04(); break;
			 case 5: Questao05(); break;
   	         case 6: Questao06(); break;
             case 7: Questao07(); break;
			 case 8: Questao08(); break;
			 case 9: Questao09(); break;
			 case 10: Questao10(); break;
			 case 11: Questao11(); break;
			 case 12: Questao12(); break;
			 case 13: Questao13(); break;
			 printf("Saindo do sistema...\n");  break;
			 printf("Opcao invalida! Tente novamente.");
		
	    	}
		
	    	if(opcao != 0){
		    	printf("\nPressione qualquer tecla para voltar ao menu...");
		    	getchar();
				getchar();	
	      	}
		
		}while(opcao != 0);
		
system("pause");	
return 0;		
}





