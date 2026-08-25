<!-- l10n-sync: source-file="README.md" -->

<div align="center">

# 🎱 Soc Ops

**Social Bingo para encontros presenciais — construído ao vivo com agentes do GitHub Copilot.**

Encontre cinco pessoas que correspondam às perguntas. Faça 5 em linha. Quebre o gelo. 🎉

[![Demo ao Vivo](https://img.shields.io/badge/▶%20Demo%20ao%20Vivo-Jogar%20Agora-4c9aff?style=for-the-badge)](https://copilot-dev-days.github.io/agent-lab-java/)
[![Guia do Lab](https://img.shields.io/badge/📚%20Guia%20do%20Lab-Ler%20Agora-22c55e?style=for-the-badge)](workshop/pt_BR/GUIDE.md)

</div>

---

## O que é isso?

**Soc Ops** é um jogo de Social Bingo 5×5 no navegador — e o projeto que você vai transformar durante o lab. Cada célula do tabuleiro é uma pergunta quebra-gelo. Encontre alguém que corresponda, vire a célula e corra em direção ao Bingo.

A mágica de verdade está em como ele é construído: todo redesign de UI, novo modo de jogo e tema de quiz personalizado é criado ao vivo usando **agentes do GitHub Copilot** trabalhando em paralelo.

---

## 🚀 Visão Geral do Lab

Quatro partes práticas, ~60 minutos no total:

| Parte | Título | O que você vai fazer |
|-------|--------|----------------------|
| [**00**](workshop/pt_BR/00-overview.md) | Visão Geral & Lista Rápida | Confirmar pré-requisitos, entender o projeto |
| [**01**](workshop/pt_BR/01-setup.md) | Configuração & Engenharia de Contexto | Gerar instruções de workspace, preparar o Copilot com contexto |
| [**02**](workshop/pt_BR/02-design.md) | Frontend Design-First | Redesign completo da UI usando o Modo de Plano do Copilot |
| [**03**](workshop/pt_BR/03-quiz-master.md) | Quiz Master Personalizado | Gerar um quiz temático com um agente customizado |
| [**04**](workshop/pt_BR/04-multi-agent.md) | Desenvolvimento Multi-Agente | Entregar novas funcionalidades com agentes TDD + Pixel Jam |

> 📝 Os guias também estão disponíveis na pasta [`workshop/pt_BR/`](workshop/pt_BR/) para leitura offline.

---

## ⚡ Início Rápido

**Pré-requisitos:** [Java 21 JDK](https://adoptium.net/) · [Maven 3.9+](https://maven.apache.org/) · VS Code v1.107+ · GitHub Copilot (Pro / Business / Enterprise)

```bash
# Clone sua cópia deste template e então:
cd socops
./mvnw spring-boot:run
# → Acesse http://localhost:8080
```

<details>
<summary>Build & testes</summary>

```bash
# Build
cd socops && ./mvnw clean package

# Testes
cd socops && ./mvnw test
```

</details>

Pushes para `main` fazem deploy automático no GitHub Pages.

---

## 🎭 Como ficará seu tabuleiro?

Cada participante termina o lab com um **redesign único** — tema diferente, perguntas diferentes, estilo diferente. Algumas direções anteriores:

`Terminal Retrô` · `Neon Cyberpunk` · `Pôr do Sol Vaporwave` · `Arcade Pixel` · `Blocos Brutalistas` · `Pastel Suave` · `Vidro com Gradiente` · `Dark Mode Noir`

---

<div align="center">

Feito com ☕ Java, 🌿 Spring Boot e um pouco de ajuda do 🤖 Copilot.

</div>
