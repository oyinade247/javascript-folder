function addIncome(expenses,product, price, income){
    expense = {
        purpose:product,
        amount:price,
        date : new Date()
    }
    expense["income"] = income;
    expenses.push(expense);
    console.log(expenses)
    return "income has been added"
}


module.exports = addIncome