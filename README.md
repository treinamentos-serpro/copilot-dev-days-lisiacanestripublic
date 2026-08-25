🌐 [Português (BR)](README.pt_BR.md) | [Español](README.es.md)

<div align="center">

# 🎱 Soc Ops

**Social Bingo for in-person mixers — built live with GitHub Copilot agents.**

Find five people who match the prompts. Get 5 in a row. Break the ice. 🎉

[![Live Demo](https://img.shields.io/badge/▶%20Live%20Demo-Play%20Now-4c9aff?style=for-the-badge)](https://copilot-dev-days.github.io/agent-lab-java/)
[![Lab Guide](https://img.shields.io/badge/📚%20Lab%20Guide-Read%20Now-22c55e?style=for-the-badge)](workshop/GUIDE.md)

</div>

---

## What is this?

**Soc Ops** is a browser-based 5×5 Social Bingo game — and the codebase you'll reshape during the lab. Each cell on the board is an icebreaker prompt. Find someone who matches, flip the cell, and race toward a Bingo.

The real magic is how it gets built: every UI redesign, new game mode, and custom quiz theme is created live using **GitHub Copilot agents** working in parallel.

---

## 🚀 Lab Overview

Four hands-on parts, ~60 minutes total:

| Part | Title | What you'll do |
|------|-------|----------------|
| [**00**](workshop/00-overview.md) | Overview & Checklist | Confirm prereqs, understand the project |
| [**01**](workshop/01-setup.md) | Setup & Context Engineering | Generate workspace instructions, prime Copilot with context |
| [**02**](workshop/02-design.md) | Design-First Frontend | Full UI redesign using Copilot's Plan Mode |
| [**03**](workshop/03-quiz-master.md) | Custom Quiz Master | Generate a themed quiz with a custom agent |
| [**04**](workshop/04-multi-agent.md) | Multi-Agent Development | Ship new features with TDD + Pixel Jam agents |

> 📝 Guides are also available in the [`workshop/`](workshop/) folder for offline reading.

---

## ⚡ Quick Start

**Prerequisites:** [Java 21 JDK](https://adoptium.net/) · [Maven 3.9+](https://maven.apache.org/) · VS Code v1.107+ · GitHub Copilot (Pro / Business / Enterprise)

```bash
# Clone your copy of this template, then:
cd socops
./mvnw spring-boot:run
# → Open http://localhost:8080
```

<details>
<summary>Build & test</summary>

```bash
# Build
cd socops && ./mvnw clean package

# Test
cd socops && ./mvnw test
```

</details>

Pushes to `main` deploy automatically to GitHub Pages.

---

## 🎭 What will your board look like?

Every participant ends the lab with a **unique redesign** — different theme, different prompts, different vibe. Some past directions:

`Retro Terminal` · `Cyberpunk Neon` · `Vaporwave Sunset` · `Pixel Arcade` · `Brutalist Blocks` · `Soft Pastel` · `Gradient Glass` · `Dark Mode Noir`

---

<div align="center">

Made with ☕ Java, 🌿 Spring Boot, and a little help from 🤖 Copilot.

</div>
