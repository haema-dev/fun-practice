@main def main(): Unit = {
  println("Hello world!")
  lotto()
}

def lotto(): Unit = {
  import LottoNumberGenerator._

  val lottoNumbers = generateLottoNumbers()
  println("이번주 로또 번호는 다음과 같습니다:")
  lottoNumbers.foreach(println)
}
