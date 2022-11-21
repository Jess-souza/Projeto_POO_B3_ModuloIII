### Melhorando o sistema dos Correios :octocat: :heavy_check_mark:

**Você foi contratado pelos Correios, para atuar na área de desenvolvimento de Software.**
Eles querem que você melhore dois pontos na arquitetura e na escrita dos códigos atuais.

Antes de realizar a implementação no projeto já existente, o Líder técnico pediu para você criar e entregar
uma POC (Prova de Conceito), contendo uma demonstração do seu código (ele quer ver sua proposta para cada um
dos dois pontos).

O primeiro ponto de melhoria é na camada de persistência.
Atualmente eles trabalham com uma classe Repository para cada entidade da aplicação (ProdutoRepository,
PostagemRepository, CarteiroRepository, EntregaRepository, etc).
Isso tem se tornado verboso para o time e pouco produtivo. Eles querem uma vida fácil,
escrever pouco e ganhar produtividade...

Esperam que você proporcione isso à eles!

Sua primeira etapa será criar uma classe de Repository.

Essa classe deve ser genérica de modo que os métodos a seguir possam ser usados por qualquer entidade,
para salvar, alterar, buscar e deletar.

O Segundo ponto é o mecanismo de calculo do modo de entrega.
Para Entregas Comuns (de até 15 dias), é cobrado a taxa de 5 reais, para todo o Brasil.

Para Entregas Sedex 12 (12 horas do dia seguinte), é cobrado a taxa de 20 reais, para todo o Brasil.

Para Entregas Sedex Hoje (mesmo dia), é cobrado a taxa de 25 reais, para todo o Brasil.

Atualmente existe uma classe que gerencia esses cálculos em um único método, com alguns if's.

Eles acham que isso no futuro pode gerar problemas, pois hoje todas essas regras estão em uma única classe,
dificultando a manutenção.

Então pediram a você que aplique algum principio à esse código que gere desacoplamento e extensibilidade.
