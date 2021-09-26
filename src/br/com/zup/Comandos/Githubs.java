package br.com.zup.Comandos;

import br.com.zup.Central.Bot1;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Githubs extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(Bot1.prefix + "githubs")){
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Githubs da Turma 🧾");
            info.setDescription("Professor André: https://github.com/andrelvicent?tab=repositories\n" +
                    "\n" +
                    "Arêtuza: https://github.com/agnr-gab?tab=repositories\n" +
                    "Barbara Ann: https://github.com/Babiplima?tab=repositories\n" +
                    "Barbara Queiroz: https://github.com/barbaraqromero\n"+
                    "Débora: https://github.com/souzadbr?tab=repositories\n" +
                    "Dorayen: https://github.com/dorayenCarrasquel?tab=repositories\n" +
                    "Elaine: https://github.com/Elaine-dss?tab=repositories\n" +
                    "Evellyin: https://github.com/evellyinhelenoir?tab=repositories\n" +
                    "Gislaine: https://github.com/Gihgavlak?tab=repositories\n" +
                    "Jeyciane: https://github.com/JeycianeFaria?tab=repositories\n" +
                    "Karen: https://github.com/KarenAlmeida21?tab=repositories\n" +
                    "Karol: https://github.com/dev-akvc?tab=repositories\n" +
                    "Larissa: https://github.com/larinovaes?tab=repositories\n" +
                    "Let: https://github.com/letsmgo?tab=repositories\n" +
                    "Letícia: https://github.com/leticiacristinamoraes?tab=repositories\n" +
                    "Lurrégia: https://github.com/lurregiabarreto?tab=repositories\n" +
                    "Maicon: https://github.com/maiconriam?tab=repositories\n" +
                    "Márcio: https://github.com/MarcioZup?tab=repositories\n" +
                    "Mariana: https://github.com/M4r1-D3v?tab=repositories\n" +
                    "Michelle: https://github.com/michellekenia?tab=repositories\n" +
                    "Paulo: https://github.com/PauloSavio?tab=repositories\n" +
                    "Rafael: https://github.com/Rafael702?tab=repositories\n" +
                    "Raline: https://github.com/Raline1?tab=repositories\n" +
                    "Raquel: https://github.com/vcRaquel?tab=repositories\n" +
                    "Vanessa: https://github.com/vanessalb08?tab=repositories\n" +
                    "Yan: https://github.com/yan-rds?tab=repositories");

            info.setColor(0x000000);
            info.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();

        }
    }
}
