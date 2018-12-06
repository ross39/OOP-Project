package ie.gmit.sw;

import java.util.List;

//This program calculates the cosine distance between two files to determine similarity
public class CaclulateDistance {

    public static double cosineSimilarity(List<Integer> vectorOne,List<Integer> vectorTwo) {
        double dotProduct = 0.0;
        double normVecA = 0.0;
        double normVecB = 0.0;

        for(int i = 0; i < vectorOne.size(); i++) {
            dotProduct += vectorOne.get(i) * vectorTwo.get(i);
            normVecA += Math.pow(vectorOne.get(i), 2);
            normVecB += Math.pow(vectorTwo.get(i), 2);
        }

        return dotProduct / (Math.sqrt(normVecA) * Math.sqrt(normVecB));
    }//end calculate cosineSimilarity

}
