<!-- l10n-sync: source-file="README.md" -->

<div align="center">

# 🎱 Soc Ops

**Social Bingo para encuentros presenciales — construido en vivo con agentes de GitHub Copilot.**

Encuentra cinco personas que coincidan con las preguntas. Consigue 5 en línea. Rompe el hielo. 🎉

[![Demo en Vivo](https://img.shields.io/badge/▶%20Demo%20en%20Vivo-Jugar%20Ahora-4c9aff?style=for-the-badge)](https://copilot-dev-days.github.io/agent-lab-java/)
[![Guía del Lab](https://img.shields.io/badge/📚%20Guía%20del%20Lab-Leer%20Ahora-22c55e?style=for-the-badge)](workshop/es/GUIDE.md)

</div>

---

## ¿Qué es esto?

**Soc Ops** es un juego de Social Bingo 5×5 en el navegador — y el proyecto que transformarás durante el lab. Cada celda del tablero es una pregunta para romper el hielo. Encuentra a alguien que coincida, voltea la celda y corre hacia el Bingo.

La verdadera magia está en cómo se construye: cada rediseño de UI, nuevo modo de juego y tema de quiz personalizado se crea en vivo usando **agentes de GitHub Copilot** trabajando en paralelo.

---

## 🚀 Resumen del Lab

Cuatro partes prácticas, ~60 minutos en total:

| Parte | Título | Lo que harás |
|-------|--------|--------------|
| [**00**](workshop/es/00-overview.md) | Descripción General y Lista de Verificación | Confirmar prerrequisitos, entender el proyecto |
| [**01**](workshop/es/01-setup.md) | Configuración e Ingeniería de Contexto | Generar instrucciones de workspace, preparar Copilot con contexto |
| [**02**](workshop/es/02-design.md) | Desarrollo Frontend Orientado al Diseño | Rediseño completo de la UI usando el Modo Plan de Copilot |
| [**03**](workshop/es/03-quiz-master.md) | Quiz Master Personalizado | Generar un quiz temático con un agente personalizado |
| [**04**](workshop/es/04-multi-agent.md) | Desarrollo Multi-Agente | Entregar nuevas funcionalidades con agentes TDD + Pixel Jam |

> 📝 Las guías también están disponibles en la carpeta [`workshop/es/`](workshop/es/) para lectura sin conexión.

---

## ⚡ Inicio Rápido

**Prerrequisitos:** [Java 21 JDK](https://adoptium.net/) · [Maven 3.9+](https://maven.apache.org/) · VS Code v1.107+ · GitHub Copilot (Pro / Business / Enterprise)

```bash
# Clona tu copia de esta plantilla y luego:
cd socops
./mvnw spring-boot:run
# → Abre http://localhost:8080
```

<details>
<summary>Build y pruebas</summary>

```bash
# Build
cd socops && ./mvnw clean package

# Pruebas
cd socops && ./mvnw test
```

</details>

Los pushes a `main` se despliegan automáticamente en GitHub Pages.

---

## 🎭 ¿Cómo quedará tu tablero?

Cada participante termina el lab con un **rediseño único** — diferente tema, diferentes preguntas, diferente estilo. Algunas direcciones anteriores:

`Terminal Retro` · `Neon Cyberpunk` · `Atardecer Vaporwave` · `Arcade Pixel` · `Bloques Brutalistas` · `Pastel Suave` · `Vidrio con Gradiente` · `Dark Mode Noir`

---

<div align="center">

Hecho con ☕ Java, 🌿 Spring Boot y un poco de ayuda del 🤖 Copilot.

</div>
