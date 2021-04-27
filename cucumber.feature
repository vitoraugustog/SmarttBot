# language: pt

Funcionalidade: Teste de Login

Como um usuário
Gostaria de fazer login
na página web

Cenário: Deve logar na pagina
Dado que estou acessando a página web
Quando informo o usuário "vitorqa"
E a senha "Teste123"
E seleciono entrar
Então visualizo a página inicial

Funcionalidade: Criação de um bot

Como um usuário
crio um bot

Cenário: Após logado na página web
Dado que estou acessando a página web
Então clico em criar robô
E seleciono "Price Action"
E seleciono "Modo Simulado"
E coloco o nome para o bot "Heitor Villa-Lobos"
Então finalizo a configuração do bot

Funcionalidade: Parametrização do Bot

Como um usuário
após o bot configurado

Cenário: Parametrizar para a ação
Dado que estou acessando a página web
Então começo a parametrizar o bot
E informo o gráfico para "30 MIN"
E deixo os "Candles Abertos"
E em "Critérios de Entrada" altero para "Limite"
E coloco o valor de "5,00" na Spread
E habilito a opção de "Contra a Tendência"
E coloco "Distanciamento da máxima" com o valor de "10,00 na distancia"
E altero o tipo de ordem para "Limite"
E quantidade de saídas "2"
E pontos de saída 1 "150,00"
E pontos de saída 2 "250,00"
E pontos BMF ou BOVESPA "200,00"
E habilito a opção de Stop Móvel
E início "150,00"
E distância "95,00"
Então finalizo a parimetrização

Funcionalidade: Salvar e Iniciar o bot

Após o bot parametrizado
salvamos e damos início 

Cenário: Salvar para executar 
Dado que estou acessando a página web
E o bot já esta parametrizado
Então eu salvo as configurações
E dou play na sua função
Então o projeto esta completo e funcional