package com.ht706.componentLibrary.systemManagement.action;

import java.util.Set;

import org.jbpm.api.task.Task;

public class TaskTemp  {
	private Task task;
	private Set<String> out;
	private String owner;
	private String id;
	private String actionName;
	private String description;
	
	public void setTask(Task task) {
		this.task = task;
	}
	public Task getTask() {
		return task;
	}
	public void setOut(Set<String> out) {
		this.out = out;
	}
	public Set<String> getOut() {
		return out;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner() {
		return owner;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getActionName() {
		return actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
