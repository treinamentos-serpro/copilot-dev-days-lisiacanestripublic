# Copilot Instructions

## Design Guide

This project is a social bingo game for in-person mixers. The design should feel joyful, energetic, and distinctly human, not generic or template-like.

### Core visual direction
- Prefer a strong atmospheric theme: dark, immersive backgrounds with layered gradients and soft glow effects.
- Use a premium “event-night” aesthetic: neon accents, glassy panels, and expressive contrast.
- Keep the UI playful but polished—this is a social interaction game, not a sterile dashboard.
- Avoid boring default styling: no flat white-card layouts, no generic sans-serif-only treatment, and no overused purple/blue gradients stripped of character.

### Typography
- Use distinctive type choices that feel intentional.
- Favor expressive display fonts for headlines and more compact utility fonts for labels.
- Good options for this app include bold geometric display faces with strong tracking and modern rhythm.
- Keep titles large, confident, and high-contrast against dark surfaces.

### Color system
- Base palette should be dark and atmospheric: near-black, deep blue, midnight purple, and charcoal.
- Use one dominant accent and one secondary accent to create energy and hierarchy.
- Example palette:
  - deep background: #090b17
  - panel: rgba(15, 23, 42, 0.8)
  - primary accent: #7c7cff
  - secondary accent: #4fd1ff
  - warm highlight: #ff7ec7
  - success tone: #7cf2c2
- Keep text readable with high contrast; selected tiles and win states should be unmistakable.

### Layout and composition
- Treat the lobby as an invitation to a social event, not a plain “start screen.”
- Use strong hierarchy: headline, short subtitle, feature chips, and clear call to action.
- For the board, keep the 5x5 structure compact and tactile. The tiles should feel interactive and playful while staying readable.
- Use generous spacing, rounded surfaces, and subtle shadow depth to create a premium feel.

### Motion and interaction
- Use motion sparingly but effectively.
- A single high-impact entrance animation or celebration pulse is better than many random micro-effects.
- Selected tiles should feel rewarding; winning cells should visibly stand out without looking chaotic.
- Buttons should have clear hover/press feedback, but remain lightweight and performant.

### Accessibility and quality bar
- Maintain strong contrast for text, buttons, selected tiles, and bingo states.
- Preserve the game rules and board contract: 5x5 grid, center free cell, winner detection logic, and localStorage behavior.
- Do not change the backend game rules or the frontend state model just to chase a visual effect.

### Implementation notes
- Prefer CSS utility classes and the existing structure in [socops/src/main/resources/static/css/app.css](socops/src/main/resources/static/css/app.css).
- Keep the app design cleanly layered in the Thymeleaf template at [socops/src/main/resources/templates/game.html](socops/src/main/resources/templates/game.html).
- Prioritize the “distinctive but deliberate” look: creative, polished, and intentionally designed for a mixer experience.

### What to avoid
- Generic AI-looking layouts
- Overused system fonts or default browser styling
- Low-contrast text on dark backgrounds
- Excessive visual noise or animations without purpose
- Breaking the game logic, board size, or persistence rules
