public class WindChill {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);

        if(Math.abs(t)>50 || v<3 || v>120){
            System.out.println("The formula is not valid for the given temperature and wind speed. Please check the inputs");
            return;
        }
        double windChill = 35.74 + 0.6215*t - 35.75*Math.pow(v, 0.16) + 0.4275*t*Math.pow(v, 0.16);

        System.out.println("The wind chill is: " + windChill);
    }
}
