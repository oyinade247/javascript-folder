const addIncome = require("./addIncome")

test("Test add income", ()=>{
    expenses = [{purpose: "buy gala", amount : 500, date: new Date()}, {}]
    expect(addIncome(expenses, 1000)).toBe("income has been added")
}
)