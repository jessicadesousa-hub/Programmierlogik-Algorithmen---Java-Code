ALGORITMO:"Fatorial" 
DESCRIÇÃO: Calcula o fatorial de um número escolhido pelo usuário. funcao (Method)
-------------------------------------------------------

var
N, F: Inteiro
Funcao Fatorial(V: inteiro): inteiro
var
C, R: inteiro
inicio
R <- 1
Para c <- 1 ate V faca
R <- R * C
FimPara
Retorne R
FimFuncao
inicio
Escreva("Digite um numero: ")
leia (N)
F <- Fatorial(N)
escreva("O valor de " , N, "! eh ", F)
fimalgoritmo