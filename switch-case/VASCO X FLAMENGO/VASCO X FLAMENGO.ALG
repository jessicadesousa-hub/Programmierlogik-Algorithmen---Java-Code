
ALGORITMO: "Vasco x Flamengo"

DESCRIÇÃO: Calcula a diferenca de gols entre dois times e informa o status da partida. switch/case
-------------------------------------------------------
var
   V, F, D: Inteiro
   Status: caracter

inicio
escreval("Quantos gols fez o Vasco?")
leia (V)
Escreval("Quantos gols fez o Flamengo?")
leia (F)
Se (V > F) entao
         D <- V - F
      senao
         D <- F - V
      FimSe

escreval("A diferenca foi de ", D)
escreva("gols.")
Escolha D
         Caso 0
              EscrevaL(" STATUS: EMPATE ")
         Caso 1, 2, 3
              EscrevaL(" STATUS: PARTIDA NORMAL ")
         Caso 4,5, 6, 7
              EscrevaL(" STATUS: GOLEADA ")
         OutroCaso
              EscrevaL(" STATUS: ALGO INCOMUM. ")
              EscrevaL(" Voce digitou os dados corretos? ")
      FimEscolha
      EscrevaL("-----------------------")
fimalgoritmo
