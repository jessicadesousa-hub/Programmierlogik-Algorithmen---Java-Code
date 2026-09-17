ALGORITMO: "Aprovacao"
DESCRIÇÃO: Calcula a média de notas escolares e indica resultado de aprovacao. if/else
-------------------------------------------------------

var
   N1, N2, M: Real

inicio
      escreva("Insira sua primeira nota: ")
      leia(N1)
      escreva("Insira sua segunda nota: ")
      leia (N2)
      M <- (N1 + N2) / 2
      Escreval("A media foi: ",M:4:2)
      se (M >= 7) entao
        escreval("Aluno aprovado!")
      senao
             Se (M <7) e (M >=5) entao
                Escreval("Aluno em recuperacao")
             senao
                escreval("Aluno reprovado")
        FimSe

fimalgoritmo
