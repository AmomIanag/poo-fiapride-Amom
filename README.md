# Projeto FiapRide - [Amom Ianaguivara Brito]

## Informações do Aluno

- **Nome:** [Amom Ianaguivara Brito]
- **RM:** [565718]
- **Turma:** [2CCPH]
- **Curso:** [Ciência da Computação]
- **GitHub:** [@AmomIanag]

---

## Descrição do Projeto

Este projeto é o resultado do aprendizado nas aulas 1-9 de Progra
mação Orientada a Objetos, onde desenvolvemos o sistema **FiapRid
e** (aplicativo de mobilidade urbana).

---

# Checklist de Implementação

- [x] Aula 1 - Classes e Objetos
- [x] Aula 2 - Métodos
- [x] Aula 3 - Encapsulamento
- [x] Aula 4 - Construtores
- [x] Aula 5 - Associação
- [x] Aula 6 - Herança
- [x] Aula 7 - Polimorfismo
- [x] Aula 8 - Classes Abstratas
- [x] Aula 9 - Interfaces

---

## Perguntas de Reflexão

### Aula 1 - Classes e Objetos

**Pergunta:** "**Pergunta:** Por que precisamos criar uma classe `Passageiro`? Não seria mais fácil apenas criar variáveis soltas no main, como `String nomeAna = "Ana"` e `double saldoAna = 50.0
`?

**Pense:** E se o FiapRide tiver 1 milhão de usuários? Como a Classe ajuda a resolver isso?"

**Sua Resposta:**
[criar uma classe ajuda a dar uma organizada nos dados e representar objetos do mundo real dentro do código. 
Se a gente colocasse apenas variáveis soltas no nosso main, o código ficaria muito bagunçado e difícil de manter,
principalmente com muitos usuarios, com a classe, a gente pode criar vários objetos reutilizando a mesma estrutura, 
em um sistema com muitos muitos usuários, seria impossível controlar tudo manualmente com variáveis separadas, teriamos que ser super humanos.
A classe também deixa adicionar comportamentos e regras específicas para cada objeto, deixando o código mais seguro, organizando bem e podendo reutilizar]

---

### Aula 2 - Métodos

**Pergunta:** "Se nós podemos simplesmente fazer `passageiro.sald
o = passageiro.saldo \+ 100` diretamente no código principal, por 
que dá tanto trabalho criar um método específico chamado `adicion
arSaldo\(valor\)` para fazer isso? Quais seriam os riscos para a 
nossa startup de mobilidade se deixássemos qualquer programador alterar o saldo diretamente?"

**Sua Resposta:**
[Entao, criar métodos específicos protege o sistema contra alterações que podem ser erradas ou perigosas. 
Se qualquer outro programador puder alterar o saldo diretamente, alguém poderia colocar qualquer valor, podendo ser eles negativos, além de esquecer validações ou causar erros financeiros no sistema. 
O método adicionarSaldo() da uma centralizada na lógica e garante que regras de negócio sejam respeitadas (sem valores negativos por exemplo).
Isso deixa o código mais seguro, além de organizado e preparado para manter para o futuro.]

---

### Aula 3 - Encapsulamento

**Pergunta:** "No nosso código, os atributos são `private`, mas o
s métodos `getSaldo\(\)` e `getNome\(\)` são `public`. Por que é 
seguro deixar o `get` público, mas perigoso deixar o atributo ori
ginal público?

Pense bem: Qual a diferença entre dar a alguém uma CÓPIA de um do
cumento seu, e entregar o documento ORIGINAL para a pessoa rasura
r? "

**Sua Resposta:**
[O get permite ver uma informação de forma controlada, sem mudar diretamente o nosso objeto. 
Agora já se deixar o atributo público permite que qualquer parte do sistema altere os dados sem validação.
É como mostrar uma cópia de um documento em vez de entregar o original para alguém editar.
O encapsulamento protege os dados internos da classe e evita estados inválidos no sistema (Acho que essa é uma das partes mais essenciais de qualquer projeto).]

---

### Aula 4 -Construtores

**Pergunta:** "> "Na nossa classe `Veiculo`, nós tomamos duas dec
isões arquitetônicas muito importantes:
>
> 1. Nós **não** criamos o método `setModelo\(\)`.
> 2. O `setPlaca\(\)` foi criado como **privado**, e criamos um m
étodo público chamado `atualizarPlaca\(\)` para acessá-lo.
>
> Pensando no mundo real e no Clean Code: Por que é um erro graví
ssimo clicar em 'Gerar Getters e Setters para tudo' automaticamen
te na sua IDE? Como as nossas duas decisões acima protegem o sist
ema de fraudes e falhas de lógica?"

_Dica: Pense sobre o que pode ou não mudar fisicamente em um carr
o, e a diferença entre "alterar um dado no banco" e "executar um 
processo real no Detran"_"

**Sua Resposta:**
[Gerar getters e setters para tudo automaticamente é perigoso porque temdados que não deveriam ser alterados livremente.
O modelo de um veículo, por exemplo, não muda o carro fisicamente após ele existir.
Já a placa exige um processo real e que precisa ser validado, tipo o que acontece no Detran.
Criar métodos específicos protege o sistema contra fraudes e invasões por exemplo, e também alterações inválidas e erros de lógica, além de deixar o código mais próximo da realidade do negócio.]

---

### Aula 5 - Associação

**Pergunta:** ""No construtor da `Viagem`, nós exigimos o objeto 
inteiro \(`Passageiro solicitante`\). Se o nosso resumo só precis
a imprimir o nome da pessoa, não seria mais fácil e mais leve ped
ir apenas a String do nome no construtor da Viagem \(`String nome
DoPassageiro`\) em vez do objeto todo?"

_Pense nas regras de negócio: O que acontece na hora que a Viagem 
acaba e o sistema precisa descontar o saldo? Se a Viagem tiver apenas a String "Ana Silva", ela consegue mexer no dinheiro dela? 
_"

**Sua Resposta:**
[Usar o objeto inteiro em vez de apenas uma String permite que a viagem tenha acesso a todos os dados e comportamentos do passageiro.
Se a viagem armazenasse apenas o nome, ela não conseguiria alterar saldo, verificar dados ou executar regras de negócio.
A associação entre objetos deixa o sistema mais completo, conectado e preparado para futuras funcionalidades.]

---

### Aula 6 - Herança

**Pergunta:** ""No nosso código, a mãe `Veiculo` possui os atribu
tos `placa` e `modelo` como `private`. Quando o `Carro` herda de 
`Veiculo`, ele recebe esses atributos, mas o código dentro de `Ca
rro` NÃO consegue fazer `this.placa = "ABC"`. Ele é obrigado a us
ar o `super\(\)` ou o `setPlaca\(\)`.

Por que o Java não deixa a filha alterar as variáveis privadas da 
mãe diretamente? Qual o princípio das aulas passadas que isso est
á protegendo?""

**Sua Resposta:**
[O java protege os atributos privados da superclasse para garantir o encapsulamento. 
Por conta disso as subclasses não podem mudar diretamente dados importantes sem passar pelas regras que foram definidas na classe mãe.
Isso evita inconsistências e mantém o controle das informações centralizado.
Esse conceito protege exatamente o conceito de encapsulamento que vimos nas outras aulas.]

---

### Aula 7 - Polimorfismo

**Pergunta:** "No nosso loop `for \(Veiculo veiculo : frota\)`, a 
variável `veiculo` é do tipo genérico `Veiculo`. Se esquecêssemos 
de criar o método `calcularAutonomia\(\)` lá na classe mãe `Veicu
lo`, nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo qu
e ele existe dentro do `Carro` e da `Moto`? Por que o contrato pr
ecisa existir na base da hierarquia?"

**Sua Resposta:**
[A gente nao ia conseguir chamar o método dentro do loop se ele não existisse na classe base. 
O java precisa que o contrato do método exista na superclasse para garantir que todos os objetos da hierarquia tenham aquele comportamento.
Isso faz com que o polimorfismo funcione direitinho, mesmo quando trabalhamos com referências genéricas da classe mãe.]

---

### Aula 8 - Classes Abstratas

**Pergunta:** "Pense no mundo real: Faz sentido existir um objeto 
que é APENAS 'Veículo' sem ser um tipo específico? Você já entrou 
em uma concessionária e comprou "um veículo" genérico, sem ser ca
rro, moto, caminhão ou nada disso?

Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Jav
a que `Veiculo` é `abstract`? Por que ele não deduz isso sozinho?

Pense: Se esquecermos de colocar `abstract`, qual o risco que cor
remos? Alguém pode criar `new Veiculo\(\)` e quebrar a lógica do 
nosso sistema?"

**Sua Resposta:**
[Na vida real não faz muito sentido existir apenas um “Veículo” genérico sem ser um tipo específico.
Por isso usamos classes abstratas para representar conceitos que servem apenas como base para outras classes.
O Java não deduz isso sozinho porque quem ta programadando precisa decidir a arquitetura do sistema.
Se esquecermos de usar abstract, alguém poderia criar um objeto genérico sem sentido, quebrando a lógica da aplicação.]

---

### Aula 9 - Interfaces

**Pergunta:** "Por que Java permite herança simples \(apenas uma 
mãe\), mas múltipla implementação de interfaces \(vários contrato
s\)?

Pense: Se `CarroEletrico` pudesse herdar de `Veiculo` E de `Bater
ia` ao mesmo tempo \(herança múltipla\), o que aconteceria se AMB
AS as mães tivessem um método chamado `ligar\(\)`?

Como as interfaces resolvem esse problema? "

**Sua Resposta:**
[O Java evita herança múltipla porque ela pode causar conflitos entre métodos iguais vindos de classes diferentes.
Isso geraria ambiguidades e dificultaria o funcionamento do sistema.
As interfaces resolvem esse problema porque funcionam apenas como contratos, sem obrigar herança de implementação.
Assim, uma classe pode implementar vários comportamentos diferentes de forma organizada e segura.]

---

## Desafios Técnicos Implementados

### Desafio Pessoal (Seu Projeto)

**Qual foi o domínio que você escolheu para seu projeto pessoal?**
[Escolhi desenvolver um sistema de gatos, representando diferentes tipos de gatos, seus tutores e comportamentos dentro do sistema.]

**Quais classes você criou?**
[Gato, Tutor, GatoPersa, GatoSiames e a interface Brincavel.]

**Qual foi o maior desafio técnico que você enfrentou?**
[O maior desafio técnico foi implementar herança, polimorfismo e interfaces ao mesmo tempo sem quebrar o funcionamento do projeto.
Precisei transformar a classe Gato em abstrata, criar subclasses diferentes e sobrescrever métodos corretamente usando @Override.
Também tive dificuldades para organizar os imports, corrigir erros de implementação da interface e entender como o polimorfismo funcionava dentro de listas e arrays.
Outro problemão foi trabalhar com Git e GitHub em computadores diferentes, porque os pcs que eu uso sexta e que eu usei pra fazer a prova segunda são diferentes.
Durante os commits aconteceram conflitos de merge com vários erros como <<<<<<< HEAD, e eu precisei dar uma pesquisada pra resolver manualmente os conflitos sem perder meu código.
Bom pelo menos isso me ajudou a entender melhor controle de versão, organização de projeto e estrutura de orientação a objetos.]

---

## Conclusão

**O que você aprendeu nestas 9 aulas?**
[Bom foi legal porque foi meu primeiro contato com java, aprendi fundamentos bem legais de programação Orientada a Objetos.
Entendi como criar classes e objetos, encapsular atributos, usar construtores, criar associações entre classes, aplicar herança, polimorfismo, classes abstratas e interfaces.
Também aprendi a importância das regras de negócio para proteger o sistema e deixar o código mais organizado.
Além disso, desenvolvi mais prática com Git e GitHub para versionamento do projeto e resolução de conflitos.]

**Qual conceito foi mais difícil de entender?**
[Basicamente como são os meus primeiros projetos em java eu senti dificuldade em todas as aulas no começo mas eu fui seguindo o material e conteudo na internet 
e assim eu ia fazendo os microdesafios, no começo dos desafios sempre era difícil mas usava materiais para passar.]

**O que você melhoraria no seu projeto se pudesse refazer?**
[Eu melhoraria principalmente a organização geral do código e criaria mais funcionalidades para os gatos, como alimentação, humor e sistema de vacinação.
Também organizaria melhor os commits desde o início para evitar os conflitos, eu costumo fazer bastante commits em terminais, mas eu me confundi usando o eclipse e vou melhorar na próxima.
Outra melhoria seria criar menus interativos e talvez uma interface gráfica para deixar o projeto mais visual e completo, gosto bastante de criar visuais nas aulas de frontend e até python em back, e gostaria de implementar em java também.]
