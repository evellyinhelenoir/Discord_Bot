package br.com.zup.Comandos;

import br.com.zup.Central.Bot1;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.List;

public class Limpar extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(Bot1.prefix + "limpar")) {
            if (args.length < 2) {
                EmbedBuilder usage = new EmbedBuilder();
                usage.setColor(0x000000);
                usage.setTitle("Informe a quantidade que deseja deletar.");
                usage.setDescription("Utilização: `" + Bot1.prefix + "limpar # [quantidade de mensagens]`");
                usage.setFooter("Desenvolvido por Evellyin Helenoir", event.getMember().getUser().getAvatarUrl());
                event.getChannel().sendMessage(usage.build()).queue();


            } else {
                try {
                    List<Message> messages = event.getChannel().getHistory().retrievePast(Integer.parseInt(args[1])).complete();
                    event.getChannel().deleteMessages(messages).queue();

                    EmbedBuilder sucesso = new EmbedBuilder();
                    sucesso.setColor(0x22ff2a);
                    sucesso.setTitle(" ✅ Mensagens deletadas com sucesso ✅");
                    sucesso.setDescription("Quantidade de mensagens deletadas: "+ args[1]);
                    event.getChannel().sendMessage(sucesso.build()).queue();

                } catch (IllegalArgumentException e) {
                    if (e.toString().startsWith("java.lang.IllegalArgumentException: Message retrieval")) {
                        EmbedBuilder error = new EmbedBuilder();
                        error.setColor(0xff3923);
                        error.setTitle("❌ Muitas mensagens foram selecionadas! ❌");
                        error.setDescription("Somente entre 1 a 100 mensagens podem ser deletadas de cada vez.");
                        event.getChannel().sendMessage(error.build()).queue();
                    }
                }
            }
        }
    }
}
