package mathematical;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
public class Line_Passes_Most_Num_Of_Points {
	/* Find line that goes through most number of points. */
	public static BestLine findBestLine(GraphPoint[] points) {
		HashMapList<Double, BestLine> linesBySlope = getListOfLines(points);
		return getBestLine(linesBySlope);
	}
	
	/* Add each pair of points as a line to the list. */
	public static HashMapList<Double, BestLine> getListOfLines(GraphPoint[] points) {
		HashMapList<Double, BestLine> linesBySlope = new HashMapList<Double, BestLine>();
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				BestLine line = new BestLine(points[i], points[j]);
				double key = BestLine.floorToNearestEpsilon(line.slope);
				linesBySlope.put(key, line);
			}
		}
		return linesBySlope;
	}		
	
	/* Return the line with the most equivalent other lines. */
	public static BestLine getBestLine(HashMapList<Double, BestLine> linesBySlope) {
		BestLine bestLine = null;
		int bestCount = 0;
		
		Set<Double> slopes = linesBySlope.keySet();
		
		for (double slope : slopes) {
			ArrayList<BestLine> lines = linesBySlope.get(slope);
			for (BestLine line : lines) {
				/* count lines that are equivalent to current line */
				int count = countEquivalentLines(linesBySlope, line);
				
				/* if better than current line, replace it */
				if (count > bestCount) {
					bestLine = line;
					bestCount = count;
					bestLine.Print();
					System.out.println(bestCount);
				}
			}
		} 
		return bestLine;
	}
	
	/* Check hashmap for lines that are equivalent. Note that we need to check one epsilon above and below the actual slope
	 * since we're defining two lines as equivalent if they're within an epsilon of each other.
	 */
	public static int countEquivalentLines(HashMapList<Double, BestLine> linesBySlope, BestLine line) {
		double key = BestLine.floorToNearestEpsilon(line.slope);
		int count = countEquivalentLines(linesBySlope.get(key), line);
		count += countEquivalentLines(linesBySlope.get(key - BestLine.epsilon), line);
		count += countEquivalentLines(linesBySlope.get(key + BestLine.epsilon), line);
		return count;
	}
	
	/* Count lines within an array of lines which are "equivalent" (slope and y-intercept are within an epsilon value) to a given line */
	public static int countEquivalentLines(ArrayList<BestLine> lines, BestLine line) {
		if (lines == null) {
			return 0;
		}
		
		int count = 0;
		for (BestLine parallelLine : lines) {
			if (parallelLine.isEquivalent(line)) {
				count++;
			}
		}
		return count;		
	}
	

	
	public static GraphPoint[] createPoints() {
		int n_points = 100;
		System.out.println("Points on Graph\n***************");
		GraphPoint[] points = new GraphPoint[n_points - 1];
		for (int i = 0; i < n_points / 2; i++) {
			GraphPoint p = new GraphPoint(i, 2.3 * ((double)i) + 20.0);
			points[i] = p;
			System.out.println(p.toString());
		}
		for (int i = 0; i < n_points / 2 - 1; i++) {
			GraphPoint p = new GraphPoint(i, 3.0 * ((double)i) + 1.0);
			points[n_points / 2 + i] = p;
			System.out.println(p.toString());
		}
		System.out.println("****************\n");
		return points;
	}
	
	public static int validate(BestLine line, GraphPoint[] points) {
		int count = 0;
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				BestLine other = new BestLine(points[i], points[j]);
				if (line.isEquivalent(other)) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		GraphPoint[] points = createPoints();
		BestLine line = findBestLine(points);
		line.Print();
		System.out.println(validate(line, points));
	}
}
