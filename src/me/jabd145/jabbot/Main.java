package me.jabd145.jabbot;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Main extends JavaPlugin implements Listener {

	
public void onEnable() {
		
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this, this);
		
		
	}

String prefix = (ChatColor.RED + "Jab-Bot" + ChatColor.AQUA + ">>");
String pref2 = (ChatColor.BLUE + "[*]");
String pref3 = (ChatColor.YELLOW + "[*]");

@EventHandler
public void onChat1(AsyncPlayerChatEvent e){
	Player p = e.getPlayer();
if (e.getMessage().equalsIgnoreCase("jabbot feed me")  ){
e.getPlayer().sendMessage(prefix + ChatColor.RED + " You have been fed");
e.getPlayer().setFoodLevel(20);
}
}
@EventHandler
public void onChat2(AsyncPlayerChatEvent e){
	Player p = e.getPlayer();
if (e.getMessage().equalsIgnoreCase("jabbot heal my wounds")  ){
	
e.getPlayer().sendMessage(prefix + ChatColor.RED + " You have been healed!");
e.getPlayer().setHealth(20);
}
}
@EventHandler
public void onChat3(AsyncPlayerChatEvent e){
	Player p = e.getPlayer();
if (e.getMessage().equalsIgnoreCase("jabbot give me a cookie" )  ){
	
e.getPlayer().sendMessage(prefix + ChatColor.RED + " enjoy your cookie sir!");
ItemStack Cookie = new ItemStack(Material.COOKIE, 20);
Inventory inv = e.getPlayer().getInventory();
inv.addItem(Cookie);
}
}	
@EventHandler
public void onChat4(AsyncPlayerChatEvent e){
	Player p = e.getPlayer();
if (e.getMessage().equalsIgnoreCase("jabbot invisibility cloak please" )  ){
	
e.getPlayer().sendMessage(prefix + ChatColor.RED + " you have become invisible!");
e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 500, 1));
}
}
@EventHandler
public void onChat5(AsyncPlayerChatEvent e){
	Player p = e.getPlayer();
if (e.getMessage().equalsIgnoreCase("jabbot i want to be superman" )  ){
	
p.sendMessage(prefix + ChatColor.RED + " go save the world!");
p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 500, 10));
p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 500, 10));
p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 500, 10));
p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 500, 10));
p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 500, 10));
p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 500, 10));
}	
}

@EventHandler
public void onChat6(AsyncPlayerChatEvent e){
	Player p = e.getPlayer();
if (e.getMessage().equalsIgnoreCase("jabbot" )  ){
	
p.sendMessage(prefix + ChatColor.RED + " Yes sir?");

}	
}

@EventHandler
public void onChat7(AsyncPlayerChatEvent e){
	Player p = e.getPlayer();
if (e.getMessage().equalsIgnoreCase("jabbot what can you do for me?" )  ){
	
p.sendMessage(prefix + ChatColor.RED + " Well sir I can do a number of things!");
p.sendMessage(pref2 +ChatColor.RED + "I can nourish your hunger!" + ChatColor.GREEN + "Simpy say 'Jabbot feed me'");
p.sendMessage(pref3 +ChatColor.RED + "I can heal your wounds!" + ChatColor.GREEN + "Simpy say 'Jabbot heal my wounds'");
p.sendMessage(pref2 +ChatColor.RED + "I can give you a cookie!" + ChatColor.GREEN + "Simpy say 'Jabbot give me a cookie'");
p.sendMessage(pref3 +ChatColor.RED + "I can give you invisible!" + ChatColor.GREEN + "Simpy say 'Jabbot invisibility cloak please'");
p.sendMessage(pref2 +ChatColor.RED + "I can make you Superman!" + ChatColor.GREEN + "Simpy say 'Jabbot I want to be Superman'");

}	
}

}

