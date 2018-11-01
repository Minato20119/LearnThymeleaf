package hello.model;

import java.util.HashSet;
import java.util.Set;

public class Details {

	private String viewCount;
	private String likeCount;
	private String dislikeCount;
	private String duration;
	private String definition;
	private String timePublished;
	private String commentCount;

	private Set<Store> stores = new HashSet<>();

	public Details() {

	}

	public String getViewCount() {
		return viewCount;
	}

	public void setViewCount(String viewCount) {
		this.viewCount = viewCount;
	}

	public String getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(String likeCount) {
		this.likeCount = likeCount;
	}

	public String getDislikeCount() {
		return dislikeCount;
	}

	public void setDislikeCount(String dislikeCount) {
		this.dislikeCount = dislikeCount;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public String getTimePublished() {
		return timePublished;
	}

	public void setTimePublished(String timePublished) {
		this.timePublished = timePublished;
	}

	public String getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(String commentCount) {
		this.commentCount = commentCount;
	}

	public Set<Store> getStores() {
		return stores;
	}

	public void setStores(Set<Store> stores) {
		this.stores = stores;
	}

}
