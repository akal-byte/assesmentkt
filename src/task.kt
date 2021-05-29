fun main() {

    var book1=arrangeBooks(List(Book("Purple Hibiscus ","Chimamnda",346),
        Book("to kill a mockingbird","Harper Lee",234)
    ))
    println(book1)

    squaresOfNegatives()
    var currency=CurrentAccount(345,"Musalia David",34000.89)
    currency.deposit(34560.89)
    currency.withdraw(14000.78)
    currency.details()
    var savings=SavingsAccount(457,"Maria Matembei",56900.56,3)
    savings.withdrawals()
    savings.withdraw(3450.89)

}
data class Book(var title:String,var author:String,var pages:Int)
 fun arrangeBooks(books:List<Book>):List<Book>{
     var arrangedBooks=books.sortedBy { book -> book.title }
     return arrangedBooks
 }
fun squaresOfNegatives(){
    var num=-1
    do {
        println(num*num)
        num++
    }
        while (num*num<=3000)
}
 open class CurrentAccount(var accNumber:Int,var accountName:String,var balance:Double){
    fun deposit(amount:Double){
        var amount=balance+amount
        println(amount)
    }
     open fun withdraw(amount: Double){
        var balance=balance-amount
        println(balance)
    }
    fun details(){
        println("Account number $accNumber with balance $balance is operated by $accountName")
    }
}
class SavingsAccount(accNumber: Int,accountName: String,balance: Double,var withdrawals:Int)
    :CurrentAccount(accNumber,accountName,balance){
        fun withdrawals(){
            withdrawals=0
            withdrawals++
        }

    override fun withdraw(amount: Double) {
      if (withdrawals<4){
          var balance=balance-amount
          println(balance)
      }
    }

}
