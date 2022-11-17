class banking_system:
    def create(acc_holders,accounts,query):
        acc_holders[query[1]]=query[2]
        accounts[query[1]]=0
    def deposit(accounts,query):
        accounts.update({query[1] : accounts.get(query[1])+int(query[2])})
    def withdraw(accounts,query):
        accounts.update({query[1] : accounts.get(query[1])-int(query[2])})
    def balance(acc_holders,accounts,query):
        print(acc_holders.get(query[1]),accounts.get(query[1]))
if __name__ == "__main__":
    acc_holders={}
    accounts={}
    while True:
        query=input().split()
        try:
            if query[0]=="CREATE":
                banking_system.create(acc_holders, accounts, query)
            elif query[0]=="DEPOSIT":
                banking_system.deposit(accounts, query)
            elif query[0]=="WITHDRAW":
                banking_system.withdraw(accounts, query)
            elif query[0]=="BALANCE":
                banking_system.balance(acc_holders, accounts, query)
        except:
            break
