public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        if (tonerLevel>-1 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
            this.duplex = duplex;
            this.pagesPrinted = 0;
        } else {
            this.tonerLevel = -1;
            this.duplex = duplex;
            this.pagesPrinted = 0;
        }
    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount>0&&tonerAmount<=100){
            if (this.tonerLevel + tonerAmount>100){
                return -1;
            } else {
                return this.tonerLevel += tonerAmount;
            }
        }
        return -1;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
            if(duplex){
                System.out.println("Printer is printing in duplex mode");
                pagesToPrint = (pages/2)+(pages%2);
            }
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }

}

