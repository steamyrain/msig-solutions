# Test Coding

## pertama
Buatlah sebuah program yang mencetak angka dari 1 sampai dengan 100, yang mana, bila angka merupakan 4 akan mencetak kata "Friend" (tanpa tanda petik dua), lalu bila angka merupakan kelipatan 7 akan mencetak "Foe", dan jika angka merupakan kelipatan empat dan tujuh kedua-duanya, maka akan mencetak "FriendFoe":

Output yang diinginkan:
```
1, 2, 3, Friend, 5, 6, Foe, Friend, 9, 10
11, Friend, 13, Foe, 15, Friend, 17, 18, 19, Friend
Foe, 22, 23, Friend, 25, 26, 27, FriendFoe, 29, 30
31, Friend, 33, 34, Foe, Friend, 37, 38, 39, Friend
41, Foe, 43, Friend, 45, 46, 47, Friend, Foe, 50
51, Friend, 53, 54, 55, FriendFoe, 57, 58, 59, Friend
61, 62, Foe, Friend, 65, 66, 67, Friend, 69, Foe
71, Friend, 73, 74, 75, Friend, Foe, 78, 79, Friend
81, 82, 83, FriendFoe, 85, 86, 87, Friend, 89, 90
Foe, Friend, 93, 94, 95, Friend, 97, Foe, 99, Friend
```

## kedua
Diberikan deret array [1,3,4,5] ambil data pertama dan data paling terakhir dan kembalikan nilainya [1,5]
tidak boleh menggunakan perulangan (loops).
```
contohnya:
firstEnd([1, 2, 3]) → [1, 3]
firstEnd([1, 2, 3, 4]) → [1, 4]
```
## ketiga
generetic code diberikan uniq code seperti randomUUID di java ambil karakter tersebut pada index(0,6) dan huruf dicetak besar,
jika ada simbol selain angka dan huruf di replace("")/ hapus terlebih dahulu kemudian baru cetak hasilnya.

```
contoh: 
random UUID: 18e-2d6bb-4b65-4b07-8e61-cd35d5a18cbc 
expected result: 18E2D6
```
## keempat
Table Fund

| id |    name           |    status   |
|  - |------------       |  ---------  |
|  1 | Equity Fund       |  verified   |
|  2 | Money Market Fund |  verified   |
|  3 | Fixed Income Fund |  verified   |
|  4 | Surat Utang Negara|not verified |

Table daily unit price

| id |fund_id (FK)|    status   | effective_date |
|  - |------------|  ---------  | --------------
|  1 | 1          |  verified   | 2019-10-05     |
|  2 | 2          |  verified   | 2019-10-05     |
|  3 | 3          |  verified   | 2019-10-05     |
|  4 | 1          |  verified   | 2019-10-06     |
|  5 | 2          |  verified   | 2019-10-06     |
|  6 | 3          |  verified   | 2019-10-06     |
|  7 | 4          |not verified | 2019-10-06     |

Buatkan Query (SQL) untuk menampilkan 3 daily unit price filter fund berstatus verified dan daily unit price berstatus verified dan hari paling terakhir.

Output yang diinginkan:
```
|       name         |  effective_date  |
| ------------------ | --------------   |
| Equity Fund        | 2019-10-06       |
| Money Market Fund  | 2019-10-06       |
| Fixed Income Fund  | 2019-10-06       |
```
## kelima
A positive integer p is called a perfect number if all the proper divisors of p sum to p exactly. Integer d is a proper divisor of p if 1≤d≤p−1 and p is evenly divisible by d. For example, the number 28 is a perfect number, since its proper divisors (which are 1, 2, 4, 7 and 14) add up to 28

.

Perfect numbers are rare; only 50
of them are known (as of 2017). Perhaps the definition of perfection is a little too strict. Instead, we will consider numbers that we’ll call almost perfect. Positive integer p is almost perfect if the proper divisors of p sum to a value that differs from p by no more than two.

### INPUT
Input consists of a sequence of up to 500 integers, one per line. Each integer is in the range 2 to 109 (inclusive). Input ends at end of file.
### OUTPUT
For each input value, output the same value and then one of the following: “perfect” (if the number is perfect), “almost perfect” (if it is almost perfect but not perfect), or “not perfect” (otherwise).
### Sample Input
```
6
65
650
```
### Sample Output
```
6 perfect
65 not perfect
650 almost perfect
```
## Keenam
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
