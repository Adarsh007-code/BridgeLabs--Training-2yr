class Lc1436 {
    public String destCity(List<List<String>> paths) {
         Set<String> startCities = new HashSet<>();
         for (List<String> path : paths) {
            startCities.add(path.get(0));
        }
         for (List<String> path : paths) {
            String destination = path.get(1);
            if (!startCities.contains(destination)) {
                return destination;
            }
        }
        return "";
    }
}