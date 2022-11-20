(2 to 1000).takeWhile(n => n*n*n*n.toLong <= 1000).filter(j => isPrime(j)).map(k => k*k*k*k.toLong)
//val res3: IndexedSeq[Long] = Vector(16, 81, 625)
