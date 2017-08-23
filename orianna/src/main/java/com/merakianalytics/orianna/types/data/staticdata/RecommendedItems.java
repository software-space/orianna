package com.merakianalytics.orianna.types.data.staticdata;

import com.merakianalytics.orianna.types.common.GameMode;
import com.merakianalytics.orianna.types.common.Map;
import com.merakianalytics.orianna.types.data.CoreData;

public class RecommendedItems extends CoreData.ListProxy<ItemSet> {
    private static final long serialVersionUID = 5561349679228162999L;
    private Map map;
    private GameMode mode;
    private boolean priority;
    private String title, type;

    public RecommendedItems() {
        super();
    }

    public RecommendedItems(final int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public boolean equals(final Object obj) {
        if(this == obj) {
            return true;
        }
        if(!super.equals(obj)) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        final RecommendedItems other = (RecommendedItems)obj;
        if(map != other.map) {
            return false;
        }
        if(mode != other.mode) {
            return false;
        }
        if(priority != other.priority) {
            return false;
        }
        if(title == null) {
            if(other.title != null) {
                return false;
            }
        } else if(!title.equals(other.title)) {
            return false;
        }
        if(type == null) {
            if(other.type != null) {
                return false;
            }
        } else if(!type.equals(other.type)) {
            return false;
        }
        return true;
    }

    /**
     * @return the map
     */
    public Map getMap() {
        return map;
    }

    /**
     * @return the mode
     */
    public GameMode getMode() {
        return mode;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (map == null ? 0 : map.hashCode());
        result = prime * result + (mode == null ? 0 : mode.hashCode());
        result = prime * result + (priority ? 1231 : 1237);
        result = prime * result + (title == null ? 0 : title.hashCode());
        result = prime * result + (type == null ? 0 : type.hashCode());
        return result;
    }

    /**
     * @return the priority
     */
    public boolean isPriority() {
        return priority;
    }

    /**
     * @param map
     *        the map to set
     */
    public void setMap(final Map map) {
        this.map = map;
    }

    /**
     * @param mode
     *        the mode to set
     */
    public void setMode(final GameMode mode) {
        this.mode = mode;
    }

    /**
     * @param priority
     *        the priority to set
     */
    public void setPriority(final boolean priority) {
        this.priority = priority;
    }

    /**
     * @param title
     *        the title to set
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * @param type
     *        the type to set
     */
    public void setType(final String type) {
        this.type = type;
    }
}
