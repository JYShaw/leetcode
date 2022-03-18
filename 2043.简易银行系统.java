/*
 * @lc app=leetcode.cn id=2043 lang=java
 *
 * [2043] 简易银行系统
 */

// @lc code=start
class Bank {
    private final long[] balance;
    private int n;

    public Bank(long[] balance) {
        this.balance = new long[balance.length + 1];
        System.arraycopy(balance, 0, this.balance, 1, balance.length);
        n = balance.length + 1;
    }

    public boolean transfer(int account1, int account2, long money) {
        if (!(validAccount(account1) && validAccount(account2))) {
            return false;
        }
        if (money < 0 || balance[account1] < money) {
            return false;
        }
        balance[account1] -= money;
        balance[account2] += money;
        return true;
    }

    public boolean deposit(int account, long money) {
        if (!(validAccount(account) && money >= 0)) {
            return false;
        }
        balance[account] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (!(validAccount(account) && money >= 0)) {
            return false;
        }
        if(balance[account]<money){
            return false;
        }
        balance[account] -= money;
        return true;
    }

    private boolean validAccount(int account) {
        return account >= 1 && account <= n;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */
// @lc code=end
