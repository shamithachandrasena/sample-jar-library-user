public class Main extends ClassLoader{
    public static void main(String[] args){
//        Car car = new Car();
//        car.setName("BMW");
//        car.setOwner("Shamitha");
//        System.out.println(car.getName()+" "+car.getOwner());


        ClassFinder.findClasses(new Visitor<String>() {
            @Override
            public boolean visit(String clazz) {
                System.out.println(clazz);
                return true; // return false if you don't want to see any more classes
            }
        });

        // -------------- Below code may work, need to fix for jars ------------------ //
        //        Enumeration<URL> roots = null;
        //        try {
        //            roots = new Main().getResources("");
        //        } catch (IOException e) {
        //            e.printStackTrace();
        //        }
        //        while (roots.hasMoreElements()){
        //            URL url = roots.nextElement();
        //            File root = new File(url.getPath());
        //            for (File file : root.listFiles()) {
        //                // ...
        //                if (file.isDirectory()) {
        //                    // Loop through its listFiles() recursively.
        //                } else {
        //                    String name = file.getName();
        //                    System.out.println(file.getName());
        //                    // Check if it's a .class file or a .jar file and handle accordingly.
        //                }
        //            }
        //        }



    }
}
