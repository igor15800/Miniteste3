
 public class PolygonFactory {
	
	public static Polygon getPolygon(int numberOfSides) {
		if (numberOfSides == 3) {
			return new Triangle();
		}
		if (numberOfSides == 4) {
			return new Square();
		}
		if (numberOfSides == 5) {
			return new Pentagon();
		}
		return null;
	}

}
