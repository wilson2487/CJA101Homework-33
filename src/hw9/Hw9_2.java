package hw9;

class Account {
    private int cash = 0;

    synchronized public void setCash(int money) {
        while (cash >= 3000) {
            System.out.println("媽媽看到餘額3000以上，暫停匯款");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        cash += money;
        System.out.println("媽媽存了 " + money + " 元");
        System.out.println("帳戶餘額為 " + cash + " 元");
        notify(); 
    }

    synchronized public void getCash(int money) {
        while (cash < money) {
            System.out.println("餘額不足，雄大暫停領款");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        cash -= money;
        System.out.println("雄大領了 " + money + " 元");
        System.out.println("帳戶餘額為 " + cash + " 元");
        if (cash <= 2000) {
            System.out.println("帳戶餘額小於2000，通知老媽匯款");
            notify();  
        }
    }
}

class Payee extends Thread {
    Account account;

    Payee(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            account.getCash(1000);
            try {
                Thread.sleep(100);  // 模擬花錢時間
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Remitter extends Thread {
    Account account;

    Remitter(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            account.setCash(2000);
            try {
                Thread.sleep(100);  // 模擬匯款時間
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Hw9_2 {
    public static void main(String[] args) {
        Account account = new Account();
        Thread p1 = new Payee(account);
        Thread r1 = new Remitter(account);
        p1.start();
        r1.start();
    }
}

