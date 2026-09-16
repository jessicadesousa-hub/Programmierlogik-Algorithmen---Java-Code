ALGORITMO:"ParOuImpar" 
DESCRIÇÃO: Identificador de par ou ímpar com uso de funcao.
-------------------------------------------------------

var
N: Inteiro
R: Caracter
Funcao ParOuImpar (V: Inteiro): Caracter
inicio
Se (V%2=0) entao
Retorne "PAR."
senao
Retorne "IMPAR."
fimse
FimFuncao
inicio
escreva("Digite um numero:")
Leia(N)
R <- ParOuImpar(N)
Escreva("O numero", N, " e um numero ", R)


fimalgoritmo