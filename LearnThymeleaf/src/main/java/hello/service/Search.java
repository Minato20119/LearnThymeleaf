package hello.service;

import hello.model.Details;
import hello.model.Store;
import hello.model.ThumbnailDetails;
import hello.model.Title;

public class Search {

	public Store getSearch(String nameTitle) {

		Store store = new Store();
		Title title = new Title();
		Details details = new Details();
		ThumbnailDetails thumbnailDetails = new ThumbnailDetails();

		thumbnailDetails.setImageSizeMin("setImageSizeMin");
		thumbnailDetails.setImageSizeMedium("setImageSizeMedium");
		thumbnailDetails.setImageSizeMax("setImageSizeMax");
		store.setThumbnailDetails(thumbnailDetails);

		title.setTitle(nameTitle);
		title.setLinkVideo("https://youtube.com/watch?v=");
		title.setIdVideo("setIdVideo");
		title.setNameChannel("setNameChannel");
		title.setLinkChannel("https://youtube.com/channel/");
		String tags = "1, 2, 3, 4, 5, tags";
//		for (String tag : singleVideo.getSnippet().getTags()) {
//			tags += tag;
//		}
		title.setTags(tags);
		title.setDescription("setDescription");
		store.setTitle(title);

		details.setViewCount("setViewCount");
		details.setLikeCount("setLikeCount");
		details.setDislikeCount("setDislikeCount");
		details.setDuration("setDuration");
		details.setDefinition("setDefinition");
		details.setCommentCount("setCommentCount");
		store.setDetails(details);

		System.out.println("Done set!");

		return store;
	}
}
