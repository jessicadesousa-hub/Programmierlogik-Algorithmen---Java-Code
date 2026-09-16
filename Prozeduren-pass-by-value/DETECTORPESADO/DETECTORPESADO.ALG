ALGORITMO: "detectorPesado"
DESCRIÇÃO: Detecta o ítem mais pesado da lista. Procedimento
-------------------------------------------------------

var
I: inteiro
N, Pesado: Caractere
P, Mai: Real
Procedimento Topo()
inicio
LimpaTela
escreval("-------------------------------")
escreval("------Detector de Pesado-------")
escreval("Maior peso até agora", Mai, "Kg")
escreval("-------------------------------")
Fimprocedimento
inicio
Topo()
Para I <- 1 ate 5 faca
     escreva("Digite o nome:")
     Leia(N)
     escreva("Qual o peso de ", N, "?")
     Leia(P)
     se (P>Mai) entao
     Mai <- P
     Pesado <- N
     fimse
Topo()
fimpara
Topo()
escreval("A pessoa mais pesada foi ", Pesado, "com ", Mai, "Kg.")
fimalgoritmo