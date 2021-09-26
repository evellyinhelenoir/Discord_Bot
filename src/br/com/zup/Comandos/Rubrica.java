package br.com.zup.Comandos;

import br.com.zup.Central.Bot1;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Rubrica extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(Bot1.prefix + "rubricas")) {

            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Rubricas Módulo 03  📢");
            info.setDescription("Segue abaixo a lista de comandos para exibição de rubricas.\n" +
                    "\n" +
                    "-rubrica_raciocinio | Raciocínio Estruturado\n" +
                    "-rubrica_estrutura | Estruturas Básicas de Código\n" +
                    "-rubrica_limpeza | Limpeza de Código\n" +
                    "-rubrica_versionamento | Versionamento de Código\n" +
                    "-rubrica_orientacao_obj | Orientação à Objetos\n" +
                    "-rubrica_autodidatismo | Autodidatismo\n" +
                    "-rubrica_mentalidade | Mentalidade de Crescimento\n" +
                    "-rubrica_ajuda_zupper | Zupper ajuda zupper \n" +
                    "-rubrica_comunicacao | Comunicação\n" +
                    "-rubrica_inteligencia_emc | Inteligência Emocional");
            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();

        } else if (args[0].equalsIgnoreCase(Bot1.prefix + "rubrica_raciocinio")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Critério: Raciocínio Estruturado");
            info.setDescription("Avaliação: abaixo do esperado\n" +
                    "Descrição: O aluno não é capaz nem de iniciar a construção de um algoritmo sozinho e tem dificuldade de compreender que um algoritmo é uma sequência de passos.\n" +
                    "\n" +
                    "Avaliação: dentro do esperado\n" +
                    "Descrição: O aluno consegue iniciar a construção de um algoritmo, pode ser que tenha algumas dificuldades ou cometa alguns erros mas com uma dose moderada de apoio consegue sair do outro lado.\n" +
                    "\n" +
                    "Avaliação: supera do esperado\n" +
                    "Descrição: O aluno é capaz de realizar a construção de um algoritmo por si só, estruturando os passos de forma correta na maioria das vezes.\n" +
                    "\n" +
                    "Avaliação: fora da curva (brilhou!)\n" +
                    "Descrição: O aluno estrutura todos os seus algoritmos sozinho numa velocidade impressionante e com um certo grau de otimização. Frente ao problema ele não demonstra nenhuma dificuldade.");

            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        } else if (args[0].equalsIgnoreCase(Bot1.prefix + "rubrica_estrutura")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Critério: Estruturas Básicas de Código");
            info.setDescription("Avaliação: abaixo do esperado\n" +
                    "Descrição: O aluno tem bastante dificuldade em utilizar estrutura condicional, se confunde com os laços na maioria das vezes, não consegue de forma alguma utilizar nem arrays, coleções e nem métodos.\n" +
                    "\n" +
                    "Avaliação: dentro do esperado\n" +
                    "Descrição: O aluno domina as estruturas condicionais e os laços, pode ser que em algum momento se confunda mas em geral essas estruturas não representam uma trava no seu desenvolvimento. As coleções ainda precisam de um empurrãozinho mas é possível que o aluno saia do outro lado quando é necessário utilizar esta estrutura. Escreve funções mas elas ainda não estão tão presentes em seus códigos. Consegue escrever arquivos.\n" +
                    "\n" +
                    "Avaliação: supera do esperado\n" +
                    "Descrição: Domina plenamente as estruturas condicionais e o laços, também não tem muita dificuldade ao lidar com as operações de inserção, remoção e busca em coleções.\n" +
                    "\n" +
                    "Avaliação: fora da curva (brilhou!)\n" +
                    "Descrição: Demonstra maestria na utilização das estruturas básicas (condições, arrays, laços, funções (métodos)) e além disso demonstra a capacidade de sair da caixa quando as utiliza.");
            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        } else if (args[0].equalsIgnoreCase(Bot1.prefix + "rubrica_limpeza")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Critério: Limpeza de Código");
            info.setDescription("Avaliação: abaixo do esperado\n" +
                    "Descrição: O código produzido pelo aluno é muitas vezes confuso. Não é possível entender com clareza o que o código faz. Em alguns momentos o aluno se perde na leitura do seu próprio código por não organizá-lo de uma maneira compreensível.\n" +
                    "\n" +
                    "Avaliação: dentro do esperado\n" +
                    "Descrição: O aluno apresenta poucos erros de indentação, nomeia suas variáveis de forma clara. Se preocupa minimamente com a modularização do seu código, dividindo as responsabilidades entre os seus métodos.\n" +
                    "\n" +
                    "Avaliação: supera do esperado\n" +
                    "Descrição: A indentação não representa dificuldade alguma para o aluno, o código é claro e modularizado. O aluno já utiliza técnicas como as constantes, já é possível também observar que ele cria mecanismos para facilitar sua implementação.\n" +
                    "\n" +
                    "Avaliação: fora da curva (brilhou!)\n" +
                    "Descrição: Já se percebe no código do aluno algumas técnicas de limpeza de código avançadas como por exemplo o fail first, a utilização de variáveis booleanas, indentação de expressões booleanas, imports estáticos e a preocupação em não realizar acessos repetidos à métodos.");
            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        } else if (args[0].equalsIgnoreCase(Bot1.prefix + "rubrica_versionamento")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Critério: Versionamento de Código");
            info.setDescription("Avaliação: abaixo do esperado\n" +
                    "Descrição: O aluno não consegue criar um repositório remoto, nem cloná-lo localmente, também não compreende os passos para um commit.\n" +
                    "\n" +
                    "Avaliação: dentro do esperado\n" +
                    "Descrição: O aluno já cria um repositório remoto por si só, consegue cloná-lo e interagir com o repositório remoto através de uma única branch.\n" +
                    "\n" +
                    "Avaliação: supera do esperado\n" +
                    "Descrição: O aluno já consegue trabalhar com branchs diferentes, domina o processo de staging e commit, entende como manipular um arquivo em staging.\n" +
                    "\n" +
                    "Avaliação: fora da curva (brilhou!)\n" +
                    "Descrição: O aluno conhece de conceitos que não foram apresentados na sala como por exemplo o rollback de commit e etc. Consegue fazer merge entre duas branchs através da dinâmica de pull-request.");
            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        } else if (args[0].equalsIgnoreCase(Bot1.prefix + "rubrica_orientacao_obj")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Critério: Orientação à Objetos");
            info.setDescription("Avaliação: abaixo do esperado\n" +
                    "Descrição: O aluno não consegue facilmente representar objetos reais e entender claramente a ideia de concentração de responsabilidade em uma classe. O aluno tem problemas para diferenciar classe de objeto.\n" +
                    "\n" +
                    "Avaliação: dentro do esperado\n" +
                    "Descrição: É possível identificar no aluno uma capacidade de abstração do mundo real ou lógico quando desenvolvendo suas classes. Ele consegue trabalhar bem o conceito de herança e entende minimamente a ideia de polimorfismo. Consegue utilizar pelo menos uma das coleções sem problemas. Encapsular suas classes não é uma dificuldade e é algo que o aluno percebe a necessidade com clareza.\n" +
                    "\n" +
                    "Avaliação: supera do esperado\n" +
                    "Descrição: O aluno domina a utilização das interfaces, e é capaz de modelar com facilidade um cenário em que é necessário utilizar duas ou mais classes que tenham alguma relação. Aqui é importante o domínio dos conceitos de composição e herança quando no momento de modelar suas classes.\n" +
                    "\n" +
                    "Avaliação: fora da curva (brilhou!)\n" +
                    "Descrição: De frente com um cenário de modelagem o aluno não apresenta nenhuma dificuldade, nem mesmo no entendimento dos requisitos levantados. Também se destaca por aqui uma extrema preocupação com a divisão de responsabilidades. A principal característica que coloca o aluno neste conceito também é a capacidade de, além de abstrair, implementar estes cenários com uma velocidade surpreendente considerando como parâmetro um profissional de nível júnior.");
            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
        } else if (args[0].equalsIgnoreCase(Bot1.prefix + "rubrica_autodidatismo")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Critério: Autodidatismo");
            info.setDescription("Avaliação: abaixo do esperado\n" +
                    "Descrição: O aluno se limita ao conteúdo apresentado, não traz dúvidas nas aulas seguintes sobre os assuntos discutidos, não demonstra nem o interesse em estudar o material de aula.\n" +
                    "\n" +
                    "Avaliação: dentro do esperado\n" +
                    "Descrição: O aluno apresenta dificuldades de procurar fontes externas contudo trás em alguns momentos discussões relevantes a respeito dos assuntos dados em aula. É capaz de começar a aprender um determinado assunto por si só, mas ainda necessita de um certo apoio para compreendê-lo.\n" +
                    "\n" +
                    "Avaliação: supera do esperado\n" +
                    "Descrição: O aluno já tem uma certa independência ao aprender um determinado assunto, raramente o mesmo empaca em algum momento mas com um grau mínimo de orientação consegue sair do lugar. Procura inúmeras fontes externas a respeito do conteúdo que está sendo estudado.\n" +
                    "\n" +
                    "Avaliação: fora da curva (brilhou!)\n" +
                    "Descrição: As aulas nunca são novidades pro aluno, seria mesmo possível até elaborar uma aula com o conjunto de questionamentos que este aluno apresenta.\n");
            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
        } else if (args[0].equalsIgnoreCase(Bot1.prefix + "rubrica_mentalidade")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Mentalidade de Crescimento (Growth Mindset)");
            info.setDescription("Avaliação: abaixo do esperado\n" +
                    "Descrição: Tem resistência em receber feedbacks de melhoria (é reativo). Não aprende com os erros e só estuda quando é orientado (não tem iniciativa diante dos desafios). Se contenta com o básico.\n" +
                    "\n" +
                    "Avaliação: dentro do esperado\n" +
                    "Descrição: Ouve feedbacks, mas leva tempo para reagir. Aprende com os erros, quando indicados. Estuda constantemente na busca de melhoria contínua, pois tem a preocupação em acertar. Diante de desafios, busca ajuda.\n" +
                    "\n" +
                    "Avaliação: supera do esperado\n" +
                    "Descrição: Reage rapidamente a feedbacks e coloca em prática as melhorias indicadas. Aprende com os erros que comete, sem dependência de indicações. Encara os desafios com uma postura positiva, pois fica motivado em superá-los.\n" +
                    "\n" +
                    "Avaliação: fora da curva (brilhou!)\n" +
                    "Descrição: Usa do ambiente como espaço para aprendizado, aprende com feedbacks e erros de colegas. Além de aprender com os próprios erros, compartilha aprendizados com a turma. Transforma o ambiente da turma positivamente.");
            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
        } else if (args[0].equalsIgnoreCase(Bot1.prefix + "rubrica_ajuda_zupper")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Critério: Zupper ajuda zupper");
            info.setDescription("Avaliação: abaixo do esperado\n" +
                    "Descrição: Tem dificuldade em trabalhar em equipe. É impaciente com as dificuldades das pessoas ao seu redor. Não tem o hábito de compartilhar conhecimento.\n" +
                    "\n" +
                    "Avaliação: dentro do esperado\n" +
                    "Descrição: Tem a capacidade de trabalhar em equipe. Tem paciência com as dificuldades das pessoas ao seu redor. Quando solicitado, consegue compartilhar conhecimento e aprendizados.\n" +
                    "\n" +
                    "Avaliação: supera do esperado\n" +
                    "Descrição: Além da capacidade de trabalhar em equipe, coopera com demais membros. Proativamente ensina as pessoas sobre aprendizados que teve e conteúdos que domina. Com isso, cria relações de confiança com as pessoas do mesmo projeto.\n" +
                    "\n" +
                    "Avaliação: fora da curva (brilhou!)\n" +
                    "Descrição: Entende que ao prestar uma ajuda a alguém, o resultado final pode ser melhor, tem senso de grupo, e age de maneira altruísta com as dificuldades das pessoas ao seu redor. Por isso, é capaz de ensinar e dar feedbacks constantes aos seus pares, criando oportunidade de desenvolvimento para si e demais.");
            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
        } else if (args[0].equalsIgnoreCase(Bot1.prefix + "rubrica_comunicacao")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Critério: Comunicação");
            info.setDescription("Avaliação: abaixo do esperado\n" +
                    "Descrição: Tem dificuldade de se expressar, sua mensagem não é clara e rápida. Se perde no raciocínio e no objetivo do que está sendo passado ao outro. A frequência de sua comunicação não é adequada, por vezes perde a oportunidade de sinalizar algo e/ou não tem proatividade para. Além disso, não tem domínio de ferramentas Google, como: agenda, e-mail e power point. \n" +
                    "\n" +
                    "Avaliação: dentro do esperado\n" +
                    "Descrição: Consegue se expressar, sua mensagem é clara. Consegue estabelecer um raciocínio e manter o foco no objetivo que está sendo passado ao outro. Tem uma boa frequência na sua comunicação. Além disso, consegue fazer uso das ferramentas Google como agenda, e-mail e power point.\n" +
                    "\n" +
                    "Avaliação: supera do esperado\n" +
                    "Descrição: Tem uma comunicação clara e objetiva de todas as formas:  verbal, escrita ou até mesmo corporal. Consegue transmitir uma mensagem a partir de um pensamento embasado. Sua comunicação é estruturada e com frequência precisa. Tem domínio das ferramentas Google como agenda, e-mail e power point e faz uso delas no dia a dia para complementar sua comunicação. \n" +
                    "\n" +
                    "Avaliação: fora da curva (brilhou!)\n" +
                    "Descrição: Além de ter uma boa comunicação a partir dos critérios acima, consegue falar em público e consegue adaptar sua fala a diferentes perfis de pessoas. Ensina os demais  sobre o uso de ferramentas que possam ajudar na comunicação.");
            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
        } else if (args[0].equalsIgnoreCase(Bot1.prefix + "rubrica_inteligencia_emc")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Critério: Inteligência Emocional");
            info.setDescription("Avaliação: abaixo do esperado\n" +
                    "Descrição: Tem dificuldade de compreender e administrar as próprias emoções. Não é aquele que consegue reconhecer as suas emoções e entender o impacto que isso exerce sobre os outros. Na maioria das vezes age de maneira impulsiva.\n" +
                    "\n" +
                    "Avaliação: dentro do esperado\n" +
                    "Descrição: Consegue compreender suas emoções e tem algum domínio sobre o que sente. Busca ajuda quando percebe que não está conseguindo administrar suas emoções. Ou seja, é atento ao que sente e ao impacto que está tendo sobre os outros ao redor.\n" +
                    "\n" +
                    "Avaliação: supera do esperado\n" +
                    "Descrição: Tem clareza do que sente e sabe administrar suas emoções. Além disso, é empático com as  pessoas à sua volta. Na prática,  tem a capacidade de construir relacionamentos mais eficazes, visto que são capazes de argumentar de forma construtiva.\n" +
                    "\n" +
                    "Avaliação: fora da curva (brilhou!)\n" +
                    "Descrição: É referência no time por demonstrar controle das suas emoções, ajuda os demais com relação a isso.  Além de manifestar ter autoconhecimento, autocontrole e empatia. É cordial com propósito, ou seja, tem a capacidade de costurar acordos. Pessoas persuasivas sabem, por exemplo, quando é melhor apelar para a emoção ou para a razão.");
            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
        }
    }
}