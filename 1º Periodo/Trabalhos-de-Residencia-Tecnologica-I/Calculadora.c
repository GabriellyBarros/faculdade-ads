#include<stdio.h>
#include<stdlib.h>

int main(){
    int opcao;
    double Num1, Num2, Resultado;

    do
    {
        printf("\n---CALCULADORA---\n");
        printf("\n1.Soma");
        printf("\n2.Subtracao");
        printf("\n3.Multiplicacao");
        printf("\n4.Divisao");
        printf("\n0.Sair");
        printf("\nEscolha uma opcao:\n");
        scanf("%d", &opcao);

        if(opcao >= 1 && opcao <= 4){
            printf("Digite o primeiro numero:");
            scanf("%lf", &Num1);

            printf("Digite o segundo numero:");
            scanf("%lf", &Num2);
        }

        switch (opcao)
        {
        case 1:
            Resultado = Num1 + Num2;
            printf("Resultado: %.2lf\n", Resultado);
            system("pause");
            break;
        case 2:
            Resultado = Num1 - Num2;
            printf("Resultado: %.2lf\n", Resultado);
            system("pause");
            break;
        case 3: 
            Resultado = Num1 * Num2;
            printf("Resultado: %.2lf\n", Resultado);
            system("pause");
            break;
        case 4:
            if(Num2 != 0)  {
                Resultado = Num1 / Num2;
                printf("Resultado: %.2lf\n", Resultado);
            } else {
                printf("Erro: Nao e possivel dividir por zero!\n");
            } 
            system("pause");
            break;
        case 0: 
            printf("Saindo...\n");
            break;        
        default:
            printf("Opcao invalida!\n");
            system("pause");
          
        }
    } while (opcao !=0);
    return 0;
}
