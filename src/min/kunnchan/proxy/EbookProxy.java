package min.kunnchan.proxy;
/*
 * Created by kunnchan on 07/03/2021
 * package :  min.kunnchan.proxy
 */

public class EbookProxy implements Ebook{
    private String fileName;
    private RealEbook realEbook;
    public EbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if(realEbook == null)
            realEbook = new RealEbook(fileName);
        realEbook.show();
    }

    @Override
    public String getFileName() {
        return this.fileName;
    }
}
