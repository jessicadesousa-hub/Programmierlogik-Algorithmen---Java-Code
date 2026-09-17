ALGORITMO:"SohC" 
DESCRIÇÃO: Faz uma filtragem de nomes para identificar quem começa com a letra "C". Array
------------------------------------------------------

var
SoC: vetor[1..10] de caracter
Nome: caracter
C, Tot: inteiro

inicio
Tot <- 0
Para C <- 1 ate 10 faca
     escreval("Digite seu nome:")
     Leia(Nome)
     Se (copia(maiusc(Nome), 1, 1) = "C") entao
     Tot <- Tot+1
     SoC[Tot] <- Nome
     Fimse
Fimpara

LimpaTela

escreval("LISTAGEM FINAL")
para C<-1 ate Tot faca
escreval(SoC[c])
fimpara



fimalgoritmo