import java.util.List;
import java.util.concurrent.ExecutorService;

public class SpiderTest
{
    /**
     * This is our test. It creates a spider (which creates spider legs) and crawls the web.
     * 
     * @param args
     *            - not used
     */
    public static void main(String[] args)
    {
            
        Spider spider1=new Spider();
         	
        spider1.search("https://www.google.com", "computer");
             
        for(String url : spider1.getPagesToVisit()){
        	
        	if(url.equals(spider1.getPagesToVisit().get(3)))
        	{
        		break;
        	}
			spider1.setOriginalurl(url);
			spider1.setSearchword("computer");
			Runnable worker = spider1;
			spider1.getExecutor().execute(worker);
    }
}
}