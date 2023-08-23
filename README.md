# MeuPrimeiroAppDio

Este repositório constitui o resultado do primeiro projeto desafiador do Santander Bootcamp 2023 - Mobile Android com Kotlin. O objetivo desse desafio é desenvolver um aplicativo com suporte a diversos idiomas, de forma a se adaptar automaticamente ao idioma do sistema. A fim de testar essa funcionalidade, foram incorporadas ImageButton que possibilitam a troca de idioma diretamente dentro do próprio aplicativo.

## Função setLocale

A função `setLocale` é responsável por alterar o idioma do aplicativo com base no idioma selecionado pelo usuário. Ela segue os seguintes passos:

1. Cria um objeto `Locale` com base no idioma selecionado.
2. Cria uma cópia das configurações atuais do sistema.
3. Define o novo `Locale` na configuração criada.
4. Atualiza as configurações globais de recursos do aplicativo.
5. Força a reinicialização da atividade para aplicar as alterações.

## Variáveis das Bandeiras

Dentro da `MainActivity`, são criadas variáveis para armazenar as imagens das bandeiras dos idiomas suportados. Essas variáveis são associadas às IDs das `ImageButton` definidas no layout.

## Comportamento dos Botões

Cada botão de bandeira é associado a uma ação específica ao ser clicado:

- Ao clicar no botão da bandeira inglesa, a função `setLocale` é chamada com o argumento `"en"` (inglês).
- Ao clicar no botão da bandeira portuguesa, a função `setLocale` é chamada com o argumento `"pt"` (português).
- Ao clicar no botão da bandeira espanhola, a função `setLocale` é chamada com o argumento `"es"` (espanhol).

Isso resulta na troca de idioma do aplicativo.