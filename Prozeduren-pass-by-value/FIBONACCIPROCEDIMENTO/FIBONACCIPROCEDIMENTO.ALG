ALGORITMO: "FibonacciProcedimento"
DESCRIÇÃO: Lista os 10 primeiros números da sequencia Fibonacci. Procedimento com pass-by-reference.
-------------------------------------------------------

var
C, T1, T2, T3: inteiro
Procedimento ProximoFibonacci (var A, B: Inteiro)
var C: Inteiro
inicio
C <- A+B
escreva (C)
A <- B
B <- C
FimProcedimento
inicio
T1 <- 0
escreva(T1)
T2 <- 1
escreva(T2)


Para C <- 3 ate 10 faca
ProximoFibonacci (T1, T2)
FimPara


fimalgoritmo