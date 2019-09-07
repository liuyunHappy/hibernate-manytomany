/*
 * Copyright (c) 2019, wenwenliuyun@163.com All Rights Reserved. 
 */

package com.liuyun.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author liuyun
 * @since 2019年9月4日下午10:49:08
 */
public class Student implements Serializable {

	private static final long serialVersionUID = 3907174579755050980L;

	private Long stuId;

	private String stuName;

	private Set<Teacher> teachers = new HashSet<Teacher>(0);

	public Student() {
		this(null);
	}

	public Student(String stuName) {
		this(null, stuName);
	}

	public Student(Long stuId, String stuName) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
	}

	public Long getStuId() {
		return stuId;
	}

	public void setStuId(Long stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + "]";
	}
	
	public Student add(Teacher...teachers ) {
		if (teachers == null) {
			return this;
		}
		if (this.teachers == null) {
			this.teachers = new HashSet<Teacher>(0);
		}
		for (Teacher t : teachers ) {
			if (t == null) {
				continue;
			}
			this.teachers.add(t);
		}
		return this;
	}
	
	public Student remove(Teacher...teachers ) {
		if (teachers == null) {
			return this;
		}
		if (this.teachers == null) {
			this.teachers = new HashSet<Teacher>(0);
		}
		for (Teacher t : teachers ) {
			if (t == null) {
				continue;
			}
			this.teachers.remove(t);
		}
		return this;
	}
}
