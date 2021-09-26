package br.com.zup.Comandos;

import br.com.zup.Central.Bot1;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Help extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(Bot1.prefix + "help")){
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("🌟 Bot Estrelas Helper 🌟");
            info.setDescription("Olá! Eu serei seu assistente durante essa longa jornada que te tornára uma grande estrela! Yay!\n" +
                    "\n" +
                    "Lista de comandos:\n" +
                    "-help | Informações sobre o bot.\n" +
                    "-limpar | Limpa uma certa quantidade de mensagens enviada no canal.\n" +
                    "-githubs | Exibe todos os diretórios remótos Github da turma.\n" +
                    "-glossario | Exibe mês, dia e responsável pelo glossário.\n" +
                    "-rubricas | Exibe todas as rubricas do módulo atual.\n" +
                    "-leituras | Exibe todas as leituras recomendadas de aula.\n" +
                    "-apostilas | Exibe todas as apostilas \n" +
                    "-softskills | Exibe todas as apresentações de softskills\n" +
                    "\n" +
                    "**OBS: Apenas utilize o comando '-limpar' quando for verdadeiramente necessário. Seu uso indevido poderá levar à consequências indesejáveis.**\n" +
                    "\n" +
                    "Caso tenha dúvidas sobre o meu funcionamento, deseje relatar algum bug ou deixar uma crítica, por favor entre em contato com a minha criadora.");
            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());



            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }
    }

}
