ALGORITMO: "Seletor _de_Pessoas"
DESCRIÇÃO: Contagem de homens com mais de 18 anos e cabelos castanhos e de de mulheres entre 25 e 30 anos após insercao de dados. do/while
-------------------------------------------------------

var
S, R:caracter
I, C, contHomem, ContMulher: inteiro

inicio
contHomem <- 0
contMulher <- 0
repita
LimpaTela
escreval("==================")
escreval("SELETOR DE PESSOAS")
escreval("==================")
escreva("Qual o sexo? [M/F]")
leia(S)
escreva("Qual a idade?")
Leia (I)
escreval("Qual a cor do cabelo?")
escreval("[1] Preto")
escreval("[2] Castanho")
escreval("[3] Loiro")
escreval("[4] Ruivo")
leia(C)

se (S = "M") e (I > 18) e (C = 2) entao
       contHomem <- ContHomem + 1

Fimse

se (S = "F") e (I > 24) e (I < 31) e (C = 3) entao
       contMulher <- ContMulher + 1
Fimse

escreval("Quer continuar? [S/N]")
leia(R)
ate (R = "N")
LimpaTela
escreval("---------------")
escreval("RESULTADO FINAL")
escreval("---------------")
escreval("O total de homens com mais de 18 anos e cabelos castanhos e ", ContHomem)
escreval("O total de mulheres entre 25 e 30 anos e ", contMulher)
fimalgoritmo