ALGORITMO: "Crianca Esperanca"
DESCRIÇÃO: Apresenta menu de valores para doacoes. switch/case
-------------------------------------------------------

var
   Doacao, Valor: Inteiro
inicio
escreval("---------------------------")
escreval("----CRIANCA ESPERANCA----")
escreval("---------------------------")
escreval("Muito obrigado por ajudar!")
escreval("[1]Para doar 10 Reais")
escreval("[2]Para doar 25 Reais")
escreval("[3]Para doar 50 Reais")
escreval("[4]Para doar outro valor")
escreval("[5]Para cancelar")
Leia (Doacao)
Escolha Doacao
        caso 1
             Valor <- 10
        caso 2
             valor <- 25
        caso 3
             valor <- 50
        caso 4
             Escreval("Qual o valor da doacao?")
             leia (Valor)
        caso 5
             valor <- 0
             
FimEscolha
Escreval("--------------------")
escreval("Sua doacao foi de R$", Valor)
escreval("Muito obrigado!")
escreval("--------------------")
fimalgoritmo