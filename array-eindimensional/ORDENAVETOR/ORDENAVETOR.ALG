ALGORITMO: "OrdenaVetor"
DESCRIÇÃO: Realiza a ordenação de valores em um vetor, organizando-os em ordem crescente. Nested Loops; Swap
-------------------------------------------------------

var
Vet: vetor[1..4] de inteiro
i,j, aux: inteiro

inicio
      para i<- 1 ate 4 faca
           escreva("Digite um valor:")
           leia (vet[i])
      Fimpara
      
      Para i <- 1 ate 3 faca
           para j <- i+1 ate 4 faca
                Se vet[i] > vet[j] entao
                aux <- vet[i]
                vet[i] <- vet[j]
                vet[j] <- aux
                fimse
           fimpara
      fimpara

para i <- 1 ate 4 faca
escreval("{", vet[i], "}")
fimpara

fimalgoritmo