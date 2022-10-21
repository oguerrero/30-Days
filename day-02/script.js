const money = document.getElementById('quantity')
const months = document.getElementById('months')
const interest = document.getElementById('interest')
const btn = document.getElementById('button-submit')
const result = document.getElementById('result')

btn.addEventListener('click', (e) => {
  e.preventDefault()
  if (money.value === '' || interest.value === '' || months.value === '') return
  result.innerHTML = money.value * interest.value * months.value
})
