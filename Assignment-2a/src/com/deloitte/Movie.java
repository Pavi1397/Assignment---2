package com.deloitte;

	public class Movie {
		int id;
		String mName;
		String date;
		String time;
		String status;
		
		public Movie(int id, String mName, String date, String time, String status) {
			
			this.id = id;
			this.mName = mName;
			this.date = date;
			this.time = time;
			this.status = status;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public String getmName() {
			return mName;
		}
		public void setmName(String mName) {
			this.mName = mName;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "Movie [id=" + id + ", mName=" + mName + ", date=" + date + ", time=" + time + ", status=" + status
					+ "]";
		}
		
	}

