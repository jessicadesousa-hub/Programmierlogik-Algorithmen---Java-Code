ALGORITMO: "analizador de valores"
DESCRIÇÃO: apresenta a soma e média dos valores, os divisíveis por 5, os nulos, e a soma dos valores pares. for
-------------------------------------------------------
var
C, V, S, Div5, Nul, SP: inteiro
M: real

inicio
S <- 0
div5 <- 0
Nul <- 0
SP <- 0
Para c <- 1 ate 5 faca
escreval("Digite o ", C, ".o numero:")
leia(V)
S <- S + V
se (V % 5 = 0) entao
Div5 <- (Div5 + 1)
fimse
se v=0 entao
Nul <- (Nul + 1)
fimse
se (V % 2 = 0) entao
SP <- (SP + V)
fimse
fimpara
M <- S / (C-1)
 EscrevaL("A soma entre os valores e ", S)
    EscrevaL("A media entre os valores e ", M:5:1)
    EscrevaL("Valores divisiveis por cinco: ", Div5)
    EscrevaL("Valores nulos: ", Nul)
    EscrevaL("A soma dos valores pares e ", SP)

fimalgoritmo