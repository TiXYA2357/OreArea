package ore.area.events;

import cn.nukkit.Player;
import cn.nukkit.event.HandlerList;
import cn.nukkit.event.player.PlayerEvent;
import ore.area.utils.area.AreaClass;

/**
 * @author 若水
 */
public class PlayerTransferAreaEvent extends PlayerEvent {

    private static final HandlerList handlers = new HandlerList();

    private AreaClass areaClass;

    public PlayerTransferAreaEvent(Player player, AreaClass areaClass){
        this.areaClass = areaClass;
        this.player = player;
    }

    public AreaClass getAreaClass() {
        return areaClass;
    }

    public static HandlerList getHandlers() {
        return handlers;
    }
}
