# language: pt
  @cadastro
  Funcionalidade: Cadastro de usuario
    Eu como usuario
    Quero efetuar um cadastro
    Para realizar compras

  @cadastro_sucesso
  Cenário: Registrar novo usuario com sucesso
    Dado que estou na tela de cadastro do site automation pratice
    Quando preencho nome "Breno Martinez", email "teste@teste.com" e senha "123456"
    E clico no botao Cadastrar
    Então exibe uma mensagem de sucesso

  @cadastro_invalido
  Esquema do Cenario: : Validar cenario: "<cenario>"
    Dado que estou na tela de cadastro do site automation pratice
    Quando preencho nome "<name>", email "<email>" e senha "<password>"
    E clico no botao Cadastrar
    Então exibe a mensagem "<message>" de campo nao preenchido

    Exemplos:
      | cenario              | name            | email            | password            | message                                             |
      | Nome vazio           |                 | teste@teste.com  | 123456              | O campo nome deve ser prenchido                     |
      | E-mail vazio         | Breno Martinez  |                  | 123456              | O campo e-mail deve ser prenchido corretamente      |
      | E-mail invalido      | Breno Martinez  | teste            | 123456              | O campo e-mail deve ser prenchido corretamente      |
      | Senha vazia          | Breno Martinez  | teste@teste.com  |                     | O campo senha deve ter pelo menos 6 dígitos         |
      | Senha invalida       | Breno Martinez  | teste@teste.com  | 123                 | O campo senha deve ter pelo menos 6 dígitos         |

