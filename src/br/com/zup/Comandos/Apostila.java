package br.com.zup.Comandos;

import br.com.zup.Central.Bot1;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Apostila extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(Bot1.prefix + "apostilas")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Apostilas Complementares 📔");
            info.setDescription("Apostilas criadas pelos nossos professores para estudos complementares:\n" +
                    "\n" +
                    "Apostila 1: Java Básico\n" +
                    "https://classroom.google.com/u/0/c/Mzc2OTU4NzExNDg1/m/MzgyMzUxOTYxODc4/details\n" +
                    "\n" +
                    "Apostila 2: Java Básico e Orientação a Objetos\n" +
                    "https://classroom.google.com/u/0/c/Mzc2OTU4NzExNDg1/m/Mzk2NjYzMjQ3MzMx/details");
            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }
    }
}