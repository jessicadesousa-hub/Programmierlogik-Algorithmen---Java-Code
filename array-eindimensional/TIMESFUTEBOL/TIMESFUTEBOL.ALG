ALGORITMO:"TimesFutebol" 
DESCRIÇÃO: Gera uma Tabela de Jogos para um campeonato com 3 times. Array
-------------------------------------------------------

var
Time: vetor[1..3] de caracter
c, i: inteiro

inicio
escreval("---------------------")
escreval("CAMPEONATO DE FUTEBOL")
escreval("---------------------")
      para i<- 1 ate 3 faca
           escreval("Nome do time:")
           leia(Time[i])
      FimPara
LimpaTela

escreval("------------------")
escreval("TABELA DE PARTIDAS")
escreval("------------------")

      para c <- 1 ate 3 faca
           para i<- 1 ate 3 faca
                se (i <> c) entao
                escreval(Time[i]:15,"[  ]x[  ] ", Time[c]:15)
                Fimse
           Fimpara
      Fimpara
fimalgoritmo