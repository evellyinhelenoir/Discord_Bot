package br.com.zup.Comandos;

import br.com.zup.Central.Bot1;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Glossario extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(Bot1.prefix + "glossario")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Glossário Setembro 📅 (09/2021)");
            info.setDescription("**Semana 01**\n" +
                    "\n" +
                    "Concluída.\n" +
                    "\n" +
                    "**Semana 02**\n" +
                    "\n" +
                    "Concluída.\n" +
                    "\n" +
                    "**Semana 03**\n" +
                    "\n" +
                    "Concluída.\n" +
                    "\n" +
                    "**Semana 04**\n" +
                    "\n" +
                    "Concluída\n" +
                    "\n" +
                    "**Semana 05**\n" +
                    "\n" +
                    "Dia 27 [Segunda] = Márcio\n" +
                    "Dia 28 [Terça] = Mariana\n" +
                    "Dia 29 [Quarta] = Michelle\n" +
                    "Dia 30 [Quinta] = Paulo");
            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            }
        }
    }

