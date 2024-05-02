package davsdd.design.patterns.creationalpatterns.singleton.logger;

class TestCustomLogger {
    public static void main(String[] args) {
        CustomLogger logger = CustomLogger.getLogger();
        logger.success("Data loaded");
        logger.error("Data not loaded. Please try again!");
    }
}
