package plm;

public class ImageLoaderFactory implements ImageLoader {

    ImageLoaderFactory() { }

    @Override
    public void load(String path) {
        if(path.endsWith(".png")) {
            new ImgPNG(path);
        }
        else if(path.endsWith(".jpg")) {
            new ImgJPG(path);
        }
        else if(path.endsWith(".bmp")) {
            new ImgBMP(path);
        }
        else {
            System.out.println("Wrong picture format.");
        }

    }


}
