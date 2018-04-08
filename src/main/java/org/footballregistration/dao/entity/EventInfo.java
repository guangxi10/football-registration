package org.footballregistration.dao.entity;

public class EventInfo {

	public long event_id;
	public String event_name;
	public String status;
	public String deadline_date;
	public String event_kbn;
	public String proposer_user_id;
	public String event_date;
	public String event_place;
	public long event_cost;
	public String phone_no;
	public String comment;

	public long getEvent_id() {
		return event_id;
	}
	public void setEvent_id(long event_id) {
		this.event_id = event_id;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDeadline_date() {
		return deadline_date;
	}
	public void setDeadline_date(String deadline_date) {
		this.deadline_date = deadline_date;
	}
	public String getEvent_kbn() {
		return event_kbn;
	}
	public void setEvent_kbn(String event_kbn) {
		this.event_kbn = event_kbn;
	}
	public String getProposer_user_id() {
		return proposer_user_id;
	}
	public void setProposer_user_id(String proposer_user_id) {
		this.proposer_user_id = proposer_user_id;
	}
	public String getEvent_date() {
		return event_date;
	}
	public void setEvent_date(String event_date) {
		this.event_date = event_date;
	}
	public String getEvent_place() {
		return event_place;
	}
	public void setEvent_place(String event_place) {
		this.event_place = event_place;
	}
	public long getEvent_cost() {
		return event_cost;
	}
	public void setEvent_cost(long event_cost) {
		this.event_cost = event_cost;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
