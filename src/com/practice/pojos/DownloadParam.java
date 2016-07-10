package com.practice.pojos;


public class DownloadParam extends Parent{

	/**
	 * 
	 */
	
	public DownloadParam(){
		System.out.println("doenload default construst");
		
	}
	public DownloadParam(String name){
		System.out.println("doenload parametrized construst");
		this.name=name;
		
	}
	private static final long serialVersionUID = -3646835549013879457L;
	private String name ;
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((job == null) ? 0 : job.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DownloadParam [name=" + name + ", id=" + id + ", job=" + job + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return true;/*
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DownloadParam other = (DownloadParam) obj;
		if (id != other.id)
			return false;
		if (job == null) {
			if (other.job != null)
				return false;
		} else if (!job.equals(other.job))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	*/}
	private int id;
	private String job;
	
	public String getName(){
		return name;
	}
	public void  setName(String name){
		this.name=name;
	}
	public int getId(){
		return id;
	}
	public void setid(int id){
		this.id=id;
	}
	public String getJob(){
		return job;
	}
	public void setJob(String job){
		this.job=job;
	}
}
