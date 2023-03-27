import scala.util.Random

object LottoNumberGenerator {
  def generateLottoNumbers(): List[Int] = {
    val randomObject = new Random()
    val lottoNumbers = (1 to 45).toList
    randomObject.shuffle(lottoNumbers).take(6).sorted
  }
}