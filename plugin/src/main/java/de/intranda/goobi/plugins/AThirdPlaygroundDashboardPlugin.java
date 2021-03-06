package de.intranda.goobi.plugins;

import org.goobi.production.enums.PluginType;
import org.goobi.production.plugin.interfaces.IDashboardPlugin;

import de.sub.goobi.config.ConfigPlugins;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import net.xeoh.plugins.base.annotations.PluginImplementation;

@PluginImplementation
@Log4j2
public class AThirdPlaygroundDashboardPlugin implements IDashboardPlugin {

    @Getter
    private String title = "intranda_dashboard_a-third-playground";

    @Getter
    private PluginType type = PluginType.Dashboard;
    
    @Getter
    private String guiPath = "/uii/plugin_dashboard_a-third-playground.xhtml";
    
    @Getter
    private String value;

    /**
     * Constructor
     */
    public AThirdPlaygroundDashboardPlugin() {
        log.info("A-third-playground dashboard plugin started");
        value = ConfigPlugins.getPluginConfig(title).getString("value", "default value");
    }   

}
