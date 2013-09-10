package com.keyboardr.xdiexplorer;
public class proj {

	public static final String[] DEFAULT_LAUNCHER_ROOT_PROJECTION = new String[] { "_id", "name", "importance",
			"display_name", "visible_count", "cache_time_ms", "image_crop_allowed", "browse_items_uri", "intent_uri",
			"notification_text" };
	public static final String[] DEFAULT_LAUNCHER_CLUSTER_PROJECTION = new String[] { "_id", "parent_id", "image_uri" };
	public static final String[] DEFAULT_BROWSE_HEADERS_PROJECTION = new String[] { "_id", "name", "display_name",
			"background_image_uri", "bg_image_uri", "icon_uri", "default_item_width", "default_item_height",
			"color_hint", "badge_uri", "items_uri" };
	public static final String[] DEFAULT_BROWSE_HEADER_ID_PROJECTION = new String[] { "_id", "parent_id",
			"display_name", "display_description", "image_uri", "width", "height", "intent_uri" };
	public static final String[] DEFAULT_DETAIL_ITEM_PROJECTION = new String[] { "_id", "display_name",
			"foreground_image_uri", "background_image_uri", "badge_uri", "color_hint", "text_color_hint" };
	public static final String[] DEFAULT_DETAIL_SECTIONS_PROJECTION = new String[] { "_id", "name", "display_header",
			"display_name", "section_type", "blob_content", "content_uri", "action_uri", "user_rating_custom",
			"user_rating", "user_rating_count" };
	public static final String[] DEFAULT_DETAIL_BLURP_PROJECTION = new String[] { "_id", "display_name",
			"display_subname", "display_description", "display_category", "user_rating_count", "user_rating",
			"user_rating_custom", "badge_uri" };
	public static final String[] DEFAULT_DETAIL_CHILDREN_PROJECTION = new String[] { "_id", "display_name",
			"display_subname", "display_description", "display_number", "image_uri", "item_display_type",
			"user_rating_count", "user_rating", "section_uri" };
	public static final String[] DEFAULT_DETAIL_ACTIONS_PROJECTION = new String[] { "_id", "display_name",
			"display_subname", "intent_uri" };
	public static final String[] DEFAULT_SEARCH_RESULTS_PROJECTION = new String[] { "_id", "results_uri",
			"default_item_width", "default_item_height" };
	public static final String[] META_PROJECTION = new String[] { "background_image_uri", "badge_uri", "color_hint",
			"activity_title" };

}
