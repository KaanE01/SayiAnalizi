# Rapor

**Ad Soyad:** Kaan Enes KAYA
**Numara:** 

## 1. Algoritma Açıklaması
girilen sayılardan bir çok veri çıkaran bir algoritma

## 2. Girdi - İşlem - Çıktı

**Girdiler:**
- sayı

**İşlemler:**
-asal sayımı ddeğil mi
-en büyükğü bulma
-en küçükğü bulma
-açıklığı bulma
-ortalamayı bulma
-negatif sayı sayısı
-basamak bulmak
-pozitif sayı sayısı bulma
-pozitif sayıların ortalamasını bulma

**Çıktılar:**
-asal sayı mı
-en büyük sayı bulma
-en küçük sayı bulma
-açıklık bulma
-ortalama bulma
-negatif sayı sayısı bulma
-basamak bulmak bulma
-pozitif sayı sayısı bulma
-pozitif sayıların ortalamaları bulma

## 3. Sözde Kod (Pseudocode)

```
1.for
2.while
3.if
4.else
5.else if
```

## 4. Akış Şeması

Programda önce bi düzüne şeye 0 değeri verdik çünkü etkisiz eleman ve toplamlar ve değişkenler hazırlanır ardından döngü başlar ve sistem kullanıcısayı girer eğer kullanıcı daha hiçbir şey girmeden doğrudan 0 tuşlarsa Daha denemeden oturumun kapandı diyerek sistemi hemen kapatır eğer birkaç işlem yaptıktan sonra 0 girerse de kaçıncı denemeden sonra kapandığını bildirip çıkış yapar eğer girilen sayı sıfırdan farklıysa program hemen başlar sayac bir artar girilen sayıyı genel toplama ekler Sayının çift mi tek mi olduğuna pozitif mi negatif mi olduğuna bakar pozitif kutusuna bir ekledik ilk girilen sayıyı geçici olarak hem en büyük hem en küçük ilan eder sonraki sayılar geldikçe bu sınırları günceller ardından sayının asal olup olmadığını anlamak için bölenlerine bakarım  bir de mükemmel sayı olup olmadığını kontrol etmek için kendisi hariç bölenlerini toplar eşitse bayrak iner ve ona göre çıktı veririöm en son girilen sayının basamak sayısını hesaplayıp ekrana yazdırır ve döngü başa döner kullanıcı 0 girip oturumu bitirdiğinde ise program devam eder o ana kadar girilen tüm pozitif sayıların ortalamasını pozitif sayı sayısını negatif sayı sayısını tek çift dağılımlarını en büyük ve en küçük sayıları genel toplamı genel ortalamayı ve sayıların arasındaki açıklığı tek okur ve biter

## 5. Test Senaryoları (en az 8)

| No | Girilen sayılar | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
 | 1  |0	|kapan|"efendim daha denemeden oturumnuz kapatilmistir"|doğru |
 | 2  |5, 3, 0|	çıktıyı çıkarır| ort 4 poz =2 ng =0  kuçuk=5 buyuk=3 toplam=8   |doğru |
 | 3  |4, 6, 0|	       çıktıyı çıkarır |          ort=5 poz=2 ng=0  kuçuk=4 buyuk=6 toplam=10     |doğru |
 | 4  |-12, 150, 0|   çıktıyı çıkarır   |         ort=69  poz=1 ng=1       kuçuk=-12 buyuk=150 toplam=-138       |doğru |
 |  5 |7, 28, 0|       çıktıyı çıkarır   |       ort=17.5 poz=2 ng=0       kuçuk=7 buyuk=28 toplam=35   	|doğru |
 |  6 |1, 9, 0	|     çıktıyı çıkarır    |       ort=5  poz=2 ng=0      kuçuk=1 buyuk=9 toplam=10       |doğru |
 | 7  |2, 4, 8, 0|	   çıktıyı çıkarır |         ort=4.6 poz=3 ng=0    kuçuk=2 buyuk=8 toplam=14         |doğru |
 | 8  |-5, -10, 0|	   çıktıyı çıkarır  |        ort=-7,5 poz= ng=2    kuçuk=-10 buyuk=-5 toplam=-15           |doğru |

## 6. Ek Görevler (Opsiyonel)
yapıldı
1. 1-5 = 1 ,5 ,2,3
2. 87,66=87,66 ,0,76.5
3. 10,-44=-44,10, 0,10

