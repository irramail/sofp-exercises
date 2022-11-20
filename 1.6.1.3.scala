def isPrime(n: Int):Boolean = (2 to n-1).takeWhile(k => k*k <= n).forall(k => n % k != 0)
//def isPrime(n: Int): Boolean

(2 to 1000).filter(k => isPrime(k)).map(p => 1.0 / (1-1.0/(p*p*p*p))).product
//val res0: Double = 1.0823233502984164

val pi = math.Pi
//val pi: Double = 3.141592653589793

pi*pi*pi*pi/90
//val res2: Double = 1.082323233711138
