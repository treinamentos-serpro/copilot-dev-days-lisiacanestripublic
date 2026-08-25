# AGENTS.md

## Mandatory development checklist

- [ ] **Lint:** run the configured linter. None is currently configured; report this gap rather than inventing a command.
- [ ] **Build:** `cd socops && ./mvnw clean package`
- [ ] **Test:** `cd socops && ./mvnw test`

Complete all applicable items after changes and report any unavailable check.

## Repository map

- `socops/` is a Java 21 / Spring Boot 3.4.2 application. Use the Maven Wrapper from that directory.
- `BoardAssembler` owns pure board rules; `BingoRestController` owns `/` and `GET /api/bingo/fresh-board`.
- Models live under `model/`; prompts live in `data/IcebreakerPrompts.java`.
- `templates/game.html` contains the UI and client-side game logic; `static/css/app.css` contains local CSS utilities.
- Tests are under `socops/src/test/` and currently focus on `BoardAssembler`.

```bash
cd socops && ./mvnw spring-boot:run  # http://localhost:8080
```

## Development rules

- Preserve the 5x5 / 25-cell contract and center index `12` free cell unless rules explicitly change.
- Keep game rules in `BoardAssembler`; `flipCell` must return a new list. Update its focused tests.
- Rule changes require checking both `BoardAssembler.java` and duplicated JavaScript in `game.html`.
- Browser state uses `localStorage` key `socops-bingo-snapshot`; state-shape changes need migration or reset handling.
- Avoid generated `socops/target/` files and unnecessary npm/Tailwind tooling. Follow [CSS](.github/instructions/css-utilities.instructions.md) and [frontend](.github/instructions/frontend-design.instructions.md) guidance.
- The deploy workflow publishes `docs/` to GitHub Pages, not the Spring Boot server.
- Use the [TDD](.github/agents/tdd.agent.md), [Pixel Jam](.github/agents/pixel-jam.agent.md), [UI Review](.github/agents/ui-review.agent.md), and [Quiz Master](.github/agents/quiz-master.agent.md) workflows when applicable.

## Design guide

Use the app as a bold social mixer experience: the interface should feel high-energy, graphic, and unmistakably designed rather than generic or template-like.

- Visual direction: Bold Constructivist. Strong geometry, rigid compositions, oversized typography, layered shadows, and printed-poster energy.
- Palette: paper-like warm neutrals with punchy accent blocks in red, yellow, blue, cyan, and green. Keep contrast high and shapes crisp.
- Typography: oversized, heavy, expressive headlines with strong industrial rhythm. Use condensed or display-like fonts to emphasize the poster aesthetic.
- Layout: the lobby should feel like an event poster or campaign board; the board should remain clear, playable, and readable while showing a graphic identity.
- Interaction: buttons and tiles should feel tactile and structural. Use visible borders, offset shadows, and deliberate motion instead of glassy softness.
- Accessibility: preserve high contrast and clear text legibility even in the more graphic treatment. The board must remain easy to scan and the game state must be obvious.
- Rule safety: do not sacrifice the 5x5 board contract, free center tile, or persistence model for style. Visual language should enhance gameplay, not hide it.
- Implementation: keep styling layered in `game.html` and `app.css`, and avoid introducing frontend frameworks or new dependencies for visual changes.

## Further reading

[README](README.md) | [README PT-BR](README.pt_BR.md) | [Workshop guide](workshop/GUIDE.md) | [Workshop PT-BR](workshop/pt_BR/GUIDE.md) | [Setup](workshop/01-setup.md) | [Design](workshop/02-design.md) | [Quiz](workshop/03-quiz-master.md) | [Multi-agent](workshop/04-multi-agent.md)
