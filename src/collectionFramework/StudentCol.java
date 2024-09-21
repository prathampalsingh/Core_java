package collectionFramework;

public class StudentCol {
		private int id1;
		private String name1;
		private String degree1;
		public int getId1() {
			return id1;
		}
		public void setId1(int id1) {
			this.id1 = id1;
		}
		public String getName1() {
			return name1;
		}
		public void setName1(String name1) {
			this.name1 = name1;
		}
		public String getDegree1() {
			return degree1;
		}
		public void setDegree1(String degree1) {
			this.degree1 = degree1;
		}
		public StudentCol() {
			super();
		}
		@Override
		public String toString() {
			return "StudentCol [id1=" + id1 + ", name1=" + name1 + ", degree1=" + degree1 + "]";
		}
		public StudentCol(int id1,String name1,String degree1) {
			super();
			this.id1=id1;
			this.name1=name1;
			this.degree1=degree1;
		}
}
