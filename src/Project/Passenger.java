	package Project;

	import java.time.LocalDate;

	enum Berth{
		UPPER ,
		LOWER,
		MIDDLE
	}
	public class Passenger {
		
		private int pId;
		private String name;
		private Berth prefBerth;
		private Berth allocatedBerth;
		private LocalDate time = LocalDate.now();
		
//		 public Passenger(int id,String name,Berth prefBerth){
//		        this.pId = id;
//		        this.name=name;
//		        this.prefBerth=prefBerth;
//		    }
		@Override
		public String toString() {
			return "Passenger [pId=" + pId + ", name=" + name + ", prefBerth=" + prefBerth + ", allocatedBerth="
					+ allocatedBerth + ", time=" + time + "]";
		}
		public int getpId() {
			return pId;
		}
		public void setpId(int pId) {
			this.pId = pId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Berth getPrefBerth() {
			return prefBerth;
		}
		public void setPrefBerth(Berth prefBerth) {
			this.prefBerth = prefBerth;
		}
		public Berth getAllocatedBerth() {
			return allocatedBerth;
		}
		public void setAllocatedBerth(Berth allocatedBerth) {
			this.allocatedBerth = allocatedBerth;
		}
		public LocalDate getTime() {
		    return time;
		}

		public void setTime(LocalDate time) {
		    this.time = time;
		}

	}


