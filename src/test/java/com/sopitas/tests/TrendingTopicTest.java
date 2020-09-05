package com.sopitas.tests;

import org.junit.Test;

public class TrendingTopicTest extends ParentTest {

    @Test
    public void testTrendingTopic() {
        home.navegarPagina("https://www.sopitas.com");
        home.verificarCargaPagina();
        home.verificarTrendingTopics();
    }

    @Test
    public void buscarArticulo() {

    }

    @Test
    public void verificarNoticiasAlternas() {

    }
}
