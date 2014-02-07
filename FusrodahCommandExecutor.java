package com.mooo.GuildHub;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class FusdorahCommandExecutor implements CommandExecutor {
 
	public FusdorahCommandExecutor(Camstools plugin) {
	}
 
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		 if (cmd.getName().equalsIgnoreCase("fusrodah")){
			 Player player = (Player) sender;
				
			 
				if (args.length != 1){
					player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "/fusrodah <player>");
				}//args.length != 1
				
				
				if (args.length == 1){
					Player target = player.getServer().getPlayer(args[0]);
					
					target.setHealth(0);
					
					player.sendMessage(ChatColor.GOLD + "" + ChatColor.ITALIC + ChatColor.BOLD + "Fus Ro Dah!");
					target.sendMessage(ChatColor.RED + "" + ChatColor.ITALIC + ChatColor.BOLD + "Fus Ro Dah!");
					
					target.playSound(target.getLocation(), Sound.EXPLODE, 4, 0);
					target.playEffect(target.getLocation(), Effect.POTION_BREAK, 4);
					target.playEffect(target.getLocation(), Effect.SMOKE, 4);
					

					
					
				}//args.length == 1

			 
		 }//cmd.getName()
		 return false;
	}//public boolean
	
	
}//end class
