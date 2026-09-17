ALGORITMO: "Contador_Inteligente"

DESCRIÇÃO: Faz uma contagem progressiva ou regressiva com base nos dados inseridos. if/else
-------------------------------------------------------
algoritmo "Contador_Inteligente"
var
cont, I, F: inteiro

inicio

escreval("Inicio: ")
leia(I)
Escreval("Fim:")
leia(F)
escreval("----------------")
escreval("----CONTANDO----")
escreval("----------------")
     Se (F > I) entao
     cont <- I
          enquanto (cont <= F) faca
          escreva(cont, ",")
          cont <- cont +1
          fimenquanto
     senao
           cont <- I
           enquanto cont >= F faca
           escreva (cont, ",")
           cont <- cont - 1
           fimenquanto
     fimse

fimalgoritmo