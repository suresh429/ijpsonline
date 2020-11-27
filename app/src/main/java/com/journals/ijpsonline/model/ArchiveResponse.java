package com.journals.ijpsonline.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ArchiveResponse {


    @SerializedName("archive_year_cnt")
    private int archiveYearCnt;
    @SerializedName("status")
    private boolean status;
    @SerializedName("message")
    private String message;
    @SerializedName("archive_years")
    private List<ArchiveYearsBean> archiveYears;

    public int getArchiveYearCnt() {
        return archiveYearCnt;
    }

    public void setArchiveYearCnt(int archiveYearCnt) {
        this.archiveYearCnt = archiveYearCnt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ArchiveYearsBean> getArchiveYears() {
        return archiveYears;
    }

    public void setArchiveYears(List<ArchiveYearsBean> archiveYears) {
        this.archiveYears = archiveYears;
    }

    public static class ArchiveYearsBean {
        @SerializedName("year")
        private String year;
        @SerializedName("archive_details")
        private List<ArchiveDetailsBean> archiveDetails;

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public List<ArchiveDetailsBean> getArchiveDetails() {
            return archiveDetails;
        }

        public void setArchiveDetails(List<ArchiveDetailsBean> archiveDetails) {
            this.archiveDetails = archiveDetails;
        }

        public static class ArchiveDetailsBean {
            @SerializedName("year")
            private String year;
            @SerializedName("journal")
            private String journal;
            @SerializedName("vol")
            private String vol;
            @SerializedName("volume")
            private String volume;
            @SerializedName("issue")
            private String issue;
            @SerializedName("pagenos")
            private String pagenos;
            @SerializedName("pageviews")
            private String pageviews;
            @SerializedName("month")
            private String month;
            @SerializedName("si_url")
            private Object siUrl;

            public String getYear() {
                return year;
            }

            public void setYear(String year) {
                this.year = year;
            }

            public String getJournal() {
                return journal;
            }

            public void setJournal(String journal) {
                this.journal = journal;
            }

            public String getVol() {
                return vol;
            }

            public void setVol(String vol) {
                this.vol = vol;
            }

            public String getVolume() {
                return volume;
            }

            public void setVolume(String volume) {
                this.volume = volume;
            }

            public String getIssue() {
                return issue;
            }

            public void setIssue(String issue) {
                this.issue = issue;
            }

            public String getPagenos() {
                return pagenos;
            }

            public void setPagenos(String pagenos) {
                this.pagenos = pagenos;
            }

            public String getPageviews() {
                return pageviews;
            }

            public void setPageviews(String pageviews) {
                this.pageviews = pageviews;
            }

            public String getMonth() {
                return month;
            }

            public void setMonth(String month) {
                this.month = month;
            }

            public Object getSiUrl() {
                return siUrl;
            }

            public void setSiUrl(Object siUrl) {
                this.siUrl = siUrl;
            }
        }
    }
}
