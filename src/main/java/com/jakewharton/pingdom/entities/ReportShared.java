package com.jakewharton.pingdom.entities;

import java.util.List;
import com.google.gson.annotations.Since;
import com.jakewharton.pingdom.PingdomEntity;
import com.jakewharton.pingdom.enumerations.BannerType;

public final class ReportShared implements PingdomEntity {
	private static final long serialVersionUID = 7591271345410192470L;

	public static final class Banner implements PingdomEntity {
		private static final long serialVersionUID = -5407286248217918402L;
		
		@Since(2.0) private Integer id;
		@Since(2.0) private String name;
		@Since(2.0) private Integer checkId;
		@Since(2.0) private Boolean auto;
		@Since(2.0) private BannerType type;
		@Since(2.0) private String url;
		@Since(2.0) private Integer fromYear;
		@Since(2.0) private Integer fromMonth;
		@Since(2.0) private Integer fromDay;
		@Since(2.0) private Integer toYear;
		@Since(2.0) private Integer toMonth;
		@Since(2.0) private Integer toDay;
		
		public Integer getId() {
			return this.id;
		}
		public String getName() {
			return this.name;
		}
		public Integer getCheckId() {
			return this.checkId;
		}
		public Boolean getAuto() {
			return this.auto;
		}
		public BannerType getType() {
			return this.type;
		}
		public String getUrl() {
			return this.url;
		}
		public Integer getFromYear() {
			return this.fromYear;
		}
		public Integer getFromMonth() {
			return this.fromMonth;
		}
		public Integer getFromDay() {
			return this.fromDay;
		}
		public Integer getToYear() {
			return this.toYear;
		}
		public Integer getToMonth() {
			return this.toMonth;
		}
		public Integer getToDay() {
			return this.toDay;
		}
	}

	@Since(2.0) public List<Banner> banners;
	
	public List<Banner> getBanners() {
		return this.banners;
	}
}