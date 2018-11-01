package hello.model;

import java.util.HashSet;
import java.util.Set;

public class ThumbnailDetails {

	private boolean iconUSD;
	private String imageSizeMin;
	private String imageSizeMedium;
	private String imageSizeMax;

	private Set<Store> stores = new HashSet<>();

	public ThumbnailDetails() {

	}

	public boolean isIconUSD() {
		return iconUSD;
	}

	public void setIconUSD(boolean iconUSD) {
		this.iconUSD = iconUSD;
	}

	public String getImageSizeMin() {
		return imageSizeMin;
	}

	public void setImageSizeMin(String imageSizeMin) {
		this.imageSizeMin = imageSizeMin;
	}

	public String getImageSizeMedium() {
		return imageSizeMedium;
	}

	public void setImageSizeMedium(String imageSizeMedium) {
		this.imageSizeMedium = imageSizeMedium;
	}

	public String getImageSizeMax() {
		return imageSizeMax;
	}

	public void setImageSizeMax(String imageSizeMax) {
		this.imageSizeMax = imageSizeMax;
	}

	public Set<Store> getStores() {
		return stores;
	}

	public void setStores(Set<Store> stores) {
		this.stores = stores;
	}

}
