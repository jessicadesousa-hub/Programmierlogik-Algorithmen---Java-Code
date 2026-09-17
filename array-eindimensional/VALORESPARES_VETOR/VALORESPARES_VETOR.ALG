ALGORITMO: "ValoresPares_Vetor"
DESCRIÇÃO: Detecta o total de valores pares e suas respectivas posicoes no array.
-------------------------------------------------------


var
   val: vetor[1..7] de inteiro
   i, TotPar: inteiro
inicio
    TotPar <- 0
    Para i <- 1 ate 4 faca
         escreval("Digite o ", i, "o. valor: ")
         Leia (Val[i])
    FimPara
    
    Para i <- 1 ate 4 faca
         se (val[i] % 2 = 0) entao
         TotPar <- TotPar + 1
         Escreval("Valor PAR na posicao ", i)
         FimSe
    FimPara

Escreval("O total de pares foi: ", TotPar)
         

fimalgoritmo