Algoritmo "bháskara"

Var
  delta,x1, x2: real
  
Funcao Bhas(a,b,c: real): real
Inicio
   Retorne a,b,c
Fimfuncao

Inicio
  escreval("Digite o valor de A:")
  leia(a)
  escreval("Digite o valor de B:")
  leia(b)
  escreval("Digite o valor de C:")
  leia(c)

delta <- b * b - 4 * a * c

se (delta < 0) entao
  escreval("Nao existem raizes reais!")
senao
  x1 <- (-b + raizq(delta)) / (2 * a)
  x2 <- (-b - raizq(delta)) / (2 * a)
  escreval("As raizes sao: ", x1, " e ", x2)
fimse
  
Fimalgoritmo

