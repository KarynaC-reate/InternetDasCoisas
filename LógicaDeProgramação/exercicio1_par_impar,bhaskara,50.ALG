Algoritmo "parouimpar"
Var
   opcao, numero, a, b, c: inteiro
   resultado, x1, x2, delta: real

inicio
   escreval("Escolha uma op��o:")
   escreval("1 - Par ou �mpar")
   escreval("2 - Bhaskara")
   escreval("3 - Contador at� 50 de 5 em 5")
   leia(opcao)

   escolha opcao
      caso 1
         escreval("Digite um n�mero inteiro:")
         leia(numero)
         se (numero mod 2 = 0) entao
            escreval("O n�mero � Par")
         senao
            escreval("O n�mero � �mpar")
         fimse

      caso 2
         escreval("Digite o valor de A:")
         leia(a)
         escreval("Digite o valor de B:")
         leia(b)
         escreval("Digite o valor de C:")
         leia(c)

         delta <- b * b - 4 * a * c

         se (delta < 0) entao
            escreval("N�o existem ra�zes reais!")
         senao
            x1 <- (-b + raizq(delta)) / (2 * a)
            x2 <- (-b - raizq(delta)) / (2 * a)
            escreval("As ra�zes s�o: ", x1, " e ", x2)
         fimse

      caso 3
         escreval("Contando de 5 em 5 at� 50:")
         para numero de 0 ate 50 passo 5 faca
            escreval(numero)
         fimpara

      outrocaso
         escreval("Op��o inv�lida.")
   fimescolha
fimalgoritmo


