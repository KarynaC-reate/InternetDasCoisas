algoritmo "EscalaDireita"
var
    i, espacos, asteriscos: inteiro
    linha: caractere
inicio
    para i de 1 ate 5 faca
        linha := ""
        para espacos de 1 ate 5 - i faca
            linha := linha + " "
        fimpara
        
        para asteriscos de 1 ate i faca
            linha := linha + "*"
        fimpara
        
        escreval(linha)
    fimpara
Fimalgoritmo