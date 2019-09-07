/*
 * Copyright (c) 2019, wenwenliuyun@163.com All Rights Reserved. 
 */

package com.liuyun.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author liuyun
 * @since 2019年9月4日下午10:48:14
 */
public class Teacher implements Serializable {
	private static final long serialVersionUID = -4629543766422581183L;

	private Long tchId;

	private String tchName;

	private Set<Student> students = new HashSet<Student>(0);

	public Teacher() {
		this(null);
	}

	public Teacher(String tchName) {
		this(null, tchName);
	}

	public Teacher(Long tchId, String tchName) {
		super();
		this.tchId = tchId;
		this.tchName = tchName;
	}

	public Long getTchId() {
		return tchId;
	}

	public void setTchId(Long tchId) {
		this.tchId = tchId;
	}

	public String getTchName() {
		return tchName;
	}

	public void setTchName(String tchName) {
		this.tchName = tchName;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Teacher [tchId=" + tchId + ", tchName=" + tchName + "]";
	}

	public Teacher add(Student... students) {
		if (students == null) {
			return this;
		}
		if (this.students == null) {
			this.students = new HashSet<Student>(0);
		}
		for (Student s : students) {
			if (s == null) {
				continue;
			}
			this.students.add(s);
		}
		return this;
	}

	public Teacher remove(Student... students) {
		if (students == null) {
			return this;
		}
		if (this.students == null) {
			this.students = new HashSet<Student>(0);
		}
		for (Student s : students) {
			if (s == null) {
				continue;
			}
			this.students.remove(s);
		}
		return this;
	}
}
