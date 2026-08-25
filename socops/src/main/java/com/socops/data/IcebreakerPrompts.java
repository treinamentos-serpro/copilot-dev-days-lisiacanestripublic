package com.socops.data;

import java.util.List;

/**
 * Central catalogue of every icebreaker prompt that can appear on a board.
 * Exactly 24 entries — one fewer than the 25-cell grid, because the
 * centre cell is always the free space.
 */
public final class IcebreakerPrompts {

    public static final String FREE_CELL_LABEL = "FREE SPACE";

    public static final List<String> ALL_PROMPTS = List.of(
            "já foi a uma convenção de fandom",
            "tem um personagem favorito de anime",
            "já fez ou viu cosplay ao vivo",
            "coleciona itens de uma série ou filme",
            "já maratonou uma série em um final de semana",
            "joga RPG de mesa ou videogame regularmente",
            "já leu mangá ou graphic novel",
            "conhece letras de música de cabeça de uma trilha de série",
            "tem um livro de fantasia ou ficção científica favorito",
            "já assistiu a um filme dublado e legendado da mesma obra",
            "segue criadores de conteúdo de cultura pop",
            "já participou de um quiz ou trivia de fandom",
            "tem uma playlist temática de série ou jogo",
            "já comprou produto oficial de um fandom",
            "já indicou uma série que virou obsessão de alguém",
            "conhece pelo menos um termo de gíria do fandom",
            "já chorou com o final de uma história",
            "tem favorito entre vilão e herói da mesma obra",
            "já releu ou reassistiu algo mais de uma vez",
            "sonha em visitar um local real de uma obra de ficção",
            "faz parte de uma comunidade ou grupo de fandom",
            "já debateu teoria de enredo com amigos",
            "tem uma música de abertura de série na cabeça agora",
            "já se identificou com um personagem de ficção"
    );

    private IcebreakerPrompts() {
        /* catalogue only — no instances */
    }
}
