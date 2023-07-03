package module2bai8;

import java.util.HashSet;
import java.util.Set;

public class Section {
	private String sectionNbr;
	private String semester;
	private String room;
	private Faculty facultyMember;
	private Set<Enrolment> listEnrolls;
	
	public Section() {
		super();
		this.sectionNbr = "chua co";
		this.semester = "chua co";
		this.room = "chua co";
	}
	
	public Section(String sectionNbr, String semester, String room,Faculty faculty, Set<Enrolment> ds) {
		super();
		setSectionNbr(sectionNbr);
		setSemester(semester);
		setRoom(room);
		this.facultyMember = faculty;
		this.listEnrolls = listEnrolls;
	}

	public String getSectionNbr() {
		return sectionNbr;
	}

	public void setSectionNbr(String sectionNbr) {
		this.sectionNbr = sectionNbr.equalsIgnoreCase("")?"chua co":sectionNbr;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester.equalsIgnoreCase("")?"chua co":semester;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room.equalsIgnoreCase("")?"chua co":room;
	}
	
}
