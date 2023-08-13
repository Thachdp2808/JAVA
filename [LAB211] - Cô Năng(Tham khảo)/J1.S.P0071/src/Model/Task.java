package Model;



public class Task {
	private int id;
	private String name;
	private int typeID;
	private String date;
	private double from;
    private double to;
    private String assignee;
    private String reviewer;
	
    public Task() {
    	
    }

	public Task(int id, String name, int typeID, String date, double from, double to, String assignee,
			String reviewer) {
		super();
		this.id = id;
		this.name = name;
		this.typeID = typeID;
		this.date = date;
		this.from = from;
		this.to = to;
		this.assignee = assignee;
		this.reviewer = reviewer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getType() {
		return typeID;
	}

	public String getTypeID() {
		 String result = null;
	        switch (typeID) {
	            case 1:
	                result = "Code";
	                break;
	            case 2:
	                result = "Test";
	                break;
	            case 3:
	                result = "Design";
	                break;
	            case 4:
	                result = "Review";
	                break;

	        }

	        return result;
	}

	public void setTypeID(int typeID) {
		if (typeID <= 3 && typeID >= 1) {
            this.typeID = typeID;
        } else {
            System.out.println("Must in 1 to 4");
        }
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getFrom() {
		return from;
	}

	public void setFrom(double from) {
		this.from = from;
	}

	public double getTo() {
		return to;
	}

	public void setTo(double to) {
		this.to = to;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getReviewer() {
		return reviewer;
	}

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	
    
    public String display() {
    	return String.format("%-5s%-15s%-15s%-15s%-15s%-15s%-15s\n", id, name, getTypeID(), date, (to-from),assignee,reviewer);
    }
}
