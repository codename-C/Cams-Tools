package com.mooo.GuildHub;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public class Camstools extends JavaPlugin{
	
	public final Logger logger = Logger.getLogger("Minecraft");
	
	public void onEnable(){
		
		getCommand("fc").setExecutor(new FreeCookieCommandExecutor(this));
		getCommand("fusrodah").setExecutor(new FusdorahCommandExecutor(this));
		
		getLogger().info("Cam's Tools Has been successfully enabled! Have fun! :D");
	}//onEnable
	
	public void onDisable(){
		getLogger().info("Cam's tools has safely disabled. Goodbye!");
	}//onDisable
	
}//End Class
