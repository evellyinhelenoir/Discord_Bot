package br.com.zup.Comandos;

import br.com.zup.Central.Bot1;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Leitura extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(Bot1.prefix + "leituras")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Leituras Sugeridas 📚");
            info.setDescription("Segue abaixo a lista de comandos para exibição dos materiais de leitura.\n" +
                    "\n" +
                    "-leitura_nocoes | Noções Básicas do computador | Data: 17/08\n" +
                    "-leitura_logica | Lógica Propositiva e Algoritmos | Data: 18/08\n" +
                    "-leitura_git | GIT e Github | Data: 19/08\n" +
                    "-leitura_jdk | JDK | Data: 24/08\n" +
                    "-leitura_java | Java Básico | Data: 26/09\n" +
                    "-leitura_decisao| Estrutaras de Decisão | Data: 26/08\n" +
                    "-leitura_repeticao | Estruturas de Repeticação | Data: 30/08\n" +
                    "-leitura_revisao_modulo2 | Revisão Módulo 2 | Data: 30/08 & 01/09\n" +
                    "-leitura_workflow | Git Workflow | Data: 14/09\n" +
                    "-leitura_paradigma | Apresentação do Paradigma | Data: 17/09\n" +
                    "-leitura_orientacao | Orientação a Objetos | Data: 20/09\n" +
                    "-leitura_encapsulamento | Encapsulamento | Data: 21/09\n" +
                    "-leitura_playlist | Playlist Java e Orientação | Data: 23/09\n" +
                    "-leitura_compxheranca | Composição x Herança | Data: 24/09\n" +
                    "\n" +
                    "**OBS: Os conteúdos de leituras sugeridas estão organizados de mais antigo para mais recente.**");




            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }else if (args[0].equalsIgnoreCase(Bot1.prefix + "leitura_nocoes")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Noções Básicas do computador");
            info.setDescription("Módulo 01 | Data: 17/08\n" +
                    "\n" +
                    "Documentação do CMD: https://docs.microsoft.com/pt-br/windows-server/administration/windows-commands/cmd\n" +
                    "\n" +
                    "HD x SSD: https://olhardigital.com.br/2018/05/22/dicas-e-tutoriais/hd-x-ssd-as-diferencas-e-vantagens-de-cada-tecnologia/\n" +
                    "\n" +
                    "Kernel Linux: https://www.redhat.com/pt-br/topics/linux/what-is-the-linux-kernel\n" +
                    "\n" +
                    "CMD Comands: https://www.thomas-krenn.com/en/wiki/Cmd_commands_under_Windows");


            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }else if (args[0].equalsIgnoreCase(Bot1.prefix + "leitura_logica")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Lógica Propositiva e Algoritmos");
            info.setDescription("Módulo 01 | Data: 18/08\n" +
                    "\n" +
                    "Tabela Verdade: https://segredosdeconcurso.com.br/tabela-de-verdade/\n" +
                    "\n" +
                    "Material em vídeo - Lógica de programação:\n" +
                    "\n" +
                    "https://www.youtube.com/watch?v=Ds1n6aHchRU&list=PLInBAd9OZCzxxk0VvMGrq7l-ZMu5lOSwC&index=2");


            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }else if (args[0].equalsIgnoreCase(Bot1.prefix + "leitura_git")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("GIT e Github");
            info.setDescription("Módulo 1 | Data: 19/08" +
                    "Documentação do GIT: \n" +
                    "https://git-scm.com/docs/git/pt_BR\n" +
                    "\n" +
                    "O que são \"commits\"? \n" +
                    "https://blog.geekhunter.com.br/o-que-e-commit-e-como-usar-commits-semanticos/#Vantagens_de_se_usar_Commits_Semanticos\n" +
                    "\n" +
                    "Material em vídeo - Git/github: \n" +
                    "https://www.youtube.com/watch?v=xEKo29OWILE&list=PLHz_AreHm4dm7ZULPAmadvNhH6vk9oNZA");


            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }else if (args[0].equalsIgnoreCase(Bot1.prefix + "leitura_jdk")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("JDK");
            info.setDescription("Módulo 02 | Data: 24/08\n" +
                    "\n" +
                    "Neste link, é abordado em formato de artigo algumas informações fundamentais sobre o java, como a JVM, JRE e JDK.\n" +
                    "https://www.caelum.com.br/apostila-java-orientacao-objetos/o-que-e-java#java\n" +
                    "\n" +
                    "Material de leitura sugerida:\n" +
                    "\n" +
                    "Trabalhando com tipos primitivos e variáveis em Java: \n" +
                    "https://www.devmedia.com.br/tipos-primitivos-e-variaveis-em-java/3149\n" +
                    "\n" +
                    "Entrada de Dados - Classe Scanner:\n" +
                    "https://www.devmedia.com.br/entrada-de-dados-classe-scanner/21366");


            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }else if (args[0].equalsIgnoreCase(Bot1.prefix + "leitura_java")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Java Básico");
            info.setDescription("Módulo 2 | Data: 26/09\n" +
                    "\n" +
                    "Livro de java orientado a objetos:\n" +
                    "\n" +
                    "https://www.casadocodigo.com.br/products/livro-orientacao-objetos-java\n" +
                    "\n" +
                    "Java Documentation: \n" +
                    "\n" +
                    "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/index.html\n" +
                    "\n" +
                    "Material em vídeo (Java básico): \n" +
                    "\n" +
                    "https://www.youtube.com/watch?v=sTX0UEplF54&list=PLJH2yd19u4hzRtpzm2dDCWZx58UrE85ye");


            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }else if (args[0].equalsIgnoreCase(Bot1.prefix + "leitura_decisao")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Estruturas de Decisões");
            info.setDescription("Módulo 2 | Data: 26/08\n" +
                    "\n" +
                    "Segue algumas referências de leitura sugerida sobre estruturas de decisão:\n" +
                    "\n" +
                    "Condições no Java: https://www.w3schools.com/java/java_conditions.asp\n" +
                    "JAVA - Estruturas de decisão : https://tableless.com.br/java-estruturas-de-decisao/");


            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }else if (args[0].equalsIgnoreCase(Bot1.prefix + "leitura_repeticao")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Estruturas de Repeticação");
            info.setDescription("Módulo 2 | Data: 30/08\n" +
                    "\n" +
                    "Estrutura de repetição (Java):\n" +
                    "\n" +
                    "Leitura 1: https://tableless.com.br/java-estruturas-de-repeticao/\n" +
                    "Leitura 2: https://digitalinnovation.one/artigos/estruturas-de-repeticao-no-java");


            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }else if (args[0].equalsIgnoreCase(Bot1.prefix + "leitura_revisao_modulo2")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Revisão Módulo 2");
            info.setDescription("Módulo 2 | Data: 30/08 & 01/09\n" +
                    "\n" +
                    "Java Collections: \n" +
                    "https://www.devmedia.com.br/java-collections-set-list-e-iterator/29637\n" +
                    "\n" +
                    "Class ArrayList: \n" +
                    "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html\n" +
                    "https://www.devmedia.com.br/explorando-a-classe-arraylist-no-java/24298\n" +
                    "https://www.w3schools.com/java/java_arraylist.asp\n" +
                    "\n" +
                    "Class HashMap<K,V>: \n" +
                    "\n" +
                    "https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html\n" +
                    "https://www.w3schools.com/java/java_hashmap.asp");


            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }else if (args[0].equalsIgnoreCase(Bot1.prefix + "leitura_workflow")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Git Workflow");
            info.setDescription("Módulo 3 | Data: 14/09\n" +
                    "\n" +
                    "Git Branch Documentation:\n" +
                    "https://git-scm.com/docs/git-branch\n" +
                    "\n" +
                    "Git Checkout Documentation:\n" +
                    "https://git-scm.com/docs/git-checkout");


            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }else if (args[0].equalsIgnoreCase(Bot1.prefix + "leitura_paradigma")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Apresentação Paradigma");
            info.setDescription("Módulo 3 | Data: 17/09\n" +
                    "\n" +
                    "Repositório remoto com exemplos desta aula: https://github.com/andrelvicent/M-dulo-3---Introdu-o.git");


            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }else if (args[0].equalsIgnoreCase(Bot1.prefix + "leitura_orientacao")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Orientação a Objetos");
            info.setDescription("Módulo 3 | Data: 20/09\n" +
                    "\n" +
                    "Construtores: \n" +
                    "https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html\n" +
                    "\n" +
                    "Java Methods: \n" +
                    "https://www.devmedia.com.br/trabalhando-com-metodos-em-java/25917\n" +
                    "\n" +
                    "Classes, objetos, métodos e atributos:\n" +
                    "https://sites.google.com/site/anhangueraniteroipoo/aulas/aula-1---orientacao-a-objetos");


            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }else if (args[0].equalsIgnoreCase(Bot1.prefix + "leitura_encapsulamento")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Encapsulamento");
            info.setDescription("Módulo 3 | Data: 21/09\n" +
                    "\n" +
                    "Controlling Access to Members of a Class:\n" +
                    "https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html\n" +
                    "\n" +
                    "Java Encapsulation:\n" +
                    "https://www.w3schools.com/java/java_encapsulation.asp");


            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }else if (args[0].equalsIgnoreCase(Bot1.prefix + "leitura_playlist")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Playlist - Java e a Orientação a objetos");
            info.setDescription("Módulo 3 | Data: 23/09\n" +
                    "\n" +
                    "https://www.youtube.com/watch?v=KlIL63MeyMY&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY");


            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }else if (args[0].equalsIgnoreCase(Bot1.prefix + "leitura_compxheranca")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Composição x Herança");
            info.setDescription("Módulo 3 | Data: 24/09\n" +
                    "\n" +
                    "https://www.devmedia.com.br/heranca-versus-composicao-qual-utilizar/26145");


            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }
    }
}
