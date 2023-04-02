package at.the2019.abilitycraft;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        items.init();
        this.getCommand("givegrapplinghook").setExecutor(new commands());
        this.getCommand("givebloodscyth").setExecutor(new commands());
        this.getCommand("giveflower").setExecutor(new commands());
        this.getCommand("givepumkinaxe").setExecutor(new commands());
        this.getCommand("givemelonecapitor").setExecutor(new commands());
        this.getCommand("givewot").setExecutor(new commands());
        this.getServer().getPluginManager().registerEvents(new grappling_hook(),this);
        this.getServer().getPluginManager().registerEvents(new join(),this);
        this.getServer().getPluginManager().registerEvents(new blood_scyth(this), this);
        this.getServer().getPluginManager().registerEvents(new pumkin_axe(),this);
        this.getServer().getPluginManager().registerEvents(new melone_capitor(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
