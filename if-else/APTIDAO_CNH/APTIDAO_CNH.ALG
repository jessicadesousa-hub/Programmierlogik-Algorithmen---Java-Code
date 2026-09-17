ALGORITMO: "AptidaoCNH"
DESCRIÇÃO: Testa maioridade e aptidao para fazer a CNH. if/else
-------------------------------------------------------

var
   Ano, Nasc, Idade: Inteiro

inicio
      Escreva("Em que ano estamos?")
      leia(Ano)
      escreva("Em que ano vc nasceu?")
      leia(Nasc)
      Idade <- Ano - Nasc
            Se (Idade >= 18) entao
            escreval("Voce esta apto a fazer a CNH")
            senao
            escreval("Voce esta inapto a fazer a CNH")
            FimSe

fimalgoritmo