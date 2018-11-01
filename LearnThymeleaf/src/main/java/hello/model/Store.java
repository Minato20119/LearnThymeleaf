package hello.model;

public class Store {

	private String q;
	private Details details;
	private Title title;
	private ThumbnailDetails thumbnailDetails;

	public Store() {

	}

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public Details getDetails() {
		return details;
	}

	public void setDetails(Details details) {
		this.details = details;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public ThumbnailDetails getThumbnailDetails() {
		return thumbnailDetails;
	}

	public void setThumbnailDetails(ThumbnailDetails thumbnailDetails) {
		this.thumbnailDetails = thumbnailDetails;
	}

}
