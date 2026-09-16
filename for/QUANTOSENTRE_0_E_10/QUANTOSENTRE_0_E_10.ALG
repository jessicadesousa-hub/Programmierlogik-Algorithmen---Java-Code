ALGORITMO: "QuantosEntre_0_e_10"

DESCRIÇÃO: Calcula a soma dos valores inseridos presentes no intervalo de 0 a 10 e também apresenta a soma dos valores pares. for
-------------------------------------------------------

var
    C, V, Tot010, SImp: inteiro
inicio
Tot010 <- 0
SImp <- 0
Para C <- 1 ate 6 faca
     escreval("Digite um valor: ")
     Leia(V)
            se (V >= 0) e (V <= 10) entao
            Tot010 <- (Tot010 + 1)
            se (V % 2 = 1) entao
            SImp <- (SImp + V)

            fimse

            fimse
Fimpara


            
escreval("Ao todo foram " ,Tot010 , " valores entre 0 e 10.")
escreval("E a soma dos numeros impares foi de ", SImp)
fimalgoritmo