package min.kunnchan.proxy;
/*
 * Created by kunnchan on 07/03/2021
 * package :  min.kunnchan.proxy
 */

public class RealEbook implements Ebook{
    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }
    private void load(){
        System.out.println("loading the ebook "+ fileName);
    }
    @Override
    public void show() {
        System.out.println("Showing the ebook "+ fileName);
    }

    @Override
    public String getFileName() {
        return this.fileName;
    }
}
