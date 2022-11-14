// f!!

((n: Int) => if (n % 2 == 0) (2 to n by 2).product else (1 to n by 2).product)(8)
// 384

((n: Int) => if (n % 2 == 0) (2 to n by 2).product else (1 to n by 2).product)(9)
// 945
