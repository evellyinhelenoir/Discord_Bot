package br.com.zup.Comandos;

import br.com.zup.Central.Bot1;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class SoftSkills extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(Bot1.prefix + "softskills")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Aulas de Softskills 👩‍🏫");
            info.setDescription("Apresentações de Soft Skills complementares apresentadas ao longo do projeto.\n" +
                    "\n" +
                    "Pilares da Cultura\n" +
                    "https://classroom.google.com/u/0/c/Mzc2OTU4NzExNDg1/m/MzkwMzQ0MDAyMTE4/details\n" +
                    "\n" +
                    "Aula de Comunicação\n" +
                    "https://classroom.google.com/u/0/c/Mzc2OTU4NzExNDg1/m/Mzk0NTYyODg3Mzg2/details\n" +
                    "\n" +
                    "Sindrome da Impostora\n" +
                    "https://classroom.google.com/u/0/c/Mzc2OTU4NzExNDg1/m/MzkwMTg3NzUyOTcy/details\n" +
                    "\n" +
                    "Educação Financeira\n" +
                    "https://classroom.google.com/u/0/c/Mzc2OTU4NzExNDg1/m/Mzk0NTUzMjY5NDI4/details\n" +
                    "\n" +
                    "Feedback/Zenity Estrelas\n" +
                    "https://classroom.google.com/u/0/c/Mzc2OTU4NzExNDg1/m/Mzg5MTcxMzUzNDEy/details\n");
            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }
    }
}
