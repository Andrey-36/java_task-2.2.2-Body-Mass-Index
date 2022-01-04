public class BmiService {
    public float calculate (float weight, float growth) {
    float index = weight / ( growth / 100 * growth / 100) ;
    return index;
    }
}
